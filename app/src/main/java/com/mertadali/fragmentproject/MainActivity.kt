package com.mertadali.fragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mertadali.fragmentproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
    private fun firsFragment(view : View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = FirstFragment()

        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()

    }
    private fun secondFragment(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = SecondFragment()              // Add yaparsak üstüne ekler karmaşıklaşabilir replace ise önceki fragment kaldırır öyle ekler.

        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()

    }

}