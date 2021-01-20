package Rizal.JAVALearn.Exception;

import Rizal.JAVALearn.Exception.RuntimeException.BlankException;
import Rizal.JAVALearn.Exception.Util.LoginRequest;
import Rizal.JAVALearn.Exception.Util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args)  {

        LoginRequest loginRequest = new LoginRequest("", "");
        loginRequest.setUsername("Rizal");
        loginRequest.setPassword ("Okok");


        try {
        ValidationUtil.Validate(loginRequest);

        }catch (ValidationException exception){
            System.out.println(exception.getMessage());
        }


        //Runtime Exception no Try Catch

        LoginRequest loginRequest2 = new LoginRequest("Rizal","Okok");

        ValidationUtil.ValidateRuntime(loginRequest2);
        System.out.println("Sukses");


    }

}
