package com.commercetools.api.models.error;


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
 * ErrorByExtension
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ErrorByExtensionImpl implements ErrorByExtension, ModelBase {

    
    private String id;
    
    
    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ErrorByExtensionImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.id = id;
        this.key = key;
    }
    /**
     * create empty instance
     */
    public ErrorByExtensionImpl() {
    }

    /**
     *  <p>Unique identifier of the Extension.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     */
    
    public String getKey(){
        return this.key;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setKey(final String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ErrorByExtensionImpl that = (ErrorByExtensionImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(key, that.key)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(key)
            .toHashCode();
    }

}
