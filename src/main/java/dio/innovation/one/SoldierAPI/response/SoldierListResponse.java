package dio.innovation.one.SoldierAPI.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.RepresentationModel;

public class SoldierListResponse extends RepresentationModel<SoldierListResponse> {

    private Long id;
    private String name;
    private String race;

    @JsonProperty("id")
    public Long getId() { return id; }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
