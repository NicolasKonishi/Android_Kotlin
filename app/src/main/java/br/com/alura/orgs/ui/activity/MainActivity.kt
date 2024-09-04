package br.com.alura.orgs.ui.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        /*val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"

        val descricao =findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, manga e maca"

        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "19.99"*/
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "teste",
                    descricao = "bom",
                    valor = BigDecimal("19.90")
                ),
                Produto(
                    nome = "teste1",
                    descricao = "ruim",
                    valor = BigDecimal("10.90")
                ),
                Produto(
                    nome = "teste2",
                    descricao = "legal",
                    valor = BigDecimal("12.90")
                ),
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}