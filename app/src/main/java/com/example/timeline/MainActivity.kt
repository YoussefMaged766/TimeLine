package com.example.timeline


import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.timeline.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        var date = SimpleDateFormat("yyyy-MMMM-dd", Locale.US).format(Calendar.getInstance().timeInMillis)
//        Log.e( "onCreate: ",date )

//        val superHero = resources.getStringArray(R.array.months)
        val arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.months, R.layout.spinner_month
        )

        arrayAdapter.setDropDownViewResource(R.layout.spinner_month)
        binding.spinner.adapter = arrayAdapter
    }
}