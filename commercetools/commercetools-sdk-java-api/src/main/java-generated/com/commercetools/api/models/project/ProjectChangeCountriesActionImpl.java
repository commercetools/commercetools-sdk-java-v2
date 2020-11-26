package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectChangeCountriesActionImpl implements ProjectChangeCountriesAction {

    private String action;
    
    private java.util.List<String> countries;

    @JsonCreator
    ProjectChangeCountriesActionImpl(@JsonProperty("countries") final java.util.List<String> countries) {
        this.countries = countries;
        this.action = "changeCountries";
    }
    public ProjectChangeCountriesActionImpl() {
        this.action = "changeCountries";
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>A two-digit country code as per country code.</p>
    */
    public java.util.List<String> getCountries(){
        return this.countries;
    }

    public void setCountries(final String ...countries){
       this.countries = new ArrayList<>(Arrays.asList(countries));
    }
    
    public void setCountries(final java.util.List<String> countries){
       this.countries = countries;
    }

}
