
package com.company.model;

import java.time.LocalDate;
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
@javax.persistence.Entity(name = "Asistencia")
@Table(name = "ASISTENCIA")
@NamedQueries({
    @NamedQuery(name = "Asistencia.findByPersistenceId", query = "SELECT a\nFROM Asistencia a\nWHERE a.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Asistencia.findByCodigo_estudiante", query = "SELECT a\nFROM Asistencia a\nWHERE a.codigo_estudiante= :codigo_estudiante\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.findByNombre", query = "SELECT a\nFROM Asistencia a\nWHERE a.nombre= :nombre\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.findByApellido", query = "SELECT a\nFROM Asistencia a\nWHERE a.apellido= :apellido\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.findByCodigo_curso", query = "SELECT a\nFROM Asistencia a\nWHERE a.codigo_curso= :codigo_curso\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.findByNombre_curso", query = "SELECT a\nFROM Asistencia a\nWHERE a.nombre_curso= :nombre_curso\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.findById_sesion", query = "SELECT a\nFROM Asistencia a\nWHERE a.id_sesion= :id_sesion\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.findByFecha", query = "SELECT a\nFROM Asistencia a\nWHERE a.fecha= :fecha\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.findByEstado_asistencia", query = "SELECT a\nFROM Asistencia a\nWHERE a.estado_asistencia= :estado_asistencia\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.findByJustificacion", query = "SELECT a\nFROM Asistencia a\nWHERE a.justificacion= :justificacion\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.find", query = "SELECT a\nFROM Asistencia a\nORDER BY a.persistenceId"),
    @NamedQuery(name = "Asistencia.countForFindByCodigo_estudiante", query = "SELECT COUNT(a)\nFROM Asistencia a\nWHERE a.codigo_estudiante= :codigo_estudiante\n"),
    @NamedQuery(name = "Asistencia.countForFindByNombre", query = "SELECT COUNT(a)\nFROM Asistencia a\nWHERE a.nombre= :nombre\n"),
    @NamedQuery(name = "Asistencia.countForFindByApellido", query = "SELECT COUNT(a)\nFROM Asistencia a\nWHERE a.apellido= :apellido\n"),
    @NamedQuery(name = "Asistencia.countForFindByCodigo_curso", query = "SELECT COUNT(a)\nFROM Asistencia a\nWHERE a.codigo_curso= :codigo_curso\n"),
    @NamedQuery(name = "Asistencia.countForFindByNombre_curso", query = "SELECT COUNT(a)\nFROM Asistencia a\nWHERE a.nombre_curso= :nombre_curso\n"),
    @NamedQuery(name = "Asistencia.countForFindById_sesion", query = "SELECT COUNT(a)\nFROM Asistencia a\nWHERE a.id_sesion= :id_sesion\n"),
    @NamedQuery(name = "Asistencia.countForFindByFecha", query = "SELECT COUNT(a)\nFROM Asistencia a\nWHERE a.fecha= :fecha\n"),
    @NamedQuery(name = "Asistencia.countForFindByEstado_asistencia", query = "SELECT COUNT(a)\nFROM Asistencia a\nWHERE a.estado_asistencia= :estado_asistencia\n"),
    @NamedQuery(name = "Asistencia.countForFindByJustificacion", query = "SELECT COUNT(a)\nFROM Asistencia a\nWHERE a.justificacion= :justificacion\n"),
    @NamedQuery(name = "Asistencia.countForFind", query = "SELECT COUNT(a)\nFROM Asistencia a\n")
})
public class Asistencia implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "CODIGO_ESTUDIANTE", nullable = false)
    private Integer codigo_estudiante;
    @Column(name = "NOMBRE", nullable = false, length = 255)
    private String nombre;
    @Column(name = "APELLIDO", nullable = false, length = 255)
    private String apellido;
    @Column(name = "CODIGO_CURSO", nullable = false)
    private Integer codigo_curso;
    @Column(name = "NOMBRE_CURSO", nullable = false, length = 255)
    private String nombre_curso;
    @Column(name = "ID_SESION", nullable = false)
    private Integer id_sesion;
    @Column(name = "FECHA", nullable = true, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate fecha;
    @Column(name = "ESTADO_ASISTENCIA", nullable = false, length = 255)
    private String estado_asistencia;
    @Column(name = "JUSTIFICACION", nullable = true, length = 255)
    private String justificacion;

    public Asistencia() {
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

    public void setCodigo_estudiante(Integer codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }

    public Integer getCodigo_estudiante() {
        return codigo_estudiante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCodigo_curso(Integer codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public Integer getCodigo_curso() {
        return codigo_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setId_sesion(Integer id_sesion) {
        this.id_sesion = id_sesion;
    }

    public Integer getId_sesion() {
        return id_sesion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setEstado_asistencia(String estado_asistencia) {
        this.estado_asistencia = estado_asistencia;
    }

    public String getEstado_asistencia() {
        return estado_asistencia;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getJustificacion() {
        return justificacion;
    }

}
