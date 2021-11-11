package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.RelacionEjecutivoAgenteDatosDePago;

public interface IRelDatosPagoServ {
    public List<RelacionEjecutivoAgenteDatosDePago> getByDatosPagosIds(List<String> idsDatosPagos);
    public List<RelacionEjecutivoAgenteDatosDePago> getByDatosPagosIdsAndAgente(List<String> idsDatosPagos, int agente);
    public List<RelacionEjecutivoAgenteDatosDePago> getByDatosPagosIdsAndAgenteAndEjecutivo(List<String> idsDatosPagos, int agente, int ejecutivo);
}
