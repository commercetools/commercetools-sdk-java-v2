package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ProjectChangeCurrenciesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectChangeCurrenciesActionBuilder {
   
   
   private java.util.List<String> currencies;
   
   public ProjectChangeCurrenciesActionBuilder currencies( final java.util.List<String> currencies) {
      this.currencies = currencies;
      return this;
   }
   
   
   public java.util.List<String> getCurrencies(){
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