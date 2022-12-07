package programa7;

import java.util.ArrayList;

public class Aprendizaje {
    int columnas,filas;
    int [][] Max;
    int [][] Min;
    
    
    ArrayList<int[]> colum= new ArrayList<int[]>();
    ArrayList<int[][]> matrices= new ArrayList<int[][]>();
    
    public Aprendizaje(int[][] matriz,int columnas,int filas){
        this.columnas = columnas;
        this.filas = filas;
        Max = new int[filas][filas];
        Min = new int[filas][filas];
        //System.out.print("\nCoulumnas: "+columnas+" filas: "+filas);
        //System.out.println();
        for(int j=0;j<columnas;j++){
            int[] columna= new int[filas];
            for(int i =0;i<filas;i++){
                columna[i]=matriz[i][j];
                
                //System.out.print(matriz[i][j]+"");
            }
            colum.add(columna);
            //System.out.println();
        }
        Matrix();
    }
    
    public int[][] getMax(){
        return Max;
    }
    public int[][] getMin(){
        return Min;
    }
    
    public void Matrix(){
        calcularMatrices();
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<filas;j++){
                int max=0;
                int min=2;
                for(int m=0;m<matrices.size();m++){
                    if(max<matrices.get(m)[i][j]){
                        max = matrices.get(m)[i][j];
                    }
                    if(min>matrices.get(m)[i][j]){
                        min = matrices.get(m)[i][j];
                    }
                }
                Min[i][j]=min;
                Max[i][j]=max;
            }
        }
        System.out.print("Maximos\n");
        for(int l=0;l<filas;l++){
            System.out.println();
            for(int k=0;k<filas;k++){
                System.out.print(Max[l][k]);
            }
            
        }
        System.out.print("Minimos\n");
        for(int r=0;r<filas;r++){
            System.out.println();
            for(int t=0;t<filas;t++){
                System.out.print(Min[r][t]);
            }
            
        }
    
    }
    
    public void calcularMatrices(){
        //System.out.println(colum.size());
        for(int ma = 0;ma<colum.size();ma++){
            //System.out.println("");
            
            int [][] matriz = new int[filas][filas];
            for(int n = 0;n<filas;n++){
                for(int m=0;m<filas;m++){
                    int valor;
                    //System.out.print("Coluna y fila: "+colum.get(ma)[n]+","+colum.get(ma)[m]+"\n");
                    if(colum.get(ma)[n]==0 && colum.get(ma)[m]==0){
                        valor = 1;
                    }
                    else{
                        if(colum.get(ma)[n]==0 && colum.get(ma)[m]==1){
                            valor = 0;
                        }
                        else{
                            if(colum.get(ma)[n]==1 && colum.get(ma)[m]==0){
                                valor = 2;
                            }
                            else valor = 1;
                        }
                    
                    }
                    matriz[n][m]=valor;
                    //System.out.print(matriz[n][m]);
                    
                }
                
                //System.out.println();
            }
            matrices.add(matriz);
            } 
            
        }
    
    

    }
    
    
    

