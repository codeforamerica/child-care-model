package org.formflowstartertemplate.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = {"org.formflowstartertemplate.app", "formflow.library"})
@EnableConfigurationProperties
public class ChildCareApplication {

  public static void main(String[] args) {

    SpringApplication.run(ChildCareApplication.class, args);
  }

}
