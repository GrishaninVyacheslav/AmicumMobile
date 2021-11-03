package com.e.amicummobile.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.amicummobile.adapters.RvGroupNotificationAdapter
import com.e.amicummobile.adapters.RvPersonalNotificationAdapter
import com.e.amicummobile.databinding.PersonalNotificationFragmentBinding
import com.e.amicummobile.viewmodel.StoreAmicum

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PersonalNotificationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PersonalNotificationFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var _binding: PersonalNotificationFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var storeAmicum: StoreAmicum

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = PersonalNotificationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        storeAmicum = ViewModelProvider(requireActivity()).get(StoreAmicum::class.java)

        val rvPersonalNotification = binding.rvPersonalNotification
        rvPersonalNotification.layoutManager = LinearLayoutManager(requireContext())

        rvPersonalNotification.adapter = storeAmicum.getNotificationPersonal().value?.let { RvPersonalNotificationAdapter(it) }

        storeAmicum.getNotificationAll().observe(viewLifecycleOwner, {
            rvPersonalNotification.adapter = RvPersonalNotificationAdapter(it)
        })

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PersonalNotificationFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PersonalNotificationFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}