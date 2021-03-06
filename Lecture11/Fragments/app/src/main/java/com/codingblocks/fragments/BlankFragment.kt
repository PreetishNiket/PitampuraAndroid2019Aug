package com.codingblocks.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_blank.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = arguments?.getString("NAME")
        var list = arrayOf("")
        if (text == "MARVEL") {
            list = arrayOf("Iron Man", "Black Panther", "Thor", "Avengers")

        } else {
            list = arrayOf("AquaMan", "Superman", "Wonder Woman", "Joker", "Sucide Squad")

        }
        val adapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_expandable_list_item_1,
            list
        )
        lv.adapter = adapter

    }


}
