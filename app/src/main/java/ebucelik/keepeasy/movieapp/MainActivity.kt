package ebucelik.keepeasy.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import ebucelik.keepeasy.dataclasses.Movie
import ebucelik.keepeasy.movieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.movie = Movie("The Queen's Gambit", resources.getString(R.string.description), 4.5f, "Drama, Sport",
            "Scott Frank, Alan Scott", "Anya Taylor-Joy, Chloe Pirrie")

        binding.floatingActionButton.setOnClickListener {
            Toast.makeText(this, "FAB is clicked.", Toast.LENGTH_SHORT).show()
        }
    }
}