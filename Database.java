package javaapplication1;
import java.util.ArrayList;

public class Database {
	public static final ArrayList<Letra> caracteres;
	static
	{
		caracteres = new ArrayList<Letra>();
                
                for(int i = 65; i<=90; i++){
                    char letra = (char)i;
                    Letra caracter = new Letra(Character.toString(letra));
                    caracteres.add(caracter);
                }
                
                for(int i = 97; i<=122; i++){
                    char letra = (char)i;
                    Letra caracter = new Letra(Character.toString(letra));
                    caracteres.add(caracter);
                }
                
                for(int i = 48; i<=57; i++){
                    char letra = (char)i;
                    Letra caracter = new Letra(Character.toString(letra));
                    caracteres.add(caracter);
                }
                
                caracteres.add(new Letra(Character.toString(' ')));

	}
	public static Letra getLetra(String md5){
                for(int i=0;i<caracteres.size();i++){
                    if(caracteres.get(i).getMd5Code().equals(md5)){
				return caracteres.get(i);
			}
                }
                return null;
	}
    public static Conta getConta(String[] md5){
        String dados[];
        String saldo;
        String nome="";
        String montarString = "";
        int i = 0;
        
        while(i<md5.length){
           String concat = getLetra(md5[i]).getCaractere();
           montarString += concat;
           i++;
        }
        
        dados = montarString.split(" ");
        i=0;
        
        while(i< dados.length - 1){
            nome += dados[i] + " ";
            i++;
        }
        
        saldo = dados[dados.length - 1];
        return new Conta(nome,saldo);
    }
}

