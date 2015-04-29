/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Julio Aldana
 */
@Entity
@Table(name = "tbl_control_prenatal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblControlPrenatal.findAll", query = "SELECT t FROM TblControlPrenatal t"),
    @NamedQuery(name = "TblControlPrenatal.findByIdcontrolprenatal", query = "SELECT t FROM TblControlPrenatal t WHERE t.idcontrolprenatal = :idcontrolprenatal"),
    @NamedQuery(name = "TblControlPrenatal.findByFechaconsulta", query = "SELECT t FROM TblControlPrenatal t WHERE t.fechaconsulta = :fechaconsulta"),
    @NamedQuery(name = "TblControlPrenatal.findByTa", query = "SELECT t FROM TblControlPrenatal t WHERE t.ta = :ta"),
    @NamedQuery(name = "TblControlPrenatal.findByPeso", query = "SELECT t FROM TblControlPrenatal t WHERE t.peso = :peso"),
    @NamedQuery(name = "TblControlPrenatal.findByAu", query = "SELECT t FROM TblControlPrenatal t WHERE t.au = :au"),
    @NamedQuery(name = "TblControlPrenatal.findByFcf", query = "SELECT t FROM TblControlPrenatal t WHERE t.fcf = :fcf"),
    @NamedQuery(name = "TblControlPrenatal.findByEg", query = "SELECT t FROM TblControlPrenatal t WHERE t.eg = :eg"),
    @NamedQuery(name = "TblControlPrenatal.findByCita", query = "SELECT t FROM TblControlPrenatal t WHERE t.cita = :cita"),
    @NamedQuery(name = "TblControlPrenatal.findByTipaje", query = "SELECT t FROM TblControlPrenatal t WHERE t.tipaje = :tipaje"),
    @NamedQuery(name = "TblControlPrenatal.findBySerologiaviral", query = "SELECT t FROM TblControlPrenatal t WHERE t.serologiaviral = :serologiaviral"),
    @NamedQuery(name = "TblControlPrenatal.findByCitologia", query = "SELECT t FROM TblControlPrenatal t WHERE t.citologia = :citologia"),
    @NamedQuery(name = "TblControlPrenatal.findByLabHB", query = "SELECT t FROM TblControlPrenatal t WHERE t.labHB = :labHB"),
    @NamedQuery(name = "TblControlPrenatal.findByLabHTO", query = "SELECT t FROM TblControlPrenatal t WHERE t.labHTO = :labHTO"),
    @NamedQuery(name = "TblControlPrenatal.findByLabPLAQ", query = "SELECT t FROM TblControlPrenatal t WHERE t.labPLAQ = :labPLAQ"),
    @NamedQuery(name = "TblControlPrenatal.findByLabCB", query = "SELECT t FROM TblControlPrenatal t WHERE t.labCB = :labCB"),
    @NamedQuery(name = "TblControlPrenatal.findByLabSEG", query = "SELECT t FROM TblControlPrenatal t WHERE t.labSEG = :labSEG"),
    @NamedQuery(name = "TblControlPrenatal.findByLabLINF", query = "SELECT t FROM TblControlPrenatal t WHERE t.labLINF = :labLINF"),
    @NamedQuery(name = "TblControlPrenatal.findByLabEOSF", query = "SELECT t FROM TblControlPrenatal t WHERE t.labEOSF = :labEOSF"),
    @NamedQuery(name = "TblControlPrenatal.findByLabGLICEMIA", query = "SELECT t FROM TblControlPrenatal t WHERE t.labGLICEMIA = :labGLICEMIA"),
    @NamedQuery(name = "TblControlPrenatal.findByLabUREA", query = "SELECT t FROM TblControlPrenatal t WHERE t.labUREA = :labUREA"),
    @NamedQuery(name = "TblControlPrenatal.findByLabCREATININA", query = "SELECT t FROM TblControlPrenatal t WHERE t.labCREATININA = :labCREATININA"),
    @NamedQuery(name = "TblControlPrenatal.findByLabTGO", query = "SELECT t FROM TblControlPrenatal t WHERE t.labTGO = :labTGO"),
    @NamedQuery(name = "TblControlPrenatal.findByLabTGP", query = "SELECT t FROM TblControlPrenatal t WHERE t.labTGP = :labTGP"),
    @NamedQuery(name = "TblControlPrenatal.findByLabLDH", query = "SELECT t FROM TblControlPrenatal t WHERE t.labLDH = :labLDH"),
    @NamedQuery(name = "TblControlPrenatal.findByLabBT", query = "SELECT t FROM TblControlPrenatal t WHERE t.labBT = :labBT"),
    @NamedQuery(name = "TblControlPrenatal.findByLabBD", query = "SELECT t FROM TblControlPrenatal t WHERE t.labBD = :labBD"),
    @NamedQuery(name = "TblControlPrenatal.findByLabNI", query = "SELECT t FROM TblControlPrenatal t WHERE t.labNI = :labNI"),
    @NamedQuery(name = "TblControlPrenatal.findByLabPROTEINAST", query = "SELECT t FROM TblControlPrenatal t WHERE t.labPROTEINAST = :labPROTEINAST"),
    @NamedQuery(name = "TblControlPrenatal.findByLabELECTROLITOS", query = "SELECT t FROM TblControlPrenatal t WHERE t.labELECTROLITOS = :labELECTROLITOS"),
    @NamedQuery(name = "TblControlPrenatal.findByLabHIV", query = "SELECT t FROM TblControlPrenatal t WHERE t.labHIV = :labHIV"),
    @NamedQuery(name = "TblControlPrenatal.findByLabVDRL", query = "SELECT t FROM TblControlPrenatal t WHERE t.labVDRL = :labVDRL"),
    @NamedQuery(name = "TblControlPrenatal.findByLabPT", query = "SELECT t FROM TblControlPrenatal t WHERE t.labPT = :labPT"),
    @NamedQuery(name = "TblControlPrenatal.findByLabPTT", query = "SELECT t FROM TblControlPrenatal t WHERE t.labPTT = :labPTT"),
    @NamedQuery(name = "TblControlPrenatal.findByUroanalisis", query = "SELECT t FROM TblControlPrenatal t WHERE t.uroanalisis = :uroanalisis"),
    @NamedQuery(name = "TblControlPrenatal.findByUrocultivo", query = "SELECT t FROM TblControlPrenatal t WHERE t.urocultivo = :urocultivo"),
    @NamedQuery(name = "TblControlPrenatal.findByEcosonograma", query = "SELECT t FROM TblControlPrenatal t WHERE t.ecosonograma = :ecosonograma"),
    @NamedQuery(name = "TblControlPrenatal.findByObservaciones", query = "SELECT t FROM TblControlPrenatal t WHERE t.observaciones = :observaciones"),
    @NamedQuery(name = "TblControlPrenatal.findByIndicaciones", query = "SELECT t FROM TblControlPrenatal t WHERE t.indicaciones = :indicaciones")})
