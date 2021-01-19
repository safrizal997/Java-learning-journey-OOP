package Rizal.JAVALearn.Error.Util;

import Rizal.JAVALearn.Error.ValidationException;

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

}
