package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("standard")
public class ProfileInterfaceStandardImpl implements ProfileInterface {

  @Override
  public void print() {
    System.out.println("PRINTER FROM STANDARD PROFILE");
  }
}
