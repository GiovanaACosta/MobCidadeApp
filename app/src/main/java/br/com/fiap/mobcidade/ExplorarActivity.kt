package br.com.fiap.mobcidade

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.ProgressBar
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class ExplorarActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explorar)

        videoView = findViewById(R.id.videoView)
        progressBar = findViewById(R.id.progressBar)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        val videoResource = R.raw.meuvideo
        val uri = Uri.parse("android.resource://${packageName}/${videoResource}")
        videoView.setVideoURI(uri)

        videoView.setOnCompletionListener {
            videoView.start()
        }

        videoView.setOnPreparedListener {
            progressBar.visibility = View.GONE
            videoView.start()
        }
    }

    fun voltarMapa(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun acessarCarro(view: View) {
        val intent = Intent(this, InfoCarroActivity::class.java)
        startActivity(intent)
    }
}
