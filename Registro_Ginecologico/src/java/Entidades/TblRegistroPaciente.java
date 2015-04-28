/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Julio Aldana
 */
@Entity
@Table(name = "tbl_registro_paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblRegistroPaciente.findAll", query = "SELECT t FROM TblRegistroPaciente t"),
    @NamedQuery(name = "TblRegistroPaciente.findByIdpaciente", query = "SELECT t FROM TblRegistroPaciente t WHERE t.idpaciente = :idpaciente"),
    @NamedQuery(name = "TblRegistroPaciente.findByNombre", query = "SELECT t FROM TblRegistroPaciente t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TblRegistroPaciente.findByApellido", query = "SELECT t FROM TblRegistroPaciente t WHERE t.apellido = :apellido"),
    @NamedQuery(name = "TblRegistroPaciente.findByCi", query = "SELECT t FROM TblRegistroPaciente t WHERE t.ci = :ci"),
    @NamedQuery(name = "TblRegistroPaciente.findByFechanacimiento", query = "SELECT t FROM TblRegistroPaciente t WHERE t.fechanacimiento = :fechanacimiento"),
    @NamedQuery(name = "TblRegistroPaciente.findByTlf", query = "SELECT t FROM TblRegistroPaciente t WHERE t.tlf = :tlf"),
    @NamedQuery(name = "TblRegistroPaciente.findByDireccion", query = "SELECT t FROM TblRegistroPaciente t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntfamiliares", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antfamiliares = :antfamiliares"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntpersonsales", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antpersonsales = :antpersonsales"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecomenarquia", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecomenarquia = :antginecomenarquia"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecosexarquia", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecosexarquia = :antginecosexarquia"),
    @NamedQuery(name = "TblRegistroPaciente.findByNumparejassexuales", query = "SELECT t FROM TblRegistroPaciente t WHERE t.numparejassexuales = :numparejassexuales"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecociclos", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecociclos = :antginecociclos"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecogestas", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecogestas = :antginecogestas"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecoparas", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecoparas = :antginecoparas"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecoabortos", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecoabortos = :antginecoabortos"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecopmf", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecopmf = :antginecopmf"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecofur", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecofur = :antginecofur"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecofpp", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecofpp = :antginecofpp"),
    @NamedQuery(name = "TblRegistroPaciente.findByAntginecoeg", query = "SELECT t FROM TblRegistroPaciente t WHERE t.antginecoeg = :antginecoeg"),
    @NamedQuery(name = "TblRegistroPaciente.findByTa", query = "SELECT t FROM TblRegistroPaciente t WHERE t.ta = :ta"),
    @NamedQuery(name = "TblRegistroPaciente.findByPeso", query = "SELECT t FROM TblRegistroPaciente t WHERE t.peso = :peso"),
    @NamedQuery(name = "TblRegistroPaciente.findByTalla", query = "SELECT t FROM TblRegistroPaciente t WHERE t.talla = :talla")})
