
package com.company.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface SesionesClaseDAO
    extends BusinessObjectDAO
{


    public SesionesClase findByPersistenceId(Long persistenceId);

    public List<SesionesClase> findByCurso(String curso, int startIndex, int maxResults);

    public List<SesionesClase> findBySesion(String sesion, int startIndex, int maxResults);

    public List<SesionesClase> findByNumero_clase(Integer numero_clase, int startIndex, int maxResults);

    public List<SesionesClase> findByFecha(LocalDate fecha, int startIndex, int maxResults);

    public List<SesionesClase> findByHora_inicio(LocalDateTime hora_inicio, int startIndex, int maxResults);

    public List<SesionesClase> findByHora_fin(LocalDateTime hora_fin, int startIndex, int maxResults);

    public List<SesionesClase> findByUnidad(String unidad, int startIndex, int maxResults);

    public List<SesionesClase> findByTema(String tema, int startIndex, int maxResults);

    public List<SesionesClase> find(int startIndex, int maxResults);

    public Long countForFindByCurso(String curso);

    public Long countForFindBySesion(String sesion);

    public Long countForFindByNumero_clase(Integer numero_clase);

    public Long countForFindByFecha(LocalDate fecha);

    public Long countForFindByHora_inicio(LocalDateTime hora_inicio);

    public Long countForFindByHora_fin(LocalDateTime hora_fin);

    public Long countForFindByUnidad(String unidad);

    public Long countForFindByTema(String tema);

    public Long countForFind();

    public SesionesClase newInstance(String curso, String sesion, Integer numero_clase, LocalDate fecha, LocalDateTime hora_inicio, LocalDateTime hora_fin, String unidad, String tema);

}
