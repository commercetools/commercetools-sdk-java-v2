package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import java.lang.Object;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ResourceDeletionError
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ResourceDeletionErrorImpl implements ResourceDeletionError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private java.lang.Object resource;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ResourceDeletionErrorImpl(@JsonProperty("message") final String message, @JsonProperty("resource") final java.lang.Object resource) {
        this.message = message;
        this.resource = resource;
        this.code =  RESOURCE_DELETION;
    }
    /**
     * create empty instance
     */
    public ResourceDeletionErrorImpl() {
        this.code =  RESOURCE_DELETION;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *
     */
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *
     */
    
    public java.lang.Object getResource(){
        return this.resource;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setResource(final java.lang.Object resource){
        this.resource = resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ResourceDeletionErrorImpl that = (ResourceDeletionErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(resource, that.resource)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(resource)
            .toHashCode();
    }

}
