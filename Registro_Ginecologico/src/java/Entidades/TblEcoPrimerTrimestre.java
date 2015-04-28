/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Julio Aldana
 */
@Entity
@Table(name = "tbl_eco_primer_trimestre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEcoPrimerTrimestre.findAll", query = "SELECT t FROM TblEcoPrimerTrimestre t"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByUteAnexLongitudinal", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.uteAnexLongitudinal = :uteAnexLongitudinal"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByIdEcoPrimerTrimestre", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.idEcoPrimerTrimestre = :idEcoPrimerTrimestre"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByIdpaciente", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.idpaciente = :idpaciente"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByUteAnexAP", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.uteAnexAP = :uteAnexAP"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByUteAnexTranverso", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.uteAnexTranverso = :uteAnexTranverso"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByUteAnexLongitudCervical", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.uteAnexLongitudCervical = :uteAnexLongitudCervical"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findBySacoDms", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.sacoDms = :sacoDms"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findBySacoEquivalente", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.sacoEquivalente = :sacoEquivalente"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findBySacoCaracteristicas", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.sacoCaracteristicas = :sacoCaracteristicas"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByEmbrionVisualizable", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.embrionVisualizable = :embrionVisualizable"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByEmbrionNovisualizable", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.embrionNovisualizable = :embrionNovisualizable"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByEmbrionActivCardiaca", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.embrionActivCardiaca = :embrionActivCardiaca"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByEmbrionLcc", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.embrionLcc = :embrionLcc"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByEmbrionEquivalente", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.embrionEquivalente = :embrionEquivalente"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByEmbrionVisculaVitelina", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.embrionVisculaVitelina = :embrionVisculaVitelina"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByHallazgos", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.hallazgos = :hallazgos"),
    @NamedQuery(name = "TblEcoPrimerTrimestre.findByConclusiones", query = "SELECT t FROM TblEcoPrimerTrimestre t WHERE t.conclusiones = :conclusiones")})
