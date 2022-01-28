package com.pirani;

public class MobilePhone implements Telephone{
    private String PhoneNumber;
    private boolean isRinging;
    private boolean isPowerOn;
    public MobilePhone(String MyNumber)
    {
        this.PhoneNumber=MyNumber;
    }

    @Override
    public void PowerOn() {
    isPowerOn=true;
        System.out.println("Phone has been power On.");
    }

    @Override
    public void DailNumber(String number) {
        System.out.println("Now Ringing"+ number+" On Mobile Phone.");
    }

    @Override
    public void AnswerCall() {
        if(isRinging && isPowerOn)
        {
            System.out.println("Answering The Mobile Phone");
            isRinging=false;
        }
        else{
            System.out.println("Phone Not Ringing");
        }
    }

    @Override
    public Boolean CallPhone(String Number) {
        if(Number == PhoneNumber && isPowerOn)
        {
            isRinging=true;
            System.out.println("Phone is Ringing.");
        }
        else{
            System.out.println("Either PhoneNumber is Wrong or It is Powered off.");
            return isRinging;
        }
        return isRinging;
    }

    @Override
    public Boolean IsRinging() {
        return isRinging;
    }
}
