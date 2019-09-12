package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.Project.ProjectChangeCurrenciesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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