public class TblEcoPrimerTrimestre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ute_Anex_Longitudinal")
    private int uteAnexLongitudinal;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Eco_Primer_Trimestre")
    private Integer idEcoPrimerTrimestre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_paciente")
    private int idpaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ute_Anex_AP")
    private int uteAnexAP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ute_Anex_Tranverso")
    private int uteAnexTranverso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ute_Anex_Longitud_Cervical")
    private int uteAnexLongitudCervical;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Saco_Dms")
    private int sacoDms;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Saco_Equivalente")
    private int sacoEquivalente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Saco_Caracteristicas")
    private int sacoCaracteristicas;
    @Column(name = "Embrion_Visualizable")
    private Boolean embrionVisualizable;
    @Column(name = "Embrion_Novisualizable")
    private Boolean embrionNovisualizable;
    @Column(name = "Embrion_Activ_Cardiaca")
    private Boolean embrionActivCardiaca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Embrion_Lcc")
    private long embrionLcc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Embrion_Equivalente")
    private String embrionEquivalente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Embrion_Viscula_Vitelina")
    private long embrionVisculaVitelina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Hallazgos")
    private String hallazgos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Conclusiones")
    private String conclusiones;

    public TblEcoPrimerTrimestre() {
    }

    public TblEcoPrimerTrimestre(Integer idEcoPrimerTrimestre) {
        this.idEcoPrimerTrimestre = idEcoPrimerTrimestre;
    }

    public TblEcoPrimerTrimestre(Integer idEcoPrimerTrimestre, int uteAnexLongitudinal, int idpaciente, int uteAnexAP, int uteAnexTranverso, int uteAnexLongitudCervical, int sacoDms, int sacoEquivalente, int sacoCaracteristicas, long embrionLcc, String embrionEquivalente, long embrionVisculaVitelina, String hallazgos, String conclusiones) {
        this.idEcoPrimerTrimestre = idEcoPrimerTrimestre;
        this.uteAnexLongitudinal = uteAnexLongitudinal;
        this.idpaciente = idpaciente;
        this.uteAnexAP = uteAnexAP;
        this.uteAnexTranverso = uteAnexTranverso;
        this.uteAnexLongitudCervical = uteAnexLongitudCervical;
        this.sacoDms = sacoDms;
        this.sacoEquivalente = sacoEquivalente;
        this.sacoCaracteristicas = sacoCaracteristicas;
        this.embrionLcc = embrionLcc;
        this.embrionEquivalente = embrionEquivalente;
        this.embrionVisculaVitelina = embrionVisculaVitelina;
        this.hallazgos = hallazgos;
        this.conclusiones = conclusiones;
    }

    public int getUteAnexLongitudinal() {
        return uteAnexLongitudinal;
    }

    public void setUteAnexLongitudinal(int uteAnexLongitudinal) {
        this.uteAnexLongitudinal = uteAnexLongitudinal;
    }

    public Integer getIdEcoPrimerTrimestre() {
        return idEcoPrimerTrimestre;
    }

    public void setIdEcoPrimerTrimestre(Integer idEcoPrimerTrimestre) {
        this.idEcoPrimerTrimestre = idEcoPrimerTrimestre;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public int getUteAnexAP() {
        return uteAnexAP;
    }

    public void setUteAnexAP(int uteAnexAP) {
        this.uteAnexAP = uteAnexAP;
    }

    public int getUteAnexTranverso() {
        return uteAnexTranverso;
    }

    public void setUteAnexTranverso(int uteAnexTranverso) {
        this.uteAnexTranverso = uteAnexTranverso;
    }

    public int getUteAnexLongitudCervical() {
        return uteAnexLongitudCervical;
    }

    public void setUteAnexLongitudCervical(int uteAnexLongitudCervical) {
        this.uteAnexLongitudCervical = uteAnexLongitudCervical;
    }

    public int getSacoDms() {
        return sacoDms;
    }

    public void setSacoDms(int sacoDms) {
        this.sacoDms = sacoDms;
    }

    public int getSacoEquivalente() {
        return sacoEquivalente;
    }

    public void setSacoEquivalente(int sacoEquivalente) {
        this.sacoEquivalente = sacoEquivalente;
    }

    public int getSacoCaracteristicas() {
        return sacoCaracteristicas;
    }

    public void setSacoCaracteristicas(int sacoCaracteristicas) {
        this.sacoCaracteristicas = sacoCaracteristicas;
    }

    public Boolean getEmbrionVisualizable() {
        return embrionVisualizable;
    }

    public void setEmbrionVisualizable(Boolean embrionVisualizable) {
        this.embrionVisualizable = embrionVisualizable;
    }

    public Boolean getEmbrionNovisualizable() {
        return embrionNovisualizable;
    }

    public void setEmbrionNovisualizable(Boolean embrionNovisualizable) {
        this.embrionNovisualizable = embrionNovisualizable;
    }

    public Boolean getEmbrionActivCardiaca() {
        return embrionActivCardiaca;
    }

    public void setEmbrionActivCardiaca(Boolean embrionActivCardiaca) {
        this.embrionActivCardiaca = embrionActivCardiaca;
    }

    public long getEmbrionLcc() {
        return embrionLcc;
    }

    public void setEmbrionLcc(long embrionLcc) {
        this.embrionLcc = embrionLcc;
    }

    public String getEmbrionEquivalente() {
        return embrionEquivalente;
    }

    public void setEmbrionEquivalente(String embrionEquivalente) {
        this.embrionEquivalente = embrionEquivalente;
    }

    public long getEmbrionVisculaVitelina() {
        return embrionVisculaVitelina;
    }

    public void setEmbrionVisculaVitelina(long embrionVisculaVitelina) {
        this.embrionVisculaVitelina = embrionVisculaVitelina;
    }

    public String getHallazgos() {
        return hallazgos;
    }

    public void setHallazgos(String hallazgos) {
        this.hallazgos = hallazgos;
    }

    public String getConclusiones() {
        return conclusiones;
    }

    public void setConclusiones(String conclusiones) {
        this.conclusiones = conclusiones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEcoPrimerTrimestre != null ? idEcoPrimerTrimestre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEcoPrimerTrimestre)) {
            return false;
        }
        TblEcoPrimerTrimestre other = (TblEcoPrimerTrimestre) object;
        if ((this.idEcoPrimerTrimestre == null && other.idEcoPrimerTrimestre != null) || (this.idEcoPrimerTrimestre != null && !this.idEcoPrimerTrimestre.equals(other.idEcoPrimerTrimestre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TblEcoPrimerTrimestre[ idEcoPrimerTrimestre=" + idEcoPrimerTrimestre + " ]";
    }
    
}
