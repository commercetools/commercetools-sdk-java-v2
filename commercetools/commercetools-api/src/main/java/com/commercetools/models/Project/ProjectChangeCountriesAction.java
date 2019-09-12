package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.Project.ProjectChangeCountriesActionImpl;

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
@JsonDeserialize(as = ProjectChangeCountriesActionImpl.class)
public interface ProjectChangeCountriesAction extends ProjectUpdateAction {

   
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