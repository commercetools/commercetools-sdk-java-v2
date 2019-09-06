package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.Project.ProjectChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectChangeNameActionBuilder {
   
   
   private java.lang.String name;
   
   public ProjectChangeNameActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public ProjectChangeNameAction build() {
       return new ProjectChangeNameActionImpl(name);
   }
   
   public static ProjectChangeNameActionBuilder of() {
      return new ProjectChangeNameActionBuilder();
   }
   
   public static ProjectChangeNameActionBuilder of(final ProjectChangeNameAction template) {
      ProjectChangeNameActionBuilder builder = new ProjectChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}