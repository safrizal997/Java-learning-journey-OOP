package Rizal.JAVALearn.Exception.Util;

import Rizal.JAVALearn.Exception.RuntimeException.BlankException;
import Rizal.JAVALearn.Exception.ValidationException;

public class ValidationUtil {

    public static void Validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.getUsername() == null){
            throw new ValidationException("Username tidak boleh null");
        }
        else if (loginRequest.getUsername().isBlank()) {
            throw new ValidationException("Username tidak boleh kosong");
        }
        else if (loginRequest.getPassword() == null){
            throw new ValidationException("Username tidak boleh null");
        }
        else if (loginRequest.getPassword().isBlank()){
            throw new ValidationException("Username tidak boleh kosong");
        }

    }
    //Runtime Exception

    public static void ValidateRuntime(LoginRequest loginRequest)  {
        if (loginRequest.getUsername() == null){
            throw new BlankException("Username tidak boleh null");
        }
        else if (loginRequest.getUsername().isBlank()) {
            throw new BlankException("Username tidak boleh kosong");
        }
        else if (loginRequest.getPassword() == null){
            throw new BlankException("Username tidak boleh null");
        }
        else if (loginRequest.getPassword().isBlank()){
            throw new BlankException("Username tidak boleh kosong");
        }

    }

}
