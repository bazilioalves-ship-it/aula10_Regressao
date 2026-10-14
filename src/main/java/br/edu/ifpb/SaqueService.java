package br.edu.ifpb;

public class SaqueService {

    public boolean podeSacar(int valor){
        return ((valor >= 10) && (valor<=3000) && (valor %10 ==0));
    }
}
