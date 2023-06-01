package com.commercetools.importapi.models.producttypes;


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
 * AttributePlainEnumValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributePlainEnumValueImpl implements AttributePlainEnumValue, ModelBase {

    
    private String key;
    
    
    private String label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributePlainEnumValueImpl(@JsonProperty("key") final String key, @JsonProperty("label") final String label) {
        this.key = key;
        this.label = label;
    }
    /**
     * create empty instance
     */
    public AttributePlainEnumValueImpl() {
    }

    /**
     *
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *
     */
    
    public String getLabel(){
        return this.label;
    }

    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setLabel(final String label){
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AttributePlainEnumValueImpl that = (AttributePlainEnumValueImpl) o;
    
        return new EqualsBuilder()
                .append(key, that.key)
                .append(label, that.label)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(key)
            .append(label)
            .toHashCode();
    }

}
