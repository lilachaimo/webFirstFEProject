package com.crunchify.tutorials;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyJaxbBean {
  public String name;
  public String age;

  public MyJaxbBean() {} // JAXB needs this

  public MyJaxbBean(String name, String age) {
    this.name = name;
    this.age = age;
  }
}