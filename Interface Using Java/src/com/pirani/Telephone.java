package com.pirani;

public interface Telephone {
    void PowerOn();
    void DailNumber(String number);
    void AnswerCall();
    Boolean CallPhone(String Number);
    Boolean IsRinging();
}
