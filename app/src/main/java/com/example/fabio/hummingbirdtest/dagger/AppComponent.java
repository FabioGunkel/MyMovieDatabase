package com.example.fabio.hummingbirdtest.dagger;


import com.example.fabio.hummingbirdtest.ui.main.di.AppSubComponent;
import com.example.fabio.hummingbirdtest.ui.main.di.MoviesModule;
import com.example.fabio.hummingbirdtest.ui.main.MoviesPresenter;

import dagger.Component;

/**
 * Created by EUROCOM on 30/08/2017.
 */

@Component(modules = {
        AppModule.class })
public interface AppComponent {

    public void inject(MoviesPresenter moviesPresenter);

    public AppSubComponent movieModule(MoviesModule moviesModule);

}


