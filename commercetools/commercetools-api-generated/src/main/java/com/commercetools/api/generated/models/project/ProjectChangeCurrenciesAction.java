package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ProjectChangeCurrenciesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectChangeCurrenciesActionImpl.class)
public interface ProjectChangeCurrenciesAction extends ProjectUpdateAction {

   /**
   *  <p>A three-digit currency code as per currency code.</p>
   */
   @NotNull
   @JsonProperty("currencies")
   public List<String> getCurrencies();

   public void setCurrencies(final List<String> currencies);
   
   public static ProjectChangeCurrenciesActionImpl of(){
      return new ProjectChangeCurrenciesActionImpl();
   }
   

   public static ProjectChangeCurrenciesActionImpl of(final ProjectChangeCurrenciesAction template) {
      ProjectChangeCurrenciesActionImpl instance = new ProjectChangeCurrenciesActionImpl();
      instance.setCurrencies(template.getCurrencies());
      return instance;
   }

}