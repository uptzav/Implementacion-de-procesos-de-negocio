
package com.company.model;

import java.time.LocalDate;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface AsistenciaDAO
    extends BusinessObjectDAO
{


    public Asistencia findByPersistenceId(Long persistenceId);

    public List<Asistencia> findByCodigo_estudiante(Integer codigo_estudiante, int startIndex, int maxResults);

    public List<Asistencia> findByNombre(String nombre, int startIndex, int maxResults);

    public List<Asistencia> findByApellido(String apellido, int startIndex, int maxResults);

    public List<Asistencia> findByCodigo_curso(Integer codigo_curso, int startIndex, int maxResults);

    public List<Asistencia> findByNombre_curso(String nombre_curso, int startIndex, int maxResults);

    public List<Asistencia> findById_sesion(Integer id_sesion, int startIndex, int maxResults);

    public List<Asistencia> findByFecha(LocalDate fecha, int startIndex, int maxResults);

    public List<Asistencia> findByEstado_asistencia(String estado_asistencia, int startIndex, int maxResults);

    public List<Asistencia> findByJustificacion(String justificacion, int startIndex, int maxResults);

    public List<Asistencia> find(int startIndex, int maxResults);

    public Long countForFindByCodigo_estudiante(Integer codigo_estudiante);

    public Long countForFindByNombre(String nombre);

    public Long countForFindByApellido(String apellido);

    public Long countForFindByCodigo_curso(Integer codigo_curso);

    public Long countForFindByNombre_curso(String nombre_curso);

    public Long countForFindById_sesion(Integer id_sesion);

    public Long countForFindByFecha(LocalDate fecha);

    public Long countForFindByEstado_asistencia(String estado_asistencia);

    public Long countForFindByJustificacion(String justificacion);

    public Long countForFind();

    public Asistencia newInstance(Integer codigo_estudiante, String nombre, String apellido, Integer codigo_curso, String nombre_curso, Integer id_sesion, String estado_asistencia);

}
