package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.EquivalenciaDeMonedas;

public interface IEquivalenciaMonedasServ {
    public List<EquivalenciaDeMonedas> getAll();
}
