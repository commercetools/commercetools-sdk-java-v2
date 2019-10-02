package com.commercetools.models.project;

import com.commercetools.models.project.ProjectUpdateAction;
import com.commercetools.models.project.ProjectUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.project.ProjectUpdateAction> actions;
   
   
   private Long version;
   
   public ProjectUpdateBuilder actions( final java.util.List<com.commercetools.models.project.ProjectUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ProjectUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.project.ProjectUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public ProjectUpdate build() {
       return new ProjectUpdateImpl(actions, version);
   }
   
   public static ProjectUpdateBuilder of() {
      return new ProjectUpdateBuilder();
   }
   
   public static ProjectUpdateBuilder of(final ProjectUpdate template) {
      ProjectUpdateBuilder builder = new ProjectUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}