package ru.godsonpeya.navgraph


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home.view.*
import ru.godsonpeya.navgraph.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate( inflater, R.layout.fragment_home, container, false)
        val root: View = binding.root

        binding.playGameBtn.setOnClickListener{view :View->
            view.findNavController().navigate(R.id.action_homeFragment_to_gameFragment)
        }

        return root
    }


}
