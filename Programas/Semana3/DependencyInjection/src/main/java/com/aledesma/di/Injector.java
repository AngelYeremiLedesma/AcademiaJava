package com.aledesma.di;

public class Injector {

    static void inyectarParcela(Parcela parcela, String tipo) { //Inyecta el tipo de fruta de acuerdo al qualifier
        if (tipo.equals("Cereales"))
            parcela.setTipoPlanta(new Cereales());
        else if (tipo.equals("Frutas"))
            parcela.setTipoPlanta(new Frutas());
        else if (tipo.equals("HierbasEspeciales"))
            parcela.setTipoPlanta(new HierbasEspecias());
        else
            parcela.setTipoPlanta(null);
    }

}
