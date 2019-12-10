package ru.godsonpeya.navgraph


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import ru.godsonpeya.navgraph.databinding.FragmentFailBinding

/**
 * A simple [Fragment] subclass.
 */
class FailFragment : Fragment() {
    private lateinit var binding: FragmentFailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_fail, container, false)

        val root: View = binding.root
        binding.tryAgainBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_failFragment_to_gameFragment)
        }
        return root
    }


}
