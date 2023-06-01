package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeType;
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
 * AttributeSetType
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeSetTypeImpl implements AttributeSetType, ModelBase {

    
    private String name;
    
    
    private com.commercetools.importapi.models.producttypes.AttributeType elementType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeSetTypeImpl(@JsonProperty("elementType") final com.commercetools.importapi.models.producttypes.AttributeType elementType) {
        this.elementType = elementType;
        this.name =  SET;
    }
    /**
     * create empty instance
     */
    public AttributeSetTypeImpl() {
        this.name =  SET;
    }

    /**
     *
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *
     */
    
    public com.commercetools.importapi.models.producttypes.AttributeType getElementType(){
        return this.elementType;
    }

    
    public void setElementType(final com.commercetools.importapi.models.producttypes.AttributeType elementType){
        this.elementType = elementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AttributeSetTypeImpl that = (AttributeSetTypeImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .append(elementType, that.elementType)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(elementType)
            .toHashCode();
    }

}
