package ru.netology.spring.implementation;

import ru.netology.spring.implementation.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
