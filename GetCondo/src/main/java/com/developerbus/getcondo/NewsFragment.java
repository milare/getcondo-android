package com.developerbus.getcondo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v4.app.ListFragment;
import android.widget.RelativeLayout;

import com.developerbus.getcondo.models.News;
import java.util.List;
import com.developerbus.getcondo.R;

import com.developerbus.getcondo.adapters.NewsArrayAdapter;

import java.util.ArrayList;

/**
 * Created by bruno on 11/21/13.
 */
public class NewsFragment extends ListFragment {

    ListView mNewsListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        View view = (View) inflater.inflate(R.layout.fragment_news, container, false);
        initializeGUI(view);
        return view;
    }

    private void initializeGUI(View view) {
        mNewsListView = (ListView) view.findViewById(android.R.id.list);
        final NewsArrayAdapter adapter = new NewsArrayAdapter(getActivity(), R.layout.row_news, retrieveNews());
        mNewsListView.setAdapter(adapter);
    }

    private List<News> retrieveNews() {
        ArrayList<News> news = new ArrayList<News>();
        News currentNews1 = new News();
        currentNews1.setTitle("DevFest São Paulo");
        currentNews1.setBody("Acontece neste final de semana, dia 23, mais uma edição do DevFest São Paulo.");
        news.add(currentNews1);

        News currentNews2 = new News();
        currentNews2.setTitle("O Developer Bus chega ao Brasil !");
        currentNews2.setBody("Depois de fazer suas paradas em Buenos Aires, Cidade do México e Bogotá, o reality show Google Developer Bus chega ao Brasil !");
        news.add(currentNews2);

        News currentNews3 = new News();
        currentNews3.setTitle("Android Developer agora fala português !");
        currentNews3.setBody("Com o objetivo de trazer cada vez mais conteúdo em português para a comunidade de desenvolvedores Android no Brasil, estamos sempre tentando trazer novidades.");
        news.add(currentNews3);

        News currentNews4 = new News();
        currentNews4.setTitle("Cursos online da Udacity: agora também em português e espanhol");
        currentNews4.setBody("Cursos online abertos e massivos, do inglês Massive Open Online Courses (MOOC), como o nosso curso gratuito, em parceria com a Udacity, de desenvolvimento de jogos");
        news.add(currentNews4);
        return (List) news;
    }
}