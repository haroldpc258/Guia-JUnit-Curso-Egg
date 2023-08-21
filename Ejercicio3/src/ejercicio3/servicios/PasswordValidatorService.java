package ejercicio3.servicios;

import ejercicio3.entidades.PasswordValidator;

public class PasswordValidatorService {

    private int longitudMinima = 8;

    public boolean longitudMinima(PasswordValidator password) {

        return password.getPassword().length() > longitudMinima;
    }

    public boolean caracteresEspeciales(PasswordValidator password) {

        String pass = password.getPassword();
        /*String caracteres = "|°¬!#$%&/()=?¡'¿´*¨+}]{[-_.:,;^~` ";

        for (int i = 0; i < caracteres.length(); i++) {
            if (pass.contains(caracteres.substring(i, i + 1))) {
                return true;
            }
        }*/

        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isAlphabetic(pass.charAt(i)) && !Character.isDigit(pass.charAt(i)))
                return true;
        }

        return false;
    }

    public boolean letraMayuscula(PasswordValidator password) {

        String pass = password.getPassword();

        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i)))
                return true;
        }

        return false;
    }
}
