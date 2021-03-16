package com.zepben.evolvemapping.models.sincal

class StdTwoWindingTransformer(
    // Documentation extracted from the PSS®SINCAL 16.0 Database Description
    element_ID: String, // Secondary Key – Network Element
    twotTyp: String,   // Name – Standard Type
    un1: Double, // Rated Voltage (Side 1)
    un2: Double, // Rated Voltage (Side 2)
    sn: Double, // Rated Apparent Power
    sMax: Double, // Full Load Power
    sMax1: Double, // First Additional Full Load Power
    rohm: Double, // Main Tap Position
    uk: Double, // Reference Short Circuit Voltage
    ur: Double, // Short Circuit Voltage – Ohmic Part
    vfe:Double, // Iron Losses
    i0: Double, // No Load Current
    vecGrp: Int, // Vector Group. See the complete map in the the PSS®SINCAL 16.0 Database Description
    Flag_Z0_Input: Int, // Zero-Phase Sequence Input Data 1: Z0/Z1 and R0/X0 2: R0 and X0 3: R0/R1 and X0/X1 4: ZABNL, ZBANL and ZABSC
    Z0_Z1: Double, // Ratio Zero-Phase to Positive-Phase Sequence Impedance
    R0_X0: Double, // Ratio R/X – Zero-Phase Sequence
    R0: Double, // Resistance – Zero-Phase Sequence
    X0: Double, // Reactance – Zero-Phase Sequence
    X0_X1:Double, // Ratio Zero-Phase to Positive-Phase Reactance
    R0_R1: Double, // Ratio Zero-Phase to Positive-Phase Resistance
    ZABNL: Double, // Impedance between A and B in No Load
    ZBANL: Double, // Impedance between B and A in No LoadImpedance between B and A in No Load
    ZABSC: Double, // Impedance between B and A in No Load
    Flag_Ct: Int,
    uk_Ct:Double,
    ur_Ct:Double,
    c: Int, // Not documented in the PSS®SINCAL 16.0 Database Description
    ung: Double, //  Not documented in the PSS®SINCAL 16.0 Database Description
) : Element(element_ID)
