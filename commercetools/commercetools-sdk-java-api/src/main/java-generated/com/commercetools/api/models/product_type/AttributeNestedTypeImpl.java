
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AttributeNestedTypeImpl implements AttributeNestedType, ModelBase {

    private String name;

    private com.commercetools.api.models.product_type.ProductTypeReference typeReference;

    @JsonCreator
    AttributeNestedTypeImpl(
            @JsonProperty("typeReference") final com.commercetools.api.models.product_type.ProductTypeReference typeReference) {
        this.typeReference = typeReference;
        this.name = NESTED;
    }

    public AttributeNestedTypeImpl() {
        this.name = NESTED;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getTypeReference() {
        return this.typeReference;
    }

    public void setTypeReference(final com.commercetools.api.models.product_type.ProductTypeReference typeReference) {
        this.typeReference = typeReference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeNestedTypeImpl that = (AttributeNestedTypeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(typeReference, that.typeReference).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(typeReference).toHashCode();
    }

}