public class TblControlPrenatal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_control_prenatal")
    private Integer idcontrolprenatal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_consulta")
    @Temporal(TemporalType.DATE)
    private Date fechaconsulta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Ta")
    private String ta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Peso")
    private String peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Au")
    private int au;
    @Size(max = 2)
    @Column(name = "Fcf")
    private String fcf;
    @Size(max = 11)
    @Column(name = "Eg")
    private String eg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cita")
    @Temporal(TemporalType.DATE)
    private Date cita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tipaje")
    private int tipaje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Serologia_viral")
    private String serologiaviral;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Citologia")
    private String citologia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_HB")
    private int labHB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_HTO")
    private int labHTO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_PLAQ")
    private int labPLAQ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_CB")
    private int labCB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_SEG")
    private int labSEG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_LINF")
    private int labLINF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_EOSF")
    private int labEOSF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_GLICEMIA")
    private int labGLICEMIA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_UREA")
    private int labUREA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_CREATININA")
    private int labCREATININA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_TGO")
    private int labTGO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_TGP")
    private int labTGP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_LDH")
    private int labLDH;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_BT")
    private int labBT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_BD")
    private int labBD;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_NI")
    private int labNI;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_PROTEINAS_T")
    private int labPROTEINAST;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_ELECTROLITOS")
    private int labELECTROLITOS;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_HIV")
    private int labHIV;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_VDRL")
    private int labVDRL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_PT")
    private int labPT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lab_PTT")
    private int labPTT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Uroanalisis")
    private int uroanalisis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Urocultivo")
    private int urocultivo;
    @Size(max = 500)
    @Column(name = "Ecosonograma")
    private String ecosonograma;
    @Size(max = 500)
    @Column(name = "Observaciones")
    private String observaciones;
    @Size(max = 500)
    @Column(name = "Indicaciones")
    private String indicaciones;
    @JoinColumn(name = "Id_paciente", referencedColumnName = "Id_paciente")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TblRegistroPaciente idpaciente;

    public TblControlPrenatal() {
    }

    public TblControlPrenatal(Integer idcontrolprenatal) {
        this.idcontrolprenatal = idcontrolprenatal;
    }

    public TblControlPrenatal(Integer idcontrolprenatal, Date fechaconsulta, String ta, String peso, int au, Date cita, int tipaje, String serologiaviral, String citologia, int labHB, int labHTO, int labPLAQ, int labCB, int labSEG, int labLINF, int labEOSF, int labGLICEMIA, int labUREA, int labCREATININA, int labTGO, int labTGP, int labLDH, int labBT, int labBD, int labNI, int labPROTEINAST, int labELECTROLITOS, int labHIV, int labVDRL, int labPT, int labPTT, int uroanalisis, int urocultivo) {
        this.idcontrolprenatal = idcontrolprenatal;
        this.fechaconsulta = fechaconsulta;
        this.ta = ta;
        this.peso = peso;
        this.au = au;
        this.cita = cita;
        this.tipaje = tipaje;
        this.serologiaviral = serologiaviral;
        this.citologia = citologia;
        this.labHB = labHB;
        this.labHTO = labHTO;
        this.labPLAQ = labPLAQ;
        this.labCB = labCB;
        this.labSEG = labSEG;
        this.labLINF = labLINF;
        this.labEOSF = labEOSF;
        this.labGLICEMIA = labGLICEMIA;
        this.labUREA = labUREA;
        this.labCREATININA = labCREATININA;
        this.labTGO = labTGO;
        this.labTGP = labTGP;
        this.labLDH = labLDH;
        this.labBT = labBT;
        this.labBD = labBD;
        this.labNI = labNI;
        this.labPROTEINAST = labPROTEINAST;
        this.labELECTROLITOS = labELECTROLITOS;
        this.labHIV = labHIV;
        this.labVDRL = labVDRL;
        this.labPT = labPT;
        this.labPTT = labPTT;
        this.uroanalisis = uroanalisis;
        this.urocultivo = urocultivo;
    }

    public Integer getIdcontrolprenatal() {
        return idcontrolprenatal;
    }

    public void setIdcontrolprenatal(Integer idcontrolprenatal) {
        this.idcontrolprenatal = idcontrolprenatal;
    }

    public Date getFechaconsulta() {
        return fechaconsulta;
    }

    public void setFechaconsulta(Date fechaconsulta) {
        this.fechaconsulta = fechaconsulta;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getAu() {
        return au;
    }

    public void setAu(int au) {
        this.au = au;
    }

    public String getFcf() {
        return fcf;
    }

    public void setFcf(String fcf) {
        this.fcf = fcf;
    }

    public String getEg() {
        return eg;
    }

    public void setEg(String eg) {
        this.eg = eg;
    }

    public Date getCita() {
        return cita;
    }

    public void setCita(Date cita) {
        this.cita = cita;
    }

    public int getTipaje() {
        return tipaje;
    }

    public void setTipaje(int tipaje) {
        this.tipaje = tipaje;
    }

    public String getSerologiaviral() {
        return serologiaviral;
    }

    public void setSerologiaviral(String serologiaviral) {
        this.serologiaviral = serologiaviral;
    }

    public String getCitologia() {
        return citologia;
    }

    public void setCitologia(String citologia) {
        this.citologia = citologia;
    }

    public int getLabHB() {
        return labHB;
    }

    public void setLabHB(int labHB) {
        this.labHB = labHB;
    }

    public int getLabHTO() {
        return labHTO;
    }

    public void setLabHTO(int labHTO) {
        this.labHTO = labHTO;
    }

    public int getLabPLAQ() {
        return labPLAQ;
    }

    public void setLabPLAQ(int labPLAQ) {
        this.labPLAQ = labPLAQ;
    }

    public int getLabCB() {
        return labCB;
    }

    public void setLabCB(int labCB) {
        this.labCB = labCB;
    }

    public int getLabSEG() {
        return labSEG;
    }

    public void setLabSEG(int labSEG) {
        this.labSEG = labSEG;
    }

    public int getLabLINF() {
        return labLINF;
    }

    public void setLabLINF(int labLINF) {
        this.labLINF = labLINF;
    }

    public int getLabEOSF() {
        return labEOSF;
    }

    public void setLabEOSF(int labEOSF) {
        this.labEOSF = labEOSF;
    }

    public int getLabGLICEMIA() {
        return labGLICEMIA;
    }

    public void setLabGLICEMIA(int labGLICEMIA) {
        this.labGLICEMIA = labGLICEMIA;
    }

    public int getLabUREA() {
        return labUREA;
    }

    public void setLabUREA(int labUREA) {
        this.labUREA = labUREA;
    }

    public int getLabCREATININA() {
        return labCREATININA;
    }

    public void setLabCREATININA(int labCREATININA) {
        this.labCREATININA = labCREATININA;
    }

    public int getLabTGO() {
        return labTGO;
    }

    public void setLabTGO(int labTGO) {
        this.labTGO = labTGO;
    }

    public int getLabTGP() {
        return labTGP;
    }

    public void setLabTGP(int labTGP) {
        this.labTGP = labTGP;
    }

    public int getLabLDH() {
        return labLDH;
    }

    public void setLabLDH(int labLDH) {
        this.labLDH = labLDH;
    }

    public int getLabBT() {
        return labBT;
    }

    public void setLabBT(int labBT) {
        this.labBT = labBT;
    }

    public int getLabBD() {
        return labBD;
    }

    public void setLabBD(int labBD) {
        this.labBD = labBD;
    }

    public int getLabNI() {
        return labNI;
    }

    public void setLabNI(int labNI) {
        this.labNI = labNI;
    }

    public int getLabPROTEINAST() {
        return labPROTEINAST;
    }

    public void setLabPROTEINAST(int labPROTEINAST) {
        this.labPROTEINAST = labPROTEINAST;
    }

    public int getLabELECTROLITOS() {
        return labELECTROLITOS;
    }

    public void setLabELECTROLITOS(int labELECTROLITOS) {
        this.labELECTROLITOS = labELECTROLITOS;
    }

    public int getLabHIV() {
        return labHIV;
    }

    public void setLabHIV(int labHIV) {
        this.labHIV = labHIV;
    }

    public int getLabVDRL() {
        return labVDRL;
    }

    public void setLabVDRL(int labVDRL) {
        this.labVDRL = labVDRL;
    }

    public int getLabPT() {
        return labPT;
    }

    public void setLabPT(int labPT) {
        this.labPT = labPT;
    }

    public int getLabPTT() {
        return labPTT;
    }

    public void setLabPTT(int labPTT) {
        this.labPTT = labPTT;
    }

    public int getUroanalisis() {
        return uroanalisis;
    }

    public void setUroanalisis(int uroanalisis) {
        this.uroanalisis = uroanalisis;
    }

    public int getUrocultivo() {
        return urocultivo;
    }

    public void setUrocultivo(int urocultivo) {
        this.urocultivo = urocultivo;
    }

    public String getEcosonograma() {
        return ecosonograma;
    }

    public void setEcosonograma(String ecosonograma) {
        this.ecosonograma = ecosonograma;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public TblRegistroPaciente getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(TblRegistroPaciente idpaciente) {
        this.idpaciente = idpaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontrolprenatal != null ? idcontrolprenatal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblControlPrenatal)) {
            return false;
        }
        TblControlPrenatal other = (TblControlPrenatal) object;
        if ((this.idcontrolprenatal == null && other.idcontrolprenatal != null) || (this.idcontrolprenatal != null && !this.idcontrolprenatal.equals(other.idcontrolprenatal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TblControlPrenatal[ idcontrolprenatal=" + idcontrolprenatal + " ]";
    }
    
}
