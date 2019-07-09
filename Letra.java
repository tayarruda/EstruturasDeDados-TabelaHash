package javaapplication1;

public class Letra {
	private String caractere;
	private String md5Code;
        
	Letra(String caractere){
		md5Code = SecurityProvider.md5(caractere);
                this.caractere = caractere;
	}
	public String getCaractere() {
		return caractere;
	}
	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}
	public String getMd5Code() {
		return md5Code;
	}
	public void setMd5Code(String md5Code) {
		this.md5Code = md5Code;
	}
}
