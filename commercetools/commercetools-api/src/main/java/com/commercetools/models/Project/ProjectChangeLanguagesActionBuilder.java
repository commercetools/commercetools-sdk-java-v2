package com.commercetools.models.project;

import com.commercetools.models.project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.project.ProjectChangeLanguagesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectChangeLanguagesActionBuilder {
   
   
   private java.util.List<java.lang.String> languages;
   
   public ProjectChangeLanguagesActionBuilder languages( final java.util.List<java.lang.String> languages) {
      this.languages = languages;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getLanguages(){
      return this.languages;
   }

   public ProjectChangeLanguagesAction build() {
       return new ProjectChangeLanguagesActionImpl(languages);
   }
   
   public static ProjectChangeLanguagesActionBuilder of() {
      return new ProjectChangeLanguagesActionBuilder();
   }
   
   public static ProjectChangeLanguagesActionBuilder of(final ProjectChangeLanguagesAction template) {
      ProjectChangeLanguagesActionBuilder builder = new ProjectChangeLanguagesActionBuilder();
      builder.languages = template.getLanguages();
      return builder;
   }
   
}