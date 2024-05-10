package App.Application.Controllers;

import App.Domain.MediaType;
import App.Infrastructure.MediaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/MediaType")
public class MediaTypeController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private MediaTypeRepository mediaTypeRepository;

    public MediaTypeController() {
        this.mediaTypeRepository = new MediaTypeRepository();
    }

    @PostMapping("/")
    public int post(@RequestBody() MediaType mediatypecreate) {
        this.mediaTypeRepository.setDatabaseConnection(this.databaseConnection);
        this.mediaTypeRepository.create(mediatypecreate);
        return mediatypecreate.getMediaId();

    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") int id, @RequestBody() MediaType mediaType) {
        this.mediaTypeRepository.setDatabaseConnection(this.databaseConnection);
        this.mediaTypeRepository.update(id, mediaType);
    }

    @GetMapping("/{id}")
    public MediaType get(@PathVariable("id") int id) throws Exception {
        this.mediaTypeRepository.setDatabaseConnection(this.databaseConnection);
        return this.mediaTypeRepository.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        this.mediaTypeRepository.setDatabaseConnection(this.databaseConnection);
        this.mediaTypeRepository.delete(id);
    }

    @GetMapping("/")
    public List<MediaType> get() {
        this.mediaTypeRepository.setDatabaseConnection(this.databaseConnection);
        return this.mediaTypeRepository.get();
    }
}
