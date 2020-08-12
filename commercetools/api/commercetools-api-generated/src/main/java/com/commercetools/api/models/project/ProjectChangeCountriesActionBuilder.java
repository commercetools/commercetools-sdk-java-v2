package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeCountriesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectChangeCountriesActionBuilder {
   
   
   private java.util.List<String> countries;
   
   public ProjectChangeCountriesActionBuilder countries( final java.util.List<String> countries) {
      this.countries = countries;
      return this;
   }
   
   
   public java.util.List<String> getCountries(){
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
