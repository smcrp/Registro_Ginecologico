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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Julio Aldana
 */
@Entity
@Table(name = "tbl_ecosonogramas_result")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEcosonogramasResult.findAll", query = "SELECT t FROM TblEcosonogramasResult t"),
    @NamedQuery(name = "TblEcosonogramasResult.findByIdpaciente", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.idpaciente = :idpaciente"),
    @NamedQuery(name = "TblEcosonogramasResult.findByIdecosonogramas", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.idecosonogramas = :idecosonogramas"),
    @NamedQuery(name = "TblEcosonogramasResult.findByUtAVF", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.utAVF = :utAVF"),
    @NamedQuery(name = "TblEcosonogramasResult.findByUtRVF", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.utRVF = :utRVF"),
    @NamedQuery(name = "TblEcosonogramasResult.findByUtIndiferente", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.utIndiferente = :utIndiferente"),
    @NamedQuery(name = "TblEcosonogramasResult.findByUtSuperRegular", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.utSuperRegular = :utSuperRegular"),
    @NamedQuery(name = "TblEcosonogramasResult.findByUtSuperIrregular", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.utSuperIrregular = :utSuperIrregular"),
    @NamedQuery(name = "TblEcosonogramasResult.findByEcopatronHomog", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ecopatronHomog = :ecopatronHomog"),
    @NamedQuery(name = "TblEcosonogramasResult.findByEcopatronHeterog", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ecopatronHeterog = :ecopatronHeterog"),
    @NamedQuery(name = "TblEcosonogramasResult.findByDimensionesL", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.dimensionesL = :dimensionesL"),
    @NamedQuery(name = "TblEcosonogramasResult.findByDimensionesAP", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.dimensionesAP = :dimensionesAP"),
    @NamedQuery(name = "TblEcosonogramasResult.findByDimensionesT", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.dimensionesT = :dimensionesT"),
    @NamedQuery(name = "TblEcosonogramasResult.findByCervixL", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.cervixL = :cervixL"),
    @NamedQuery(name = "TblEcosonogramasResult.findByCervixAP", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.cervixAP = :cervixAP"),
    @NamedQuery(name = "TblEcosonogramasResult.findByUtOtros", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.utOtros = :utOtros"),
    @NamedQuery(name = "TblEcosonogramasResult.findByInterfEndometHomog", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.interfEndometHomog = :interfEndometHomog"),
    @NamedQuery(name = "TblEcosonogramasResult.findByInterfEndometHetero", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.interfEndometHetero = :interfEndometHetero"),
    @NamedQuery(name = "TblEcosonogramasResult.findByInterfEndometEspesor", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.interfEndometEspesor = :interfEndometEspesor"),
    @NamedQuery(name = "TblEcosonogramasResult.findByInterfEndometOtros", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.interfEndometOtros = :interfEndometOtros"),
    @NamedQuery(name = "TblEcosonogramasResult.findByOvaDereL", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ovaDereL = :ovaDereL"),
    @NamedQuery(name = "TblEcosonogramasResult.findByOvaDereAP", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ovaDereAP = :ovaDereAP"),
    @NamedQuery(name = "TblEcosonogramasResult.findByOvaDereT", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ovaDereT = :ovaDereT"),
    @NamedQuery(name = "TblEcosonogramasResult.findByOvaDereVOL", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ovaDereVOL = :ovaDereVOL"),
    @NamedQuery(name = "TblEcosonogramasResult.findByOvaIzqL", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ovaIzqL = :ovaIzqL"),
    @NamedQuery(name = "TblEcosonogramasResult.findByOvaIzqAP", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ovaIzqAP = :ovaIzqAP"),
    @NamedQuery(name = "TblEcosonogramasResult.findByOvaIzqT", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ovaIzqT = :ovaIzqT"),
    @NamedQuery(name = "TblEcosonogramasResult.findByOvaIzqVOL", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ovaIzqVOL = :ovaIzqVOL"),
    @NamedQuery(name = "TblEcosonogramasResult.findByOvariosOtros", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.ovariosOtros = :ovariosOtros"),
    @NamedQuery(name = "TblEcosonogramasResult.findByFondoSacoLibre", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.fondoSacoLibre = :fondoSacoLibre"),
    @NamedQuery(name = "TblEcosonogramasResult.findByConclusiones", query = "SELECT t FROM TblEcosonogramasResult t WHERE t.conclusiones = :conclusiones")})
public class TblEcosonogramasResult implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_paciente")
    private int idpaciente;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_ecosonogramas")
    private Integer idecosonogramas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ut_AVF")
    private int utAVF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ut_RVF")
    private int utRVF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ut_Indiferente")
    private int utIndiferente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ut_Super_Regular")
    private int utSuperRegular;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ut_Super_Irregular")
    private int utSuperIrregular;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ecopatron_Homog")
    private int ecopatronHomog;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ecopatron_Heterog")
    private int ecopatronHeterog;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dimensiones_L")
    private int dimensionesL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dimensiones_AP")
    private int dimensionesAP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dimensiones_T")
    private int dimensionesT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cervix_L")
    private int cervixL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cervix_AP")
    private int cervixAP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ut_Otros")
    private int utOtros;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Interf_Endomet_Homog")
    private int interfEndometHomog;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Interf_Endomet_Hetero")
    private int interfEndometHetero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Interf_Endomet_Espesor")
    private int interfEndometEspesor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Interf_Endomet_Otros")
    private String interfEndometOtros;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ova_Dere_L")
    private int ovaDereL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ova_Dere_AP")
    private int ovaDereAP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ova_Dere_T")
    private int ovaDereT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ova_Dere_VOL")
    private int ovaDereVOL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ova_Izq_L")
    private int ovaIzqL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ova_Izq_AP")
    private int ovaIzqAP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ova_Izq_T")
    private int ovaIzqT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ova_Izq_VOL")
    private int ovaIzqVOL;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Ovarios_Otros")
    private String ovariosOtros;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fondo_Saco_Libre")
    private int fondoSacoLibre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 800)
    @Column(name = "Conclusiones")
    private String conclusiones;

    public TblEcosonogramasResult() {
    }

    public TblEcosonogramasResult(Integer idecosonogramas) {
        this.idecosonogramas = idecosonogramas;
    }

    public TblEcosonogramasResult(Integer idecosonogramas, int idpaciente, int utAVF, int utRVF, int utIndiferente, int utSuperRegular, int utSuperIrregular, int ecopatronHomog, int ecopatronHeterog, int dimensionesL, int dimensionesAP, int dimensionesT, int cervixL, int cervixAP, int utOtros, int interfEndometHomog, int interfEndometHetero, int interfEndometEspesor, String interfEndometOtros, int ovaDereL, int ovaDereAP, int ovaDereT, int ovaDereVOL, int ovaIzqL, int ovaIzqAP, int ovaIzqT, int ovaIzqVOL, String ovariosOtros, int fondoSacoLibre, String conclusiones) {
        this.idecosonogramas = idecosonogramas;
        this.idpaciente = idpaciente;
        this.utAVF = utAVF;
        this.utRVF = utRVF;
        this.utIndiferente = utIndiferente;
        this.utSuperRegular = utSuperRegular;
        this.utSuperIrregular = utSuperIrregular;
        this.ecopatronHomog = ecopatronHomog;
        this.ecopatronHeterog = ecopatronHeterog;
        this.dimensionesL = dimensionesL;
        this.dimensionesAP = dimensionesAP;
        this.dimensionesT = dimensionesT;
        this.cervixL = cervixL;
        this.cervixAP = cervixAP;
        this.utOtros = utOtros;
        this.interfEndometHomog = interfEndometHomog;
        this.interfEndometHetero = interfEndometHetero;
        this.interfEndometEspesor = interfEndometEspesor;
        this.interfEndometOtros = interfEndometOtros;
        this.ovaDereL = ovaDereL;
        this.ovaDereAP = ovaDereAP;
        this.ovaDereT = ovaDereT;
        this.ovaDereVOL = ovaDereVOL;
        this.ovaIzqL = ovaIzqL;
        this.ovaIzqAP = ovaIzqAP;
        this.ovaIzqT = ovaIzqT;
        this.ovaIzqVOL = ovaIzqVOL;
        this.ovariosOtros = ovariosOtros;
        this.fondoSacoLibre = fondoSacoLibre;
        this.conclusiones = conclusiones;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Integer getIdecosonogramas() {
        return idecosonogramas;
    }

    public void setIdecosonogramas(Integer idecosonogramas) {
        this.idecosonogramas = idecosonogramas;
    }

    public int getUtAVF() {
        return utAVF;
    }

    public void setUtAVF(int utAVF) {
        this.utAVF = utAVF;
    }

    public int getUtRVF() {
        return utRVF;
    }

    public void setUtRVF(int utRVF) {
        this.utRVF = utRVF;
    }

    public int getUtIndiferente() {
        return utIndiferente;
    }

    public void setUtIndiferente(int utIndiferente) {
        this.utIndiferente = utIndiferente;
    }

    public int getUtSuperRegular() {
        return utSuperRegular;
    }

    public void setUtSuperRegular(int utSuperRegular) {
        this.utSuperRegular = utSuperRegular;
    }

    public int getUtSuperIrregular() {
        return utSuperIrregular;
    }

    public void setUtSuperIrregular(int utSuperIrregular) {
        this.utSuperIrregular = utSuperIrregular;
    }

    public int getEcopatronHomog() {
        return ecopatronHomog;
    }

    public void setEcopatronHomog(int ecopatronHomog) {
        this.ecopatronHomog = ecopatronHomog;
    }

    public int getEcopatronHeterog() {
        return ecopatronHeterog;
    }

    public void setEcopatronHeterog(int ecopatronHeterog) {
        this.ecopatronHeterog = ecopatronHeterog;
    }

    public int getDimensionesL() {
        return dimensionesL;
    }

    public void setDimensionesL(int dimensionesL) {
        this.dimensionesL = dimensionesL;
    }

    public int getDimensionesAP() {
        return dimensionesAP;
    }

    public void setDimensionesAP(int dimensionesAP) {
        this.dimensionesAP = dimensionesAP;
    }

    public int getDimensionesT() {
        return dimensionesT;
    }

    public void setDimensionesT(int dimensionesT) {
        this.dimensionesT = dimensionesT;
    }

    public int getCervixL() {
        return cervixL;
    }

    public void setCervixL(int cervixL) {
        this.cervixL = cervixL;
    }

    public int getCervixAP() {
        return cervixAP;
    }

    public void setCervixAP(int cervixAP) {
        this.cervixAP = cervixAP;
    }

    public int getUtOtros() {
        return utOtros;
    }

    public void setUtOtros(int utOtros) {
        this.utOtros = utOtros;
    }

    public int getInterfEndometHomog() {
        return interfEndometHomog;
    }

    public void setInterfEndometHomog(int interfEndometHomog) {
        this.interfEndometHomog = interfEndometHomog;
    }

    public int getInterfEndometHetero() {
        return interfEndometHetero;
    }

    public void setInterfEndometHetero(int interfEndometHetero) {
        this.interfEndometHetero = interfEndometHetero;
    }

    public int getInterfEndometEspesor() {
        return interfEndometEspesor;
    }

    public void setInterfEndometEspesor(int interfEndometEspesor) {
        this.interfEndometEspesor = interfEndometEspesor;
    }

    public String getInterfEndometOtros() {
        return interfEndometOtros;
    }

    public void setInterfEndometOtros(String interfEndometOtros) {
        this.interfEndometOtros = interfEndometOtros;
    }

    public int getOvaDereL() {
        return ovaDereL;
    }

    public void setOvaDereL(int ovaDereL) {
        this.ovaDereL = ovaDereL;
    }

    public int getOvaDereAP() {
        return ovaDereAP;
    }

    public void setOvaDereAP(int ovaDereAP) {
        this.ovaDereAP = ovaDereAP;
    }

    public int getOvaDereT() {
        return ovaDereT;
    }

    public void setOvaDereT(int ovaDereT) {
        this.ovaDereT = ovaDereT;
    }

    public int getOvaDereVOL() {
        return ovaDereVOL;
    }

    public void setOvaDereVOL(int ovaDereVOL) {
        this.ovaDereVOL = ovaDereVOL;
    }

    public int getOvaIzqL() {
        return ovaIzqL;
    }

    public void setOvaIzqL(int ovaIzqL) {
        this.ovaIzqL = ovaIzqL;
    }

    public int getOvaIzqAP() {
        return ovaIzqAP;
    }

    public void setOvaIzqAP(int ovaIzqAP) {
        this.ovaIzqAP = ovaIzqAP;
    }

    public int getOvaIzqT() {
        return ovaIzqT;
    }

    public void setOvaIzqT(int ovaIzqT) {
        this.ovaIzqT = ovaIzqT;
    }

    public int getOvaIzqVOL() {
        return ovaIzqVOL;
    }

    public void setOvaIzqVOL(int ovaIzqVOL) {
        this.ovaIzqVOL = ovaIzqVOL;
    }

    public String getOvariosOtros() {
        return ovariosOtros;
    }

    public void setOvariosOtros(String ovariosOtros) {
        this.ovariosOtros = ovariosOtros;
    }

    public int getFondoSacoLibre() {
        return fondoSacoLibre;
    }

    public void setFondoSacoLibre(int fondoSacoLibre) {
        this.fondoSacoLibre = fondoSacoLibre;
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
        hash += (idecosonogramas != null ? idecosonogramas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEcosonogramasResult)) {
            return false;
        }
        TblEcosonogramasResult other = (TblEcosonogramasResult) object;
        if ((this.idecosonogramas == null && other.idecosonogramas != null) || (this.idecosonogramas != null && !this.idecosonogramas.equals(other.idecosonogramas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TblEcosonogramasResult[ idecosonogramas=" + idecosonogramas + " ]";
    }
    
}
