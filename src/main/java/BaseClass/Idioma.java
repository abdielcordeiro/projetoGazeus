package BaseClass;

import java.util.ArrayList;
import java.util.List;

public class Idioma {

    private ArrayList<String> palavra = new ArrayList<>();

    public Idioma(){}

    public void setListPalavras(List<String> list){
        this.palavra.addAll(list);
    }

    public String getListPalavra(int posicao){
       return palavra.get(posicao);
    }
}
