package com.pirani;

public class OfficePhone implements Telephone {
    private String MyNumber;
    private Boolean isRinging;

    public OfficePhone(String MyNumber)
    {
        this.MyNumber=MyNumber;
    }

    @Override
    public void PowerOn() {
        System.out.println("Office Phone is always on.");
    }

    @Override
    public void DailNumber(String number) {
        System.out.println("Now Ringing"+ number+" On Office Phone.");
    }

    @Override
    public void AnswerCall() {
    if(isRinging)
    {
        System.out.println("Answering The Office Phone");
        isRinging=false;
    }
    else{
        System.out.println("Phone Not Ringing");
    }
    }

    @Override
    public Boolean CallPhone(String Number) {
        if(Number == MyNumber)
        {
         isRinging=true;
            System.out.println("Phone is Ringing.");
        }
        else{
            return isRinging;
        }
        return isRinging;
    }

    @Override
    public Boolean IsRinging() {
        return isRinging;
    }
}
