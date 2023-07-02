package ru.netology.spring.implementation;

import ru.netology.spring.implementation.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
