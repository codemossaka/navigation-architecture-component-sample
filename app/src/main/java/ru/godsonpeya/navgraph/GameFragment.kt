package ru.godsonpeya.navgraph


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import ru.godsonpeya.navgraph.databinding.FragmentGameBinding

/**
 * A simple [Fragment] subclass.
 */
class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game, container, false)
        val root: View = binding.root

        binding.gameOverBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_gameFragment_to_failFragment))
        binding.successBtn.setOnClickListener{view :View->
            view.findNavController().navigate(R.id.action_gameFragment_to_congratFragment)
        }


        return root
    }


}
