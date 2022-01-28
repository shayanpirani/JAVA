package com.pirani;

public class Songs {
    String Name;
    double Duration;

    public Songs(String name, double duration) {
        Name = name;
        Duration = duration;
    }
    public Songs()
    {

    }

    public String Name() {
        return Name;
    }

    public double Duration() {
        return Duration;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "Name='" + Name + '\'' +
                ", Duration=" + Duration +
                '}';
    }
}
