package programa7;
import java.util.ArrayList;
import programa7.*;
public class Recuperacion {
    ArrayList<Aprendizaje> aprendizajes = new ArrayList<Aprendizaje>();
    int[][] matrix;
    int filas,columnas;
    ArrayList<int[]> colum= new ArrayList<int[]>();
    ArrayList<int[][]> resultados= new ArrayList<int[][]>();
    public Recuperacion(int[][] matrix, ArrayList<Aprendizaje> aprendizajes,int filas,int columnas){
        this.aprendizajes = aprendizajes;
        this.matrix = matrix;
        this.filas = filas;
        this.columnas = columnas;
        for(int j=0;j<columnas;j++){
            int[] columna= new int[filas];
            for(int i =0;i<filas;i++){
                columna[i]=matrix[i][j];
                //System.out.print(matriz[i][j]+"");
            }
            colum.add(columna);
        }
        result();
    
    }
    
    public void result(){
        for(int i=0;i<aprendizajes.size();i++){
            resultados.add(recuperarMatriz(aprendizajes.get(i).Max,aprendizajes.get(i).Min));
        }
    }
    
    public ArrayList<int[][]> getResultados(){
        return resultados;
    
    }
    
    public int[][] recuperarMatriz(int [][] Max,int [][] Min){
        int[][] resultado = new int[filas][columnas];
        for(int i=0;i<colum.size();i++){
            
            System.out.println("Matriz:" +i);
            int [][] matriz = new int[filas][filas];
            int sumcero=0,sumunos=0;
            for(int no = 1;no<filas;no++){
                if(colum.get(i)[no]==1)sumunos++;
                else sumcero++;
            }
            if(sumunos>=sumcero){
                //Existen más unos que cero por lo tanto para realizar la recuperación se toma en cuenta la matriz Max
                for(int y=0;y<filas;y++){
                    System.out.println();
                    int min=1;
                    for(int x =0;x<filas;x++){
                        int valor;
                        if(Max[y][x]==0 && colum.get(i)[x]==0)valor = 0;
                        else if(Max[y][x]==0 && colum.get(i)[x]==1) valor =0;
                        else if(Max[y][x]==1 && colum.get(i)[x]==0) valor =0;
                        else if(Max[y][x]==1 && colum.get(i)[x]==1) valor =1;
                        else if(Max[y][x]==2 && colum.get(i)[x]==0) valor =1;
                        else valor = 1;
                        matriz[y][x] = valor;
                        System.out.print(matriz[y][x]);
                        //System.out.print(Max[y][x]+","+colum.get(i)[x]);
                        if(min>valor)min=valor;
                    }
                    System.out.print("\nValor min: "+min);
                    resultado[y][i]=min;
                }
            }
            
            else{
                //Existen más unos que cero por lo tanto para realizar la recuperación se toma en cuenta la matriz Max
                for(int w=0;w<filas;w++){
                    System.out.println();
                    int max=0;
                    for(int z =0;z<filas;z++){
                        int valor;
                        if(Max[w][z]==0 && colum.get(i)[z]==0)valor = 0;
                        else if(Max[w][z]==0 && colum.get(i)[z]==1) valor =0;
                        else if(Max[w][z]==1 && colum.get(i)[z]==0) valor =0;
                        else if(Max[w][z]==1 && colum.get(i)[z]==1) valor =1;
                        else if(Max[w][z]==2 && colum.get(i)[z]==0) valor =1;
                        else valor = 1;
                        matriz[z][z] = valor;
                        System.out.print(matriz[w][z]);
                        if(max>valor) max=valor;
                    }
                System.out.print("\nValor max: "+max);
                }                
            
            
            
            }
            
            
            
        }
        
//        System.out.println("Matriz resultado");
//            for(int r=0;r<filas;r++){
//                for(int b=0;b<columnas;b++){
//                    System.out.print(resultado[r][b]);
//                }
//                System.out.print("\n");
//            }

    return resultado;
    
    }
    
    
}
