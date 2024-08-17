
package com.company.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "SesionesClase")
@Table(name = "SESIONESCLASE")
@NamedQueries({
    @NamedQuery(name = "SesionesClase.findByPersistenceId", query = "SELECT s\nFROM SesionesClase s\nWHERE s.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "SesionesClase.findByCurso", query = "SELECT s\nFROM SesionesClase s\nWHERE s.curso= :curso\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SesionesClase.findBySesion", query = "SELECT s\nFROM SesionesClase s\nWHERE s.sesion= :sesion\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SesionesClase.findByNumero_clase", query = "SELECT s\nFROM SesionesClase s\nWHERE s.numero_clase= :numero_clase\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SesionesClase.findByFecha", query = "SELECT s\nFROM SesionesClase s\nWHERE s.fecha= :fecha\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SesionesClase.findByHora_inicio", query = "SELECT s\nFROM SesionesClase s\nWHERE s.hora_inicio= :hora_inicio\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SesionesClase.findByHora_fin", query = "SELECT s\nFROM SesionesClase s\nWHERE s.hora_fin= :hora_fin\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SesionesClase.findByUnidad", query = "SELECT s\nFROM SesionesClase s\nWHERE s.unidad= :unidad\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SesionesClase.findByTema", query = "SELECT s\nFROM SesionesClase s\nWHERE s.tema= :tema\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SesionesClase.find", query = "SELECT s\nFROM SesionesClase s\nORDER BY s.persistenceId"),
    @NamedQuery(name = "SesionesClase.countForFindByCurso", query = "SELECT COUNT(s)\nFROM SesionesClase s\nWHERE s.curso= :curso\n"),
    @NamedQuery(name = "SesionesClase.countForFindBySesion", query = "SELECT COUNT(s)\nFROM SesionesClase s\nWHERE s.sesion= :sesion\n"),
    @NamedQuery(name = "SesionesClase.countForFindByNumero_clase", query = "SELECT COUNT(s)\nFROM SesionesClase s\nWHERE s.numero_clase= :numero_clase\n"),
    @NamedQuery(name = "SesionesClase.countForFindByFecha", query = "SELECT COUNT(s)\nFROM SesionesClase s\nWHERE s.fecha= :fecha\n"),
    @NamedQuery(name = "SesionesClase.countForFindByHora_inicio", query = "SELECT COUNT(s)\nFROM SesionesClase s\nWHERE s.hora_inicio= :hora_inicio\n"),
    @NamedQuery(name = "SesionesClase.countForFindByHora_fin", query = "SELECT COUNT(s)\nFROM SesionesClase s\nWHERE s.hora_fin= :hora_fin\n"),
    @NamedQuery(name = "SesionesClase.countForFindByUnidad", query = "SELECT COUNT(s)\nFROM SesionesClase s\nWHERE s.unidad= :unidad\n"),
    @NamedQuery(name = "SesionesClase.countForFindByTema", query = "SELECT COUNT(s)\nFROM SesionesClase s\nWHERE s.tema= :tema\n"),
    @NamedQuery(name = "SesionesClase.countForFind", query = "SELECT COUNT(s)\nFROM SesionesClase s\n")
})
public class SesionesClase implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "CURSO", nullable = false, length = 255)
    private String curso;
    @Column(name = "SESION", nullable = false, length = 255)
    private String sesion;
    @Column(name = "NUMERO_CLASE", nullable = false)
    private Integer numero_clase;
    @Column(name = "FECHA", nullable = false, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate fecha;
    @Column(name = "HORA_INICIO", nullable = false, length = 30)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateAndTimeConverter.class)
    private LocalDateTime hora_inicio;
    @Column(name = "HORA_FIN", nullable = false, length = 30)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateAndTimeConverter.class)
    private LocalDateTime hora_fin;
    @Column(name = "UNIDAD", nullable = false, length = 255)
    private String unidad;
    @Column(name = "TEMA", nullable = false, length = 255)
    private String tema;

    public SesionesClase() {
    }

    public void setPersistenceId(Long persistenceId) {
        this.persistenceId = persistenceId;
    }

    public Long getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceVersion(Long persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    public Long getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    public String getSesion() {
        return sesion;
    }

    public void setNumero_clase(Integer numero_clase) {
        this.numero_clase = numero_clase;
    }

    public Integer getNumero_clase() {
        return numero_clase;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setHora_inicio(LocalDateTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public LocalDateTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_fin(LocalDateTime hora_fin) {
        this.hora_fin = hora_fin;
    }

    public LocalDateTime getHora_fin() {
        return hora_fin;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

}
