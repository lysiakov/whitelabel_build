package com.example.demo;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProfileTestBean {

  @Value("${general.variableA}")
  private String variableA;

  @Value("${general.variableB}")
  private String variableB;

  private final Environment environment;

  private final ProfileInterface profileInterface;

  public ProfileTestBean(
      Environment environment,
      ProfileInterface profileInterface)
  {
    this.environment = environment;
    this.profileInterface = profileInterface;
  }

  @EventListener(ApplicationReadyEvent.class)
  public void testProfileBuild() {
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println("ACTIVE PROFILE FOR THIS START");
    System.out.println(Arrays.toString(environment.getActiveProfiles()));
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println(variableA);
    System.out.println(variableB);
    profileInterface.print();
  }
}
