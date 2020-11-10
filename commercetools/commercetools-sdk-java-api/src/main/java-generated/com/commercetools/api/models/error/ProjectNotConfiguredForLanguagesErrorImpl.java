package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
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
public final class ProjectNotConfiguredForLanguagesErrorImpl implements ProjectNotConfiguredForLanguagesError {

    private String code;
    
    private String message;
    
    private java.util.List<String> languages;

    @JsonCreator
    ProjectNotConfiguredForLanguagesErrorImpl(@JsonProperty("message") final String message, @JsonProperty("languages") final java.util.List<String> languages) {
        this.message = message;
        this.languages = languages;
        this.code = "ProjectNotConfiguredForLanguages";
    }
    public ProjectNotConfiguredForLanguagesErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public java.util.List<String> getLanguages(){
        return this.languages;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setLanguages(final String ...languages){
       this.languages = new ArrayList<>(Arrays.asList(languages));
    }
    
    public void setLanguages(final java.util.List<String> languages){
       this.languages = languages;
    }

}
