package br.com.fiap.mobcidade

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InfoCarroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_carro)
    }

    fun voltarExplorar(view: View) {
        val intent = Intent(this, ExplorarActivity::class.java)
        startActivity(intent)
    }


}