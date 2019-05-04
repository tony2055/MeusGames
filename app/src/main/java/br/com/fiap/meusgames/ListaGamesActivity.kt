package br.com.fiap.meusgames

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import br.com.fiap.meusgames.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_games.*

class ListaGamesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_games)

        rvJogos.adapter = ListaGamesAdapter(
                meusJogos(), this, {
            Toast.makeText(
                    this,
                    it.nome,
                    Toast.LENGTH_LONG)
                    .show()
        })

        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    fun meusJogos(): List<Jogo>{
        return listOf(
                Jogo(R.drawable.acodissey,
                        "Assassin's Creed Odyssey",
                        2018,
                        "Aqui vou falar a descrição do jogo")
        )


    }
}
