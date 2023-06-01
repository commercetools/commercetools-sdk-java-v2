package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.common.ProductTypeKeyReference;
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
 * AttributeNestedType
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeNestedTypeImpl implements AttributeNestedType, ModelBase {

    
    private String name;
    
    
    private com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeNestedTypeImpl(@JsonProperty("typeReference") final com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference) {
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
     *  <p>References a product type by key.</p>
     */
    
    public com.commercetools.importapi.models.common.ProductTypeKeyReference getTypeReference(){
        return this.typeReference;
    }

    
    public void setTypeReference(final com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference){
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
