package com.example.unifrotas

import com.example.unifrotas.R;
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unifrotas.adapters.RecyclerCarroAdapter
import com.example.unifrotas.pojo.Carro


class MainActivity : AppCompatActivity() {
    var carros: ArrayList<Carro> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c1 = Carro(1, "Audi", "A5", "ABC-1234", "Preto", true)
        val c2 = Carro(1, "VW", "Passat", "GCH-1234", "Cinza", true)
        val c3 = Carro(1, "JAC", "J1", "ABD-1234", "Rosinha", false)
        carros.add(c1)
        carros.add(c2)
        carros.add(c3)
        carros.add(c1)
        carros.add(c2)
        carros.add(c3)
        carros.add(c1)
        carros.add(c2)
        carros.add(c3)
        carros.add(c1)
        carros.add(c2)
        carros.add(c3)
        iniciaRecyclerView()
    }

    private fun iniciaRecyclerView() {
        val rv = findViewById<RecyclerView>(R.id.lista_carros)
        val adaptador = RecyclerCarroAdapter(this, carros)
        rv.adapter = adaptador
        rv.addItemDecoration(DividerItemDecoration(rv.context, DividerItemDecoration.VERTICAL))
        rv.layoutManager = LinearLayoutManager(this)
    }
}
