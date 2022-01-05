package ru.jopasquad.jopaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    var clickCount: UInt = 1u;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showAlertDialog()
    }

    private fun showAlertDialog() {
        val btn: Button = findViewById<Button>(R.id.button);

        btn.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setMessage("Ты нажал на кнопку $clickCount раз!")
                .show()

            clickCount++
        }
    }
}