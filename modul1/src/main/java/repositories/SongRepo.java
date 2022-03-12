package repositories;

import org.springframework.data.repository.CrudRepository;
import com.module1.modul1.model.Song;
public interface SongRepo extends CrudRepository<Song, Long>{
}
