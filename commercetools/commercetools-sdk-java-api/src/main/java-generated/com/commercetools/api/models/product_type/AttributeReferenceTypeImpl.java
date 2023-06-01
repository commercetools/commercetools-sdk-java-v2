package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeReferenceTypeId;
import com.commercetools.api.models.product_type.AttributeType;
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
 * AttributeReferenceType
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeReferenceTypeImpl implements AttributeReferenceType, ModelBase {

    
    private String name;
    
    
    private com.commercetools.api.models.product_type.AttributeReferenceTypeId referenceTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeReferenceTypeImpl(@JsonProperty("referenceTypeId") final com.commercetools.api.models.product_type.AttributeReferenceTypeId referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        this.name =  REFERENCE;
    }
    /**
     * create empty instance
     */
    public AttributeReferenceTypeImpl() {
        this.name =  REFERENCE;
    }

    /**
     *
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>Name of the resource type that the value should reference.</p>
     */
    
    public com.commercetools.api.models.product_type.AttributeReferenceTypeId getReferenceTypeId(){
        return this.referenceTypeId;
    }

    
    public void setReferenceTypeId(final com.commercetools.api.models.product_type.AttributeReferenceTypeId referenceTypeId){
        this.referenceTypeId = referenceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AttributeReferenceTypeImpl that = (AttributeReferenceTypeImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .append(referenceTypeId, that.referenceTypeId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(referenceTypeId)
            .toHashCode();
    }

}
