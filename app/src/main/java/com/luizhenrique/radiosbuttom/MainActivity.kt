package com.luizhenrique.radiosbuttom

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luizhenrique.radiosbuttom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener{_,id ->
            when(id){
            R.id.radioBtnNotifica ->{
                Log.i("INFOTESTE", "Opção 1")
            }
            R.id.radioBtnNotifica2 ->{
                Log.i("INFOTESTE", "Opção 2")
            }
            R.id.radioBtnNotifica3 ->{
                Log.i("INFOTESTE", "Opção 3")
            }

            }
        }




    }
}