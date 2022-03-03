package com.example.valueconverter.model

interface Value {
    val CharCode: String
    val ID: String
    val Name: String
    val Nominal: Int
    val NumCode: String
    val Previous: Double
    val Value: Double
}

data class ValuesList(
    val Date: String,
    val PreviousDate: String,
    val PreviousURL: String,
    val Timestamp: String,
    val Valute: Valute
)

data class Valute(
    val AMD: AMD,
    val AUD: AUD,
    val AZN: AZN,
    val BGN: BGN,
    val BRL: BRL,
    val BYN: BYN,
    val CAD: CAD,
    val CHF: CHF,
    val CNY: CNY,
    val CZK: CZK,
    val DKK: DKK,
    val EUR: EUR,
    val GBP: GBP,
    val HKD: HKD,
    val HUF: HUF,
    val INR: INR,
    val JPY: JPY,
    val KGS: KGS,
    val KRW: KRW,
    val KZT: KZT,
    val MDL: MDL,
    val NOK: NOK,
    val PLN: PLN,
    val RON: RON,
    val SEK: SEK,
    val SGD: SGD,
    val TJS: TJS,
    val TMT: TMT,
    val TRY: TRY,
    val UAH: UAH,
    val USD: USD,
    val UZS: UZS,
    val XDR: XDR,
    val ZAR: ZAR
)

data class AMD(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class AUD(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class AZN(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class BGN(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class BRL(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class BYN(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class CAD(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class CHF(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class CNY(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class CZK(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class DKK(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class EUR(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class GBP(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class HKD(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class HUF(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class INR(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class JPY(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class KGS(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class KRW(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class KZT(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class MDL(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class NOK(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class PLN(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class RON(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class SEK(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class SGD(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class TJS(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class TMT(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class TRY(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class UAH(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class USD(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class UZS(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class XDR(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value

data class ZAR(
    override val CharCode: String,
    override val ID: String,
    override val Name: String,
    override val Nominal: Int,
    override val NumCode: String,
    override val Previous: Double,
    override val Value: Double
) : Value