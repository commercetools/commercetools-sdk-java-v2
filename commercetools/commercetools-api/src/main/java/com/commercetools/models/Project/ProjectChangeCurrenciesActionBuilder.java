package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.Project.ProjectChangeCurrenciesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProjectChangeCurrenciesActionBuilder {
   
   
   private java.util.List<java.lang.String> currencies;
   
   public ProjectChangeCurrenciesActionBuilder currencies( final java.util.List<java.lang.String> currencies) {
      this.currencies = currencies;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getCurrencies(){
      return this.currencies;
   }

   public ProjectChangeCurrenciesAction build() {
       return new ProjectChangeCurrenciesActionImpl(currencies);
   }
   
   public static ProjectChangeCurrenciesActionBuilder of() {
      return new ProjectChangeCurrenciesActionBuilder();
   }
   
   public static ProjectChangeCurrenciesActionBuilder of(final ProjectChangeCurrenciesAction template) {
      ProjectChangeCurrenciesActionBuilder builder = new ProjectChangeCurrenciesActionBuilder();
      builder.currencies = template.getCurrencies();
      return builder;
   }
   
}