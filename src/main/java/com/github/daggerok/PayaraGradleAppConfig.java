package com.github.daggerok;

import com.github.daggerok.app.ErrorHandler;
import com.github.daggerok.app.MyResource;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
@ApplicationPath("")
public class PayaraGradleAppConfig extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    final HashSet<Class<?>> classes = new HashSet<>();
    classes.add(MyResource.class);
    classes.add(ErrorHandler.class);
    return classes;
  }
}
