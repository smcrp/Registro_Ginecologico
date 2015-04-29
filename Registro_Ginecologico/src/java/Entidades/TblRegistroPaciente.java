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
    @NamedQuery(name = "TblRegistroPaciente.findByTalla", query = "SELECT t FROM TblRegistroPaciente t WHERE t.talla = :talla"),
    @NamedQuery(name = "TblRegistroPaciente.findByGeneral", query = "SELECT t FROM TblRegistroPaciente t WHERE t.general = :general"),
    @NamedQuery(name = "TblRegistroPaciente.findByMamas", query = "SELECT t FROM TblRegistroPaciente t WHERE t.mamas = :mamas"),
    @NamedQuery(name = "TblRegistroPaciente.findByAbdomen", query = "SELECT t FROM TblRegistroPaciente t WHERE t.abdomen = :abdomen"),
    @NamedQuery(name = "TblRegistroPaciente.findByGenitalesExternos", query = "SELECT t FROM TblRegistroPaciente t WHERE t.genitalesExternos = :genitalesExternos"),
    @NamedQuery(name = "TblRegistroPaciente.findByVaginaCuelloUterino", query = "SELECT t FROM TblRegistroPaciente t WHERE t.vaginaCuelloUterino = :vaginaCuelloUterino"),
    @NamedQuery(name = "TblRegistroPaciente.findByUteroAnexos", query = "SELECT t FROM TblRegistroPaciente t WHERE t.uteroAnexos = :uteroAnexos"),
    @NamedQuery(name = "TblRegistroPaciente.findByColposcopia", query = "SELECT t FROM TblRegistroPaciente t WHERE t.colposcopia = :colposcopia"),
    @NamedQuery(name = "TblRegistroPaciente.findByTsctoRectal", query = "SELECT t FROM TblRegistroPaciente t WHERE t.tsctoRectal = :tsctoRectal"),
    @NamedQuery(name = "TblRegistroPaciente.findByDiagnostico", query = "SELECT t FROM TblRegistroPaciente t WHERE t.diagnostico = :diagnostico"),
    @NamedQuery(name = "TblRegistroPaciente.findByPlan", query = "SELECT t FROM TblRegistroPaciente t WHERE t.plan = :plan"),
    @NamedQuery(name = "TblRegistroPaciente.findByTipeaje", query = "SELECT t FROM TblRegistroPaciente t WHERE t.tipeaje = :tipeaje"),
    @NamedQuery(name = "TblRegistroPaciente.findByTipeajePareja", query = "SELECT t FROM TblRegistroPaciente t WHERE t.tipeajePareja = :tipeajePareja"),
    @NamedQuery(name = "TblRegistroPaciente.findByVih", query = "SELECT t FROM TblRegistroPaciente t WHERE t.vih = :vih"),
    @NamedQuery(name = "TblRegistroPaciente.findByVihFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.vihFecha = :vihFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByVdrl", query = "SELECT t FROM TblRegistroPaciente t WHERE t.vdrl = :vdrl"),
    @NamedQuery(name = "TblRegistroPaciente.findByVdrlFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.vdrlFecha = :vdrlFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByNota", query = "SELECT t FROM TblRegistroPaciente t WHERE t.nota = :nota"),
    @NamedQuery(name = "TblRegistroPaciente.findByHepB", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hepB = :hepB"),
    @NamedQuery(name = "TblRegistroPaciente.findByHepBFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hepBFecha = :hepBFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByHepC", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hepC = :hepC"),
    @NamedQuery(name = "TblRegistroPaciente.findByHepCFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hepCFecha = :hepCFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByToxotest", query = "SELECT t FROM TblRegistroPaciente t WHERE t.toxotest = :toxotest"),
    @NamedQuery(name = "TblRegistroPaciente.findByToxotestFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.toxotestFecha = :toxotestFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByCmv", query = "SELECT t FROM TblRegistroPaciente t WHERE t.cmv = :cmv"),
    @NamedQuery(name = "TblRegistroPaciente.findByCmvFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.cmvFecha = :cmvFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByRubeola", query = "SELECT t FROM TblRegistroPaciente t WHERE t.rubeola = :rubeola"),
    @NamedQuery(name = "TblRegistroPaciente.findByRubeolaFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.rubeolaFecha = :rubeolaFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByHs", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hs = :hs"),
    @NamedQuery(name = "TblRegistroPaciente.findByHsFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hsFecha = :hsFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByHc", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hc = :hc"),
    @NamedQuery(name = "TblRegistroPaciente.findByHcFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hcFecha = :hcFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByGb", query = "SELECT t FROM TblRegistroPaciente t WHERE t.gb = :gb"),
    @NamedQuery(name = "TblRegistroPaciente.findByLeucocitos", query = "SELECT t FROM TblRegistroPaciente t WHERE t.leucocitos = :leucocitos"),
    @NamedQuery(name = "TblRegistroPaciente.findByPlaquetas", query = "SELECT t FROM TblRegistroPaciente t WHERE t.plaquetas = :plaquetas"),
    @NamedQuery(name = "TblRegistroPaciente.findByHb", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hb = :hb"),
    @NamedQuery(name = "TblRegistroPaciente.findByHcto", query = "SELECT t FROM TblRegistroPaciente t WHERE t.hcto = :hcto"),
    @NamedQuery(name = "TblRegistroPaciente.findByQuimica", query = "SELECT t FROM TblRegistroPaciente t WHERE t.quimica = :quimica"),
    @NamedQuery(name = "TblRegistroPaciente.findByGlicemia", query = "SELECT t FROM TblRegistroPaciente t WHERE t.glicemia = :glicemia"),
    @NamedQuery(name = "TblRegistroPaciente.findByUrea", query = "SELECT t FROM TblRegistroPaciente t WHERE t.urea = :urea"),
    @NamedQuery(name = "TblRegistroPaciente.findByCreatinina", query = "SELECT t FROM TblRegistroPaciente t WHERE t.creatinina = :creatinina"),
    @NamedQuery(name = "TblRegistroPaciente.findByAst", query = "SELECT t FROM TblRegistroPaciente t WHERE t.ast = :ast"),
    @NamedQuery(name = "TblRegistroPaciente.findByAlt", query = "SELECT t FROM TblRegistroPaciente t WHERE t.alt = :alt"),
    @NamedQuery(name = "TblRegistroPaciente.findByColesterol", query = "SELECT t FROM TblRegistroPaciente t WHERE t.colesterol = :colesterol"),
    @NamedQuery(name = "TblRegistroPaciente.findByTrigliceridos", query = "SELECT t FROM TblRegistroPaciente t WHERE t.trigliceridos = :trigliceridos"),
    @NamedQuery(name = "TblRegistroPaciente.findByUroanalisis", query = "SELECT t FROM TblRegistroPaciente t WHERE t.uroanalisis = :uroanalisis"),
    @NamedQuery(name = "TblRegistroPaciente.findByUroanalisisFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.uroanalisisFecha = :uroanalisisFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByCitologia", query = "SELECT t FROM TblRegistroPaciente t WHERE t.citologia = :citologia"),
    @NamedQuery(name = "TblRegistroPaciente.findByCitologiaFecha", query = "SELECT t FROM TblRegistroPaciente t WHERE t.citologiaFecha = :citologiaFecha"),
    @NamedQuery(name = "TblRegistroPaciente.findByCitologiaOtros", query = "SELECT t FROM TblRegistroPaciente t WHERE t.citologiaOtros = :citologiaOtros")})
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
    @Column(name = "Tlf")
    private Integer tlf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Direccion")
    private String direccion;
    @Size(max = 150)
    @Column(name = "Ant_familiares")
    private String antfamiliares;
    @Size(max = 150)
    @Column(name = "Ant_personsales")
    private String antpersonsales;
    @Column(name = "Ant_gineco_menarquia")
    private Integer antginecomenarquia;
    @Column(name = "Ant_gineco_sexarquia")
    private Integer antginecosexarquia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Num_parejas_sexuales")
    private int numparejassexuales;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Ant_gineco_ciclos")
    private String antginecociclos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Ant_gineco_gestas")
    private String antginecogestas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Ant_gineco_paras")
    private String antginecoparas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Ant_gineco_abortos")
    private String antginecoabortos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Ant_gineco_pmf")
    private String antginecopmf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ant_gineco_fur")
    @Temporal(TemporalType.DATE)
    private Date antginecofur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ant_gineco_fpp")
    @Temporal(TemporalType.DATE)
    private Date antginecofpp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "Ant_gineco_eg")
    private String antginecoeg;
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
    @Size(min = 1, max = 5)
    @Column(name = "Talla")
    private String talla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "General")
    private String general;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Mamas")
    private String mamas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Abdomen")
    private String abdomen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Genitales_Externos")
    private String genitalesExternos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Vagina_Cuello_Uterino")
    private String vaginaCuelloUterino;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Utero_Anexos")
    private String uteroAnexos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Colposcopia")
    private String colposcopia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Tscto_Rectal")
    private String tsctoRectal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Diagnostico")
    private String diagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Plan")
    private String plan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Tipeaje")
    private String tipeaje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Tipeaje_Pareja")
    private String tipeajePareja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Vih")
    private String vih;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Vih_Fecha")
    @Temporal(TemporalType.DATE)
    private Date vihFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Vdrl")
    private String vdrl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Vdrl_Fecha")
    @Temporal(TemporalType.DATE)
    private Date vdrlFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nota")
    private String nota;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Hep_B")
    private String hepB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hep_B_Fecha")
    @Temporal(TemporalType.DATE)
    private Date hepBFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Hep_C")
    private String hepC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hep_C_Fecha")
    @Temporal(TemporalType.DATE)
    private Date hepCFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Toxotest")
    private String toxotest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Toxotest_Fecha")
    @Temporal(TemporalType.DATE)
    private Date toxotestFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Cmv")
    private String cmv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cmv_Fecha")
    @Temporal(TemporalType.DATE)
    private Date cmvFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Rubeola")
    private String rubeola;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Rubeola_Fecha")
    @Temporal(TemporalType.DATE)
    private Date rubeolaFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Hs")
    private String hs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hs_Fecha")
    @Temporal(TemporalType.DATE)
    private Date hsFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Hc")
    private String hc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hc_Fecha")
    @Temporal(TemporalType.DATE)
    private Date hcFecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gb")
    private int gb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Leucocitos")
    private int leucocitos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Plaquetas")
    private int plaquetas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hb")
    private int hb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hcto")
    private int hcto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quimica")
    @Temporal(TemporalType.DATE)
    private Date quimica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Glicemia")
    private int glicemia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Urea")
    private int urea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Creatinina")
    private String creatinina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ast")
    private int ast;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Alt")
    private int alt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Colesterol")
    private int colesterol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Trigliceridos")
    private int trigliceridos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Uroanalisis")
    private String uroanalisis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Uroanalisis_Fecha")
    @Temporal(TemporalType.DATE)
    private Date uroanalisisFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Citologia")
    private String citologia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Citologia_Fecha")
    @Temporal(TemporalType.DATE)
    private Date citologiaFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Citologia_Otros")
    private String citologiaOtros;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpaciente", fetch = FetchType.EAGER)
    private List<TblControlPrenatal> tblControlPrenatalList;

    public TblRegistroPaciente() {
    }

    public TblRegistroPaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public TblRegistroPaciente(Integer idpaciente, String nombre, String apellido, int ci, Date fechanacimiento, String direccion, int numparejassexuales, String antginecociclos, String antginecogestas, String antginecoparas, String antginecoabortos, String antginecopmf, Date antginecofur, Date antginecofpp, String antginecoeg, String ta, String peso, String talla, String general, String mamas, String abdomen, String genitalesExternos, String vaginaCuelloUterino, String uteroAnexos, String colposcopia, String tsctoRectal, String diagnostico, String plan, String tipeaje, String tipeajePareja, String vih, Date vihFecha, String vdrl, Date vdrlFecha, String nota, String hepB, Date hepBFecha, String hepC, Date hepCFecha, String toxotest, Date toxotestFecha, String cmv, Date cmvFecha, String rubeola, Date rubeolaFecha, String hs, Date hsFecha, String hc, Date hcFecha, int gb, int leucocitos, int plaquetas, int hb, int hcto, Date quimica, int glicemia, int urea, String creatinina, int ast, int alt, int colesterol, int trigliceridos, String uroanalisis, Date uroanalisisFecha, String citologia, Date citologiaFecha, String citologiaOtros) {
        this.idpaciente = idpaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.fechanacimiento = fechanacimiento;
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
        this.general = general;
        this.mamas = mamas;
        this.abdomen = abdomen;
        this.genitalesExternos = genitalesExternos;
        this.vaginaCuelloUterino = vaginaCuelloUterino;
        this.uteroAnexos = uteroAnexos;
        this.colposcopia = colposcopia;
        this.tsctoRectal = tsctoRectal;
        this.diagnostico = diagnostico;
        this.plan = plan;
        this.tipeaje = tipeaje;
        this.tipeajePareja = tipeajePareja;
        this.vih = vih;
        this.vihFecha = vihFecha;
        this.vdrl = vdrl;
        this.vdrlFecha = vdrlFecha;
        this.nota = nota;
        this.hepB = hepB;
        this.hepBFecha = hepBFecha;
        this.hepC = hepC;
        this.hepCFecha = hepCFecha;
        this.toxotest = toxotest;
        this.toxotestFecha = toxotestFecha;
        this.cmv = cmv;
        this.cmvFecha = cmvFecha;
        this.rubeola = rubeola;
        this.rubeolaFecha = rubeolaFecha;
        this.hs = hs;
        this.hsFecha = hsFecha;
        this.hc = hc;
        this.hcFecha = hcFecha;
        this.gb = gb;
        this.leucocitos = leucocitos;
        this.plaquetas = plaquetas;
        this.hb = hb;
        this.hcto = hcto;
        this.quimica = quimica;
        this.glicemia = glicemia;
        this.urea = urea;
        this.creatinina = creatinina;
        this.ast = ast;
        this.alt = alt;
        this.colesterol = colesterol;
        this.trigliceridos = trigliceridos;
        this.uroanalisis = uroanalisis;
        this.uroanalisisFecha = uroanalisisFecha;
        this.citologia = citologia;
        this.citologiaFecha = citologiaFecha;
        this.citologiaOtros = citologiaOtros;
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

    public Integer getTlf() {
        return tlf;
    }

    public void setTlf(Integer tlf) {
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

    public Integer getAntginecomenarquia() {
        return antginecomenarquia;
    }

    public void setAntginecomenarquia(Integer antginecomenarquia) {
        this.antginecomenarquia = antginecomenarquia;
    }

    public Integer getAntginecosexarquia() {
        return antginecosexarquia;
    }

    public void setAntginecosexarquia(Integer antginecosexarquia) {
        this.antginecosexarquia = antginecosexarquia;
    }

    public int getNumparejassexuales() {
        return numparejassexuales;
    }

    public void setNumparejassexuales(int numparejassexuales) {
        this.numparejassexuales = numparejassexuales;
    }

    public String getAntginecociclos() {
        return antginecociclos;
    }

    public void setAntginecociclos(String antginecociclos) {
        this.antginecociclos = antginecociclos;
    }

    public String getAntginecogestas() {
        return antginecogestas;
    }

    public void setAntginecogestas(String antginecogestas) {
        this.antginecogestas = antginecogestas;
    }

    public String getAntginecoparas() {
        return antginecoparas;
    }

    public void setAntginecoparas(String antginecoparas) {
        this.antginecoparas = antginecoparas;
    }

    public String getAntginecoabortos() {
        return antginecoabortos;
    }

    public void setAntginecoabortos(String antginecoabortos) {
        this.antginecoabortos = antginecoabortos;
    }

    public String getAntginecopmf() {
        return antginecopmf;
    }

    public void setAntginecopmf(String antginecopmf) {
        this.antginecopmf = antginecopmf;
    }

    public Date getAntginecofur() {
        return antginecofur;
    }

    public void setAntginecofur(Date antginecofur) {
        this.antginecofur = antginecofur;
    }

    public Date getAntginecofpp() {
        return antginecofpp;
    }

    public void setAntginecofpp(Date antginecofpp) {
        this.antginecofpp = antginecofpp;
    }

    public String getAntginecoeg() {
        return antginecoeg;
    }

    public void setAntginecoeg(String antginecoeg) {
        this.antginecoeg = antginecoeg;
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

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getMamas() {
        return mamas;
    }

    public void setMamas(String mamas) {
        this.mamas = mamas;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getGenitalesExternos() {
        return genitalesExternos;
    }

    public void setGenitalesExternos(String genitalesExternos) {
        this.genitalesExternos = genitalesExternos;
    }

    public String getVaginaCuelloUterino() {
        return vaginaCuelloUterino;
    }

    public void setVaginaCuelloUterino(String vaginaCuelloUterino) {
        this.vaginaCuelloUterino = vaginaCuelloUterino;
    }

    public String getUteroAnexos() {
        return uteroAnexos;
    }

    public void setUteroAnexos(String uteroAnexos) {
        this.uteroAnexos = uteroAnexos;
    }

    public String getColposcopia() {
        return colposcopia;
    }

    public void setColposcopia(String colposcopia) {
        this.colposcopia = colposcopia;
    }

    public String getTsctoRectal() {
        return tsctoRectal;
    }

    public void setTsctoRectal(String tsctoRectal) {
        this.tsctoRectal = tsctoRectal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getTipeaje() {
        return tipeaje;
    }

    public void setTipeaje(String tipeaje) {
        this.tipeaje = tipeaje;
    }

    public String getTipeajePareja() {
        return tipeajePareja;
    }

    public void setTipeajePareja(String tipeajePareja) {
        this.tipeajePareja = tipeajePareja;
    }

    public String getVih() {
        return vih;
    }

    public void setVih(String vih) {
        this.vih = vih;
    }

    public Date getVihFecha() {
        return vihFecha;
    }

    public void setVihFecha(Date vihFecha) {
        this.vihFecha = vihFecha;
    }

    public String getVdrl() {
        return vdrl;
    }

    public void setVdrl(String vdrl) {
        this.vdrl = vdrl;
    }

    public Date getVdrlFecha() {
        return vdrlFecha;
    }

    public void setVdrlFecha(Date vdrlFecha) {
        this.vdrlFecha = vdrlFecha;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getHepB() {
        return hepB;
    }

    public void setHepB(String hepB) {
        this.hepB = hepB;
    }

    public Date getHepBFecha() {
        return hepBFecha;
    }

    public void setHepBFecha(Date hepBFecha) {
        this.hepBFecha = hepBFecha;
    }

    public String getHepC() {
        return hepC;
    }

    public void setHepC(String hepC) {
        this.hepC = hepC;
    }

    public Date getHepCFecha() {
        return hepCFecha;
    }

    public void setHepCFecha(Date hepCFecha) {
        this.hepCFecha = hepCFecha;
    }

    public String getToxotest() {
        return toxotest;
    }

    public void setToxotest(String toxotest) {
        this.toxotest = toxotest;
    }

    public Date getToxotestFecha() {
        return toxotestFecha;
    }

    public void setToxotestFecha(Date toxotestFecha) {
        this.toxotestFecha = toxotestFecha;
    }

    public String getCmv() {
        return cmv;
    }

    public void setCmv(String cmv) {
        this.cmv = cmv;
    }

    public Date getCmvFecha() {
        return cmvFecha;
    }

    public void setCmvFecha(Date cmvFecha) {
        this.cmvFecha = cmvFecha;
    }

    public String getRubeola() {
        return rubeola;
    }

    public void setRubeola(String rubeola) {
        this.rubeola = rubeola;
    }

    public Date getRubeolaFecha() {
        return rubeolaFecha;
    }

    public void setRubeolaFecha(Date rubeolaFecha) {
        this.rubeolaFecha = rubeolaFecha;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    public Date getHsFecha() {
        return hsFecha;
    }

    public void setHsFecha(Date hsFecha) {
        this.hsFecha = hsFecha;
    }

    public String getHc() {
        return hc;
    }

    public void setHc(String hc) {
        this.hc = hc;
    }

    public Date getHcFecha() {
        return hcFecha;
    }

    public void setHcFecha(Date hcFecha) {
        this.hcFecha = hcFecha;
    }

    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    public int getLeucocitos() {
        return leucocitos;
    }

    public void setLeucocitos(int leucocitos) {
        this.leucocitos = leucocitos;
    }

    public int getPlaquetas() {
        return plaquetas;
    }

    public void setPlaquetas(int plaquetas) {
        this.plaquetas = plaquetas;
    }

    public int getHb() {
        return hb;
    }

    public void setHb(int hb) {
        this.hb = hb;
    }

    public int getHcto() {
        return hcto;
    }

    public void setHcto(int hcto) {
        this.hcto = hcto;
    }

    public Date getQuimica() {
        return quimica;
    }

    public void setQuimica(Date quimica) {
        this.quimica = quimica;
    }

    public int getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(int glicemia) {
        this.glicemia = glicemia;
    }

    public int getUrea() {
        return urea;
    }

    public void setUrea(int urea) {
        this.urea = urea;
    }

    public String getCreatinina() {
        return creatinina;
    }

    public void setCreatinina(String creatinina) {
        this.creatinina = creatinina;
    }

    public int getAst() {
        return ast;
    }

    public void setAst(int ast) {
        this.ast = ast;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int getColesterol() {
        return colesterol;
    }

    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }

    public int getTrigliceridos() {
        return trigliceridos;
    }

    public void setTrigliceridos(int trigliceridos) {
        this.trigliceridos = trigliceridos;
    }

    public String getUroanalisis() {
        return uroanalisis;
    }

    public void setUroanalisis(String uroanalisis) {
        this.uroanalisis = uroanalisis;
    }

    public Date getUroanalisisFecha() {
        return uroanalisisFecha;
    }

    public void setUroanalisisFecha(Date uroanalisisFecha) {
        this.uroanalisisFecha = uroanalisisFecha;
    }

    public String getCitologia() {
        return citologia;
    }

    public void setCitologia(String citologia) {
        this.citologia = citologia;
    }

    public Date getCitologiaFecha() {
        return citologiaFecha;
    }

    public void setCitologiaFecha(Date citologiaFecha) {
        this.citologiaFecha = citologiaFecha;
    }

    public String getCitologiaOtros() {
        return citologiaOtros;
    }

    public void setCitologiaOtros(String citologiaOtros) {
        this.citologiaOtros = citologiaOtros;
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
