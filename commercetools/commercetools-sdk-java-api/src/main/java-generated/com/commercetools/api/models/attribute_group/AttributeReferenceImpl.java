package com.commercetools.api.models.attribute_group;


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
 * AttributeReference
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeReferenceImpl implements AttributeReference, ModelBase {

    
    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeReferenceImpl(@JsonProperty("key") final String key) {
        this.key = key;
    }
    /**
     * create empty instance
     */
    public AttributeReferenceImpl() {
    }

    /**
     *  <p>The Attribute's <code>name</code> as given in its AttributeDefinition.</p>
     */
    
    public String getKey(){
        return this.key;
    }

    
    public void setKey(final String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AttributeReferenceImpl that = (AttributeReferenceImpl) o;
    
        return new EqualsBuilder()
                .append(key, that.key)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(key)
            .toHashCode();
    }

}
