package com.gredi.manual_dependency_injection

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val viewModel: MainActivityViewModel by viewModels()

    private lateinit var button: Button
    private lateinit var textLabel: TextView

    // val repository: Repository by lazy { AppModule.repository }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViews()
    }

    private fun setUpViews() {
        button = findViewById(R.id.button_random_number)
        textLabel = findViewById(R.id.text_label)
        textLabel.text = viewModel.number.toString()

        button.setOnClickListener {
            viewModel.getRandomNumber()
            textLabel.text = viewModel.number.toString()
        }
    }
}