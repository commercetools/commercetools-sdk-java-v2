package com.commercetools.history.models.change_value;


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
 * ParcelChangeValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ParcelChangeValueImpl implements ParcelChangeValue, ModelBase {

    
    private String id;
    
    
    private String createdAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelChangeValueImpl(@JsonProperty("id") final String id, @JsonProperty("createdAt") final String createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }
    /**
     * create empty instance
     */
    public ParcelChangeValueImpl() {
    }

    /**
     *
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *
     */
    
    public String getCreatedAt(){
        return this.createdAt;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setCreatedAt(final String createdAt){
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ParcelChangeValueImpl that = (ParcelChangeValueImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(createdAt, that.createdAt)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(createdAt)
            .toHashCode();
    }

}
