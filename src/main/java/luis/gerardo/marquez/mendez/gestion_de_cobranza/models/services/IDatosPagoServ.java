package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.DatosDePagosAux;

public interface IDatosPagoServ {
    public List<DatosDePagosAux> getAll();
    public List<DatosDePagosAux> getByOficina(int oficina);
    public List<DatosDePagosAux> getByOficinaAgente(int oficina, int agente);
    public List<DatosDePagosAux> getByOficinaAgenteEjecutivo(int oficina, int agente, int ejecutivo);
}
