package com.example.iorga_elys_practicapmdmfinal.ui.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.iorga_elys_practicapmdmfinal.R
import com.example.iorga_elys_practicapmdmfinal.databinding.FragmentArticleBinding
import com.example.iorga_elys_practicapmdmfinal.ui.MainActivity
import com.example.iorga_elys_practicapmdmfinal.ui.NewsViewModel
import com.google.android.material.snackbar.Snackbar

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var newsViewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()
    lateinit var binding: FragmentArticleBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentArticleBinding.bind(view)

        newsViewModel = (activity as MainActivity).newsViewModel
        val article = args.article

        binding.webView.apply {
            webViewClient = WebViewClient()
            article.url?.let {
                loadUrl(it)
            }
        }

        binding.fab.setOnClickListener{

            newsViewModel.addToFavourites(article)
            Snackbar.make(view, "Añadido a favoritos", Snackbar.LENGTH_SHORT).show()

        }

    }



}