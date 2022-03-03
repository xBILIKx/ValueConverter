package com.example.valueconverter

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.valueconverter.model.Value
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var viewModel: MainViewModel

    private val adapter = CustomRecycleAdapter(mutableListOf(), 1.0)
    private var _valute: List<Value> = mutableListOf()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHasOptionsMenu(true)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        rcView.layoutManager = LinearLayoutManager(context)
        rcView.adapter = adapter

        viewModel.updateData()
        viewModel.valuteListLiveData.observe(viewLifecycleOwner, { valute ->
            adapter.update(valute)
            _valute = valute
            swipeRecycler.isRefreshing = false
        })

        viewModel.errorLiveData.observe(viewLifecycleOwner, {
            Toast.makeText(context, "Something is wrong, check your internet connection", Toast.LENGTH_LONG).show()
            swipeRecycler.isRefreshing = false
        })

        swipeRecycler.setOnRefreshListener {
            viewModel.updateData()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) =
        inflater.inflate(R.menu.values_menu, menu)

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        _valute.forEach {
            if(it.CharCode == item.title.toString())
                adapter.updateFactor(it.Value)
            else if(item.title.toString() == "RUB")
                adapter.updateFactor(1.0)
        }

        return true
    }

}