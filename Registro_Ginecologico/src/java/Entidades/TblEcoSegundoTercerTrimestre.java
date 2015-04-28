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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Julio Aldana
 */
@Entity
@Table(name = "tbl_eco_segundo_tercer_trimestre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findAll", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByIdEcoSegundoTercerTrimestre", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.idEcoSegundoTercerTrimestre = :idEcoSegundoTercerTrimestre"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByIdPaciente", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.idPaciente = :idPaciente"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByFur", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.fur = :fur"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByFpp", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.fpp = :fpp"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByEg", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.eg = :eg"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByFeto", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.feto = :feto"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByPresentacion", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.presentacion = :presentacion"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findBySituacion", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.situacion = :situacion"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByPosicion", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.posicion = :posicion"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioDbp", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioDbp = :bioDbp"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioFemur", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioFemur = :bioFemur"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioCerebelo", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioCerebelo = :bioCerebelo"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioIla", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioIla = :bioIla"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioCc", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioCc = :bioCc"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioTibia", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioTibia = :bioTibia"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioAtrio", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioAtrio = :bioAtrio"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioPef", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioPef = :bioPef"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioCa", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioCa = :bioCa"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioHumero", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioHumero = :bioHumero"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioCMagna", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioCMagna = :bioCMagna"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByBioSexo", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.bioSexo = :bioSexo"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByNodf", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.nodf = :nodf"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByNopt", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.nopt = :nopt"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByNoph", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.noph = :noph"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatCraneo", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatCraneo = :anatCraneo"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatRinones", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatRinones = :anatRinones"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatColumna", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatColumna = :anatColumna"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatEstomago", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatEstomago = :anatEstomago"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatRostro", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatRostro = :anatRostro"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatVejiga", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatVejiga = :anatVejiga"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatCorazon", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatCorazon = :anatCorazon"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatExtremidades", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatExtremidades = :anatExtremidades"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatAbdomen", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatAbdomen = :anatAbdomen"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatCordon", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatCordon = :anatCordon"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatIntestino", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatIntestino = :anatIntestino"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByAnatPlacenta", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.anatPlacenta = :anatPlacenta"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByPerfilTono", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.perfilTono = :perfilTono"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByPerfilMF", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.perfilMF = :perfilMF"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByPerfilMr", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.perfilMr = :perfilMr"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByPerfilLa", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.perfilLa = :perfilLa"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByPerfilPuntos", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.perfilPuntos = :perfilPuntos"),
    @NamedQuery(name = "TblEcoSegundoTercerTrimestre.findByConclusiones", query = "SELECT t FROM TblEcoSegundoTercerTrimestre t WHERE t.conclusiones = :conclusiones")})
