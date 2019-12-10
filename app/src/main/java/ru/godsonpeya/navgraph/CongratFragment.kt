package ru.godsonpeya.navgraph


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import ru.godsonpeya.navgraph.databinding.FragmentCongratBinding

/**
 * A simple [Fragment] subclass.
 */
class CongratFragment : Fragment() {

    private lateinit var binding: FragmentCongratBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_congrat, container, false)
        val root: View = binding.root


        binding.nextMatchButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_congratFragment_to_gameFragment))
        return root
    }


}
