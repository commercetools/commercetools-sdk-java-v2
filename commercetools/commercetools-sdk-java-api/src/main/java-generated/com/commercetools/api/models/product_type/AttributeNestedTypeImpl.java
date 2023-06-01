package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.ProductTypeReference;
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
 *  <p>Attribute type for nesting Attributes based on some existing ProductType. It does not support <code>isSearchable</code> and is not supported in queries. The only supported AttributeConstraint is <code>None</code>.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeNestedTypeImpl implements AttributeNestedType, ModelBase {

    
    private String name;
    
    
    private com.commercetools.api.models.product_type.ProductTypeReference typeReference;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeNestedTypeImpl(@JsonProperty("typeReference") final com.commercetools.api.models.product_type.ProductTypeReference typeReference) {
        this.typeReference = typeReference;
        this.name =  NESTED;
    }
    /**
     * create empty instance
     */
    public AttributeNestedTypeImpl() {
        this.name =  NESTED;
    }

    /**
     *
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>Attributes that can be stored as nested Attributes of the current Attribute.</p>
     */
    
    public com.commercetools.api.models.product_type.ProductTypeReference getTypeReference(){
        return this.typeReference;
    }

    
    public void setTypeReference(final com.commercetools.api.models.product_type.ProductTypeReference typeReference){
        this.typeReference = typeReference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AttributeNestedTypeImpl that = (AttributeNestedTypeImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .append(typeReference, that.typeReference)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(typeReference)
            .toHashCode();
    }

}
