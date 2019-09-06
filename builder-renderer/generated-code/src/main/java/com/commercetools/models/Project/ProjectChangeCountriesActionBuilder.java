package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.Project.ProjectChangeCountriesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectChangeCountriesActionBuilder {
   
   
   private java.util.List<java.lang.String> countries;
   
   public ProjectChangeCountriesActionBuilder countries( final java.util.List<java.lang.String> countries) {
      this.countries = countries;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getCountries(){
      return this.countries;
   }

   public ProjectChangeCountriesAction build() {
       return new ProjectChangeCountriesActionImpl(countries);
   }
   
   public static ProjectChangeCountriesActionBuilder of() {
      return new ProjectChangeCountriesActionBuilder();
   }
   
   public static ProjectChangeCountriesActionBuilder of(final ProjectChangeCountriesAction template) {
      ProjectChangeCountriesActionBuilder builder = new ProjectChangeCountriesActionBuilder();
      builder.countries = template.getCountries();
      return builder;
   }
   
}