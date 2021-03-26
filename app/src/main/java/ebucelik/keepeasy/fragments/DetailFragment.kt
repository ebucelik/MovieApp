package ebucelik.keepeasy.fragments

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import ebucelik.keepeasy.dataclasses.Movie
import ebucelik.keepeasy.movieapp.R
import ebucelik.keepeasy.movieapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)

        binding.movie = Movie("The Queen's Gambit", resources.getString(R.string.description), 4.5f, "Drama, Sport",
            "Scott Frank, Alan Scott", "Anya Taylor-Joy, Chloe Pirrie")

        binding.floatingActionButton.setOnClickListener {
            Toast.makeText(activity?.baseContext, "FAB is clicked.", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}