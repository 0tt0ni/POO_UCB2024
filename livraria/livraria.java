package livraria;

import java.util.ArrayList;

public class livraria {
    
    public ArrayList<livro> livros;

    public livraria(){
        this.livros = new ArrayList<>();
    }
    
    public void cadastrarlivro(livro livro){
        this.livros.add(livro);
    
    }

    public String listarLivros(){
       String listarLivros = "";
    
    for (livro l  : this.livros) {
        listarLivros += l.id + " - " + l.titulo + "\n";
    }
    
       return listarLivros;
    }
    public String detalharlivroporid(int id){

        String detalhelivro = "livro não encontrado.\n";

        for (livro livro : livros){
            if(livro.id == id){
                detalhelivro = livro.toString();

            }
        }

        return detalhelivro;
    }
}