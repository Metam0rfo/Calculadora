package com.example.tfbel.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var operador: String? = null
    private var valorAnterior: String? = null

    private var botaozero: Button? = null
    private var botaoum: Button? = null
    private var botaodois: Button? = null
    private var botaotres: Button? = null
    private var botaoquatro: Button? = null
    private var botaocinco: Button? = null
    private var botaoseis: Button? = null
    private var botaosete: Button? = null
    private var botaooito: Button? = null
    private var botaonove: Button? = null

    private var botaovirgula: Button? = null
    private var botaomais: Button? = null
    private var botaomenos: Button? = null
    private var botaovezes: Button? = null
    private var botaodivisao: Button? = null
    private var botaoigual: Button? = null
    private var botaodeletar: Button? = null

    private var resultadocalc: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        botaozero = findViewById<Button>(R.id.botaozero)
        botaoum = findViewById<Button>(R.id.botaoum)
        botaodois = findViewById<Button>(R.id.botaodois)
        botaotres = findViewById<Button>(R.id.botaotres)
        botaoquatro = findViewById<Button>(R.id.botaoquatro)
        botaocinco = findViewById<Button>(R.id.botaocinco)
        botaoseis = findViewById<Button>(R.id.botaoseis)
        botaosete = findViewById<Button>(R.id.botaosete)
        botaooito = findViewById<Button>(R.id.botaooito)
        botaonove = findViewById<Button>(R.id.botaonove)

        botaovirgula = findViewById<Button>(R.id.botaovirgula)
        botaomais = findViewById<Button>(R.id.botaomais)
        botaomenos = findViewById<Button>(R.id.botaomenos)
        botaovezes = findViewById<Button>(R.id.botaovezes)
        botaodivisao = findViewById<Button>(R.id.botaodivisao)
        botaoigual = findViewById<Button>(R.id.botaoigual)
        botaodeletar = findViewById<Button>(R.id.botaodeletar)

        resultadocalc = findViewById<EditText>(R.id.resultadocalc)

        botaozero!!.setOnClickListener(this)
        botaoum!!.setOnClickListener(this)
        botaodois!!.setOnClickListener(this)
        botaotres!!.setOnClickListener(this)
        botaoquatro!!.setOnClickListener(this)
        botaocinco!!.setOnClickListener(this)
        botaoseis!!.setOnClickListener(this)
        botaosete!!.setOnClickListener(this)
        botaooito!!.setOnClickListener(this)
        botaonove!!.setOnClickListener(this)

        botaovirgula!!.setOnClickListener(this)
        botaomais!!.setOnClickListener(this)
        botaomenos!!.setOnClickListener(this)
        botaovezes!!.setOnClickListener(this)
        botaodivisao!!.setOnClickListener(this)
        botaoigual!!.setOnClickListener(this)
        botaodeletar!!.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        var resultado: Float

        when (v?.id) {
            R.id.botaozero -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "0")
            }
            R.id.botaoum -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "1")
            }
            R.id.botaodois -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "2")
            }
            R.id.botaotres -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "3")
            }
            R.id.botaoquatro -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "4")
            }
            R.id.botaocinco -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "5")
            }
            R.id.botaoseis -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "6")
            }
            R.id.botaosete -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "7")
            }
            R.id.botaooito -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "8")
            }
            R.id.botaonove -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + "9")
            }
            R.id.botaovirgula -> {
                resultadocalc?.setText(resultadocalc?.text.toString() + ",")
            }

            R.id.botaomais -> {

                valorAnterior = resultadocalc?.text.toString()
                resultadocalc?.setText("")
                operador = "+"
            }
            R.id.botaomenos -> {

                valorAnterior = resultadocalc?.text.toString()
                resultadocalc?.setText("")
                operador = "-"
            }
            R.id.botaovezes -> {

                valorAnterior = resultadocalc?.text.toString()
                resultadocalc?.setText("")
                operador = "*"
            }
            R.id.botaodivisao -> {

                valorAnterior = resultadocalc?.text.toString()
                resultadocalc?.setText("")
                operador = "/"
            }

            R.id.botaoigual -> {
                when (operador) {
                    "+" -> {

                        resultado = valorAnterior?.toFloat()!! + resultadocalc?.text.toString().toFloat()
                        resultadocalc?.setText(resultado.toString())
                    }
                    "-" -> {
                        resultado = valorAnterior?.toFloat()!! - resultadocalc?.text.toString().toFloat()
                        resultadocalc?.setText(resultado.toString())
                    }
                    "*" -> {
                        resultado = valorAnterior?.toFloat()!! * resultadocalc?.text.toString().toFloat()
                        resultadocalc?.setText(resultado.toString())
                    }
                    "/" -> {
                        resultado = (valorAnterior?.toDouble()!! / resultadocalc?.text.toString().toDouble()).toFloat()
                        resultadocalc?.setText(resultado.toString())
                    }
                }
            }

            R.id.botaodeletar -> {
                var aux = resultadocalc?.text.toString()
                if ((aux != null) && (!aux.equals(""))) {
                    aux = aux.substring(0, aux.length - 1)
                    resultadocalc?.setText(aux)
                }

            }
        }
    }
}
