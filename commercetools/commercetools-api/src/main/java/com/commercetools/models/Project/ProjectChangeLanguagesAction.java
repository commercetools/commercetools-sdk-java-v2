package com.commercetools.models.project;

import com.commercetools.models.project.ProjectUpdateAction;
import java.lang.String;
import com.commercetools.models.project.ProjectChangeLanguagesActionImpl;

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
@JsonDeserialize(as = ProjectChangeLanguagesActionImpl.class)
public interface ProjectChangeLanguagesAction extends ProjectUpdateAction {

   
   @NotNull
   @JsonProperty("languages")
   public List<String> getLanguages();

   public void setLanguages(final List<String> languages);
   
   public static ProjectChangeLanguagesActionImpl of(){
      return new ProjectChangeLanguagesActionImpl();
   }
   

   public static ProjectChangeLanguagesActionImpl of(final ProjectChangeLanguagesAction template) {
      ProjectChangeLanguagesActionImpl instance = new ProjectChangeLanguagesActionImpl();
      instance.setLanguages(template.getLanguages());
      return instance;
   }

}