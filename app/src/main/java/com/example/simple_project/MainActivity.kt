package com.example.simple_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.simple_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: Operattionview
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainactivityobje = this
        viewModel = ViewModelProvider(this).get(Operattionview::class.java)

        viewModel.result.observe(this, { s -> binding.resultview = s })


        /* val operations = arrayOf(binding.toplama, binding.vurma)
        operations.forEach { buttons ->
             buttons.setOnClickListener {
                 val alinansay1 = binding.sayi1.text.toString()
                 val alinansay2 = binding.sayi2.text.toString()
                 val say1 = alinansay1.toInt()
                 val sayi2 = alinansay2.toInt()
                 val toplam = say1 + sayi2
                 val vurma = say1 * sayi2
                 binding.textView.text = when (buttons) {
                     binding.toplama -> toplam.toString()
                     binding.vurma -> vurma.toString()


                     else -> {
                         "0"
                     }
                 }.toString()


             }
         }*/


    }

    fun toplama(alinansay1: String, alinansay2: String) {

        viewModel.toplama(alinansay1, alinansay2)


    }

    fun vurma(alinansay1: String, alinansay2: String) {

        viewModel.vurma(alinansay1, alinansay2)

    }
}
