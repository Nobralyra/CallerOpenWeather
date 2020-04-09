package dat19v2.mandatory.api.v1.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class ApiOpenWeather
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String allOpenWeatherData;

    @Column(name = "CreatedDate", updatable=false)
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "ModifiedDate")
    @UpdateTimestamp
    private Timestamp modifiedDate;
}
