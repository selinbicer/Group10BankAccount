package bankAccount;

import javafx.scene.transform.Scale;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Users {
    public String name;
    public String password;
    public String dateOfBirth;
    public String marriageStatus;
    public String relativeName;
    public int relativeAge;
    public boolean isTransferedSuceesfully;
    public int accountNumber1;
    public int amountAccount1;
    public int accountNumber2;
    public int amountAccount2;

    public Users(String name, String password, String dateOfBirth, String marriageStatus, int amountAccount1, int amountAccount2) {
        this.name = name;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.marriageStatus = marriageStatus;
        this.amountAccount1 = amountAccount1;
        this.amountAccount2 = amountAccount2;

        //this.accountNumber1 =  randomNumberCreader();
        //this.accountNumber2 = randomNumberCreader();
        //this.marriageStatus = CheckMariageStatus(); //return
        //this.dateOfBirth = checkAge(); //return
    }

    public String CheckMariageStatus(String marriageStatus){
        Scanner input = new Scanner(System.in);
        System.out.print("Evli misiniz? E/H");
        marriageStatus=input.next();
        if (marriageStatus.equalsIgnoreCase("E")){
            System.out.print("Akraba eklemek ister misiniz? E/H");
            String akrabaEklendiMi= input.next();
            if (akrabaEklendiMi.equalsIgnoreCase("E")){
                System.out.print("akrabanizin ismi nedir? ");
                this.relativeName=input.nextLine();
                Scanner intOku = new Scanner(System.in);
                System.out.println("akrabanizin dogum tarihi? ");
                this.relativeAge= intOku.nextInt();
            }
            return marriageStatus;
        } else
            return "Akraba eklenmeyektir.";
    }

    public String checkAge(String myDOB){
        LocalDate today = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate DOBDate= LocalDate.parse(myDOB,format);
        Period fark = Period.between(DOBDate,today);
        if (fark.getYears()>=18)
            return "You can get a credit card";
        else
            return "You should be at least 18 years old to get a credit card.";
    }

    public int randomNumCreader(){
        int randomNum=(int)((Math.random()*(10000000-1000000)+1000000));
        return randomNum;
    }


    //--------------------------------------------------------------------------------------------------
    /*
        Create method name is  CheckMariageStatus
        parameter is String(marriageStatus)
        return type is String

        if String marriageStatus is married

        Ask to user (use scanner class)
        Do you want to add your relative?

        if the user say Yes
        Ask to user
        What is your relative name?
        Ask to user
        Date of birth relative?

        Then Add the relative(Use AddRelative class )
        relativeName variable equal to AddRelative class fullName
        relativeAge variable equal to AddRelative class age

            if relativeAge equal to "0"
                then change the relativeName to "Relative should be more then 18 years old";
                then change the relativeAge to "Relative should be more then 18 years old";
                return the "Relative should be more then 18 years old";
            if the relativeAge is not equal to "0"
               return Transaction done successfully

        If the user say No
        then no need to add anything.
     */


    /*

       -- Parametresi String(marriageStatus) ve return  tipi String olan CheckMariageStatus methodunu olu??turun
       if String marriageStatus is married

       -- E??er String marriageStatus  married ise

       Kullan??c??ya sor ( scanner class kullan)
       Do you want to add add your relative?

       --E??er kullan??c?? Yes derse
       Kullan??c??ya sor
       What is your relative name?
       Kullan??c??ya sor
       Date of birth relative?

       Sonra  relative(Use AddRelative class ) ekle
       relativeName variable  AddRelative class fullName e??ittir
       relativeAge variable  AddRelative class age  e??ittir

           --E??er relativeAge  "0"  a e??it ise
                relativeName i  "Relative should be more then 18 years old";  e de??i??tir
                relativeAge i  "Relative should be more then 18 years old";   e de??i??tir
               return   "Relative should be more then 18 years old";   olmal??
           -- E??er the relativeAge  "0" a e??it de??ilse
               return Transaction done successfully

      -- E??er kullan??c?? No derse
       hi??bir??ey eklemeye gerek yok.
    */
    //--------------------------------------------------------------------------------------------------





    //--------------------------------------------------------------------------------------------------



    /*

        -- Parametresi String(myDOB) ve return  tipi String olan checkAge static methodunu olu??turun

        -- taday date i myDOB ile kar????la??t??r

        -- E??er compare to today date 18 ise "You can get a credit card" et

        -- E??er compare to today date 18 den k??????k ise "You should be at least 18 years old to get a credit card."
        return et.





        ??rnek today date  10/05/2020 ise

        E??er myDOB  09/05/2002 ise

        return   "You can get a credit card"  olmal??

        E??er   myDOB  11/05/2002  ise

        return  "You should be at least 18 years old to get a credit card."  olmal??

     */
    //--------------------------------------------------------------------------------------------------






    //--------------------------------------------------------------------------------------------------
    /*
        Create a Random number which is returning 8 digit number

            it should be between 10000000 - 99999999

     */


    /*

       8 basamak say?? d??nd??ren Random say?? olu??tur

           Bu say??  10000000 - 99999999 aras??nda olamal??

    */



    /*
        Create a method name is transfer
        Parameters are two Users object
        Return type is void

        In this method
            First ask to user "Do you want to transfer between your accounts or different user" (use scanner class)

        if the answer is own
            Call the method transferToOwnAccount in the Account class

        if the answer different
            Call the method transferOtherUser in the Account class

     */


    /*

        -- Parametreleri iki tane Users object olan return tipi void olan transfer ad??nda method olu??tur.


        -- Bu method i??inden
           ??nce kullan??c??ya sor  "Do you want to transfer between your accounts or different user" ( scanner class kullan)

      - E??er cevap own ise
            Account class i??inde transferToOwnAccount methodunu ??a????r

      - E??er cevap farkl?? ise
           Account class i??inde transferOtherUser methodunu ??a????r


     */
//--------------------------------------------------------------------------------------------------






//--------------------------------------------------------------------------------------------------
    /*
        Print the object using toString method

        like
         return "\nname: " + name +
                "\npassword: " + password+
                "\ndateOfBirth: " + dateOfBirth+
                ......

     */


    /*

       toString methodunu kullanarak objecti print et


        return "\nname: " + name +
               "\npassword: " + password+
               "\ndateOfBirth: " + dateOfBirth+
               ......


               gibi

    */
    //--------------------------------------------------------------------------------------------------







    /*
        Create String variable name password dateOfBirth marriageStatus  relativeName relativeAge isTransferedSuceesfully
        Create int  accountNumber amountAccount1 accountNumber2 amountAccount2
        all public
     */

    /*
    --String name ,password, dateOfBirth, marriageStatus,  relativeName, relativeAge, isTransferedSuceesfully  de??i??kenlerini olu??turun.
    --int accountNumber, mountAccount1 , accountNumber2 , amountAccount2   de??i??kenlerini olu??turun.
    -- hepsi public olsun
     */
    //--------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------
    /*
    Create a constructor
    Parameters are String name , passwod , dateOfBirth , marriageStatus
    Int amountAccount1 , amountAccount2

    variable name equal to parameter name
    same for password
    same for amountAccount1
    same for amountAccount2

    Following also in the constructor

    variable accountNumber get the the number from the  randomNumberCreader method
    variable accountNumber2 get the the number from the  randomNumberCreader method
    variable marriageStatus equal to CheckMariageStatus method return
    variable dateOfBirth equal to checkAge return

     */

    /*
    --Parametreleri String name , passwod , dateOfBirth , marriageStatus ve
      Int amountAccount1 , amountAccount2 olan constructor olu??turun

    -- variable name  parameter name e e??ittir.
    -- variable password  parameter password a e??ittir.
    -- variable amountAccount1  parameter amountAccount1 e e??ittir.
    -- variable amountAccount2  parameter amountAccount2 e e??ittir.

    --  variable accountNumber   randomNumberCreader methodundan say?? almal??
    --  variable accountNumber2   randomNumberCreader methodundan say?? almal??
    -- variable marriageStatus CheckMariageStatus methodunun  return una e??ittir
    -- variable dateOfBirth  checkAge  methodunun return una e??ittir
     */
    //--------------------------------------------------------------------------------------------------

}
