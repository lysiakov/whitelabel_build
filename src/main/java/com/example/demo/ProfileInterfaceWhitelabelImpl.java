package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("whitelabel")
public class ProfileInterfaceWhitelabelImpl implements ProfileInterface {

  @Override
  public void print() {
    System.out.println("PRINTER FROM WHITELABEL PROFILE");
  }
}
