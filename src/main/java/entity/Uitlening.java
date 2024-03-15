package entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "uitleningen")
public class Uitlening {

    public Uitlening() {
        // Standaard constructor
    }

    public Uitlening(Lid lid, Boek boek, Date uitgeleendOp) {
        this.lid = lid;
        this.boek = boek;
        this.uitgeleendOp = uitgeleendOp;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Uitlening_id;

    // Definieert een many-to-one relatie met Lid entiteit.
    // Ophalen van Lid gebeurt 'lui' (LAZY). Gebruikt 'lid_id' als de join-kolom.

    @JsonBackReference(value = "uitleenLid")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lid_id")
    private Lid lid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "boek_id")
    private Boek boek;

    @Column(name = "uitgeleend_op")
    @Temporal(TemporalType.DATE)
    private Date uitgeleendOp;

    @Column(name = "teruggebracht_op")
    @Temporal(TemporalType.DATE)
    private Date teruggebrachtOp;

    public int getId() { return Uitlening_id; }
    public void setId(int id) { this.Uitlening_id = id; }
    public Lid getLid() { return lid; }
    public void setLid(Lid lid) { this.lid = lid; }
    public Boek getBoek() { return boek; }
    public void setBoek(Boek boek) { this.boek = boek; }
    public Date getUitgeleendOp() { return uitgeleendOp; }
    public void setUitgeleendOp(Date uitgeleendOp) { this.uitgeleendOp = uitgeleendOp; }
    public Date getTeruggebrachtOp() { return teruggebrachtOp; }
    public void setTeruggebrachtOp(Date teruggebrachtOp) { this.teruggebrachtOp = teruggebrachtOp; }
}
