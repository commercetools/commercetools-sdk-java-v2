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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


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
        this.code = "ProjectNotConfiguredForLanguages";
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProjectNotConfiguredForLanguagesErrorImpl that = (ProjectNotConfiguredForLanguagesErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(languages, that.languages)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(languages)
            .toHashCode();
    }

}
