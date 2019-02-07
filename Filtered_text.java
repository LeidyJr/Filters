package filtros;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filtered_text {
	
	public static void palindromo(String archivo) throws FileNotFoundException, IOException {
        Scanner in = null;
        in = new Scanner(new FileReader(archivo)); 
        File file = new File("./src/filtros/palindromos.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw); 
        while(in.hasNext()) {
        	String cadena=in.next();
        	StringBuilder builder=new StringBuilder(cadena);
        	String sCadenaInvertida=builder.reverse().toString();
        		if(sCadenaInvertida.equals(cadena)){
            		System.out.println("palindromo: "+sCadenaInvertida);
            		pw.println(sCadenaInvertida);
        		}
        	}
        bw.close();
        pw.close();
        }

	public static void empiezaConT(String archivo) throws FileNotFoundException, IOException {
		Scanner in = null;
        in = new Scanner(new FileReader(archivo)); 
        File file = new File("./src/filtros/empiezaT.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw); 
        while(in.hasNext()) {
        	String cadena=in.next();
        	if(cadena.charAt(0)=='t'){//Las que empiezan con T
            System.out.println("Empieza con t: "+cadena);
            pw.println(cadena);
        	}
        }
        bw.close();
        pw.close();
    }	

	public static void cincoCaracteres(String archivo) throws FileNotFoundException, IOException {
		Scanner in = null;
        in = new Scanner(new FileReader(archivo)); 
        File file = new File("./src/filtros/cincoletras.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        while(in.hasNext()) {
        	String cadena=in.next();
        	if (cadena.length()==5){//Las que tienen 5 caracteres
        		System.out.println("5 caracteres: "+cadena);
        		pw.println(cadena);
        	}
        }
        bw.close();
        pw.close();
    }

	@SuppressWarnings("resource")
	public static void sinFiltros(String archivo) throws FileNotFoundException, IOException {
		Scanner in = null;
        in = new Scanner(new FileReader(archivo)); 
        File file = new File("./src/filtros/nofiltros.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        while(in.hasNext()) {
        	String cadena=in.next();
        		System.out.println("Sin filtrar: "+cadena);
        		pw.println(cadena);
        }
        bw.close();
        pw.close();
    }
    public static void main(String[] args) throws IOException {
        empiezaConT("./src/filtros/parrafo.txt");
        cincoCaracteres("./src/filtros/parrafo.txt");
        sinFiltros("./src/filtros/parrafo.txt");
        palindromo("./src/filtros/parrafo.txt");    
    }
}