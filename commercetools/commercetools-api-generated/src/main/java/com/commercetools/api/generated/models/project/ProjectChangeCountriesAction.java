package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ProjectUpdateAction;
import com.commercetools.api.generated.models.project.ProjectChangeCountriesActionImpl;

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
@JsonDeserialize(as = ProjectChangeCountriesActionImpl.class)
public interface ProjectChangeCountriesAction extends ProjectUpdateAction {

   /**
   *  <p>A two-digit country code as per country code.</p>
   */
   @NotNull
   @JsonProperty("countries")
   public List<String> getCountries();

   public void setCountries(final List<String> countries);
   
   public static ProjectChangeCountriesActionImpl of(){
      return new ProjectChangeCountriesActionImpl();
   }
   

   public static ProjectChangeCountriesActionImpl of(final ProjectChangeCountriesAction template) {
      ProjectChangeCountriesActionImpl instance = new ProjectChangeCountriesActionImpl();
      instance.setCountries(template.getCountries());
      return instance;
   }

}