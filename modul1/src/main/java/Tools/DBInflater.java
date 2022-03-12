package Tools;

import com.module1.modul1.model.Artist;
import com.module1.modul1.model.Song;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import repositories.ArtistRepo;
import repositories.SongRepo;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    private SongRepo songRepo;
    private ArtistRepo artistRepo;

    public DBInflater(SongRepo songRepo, ArtistRepo artistRepo) {
        this.songRepo = songRepo;
        this.artistRepo = artistRepo;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
    private void initData(){
        Artist Eminem = new Artist("Marshall", "Bruce ","Eminem" );
        Song WithoutMe = new Song("Without me", "rap", "1983129333","2003", "X");
                Eminem.getSongs().add(WithoutMe);
        WithoutMe.getArtists().add(Eminem);
        ArtistRepo.save(Eminem);
        SongRepo.save(WithoutMe);


        Artist ACDC = new Artist("Rock","Metal","ACDC");
        Song HighWayToHell = new Song("HighWayToHell", "rock", "1983129873",
                "1969", "London");
        ACDC.getSongs().add(HighWayToHell);
        HighWayToHell.getArtists().add(ACDC);
        ArtistRepo.save(ACDC);
        SongRepo.save(HighWayToHell);

        Artist Kali = new Artist("Marcin", "Gutkowski", "Kali");
        Song PantaRhei = new Song("PantaRhei", "rap", "1983129873",
                "1969", "Kato");
        Kali.getSongs().add(PantaRhei);
        PantaRhei.getArtists().add(Kali);
        ArtistRepo.save(Kali);
        SongRepo.save(PantaRhei);


    }

}
