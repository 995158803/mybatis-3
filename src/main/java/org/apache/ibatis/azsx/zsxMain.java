package org.apache.ibatis.azsx;

import org.apache.ibatis.azsx.domain.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class zsxMain {

  public static void main(String[] args) throws Exception {
    Method method = Person.class.getMethod("getName");
    Type genericReturnType =method.getGenericReturnType();
    Class<?> declaringClass = method.getDeclaringClass();
    System.out.println(genericReturnType.getTypeName());
    System.out.println(declaringClass.getName());
  }
}
