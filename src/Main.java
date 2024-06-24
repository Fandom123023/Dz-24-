import exeption.WrongLoginExeption;
import exeption.WrongLoginExeption;




public class Main {
    public static final String VALID_SIMBOLS ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890_";
    public static void main (String[] args){
    try {
        dataChecking("gw_asfafasfasf23", "123", "123");
    } catch (WrongLoginExseption e ) {
        System.out.println(e.getMessage());
    catch (WrongPasswordExseption e ) {
            System.out.println(e.getMessage());
        }
    }

    public static void dataCheking(String login, String password, String confirmPassword) {
        loginCheking(login);
        passwordCheking(password);
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        }

    public static void loginChecking(String login) {
        if (login.length() > 20) {
            throw new WrongLoginExseption("Логин больше 20 символов, попробуйте более короткий");
        }
        for (int i = 0; i < login.length(); i ++) {
            if (!VALID_SIMBOLS.contains(Character.toString(login.charAt(i)))) {
                throw new WrongLoginExseption("В логине используется недопустимые символы");

            }
        }
    }





    }
}
