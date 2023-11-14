package com.example.tareaevaluable1trimestre

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.tareaevaluable1trimestre.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var binding: ActivityMainBinding
    var texto: String = ""
    var reg: String = ""

    override fun onSaveInstanceState(outState: Bundle) {
        if (outState != null) {
            super.onSaveInstanceState(outState)
            outState?.putString("texto", texto)
            outState?.putString("registro", reg)

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState != null) {
            texto = savedInstanceState.getString("texto").toString()
            binding.textocuadro.text = texto
            reg = savedInstanceState.getString("registro").toString()
            binding.registro.text = reg

        }
        //texto = savedInstanceState?.getString("texto").toString()?:"0"
        binding.registro.text = reg
        binding.ac.setOnClickListener(this)
        binding.negativoPositivo.setOnClickListener(this)
        binding.porcentaje.setOnClickListener(this)
        binding.division.setOnClickListener(this)
        binding.siete.setOnClickListener(this)
        binding.ocho.setOnClickListener(this)
        binding.nueve.setOnClickListener(this)
        binding.multiplicacion.setOnClickListener(this)
        binding.cuatro.setOnClickListener(this)
        binding.cinco.setOnClickListener(this)
        binding.seis.setOnClickListener(this)
        binding.resta.setOnClickListener(this)
        binding.uno.setOnClickListener(this)
        binding.dos.setOnClickListener(this)
        binding.tres.setOnClickListener(this)
        binding.suma.setOnClickListener(this)
        binding.cero.setOnClickListener(this)
        binding.coma.setOnClickListener(this)
        binding.igual.setOnClickListener(this)
        binding.factorial?.setOnClickListener(this)
        binding.raizCubica?.setOnClickListener(this)
        binding.raizCuadrada?.setOnClickListener(this)
        binding.exponente?.setOnClickListener(this)
        binding.elevadoCubo?.setOnClickListener(this)
        binding.elevadoCuadrado?.setOnClickListener(this)
        binding.seno?.setOnClickListener(this)
        binding.coseno?.setOnClickListener(this)
        binding.tangente?.setOnClickListener(this)
        binding.senoHiperbolico?.setOnClickListener(this)
        binding.cosenoHiperbolico?.setOnClickListener(this)
        binding.tangHiperbolica?.setOnClickListener(this)
        binding.pi?.setOnClickListener(this)
        binding.logaritmoBase10?.setOnClickListener(this)
        binding.logaritmoNatural?.setOnClickListener(this)


    }

    override fun onClick(v: View?) {


        when (v?.id) {


            binding.suma.id -> {
                texto += ("+").toString()
            }

            binding.resta.id -> {
                texto += ("-").toString()
            }

            binding.multiplicacion.id -> {
                texto += ("x").toString()
            }

            binding.division.id -> {
                texto += ("/").toString()
            }


            binding.cero.id -> {
                texto += "0"
            }

            binding.uno.id -> {
                texto += "1"
            }

            binding.dos.id -> {
                texto += "2"
            }

            binding.tres.id -> {
                texto += "3"
            }

            binding.cuatro.id -> {
                texto += "4"
            }

            binding.cinco.id -> {
                texto += "5"
            }

            binding.seis.id -> {
                texto += "6"
            }

            binding.siete.id -> {
                texto += "7"
            }

            binding.ocho.id -> {
                texto += "8"
            }

            binding.nueve.id -> {
                texto += "9"


            }


            binding.ac.id -> {
                texto = ""
                reg = ""
            }

            binding.negativoPositivo.id -> {
                texto = (texto.toDouble() * -1).toString()
            }

            binding.porcentaje.id -> {
                val op = texto.toDouble()
                val result = formatoResultado(op * 0.01)
                texto =
                    limitarDecimales(formatoResultado(result.toDouble()).toDouble(), 2).toString()
            }

            binding.coma.id -> {
                texto += (".").toString()
            }

            binding.factorial?.id -> {
                texto = factorial(texto.toLong()).toString()
            }

            binding.raizCubica?.id -> {

                texto =
                    limitarDecimales(formatoResultado(Math.cbrt(texto.toDouble())).toDouble(), 2)
            }

            binding.raizCuadrada?.id -> {
                texto =
                    limitarDecimales(formatoResultado(Math.sqrt(texto.toDouble())).toDouble(), 2)
            }

            binding.exponente?.id -> {
                texto += ("^").toString()
            }

            binding.elevadoCubo?.id -> {
                texto = Math.pow(texto.toDouble(), 3.0).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.elevadoCuadrado?.id -> {
                texto = Math.pow(texto.toDouble(), 2.0).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.seno?.id -> {
                texto = Math.sin(texto.toDouble()).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.coseno?.id -> {
                texto = Math.cos(texto.toDouble()).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.tangente?.id -> {
                texto = Math.tan(texto.toDouble()).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.senoHiperbolico?.id -> {
                texto = Math.sinh(texto.toDouble()).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.cosenoHiperbolico?.id -> {
                texto = Math.cosh(texto.toDouble()).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.tangHiperbolica?.id -> {
                texto = Math.tanh(texto.toDouble()).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.pi?.id -> {
                texto += Math.PI.toString()
            }

            binding.logaritmoBase10?.id -> {
                texto = Math.log10(texto.toDouble()).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.logaritmoNatural?.id -> {
                texto = Math.log(texto.toDouble()).toString()
                texto =
                    limitarDecimales(formatoResultado(texto.toDouble()).toDouble(), 2).toString()
            }

            binding.igual.id -> {


                val input = binding.textocuadro.text
                var regi = binding.registro.text


                if (input.isNotEmpty()) {
                    if (input.contains("+")) {
                        val parts = input.split("+")
                        if (parts.size == 2) {
                            val operand1 = parts[0].toDouble()
                            val operand2 = parts[1].toDouble()
                            val result = operand1 + operand2
                            reg = texto
                            texto =
                                limitarDecimales(formatoResultado(result).toDouble(), 2).toString()

                        }
                    } else if (input.contains("x")) {
                        val parts = input.split("x")
                        if (parts.size == 2) {
                            val operand1 = parts[0].toDouble()
                            val operand2 = parts[1].toDouble()
                            val result = operand1 * operand2
                            reg = texto
                            texto =
                                limitarDecimales(formatoResultado(result).toDouble(), 2).toString()
                        }
                    } else if (input.contains("/")) {
                        val parts = input.split("/")
                        if (parts.size == 2) {
                            val operand1 = parts[0].toDouble()
                            val operand2 = parts[1].toDouble()
                            val result = operand1 / operand2
                            reg = texto
                            texto =
                                limitarDecimales(formatoResultado(result).toDouble(), 2).toString()
                        }
                    } else if (input.contains("^")) {
                        val parts = input.split("^")
                        if (parts.size == 2) {
                            val operand1 = parts[0].toDouble()
                            val operand2 = parts[1].toDouble()
                            val result = Math.pow(operand1, operand2)
                            reg = texto
                            texto =
                                limitarDecimales(formatoResultado(result).toDouble(), 2).toString()
                        }


                    } else if (input.contains("-")) {

                        val cleanedInput = input.removePrefix("-")
                        val parts = cleanedInput.split("-")
                        val menosPrimero = input.startsWith("-")


                        if (menosPrimero) {
                            val operand1 = parts[0].toDouble()
                            val operand2 = parts[1].toDouble()
                            val result = -1 * (operand1 + operand2)
                            reg = texto
                            texto =
                                limitarDecimales(formatoResultado(result).toDouble(), 2).toString()
                        } else if (parts.size == 2) {
                            val operand1 = parts[0].toDouble()
                            val operand2 = parts[1].toDouble()
                            val result = operand1 - operand2
                            reg = texto
                            texto =
                                limitarDecimales(formatoResultado(result).toDouble(), 2).toString()

                        }


                    } else {


                        if (regi.contains("+")) {
                            val parts = regi.split("+")
                            if (parts.size == 2) {
                                val op1 = input.toString().toDouble()
                                val op2 = parts[1].toDouble()
                                val result = op1 + op2
                                reg =
                                    formatoResultado(op1) + ("+").toString() + formatoResultado(op2)
                                texto =
                                    limitarDecimales(
                                        formatoResultado(result).toDouble(),
                                        2
                                    ).toString()
                            }

                        } else if (regi.contains("-")) {
                            val parts = regi.split("-")
                            if (parts.size == 2) {
                                val op1 = input.toString().toDouble()
                                val op2 = parts[1].toDouble()
                                val result = op1 - (op2)
                                reg =
                                    formatoResultado(op1) + ("-").toString() + formatoResultado(op2)
                                texto =
                                    limitarDecimales(
                                        formatoResultado(result).toDouble(),
                                        2
                                    ).toString()
                            }
                        } else if (regi.contains("/")) {
                            val parts = regi.split("/")
                            if (parts.size == 2) {
                                val op1 = input.toString().toDouble()
                                val op2 = parts[1].toDouble()
                                val result = op1 / (op2)
                                reg =
                                    formatoResultado(op1) + ("/").toString() + formatoResultado(op2)
                                texto =
                                    limitarDecimales(
                                        formatoResultado(result).toDouble(),
                                        2
                                    ).toString()
                            }
                        } else if (regi.contains("x")) {
                            val parts = regi.split("x")
                            if (parts.size == 2) {
                                val op1 = input.toString().toDouble()
                                val op2 = parts[1].toDouble()
                                val result = op1 * op2
                                reg =
                                    formatoResultado(op1) + ("x").toString() + formatoResultado(op2)
                                texto =
                                    limitarDecimales(
                                        formatoResultado(result).toDouble(),
                                        2
                                    ).toString()
                            }
                        } else if (regi.contains("^")) {
                            val parts = regi.split("^")
                            if (parts.size == 2) {
                                val op1 = input.toString().toDouble()
                                val op2 = parts[1].toDouble()
                                val result = Math.pow(op1, op2)
                                reg =
                                    formatoResultado(op1) + ("^").toString() + formatoResultado(op2)
                                texto =
                                    limitarDecimales(
                                        formatoResultado(result).toDouble(),
                                        2
                                    )
                            }
                        }
                    }
                }
            }

        }
        binding.textocuadro.text = texto
        binding.registro.text = reg

    }


    fun factorial(n: Long): Long {
        if (n < 0) {

        }
        var result: Long = 1
        for (i in 1..n) {
            result *= i
        }
        return result
    }

    fun formatoResultado(valor: Double): String {
        if (valor % 1 == 0.0) {
            return valor.toInt().toString()
        } else {
            return valor.toString()
        }
    }

    fun limitarDecimales(numero: Double, numeroDecimales: Int = 2): String {
        val formato = DecimalFormat(
            "#." + "#".repeat(numeroDecimales)
        )
        return formato.format(numero)
    }


}





