package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
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
public final class AttributeSetTypeImpl implements AttributeSetType {

    private String name;
    
    private com.commercetools.api.models.product_type.AttributeType elementType;

    @JsonCreator
    AttributeSetTypeImpl(@JsonProperty("elementType") final com.commercetools.api.models.product_type.AttributeType elementType) {
        this.elementType = elementType;
        this.name = "set";
    }
    public AttributeSetTypeImpl() {
        this.name = "set";
    }

    
    public String getName(){
        return this.name;
    }
    
    
    public com.commercetools.api.models.product_type.AttributeType getElementType(){
        return this.elementType;
    }

    public void setElementType(final com.commercetools.api.models.product_type.AttributeType elementType){
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
