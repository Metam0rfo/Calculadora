package com.example.tfbel.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var operador: String? = null
    private var valorAnterior: String? = null

    private var botaozero: Button?=null
    private var botaoum: Button?=null
    private var botaodois: Button?=null
    private var botaotres: Button?=null
    private var botaoquatro: Button?=null
    private var botaocinco: Button?=null
    private var botaoseis: Button?=null
    private var botaosete: Button?=null
    private var botaooito: Button?=null
    private var botaonove: Button?=null

    private var botaovirgula: Button?=null
    private var botaomais: Button?=null
    private var botaomenos: Button?=null
    private var botaovezes: Button?=null
    private var botaodivisao: Button?=null
    private var botaoigual : Button?=null
    private var botaodeletar : Button?=null

    private var resultadocalc : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        botaozero = findViewById<Button>(R.id.botaozero)
        botaoum = findViewById<Button>(R.id.botaoum)
        botaodois = findViewById<Button>(R.id.botaodois)
        botaotres= findViewById<Button>(R.id.botaotres)
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



        //etIngreso = findViewById<EditText>(R.id.etIngreso)
        //tvsigno=findViewById<TextView>(R.id.tvSigno)

    }
}
