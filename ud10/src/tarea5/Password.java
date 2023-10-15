package tarea5;
import java.util.Random;

public class Password {
	private int longitud;
	private String password;
	
	private static final int LONGITUD = 8; 
	
	public Password() {
		 this.longitud = LONGITUD; 
		 this.password = createPassword();		 
	}
	
	public Password(int longitud) {
		 this.longitud = longitud; 
		 this.password =createPassword();	
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public String createPassword() {
	    String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String characters = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        
        StringBuilder generatedPassword = new StringBuilder();

        
        String comboForPassword = upperCaseLetters + lowerCaseLetters + numbers + characters;
     	Random random = new Random();
     	
     	int randomIndex = 0; 
     	char passwordNow = '\0';
     	
     	for(int i = 0; i< this.longitud; i++) {
     		randomIndex = random.nextInt(comboForPassword.length());
         	passwordNow = comboForPassword.charAt(randomIndex);
         	generatedPassword.append(passwordNow);
     	}
     	return generatedPassword.toString();

	}
	
	public boolean esFuerte() {
		int countUpperCase = 0;
		int countLowerCase = 0;
		int countNumbers = 0;
		
		boolean isItStrong = false;
		
		for(char c : password.toCharArray()) {
			if(Character.isUpperCase(c)) {
				countUpperCase ++;
			}
			else if(Character.isLowerCase(c)) {
				countLowerCase ++;
			}
			else if(Character.isDigit(c)) {
				countNumbers ++;
			}
		}
		if(countUpperCase>2 && countLowerCase>2 &&  countNumbers>2 ) {
			isItStrong = true;
			//System.out.println("Es una contraseña muyy fuertee!");
			
		}
		return isItStrong;
		
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", password=" + password + "]";
	}
	 
	
}

