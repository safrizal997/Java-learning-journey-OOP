package Rizal.JAVALearn.Error;

import Rizal.JAVALearn.Error.Util.LoginRequest;
import Rizal.JAVALearn.Error.Util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args)  {

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(null);
        loginRequest.setPassword (null);


        try {
        ValidationUtil.Validate(loginRequest);

        }catch (ValidationException exception){
            System.out.println(exception.getMessage());
        }

    }

}
