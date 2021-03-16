package com.zepben.evolvemapping.models.sincal

class StdTwoWindingTransformer(
    override val elementId: Int
    // Documentation extracted from the PSS®SINCAL 16.0 Database Description
    //val twotTyp: String,   // Name – Standard Type
    //val un1: Double, // Rated Voltage (Side 1)
    //val un2: Double, // Rated Voltage (Side 2)
    //val sn: Double, // Rated Apparent Power
    //val sMax: Double, // Full Load Power
    //val sMax1: Double, // First Additional Full Load Power
    //val rohm: Double, // Main Tap Position
    //val uk: Double, // Reference Short Circuit Voltage
    //val ur: Double, // Short Circuit Voltage – Ohmic Part
    //val vfe:Double, // Iron Losses
    //val i0: Double, // No Load Current
    //val vecGrp: Int, // Vector Group. See the complete map in the the PSS®SINCAL 16.0 Database Description
    //val Flag_Z0_Input: Int, // Zero-Phase Sequence Input Data 1: Z0/Z1 and R0/X0 2: R0 and X0 3: R0/R1 and X0/X1 4: ZABNL, ZBANL and ZABSC
    //val Z0_Z1: Double, // Ratio Zero-Phase to Positive-Phase Sequence Impedance
    //val R0_X0: Double, // Ratio R/X – Zero-Phase Sequence
    //val R0: Double, // Resistance – Zero-Phase Sequence
    //val X0: Double, // Reactance – Zero-Phase Sequence
    //val X0_X1:Double, // Ratio Zero-Phase to Positive-Phase Reactance
    //val R0_R1: Double, // Ratio Zero-Phase to Positive-Phase Resistance
    //val ZABNL: Double, // Impedance between A and B in No Load
    //val ZBANL: Double, // Impedance between B and A in No LoadImpedance between B and A in No Load
    //val ZABSC: Double, // Impedance between B and A in No Load
    //val Flag_Ct: Int,
    //val uk_Ct:Double,
    //val ur_Ct:Double,
    //val c: Int, // Not documented in the PSS®SINCAL 16.0 Database Description
    //val ung: Double, //  Not documented in the PSS®SINCAL 16.0 Database Description
): Element()
