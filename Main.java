public class Main {
  public static void main(String[] args) {
    int[] dado = {0, 3, 4, 6, 7, 9, 15};
    int x = 4; //MUDA O VALOR QUE SERÁ BUSCADO
    int inf = 0;
    int sup = dado.length -1;

    int iterativa = Busca_Binaria_Iterativa(dado, x, inf, sup);
    int recursiva = Busca_Binaria_Recursiva(dado, x, inf, sup);
    System.out.print("Lista: [ ");
    for(int i = 0; i <= dado.length -1; i++){
      System.out.print(dado[i] + " ");
    }
    System.out.println("]");

    System.out.println("Valor sendo buscado: " + x);
    System.out.println("Iterativa - index: " + iterativa);
    System.out.println("Recursiva - index: " + recursiva);
  }

    //APENAS COPIEI O QUE ESTAVA NO SLIDE DA AULA
    public static int Busca_Binaria_Recursiva(int dado[], int x, int inf, int sup){
      int meio;
      if(inf > sup){
        return (-1);
      }
      meio = (inf + sup) / 2;

      if(x == dado[meio]){
        return meio;
      }

      if(x < dado[meio]){
        return Busca_Binaria_Recursiva(dado, x, inf, meio - 1);
      }
      else{
        return Busca_Binaria_Recursiva(dado, x, meio + 1, sup);
      }
    }

    public static int Busca_Binaria_Iterativa(int dado[], int x, int inf, int sup){
      int meio;


      while(inf <= sup){
        meio = (inf + sup) / 2;
        if(dado[meio] == x){
          return meio;
        }
        
        //Se o valor do meio for menor que o valor buscado, define o inicio da lista como meio
        if(dado[meio] < x){
          inf = meio + 1;
        }
        else{ //Se não, define o fim da lista como o anterior ao meio
          sup = meio - 1;
        }
      }

      return (-1);
    }
}
