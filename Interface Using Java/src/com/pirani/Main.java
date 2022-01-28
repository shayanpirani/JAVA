package com.pirani;

public class Main {

    public static void main(String[] args) {
	//OfficePhone MyPhone=new OfficePhone("03370366908");
    //MyPhone.PowerOn();
    //MyPhone.CallPhone("03370366908");
    //MyPhone.AnswerCall();
        MobilePhone m=new MobilePhone("123445");
        m.PowerOn();
        m.DailNumber("4567788");
        m.CallPhone("123445");
    }
}
