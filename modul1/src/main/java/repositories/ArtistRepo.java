package repositories;
import com.module1.modul1.model.Artist;
import org.springframework.data.repository.CrudRepository;
import com.module1.modul1.model.Song;

public interface ArtistRepo extends CrudRepository<Artist, Long>{
}
