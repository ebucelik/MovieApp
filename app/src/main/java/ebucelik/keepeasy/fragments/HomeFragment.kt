package ebucelik.keepeasy.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import ebucelik.keepeasy.dataclasses.Movie
import ebucelik.keepeasy.movieapp.R
import ebucelik.keepeasy.movieapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    companion object{
        lateinit var movie: Movie
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        setHasOptionsMenu(true)

        binding.cardButton.setOnClickListener { view : View ->
            movie = Movie(binding.cardTitle.text.toString(), resources.getString(R.string.description), 4.8f, "Comedy", binding.cardDirector.text.toString(), binding.cardActor.text.toString())

            view.findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
        }

        binding.card1Button.setOnClickListener { view : View ->
            movie = Movie(binding.card1Title.text.toString(), resources.getString(R.string.marvelsDescription), 5.0f, "Action, Comedy", binding.card1Director.text.toString(), binding.card1Actor.text.toString())

            view.findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
        }

        binding.card2Button.setOnClickListener { view : View ->
            movie = Movie(binding.card2Title.text.toString(), resources.getString(R.string.imitationDescription), 4.1f, "True Story", binding.card2Director.text.toString(), binding.card2Actor.text.toString())

            view.findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
        }

        binding.card3Button.setOnClickListener { view : View ->
            movie = Movie(binding.card3Title.text.toString(), resources.getString(R.string.wolfDescription), 4.6f, "Action, Comedy, True Story", binding.card3Director.text.toString(), binding.card3Actor.text.toString())

            view.findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
        }

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.home_fragment_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) || super.onOptionsItemSelected(item)
    }
}