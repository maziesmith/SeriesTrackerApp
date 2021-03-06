package hu.bme.aut.mobsoftlab.seriestrackerapp.interactor;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.mobsoftlab.seriestrackerapp.interactor.about.AboutInteractor;
import hu.bme.aut.mobsoftlab.seriestrackerapp.interactor.about.IAboutInteractor;
import hu.bme.aut.mobsoftlab.seriestrackerapp.interactor.details.DetailsInteractor;
import hu.bme.aut.mobsoftlab.seriestrackerapp.interactor.details.IDetailsInteractor;
import hu.bme.aut.mobsoftlab.seriestrackerapp.interactor.main.IMainInteractor;
import hu.bme.aut.mobsoftlab.seriestrackerapp.interactor.main.MainInteractor;
import hu.bme.aut.mobsoftlab.seriestrackerapp.interactor.newseries.INewSeriesInteractor;
import hu.bme.aut.mobsoftlab.seriestrackerapp.interactor.newseries.NewSeriesInteractor;

@Module
public class InteractorModule {

    @Provides
    public IMainInteractor provideMainInteractor() {
        return new MainInteractor();
    }

    @Provides
    public IAboutInteractor provideAboutInteractor() {
        return new AboutInteractor();
    }

    @Provides
    public IDetailsInteractor provideDetailsInteractor() {
        return new DetailsInteractor();
    }

    @Provides
    public INewSeriesInteractor provideNewSeriesInteractor() {
        return new NewSeriesInteractor();
    }
}
