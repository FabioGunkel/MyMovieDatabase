package com.example.fabio.hummingbirdtest.ui.main;

import com.example.fabio.hummingbirdtest.BaseActivity;
import com.example.fabio.hummingbirdtest.data.Movie;

import java.util.List;

import javax.inject.Inject;

import dagger.Provides;

/**
 * Created by EUROCOM on 29/08/2017.
 */

public interface MoviesContract {

    interface view{
        void showMovieList(List<Movie> movies);
        public void makeFailureDialogBox();

        public void showLoadingDialog();
        public void hideLoadingDialog();

        void makeFailureToast();
    }

    interface UserActionsListener{
        void findMoviesByPopularity(int index);
        void findMoviesByKeyword(String movieName, int index);
    }
}