public class TblRegistroPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_paciente")
    private Integer idpaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ci")
    private int ci;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tlf")
    private int tlf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 800)
    @Column(name = "Direccion")
    private String direccion;
    @Size(max = 500)
    @Column(name = "Ant_familiares")
    private String antfamiliares;
    @Size(max = 500)
    @Column(name = "Ant_personsales")
    private String antpersonsales;
    @Size(max = 500)
    @Column(name = "Ant_gineco_menarquia")
    private String antginecomenarquia;
    @Size(max = 500)
    @Column(name = "Ant_gineco_sexarquia")
    private String antginecosexarquia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Num_parejas_sexuales")
    private int numparejassexuales;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ant_gineco_ciclos")
    private int antginecociclos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ant_gineco_gestas")
    private int antginecogestas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ant_gineco_paras")
    private int antginecoparas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ant_gineco_abortos")
    private int antginecoabortos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ant_gineco_pmf")
    private int antginecopmf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ant_gineco_fur")
    private int antginecofur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ant_gineco_fpp")
    private int antginecofpp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Ant_gineco_eg")
    private String antginecoeg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ta")
    private int ta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Peso")
    private long peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Talla")
    private int talla;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpaciente", fetch = FetchType.EAGER)
    private List<TblControlPrenatal> tblControlPrenatalList;

    public TblRegistroPaciente() {
    }

    public TblRegistroPaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public TblRegistroPaciente(Integer idpaciente, String nombre, String apellido, int ci, Date fechanacimiento, int tlf, String direccion, int numparejassexuales, int antginecociclos, int antginecogestas, int antginecoparas, int antginecoabortos, int antginecopmf, int antginecofur, int antginecofpp, String antginecoeg, int ta, long peso, int talla) {
        this.idpaciente = idpaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.fechanacimiento = fechanacimiento;
        this.tlf = tlf;
        this.direccion = direccion;
        this.numparejassexuales = numparejassexuales;
        this.antginecociclos = antginecociclos;
        this.antginecogestas = antginecogestas;
        this.antginecoparas = antginecoparas;
        this.antginecoabortos = antginecoabortos;
        this.antginecopmf = antginecopmf;
        this.antginecofur = antginecofur;
        this.antginecofpp = antginecofpp;
        this.antginecoeg = antginecoeg;
        this.ta = ta;
        this.peso = peso;
        this.talla = talla;
    }

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAntfamiliares() {
        return antfamiliares;
    }

    public void setAntfamiliares(String antfamiliares) {
        this.antfamiliares = antfamiliares;
    }

    public String getAntpersonsales() {
        return antpersonsales;
    }

    public void setAntpersonsales(String antpersonsales) {
        this.antpersonsales = antpersonsales;
    }

    public String getAntginecomenarquia() {
        return antginecomenarquia;
    }

    public void setAntginecomenarquia(String antginecomenarquia) {
        this.antginecomenarquia = antginecomenarquia;
    }

    public String getAntginecosexarquia() {
        return antginecosexarquia;
    }

    public void setAntginecosexarquia(String antginecosexarquia) {
        this.antginecosexarquia = antginecosexarquia;
    }

    public int getNumparejassexuales() {
        return numparejassexuales;
    }

    public void setNumparejassexuales(int numparejassexuales) {
        this.numparejassexuales = numparejassexuales;
    }

    public int getAntginecociclos() {
        return antginecociclos;
    }

    public void setAntginecociclos(int antginecociclos) {
        this.antginecociclos = antginecociclos;
    }

    public int getAntginecogestas() {
        return antginecogestas;
    }

    public void setAntginecogestas(int antginecogestas) {
        this.antginecogestas = antginecogestas;
    }

    public int getAntginecoparas() {
        return antginecoparas;
    }

    public void setAntginecoparas(int antginecoparas) {
        this.antginecoparas = antginecoparas;
    }

    public int getAntginecoabortos() {
        return antginecoabortos;
    }

    public void setAntginecoabortos(int antginecoabortos) {
        this.antginecoabortos = antginecoabortos;
    }

    public int getAntginecopmf() {
        return antginecopmf;
    }

    public void setAntginecopmf(int antginecopmf) {
        this.antginecopmf = antginecopmf;
    }

    public int getAntginecofur() {
        return antginecofur;
    }

    public void setAntginecofur(int antginecofur) {
        this.antginecofur = antginecofur;
    }

    public int getAntginecofpp() {
        return antginecofpp;
    }

    public void setAntginecofpp(int antginecofpp) {
        this.antginecofpp = antginecofpp;
    }

    public String getAntginecoeg() {
        return antginecoeg;
    }

    public void setAntginecoeg(String antginecoeg) {
        this.antginecoeg = antginecoeg;
    }

    public int getTa() {
        return ta;
    }

    public void setTa(int ta) {
        this.ta = ta;
    }

    public long getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @XmlTransient
    public List<TblControlPrenatal> getTblControlPrenatalList() {
        return tblControlPrenatalList;
    }

    public void setTblControlPrenatalList(List<TblControlPrenatal> tblControlPrenatalList) {
        this.tblControlPrenatalList = tblControlPrenatalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaciente != null ? idpaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRegistroPaciente)) {
            return false;
        }
        TblRegistroPaciente other = (TblRegistroPaciente) object;
        if ((this.idpaciente == null && other.idpaciente != null) || (this.idpaciente != null && !this.idpaciente.equals(other.idpaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TblRegistroPaciente[ idpaciente=" + idpaciente + " ]";
    }
    
}