public class TblEcoSegundoTercerTrimestre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Eco_Segundo_Tercer_Trimestre")
    private Integer idEcoSegundoTercerTrimestre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Paciente")
    private int idPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fur")
    private int fur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fpp")
    private int fpp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Eg")
    private int eg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Feto")
    private int feto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Presentacion")
    private int presentacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Situacion")
    private int situacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Posicion")
    private int posicion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Dbp")
    private int bioDbp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Femur")
    private int bioFemur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Cerebelo")
    private int bioCerebelo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Ila")
    private int bioIla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Cc")
    private int bioCc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Tibia")
    private int bioTibia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Atrio")
    private int bioAtrio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Pef")
    private int bioPef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Ca")
    private int bioCa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Humero")
    private int bioHumero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_C_Magna")
    private int bioCMagna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Bio_Sexo")
    private int bioSexo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nodf")
    private int nodf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nopt")
    private int nopt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Noph")
    private int noph;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Craneo")
    private int anatCraneo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Rinones")
    private int anatRinones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Columna")
    private int anatColumna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Estomago")
    private int anatEstomago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Rostro")
    private int anatRostro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Vejiga")
    private int anatVejiga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Corazon")
    private int anatCorazon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Extremidades")
    private int anatExtremidades;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Abdomen")
    private int anatAbdomen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Cordon")
    private int anatCordon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Intestino")
    private int anatIntestino;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anat_Placenta")
    private int anatPlacenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Perfil_Tono")
    private int perfilTono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Perfil_MF")
    private int perfilMF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Perfil_Mr")
    private int perfilMr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Perfil_La")
    private int perfilLa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Perfil_Puntos")
    private int perfilPuntos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Conclusiones")
    private int conclusiones;

    public TblEcoSegundoTercerTrimestre() {
    }

    public TblEcoSegundoTercerTrimestre(Integer idEcoSegundoTercerTrimestre) {
        this.idEcoSegundoTercerTrimestre = idEcoSegundoTercerTrimestre;
    }

    public TblEcoSegundoTercerTrimestre(Integer idEcoSegundoTercerTrimestre, int idPaciente, int fur, int fpp, int eg, int feto, int presentacion, int situacion, int posicion, int bioDbp, int bioFemur, int bioCerebelo, int bioIla, int bioCc, int bioTibia, int bioAtrio, int bioPef, int bioCa, int bioHumero, int bioCMagna, int bioSexo, int nodf, int nopt, int noph, int anatCraneo, int anatRinones, int anatColumna, int anatEstomago, int anatRostro, int anatVejiga, int anatCorazon, int anatExtremidades, int anatAbdomen, int anatCordon, int anatIntestino, int anatPlacenta, int perfilTono, int perfilMF, int perfilMr, int perfilLa, int perfilPuntos, int conclusiones) {
        this.idEcoSegundoTercerTrimestre = idEcoSegundoTercerTrimestre;
        this.idPaciente = idPaciente;
        this.fur = fur;
        this.fpp = fpp;
        this.eg = eg;
        this.feto = feto;
        this.presentacion = presentacion;
        this.situacion = situacion;
        this.posicion = posicion;
        this.bioDbp = bioDbp;
        this.bioFemur = bioFemur;
        this.bioCerebelo = bioCerebelo;
        this.bioIla = bioIla;
        this.bioCc = bioCc;
        this.bioTibia = bioTibia;
        this.bioAtrio = bioAtrio;
        this.bioPef = bioPef;
        this.bioCa = bioCa;
        this.bioHumero = bioHumero;
        this.bioCMagna = bioCMagna;
        this.bioSexo = bioSexo;
        this.nodf = nodf;
        this.nopt = nopt;
        this.noph = noph;
        this.anatCraneo = anatCraneo;
        this.anatRinones = anatRinones;
        this.anatColumna = anatColumna;
        this.anatEstomago = anatEstomago;
        this.anatRostro = anatRostro;
        this.anatVejiga = anatVejiga;
        this.anatCorazon = anatCorazon;
        this.anatExtremidades = anatExtremidades;
        this.anatAbdomen = anatAbdomen;
        this.anatCordon = anatCordon;
        this.anatIntestino = anatIntestino;
        this.anatPlacenta = anatPlacenta;
        this.perfilTono = perfilTono;
        this.perfilMF = perfilMF;
        this.perfilMr = perfilMr;
        this.perfilLa = perfilLa;
        this.perfilPuntos = perfilPuntos;
        this.conclusiones = conclusiones;
    }

    public Integer getIdEcoSegundoTercerTrimestre() {
        return idEcoSegundoTercerTrimestre;
    }

    public void setIdEcoSegundoTercerTrimestre(Integer idEcoSegundoTercerTrimestre) {
        this.idEcoSegundoTercerTrimestre = idEcoSegundoTercerTrimestre;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getFur() {
        return fur;
    }

    public void setFur(int fur) {
        this.fur = fur;
    }

    public int getFpp() {
        return fpp;
    }

    public void setFpp(int fpp) {
        this.fpp = fpp;
    }

    public int getEg() {
        return eg;
    }

    public void setEg(int eg) {
        this.eg = eg;
    }

    public int getFeto() {
        return feto;
    }

    public void setFeto(int feto) {
        this.feto = feto;
    }

    public int getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(int presentacion) {
        this.presentacion = presentacion;
    }

    public int getSituacion() {
        return situacion;
    }

    public void setSituacion(int situacion) {
        this.situacion = situacion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getBioDbp() {
        return bioDbp;
    }

    public void setBioDbp(int bioDbp) {
        this.bioDbp = bioDbp;
    }

    public int getBioFemur() {
        return bioFemur;
    }

    public void setBioFemur(int bioFemur) {
        this.bioFemur = bioFemur;
    }

    public int getBioCerebelo() {
        return bioCerebelo;
    }

    public void setBioCerebelo(int bioCerebelo) {
        this.bioCerebelo = bioCerebelo;
    }

    public int getBioIla() {
        return bioIla;
    }

    public void setBioIla(int bioIla) {
        this.bioIla = bioIla;
    }

    public int getBioCc() {
        return bioCc;
    }

    public void setBioCc(int bioCc) {
        this.bioCc = bioCc;
    }

    public int getBioTibia() {
        return bioTibia;
    }

    public void setBioTibia(int bioTibia) {
        this.bioTibia = bioTibia;
    }

    public int getBioAtrio() {
        return bioAtrio;
    }

    public void setBioAtrio(int bioAtrio) {
        this.bioAtrio = bioAtrio;
    }

    public int getBioPef() {
        return bioPef;
    }

    public void setBioPef(int bioPef) {
        this.bioPef = bioPef;
    }

    public int getBioCa() {
        return bioCa;
    }

    public void setBioCa(int bioCa) {
        this.bioCa = bioCa;
    }

    public int getBioHumero() {
        return bioHumero;
    }

    public void setBioHumero(int bioHumero) {
        this.bioHumero = bioHumero;
    }

    public int getBioCMagna() {
        return bioCMagna;
    }

    public void setBioCMagna(int bioCMagna) {
        this.bioCMagna = bioCMagna;
    }

    public int getBioSexo() {
        return bioSexo;
    }

    public void setBioSexo(int bioSexo) {
        this.bioSexo = bioSexo;
    }

    public int getNodf() {
        return nodf;
    }

    public void setNodf(int nodf) {
        this.nodf = nodf;
    }

    public int getNopt() {
        return nopt;
    }

    public void setNopt(int nopt) {
        this.nopt = nopt;
    }

    public int getNoph() {
        return noph;
    }

    public void setNoph(int noph) {
        this.noph = noph;
    }

    public int getAnatCraneo() {
        return anatCraneo;
    }

    public void setAnatCraneo(int anatCraneo) {
        this.anatCraneo = anatCraneo;
    }

    public int getAnatRinones() {
        return anatRinones;
    }

    public void setAnatRinones(int anatRinones) {
        this.anatRinones = anatRinones;
    }

    public int getAnatColumna() {
        return anatColumna;
    }

    public void setAnatColumna(int anatColumna) {
        this.anatColumna = anatColumna;
    }

    public int getAnatEstomago() {
        return anatEstomago;
    }

    public void setAnatEstomago(int anatEstomago) {
        this.anatEstomago = anatEstomago;
    }

    public int getAnatRostro() {
        return anatRostro;
    }

    public void setAnatRostro(int anatRostro) {
        this.anatRostro = anatRostro;
    }

    public int getAnatVejiga() {
        return anatVejiga;
    }

    public void setAnatVejiga(int anatVejiga) {
        this.anatVejiga = anatVejiga;
    }

    public int getAnatCorazon() {
        return anatCorazon;
    }

    public void setAnatCorazon(int anatCorazon) {
        this.anatCorazon = anatCorazon;
    }

    public int getAnatExtremidades() {
        return anatExtremidades;
    }

    public void setAnatExtremidades(int anatExtremidades) {
        this.anatExtremidades = anatExtremidades;
    }

    public int getAnatAbdomen() {
        return anatAbdomen;
    }

    public void setAnatAbdomen(int anatAbdomen) {
        this.anatAbdomen = anatAbdomen;
    }

    public int getAnatCordon() {
        return anatCordon;
    }

    public void setAnatCordon(int anatCordon) {
        this.anatCordon = anatCordon;
    }

    public int getAnatIntestino() {
        return anatIntestino;
    }

    public void setAnatIntestino(int anatIntestino) {
        this.anatIntestino = anatIntestino;
    }

    public int getAnatPlacenta() {
        return anatPlacenta;
    }

    public void setAnatPlacenta(int anatPlacenta) {
        this.anatPlacenta = anatPlacenta;
    }

    public int getPerfilTono() {
        return perfilTono;
    }

    public void setPerfilTono(int perfilTono) {
        this.perfilTono = perfilTono;
    }

    public int getPerfilMF() {
        return perfilMF;
    }

    public void setPerfilMF(int perfilMF) {
        this.perfilMF = perfilMF;
    }

    public int getPerfilMr() {
        return perfilMr;
    }

    public void setPerfilMr(int perfilMr) {
        this.perfilMr = perfilMr;
    }

    public int getPerfilLa() {
        return perfilLa;
    }

    public void setPerfilLa(int perfilLa) {
        this.perfilLa = perfilLa;
    }

    public int getPerfilPuntos() {
        return perfilPuntos;
    }

    public void setPerfilPuntos(int perfilPuntos) {
        this.perfilPuntos = perfilPuntos;
    }

    public int getConclusiones() {
        return conclusiones;
    }

    public void setConclusiones(int conclusiones) {
        this.conclusiones = conclusiones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEcoSegundoTercerTrimestre != null ? idEcoSegundoTercerTrimestre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEcoSegundoTercerTrimestre)) {
            return false;
        }
        TblEcoSegundoTercerTrimestre other = (TblEcoSegundoTercerTrimestre) object;
        if ((this.idEcoSegundoTercerTrimestre == null && other.idEcoSegundoTercerTrimestre != null) || (this.idEcoSegundoTercerTrimestre != null && !this.idEcoSegundoTercerTrimestre.equals(other.idEcoSegundoTercerTrimestre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TblEcoSegundoTercerTrimestre[ idEcoSegundoTercerTrimestre=" + idEcoSegundoTercerTrimestre + " ]";
    }
    
}
