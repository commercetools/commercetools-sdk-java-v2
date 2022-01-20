
package com.commercetools.importapi.models.producttypes;

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

    private com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference;

    @JsonCreator
    AttributeNestedTypeImpl(
            @JsonProperty("typeReference") final com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference) {
        this.typeReference = typeReference;
        this.name = NESTED;
    }

    public AttributeNestedTypeImpl() {
        this.name = NESTED;
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>References a product type by key.</p>
    */
    public com.commercetools.importapi.models.common.ProductTypeKeyReference getTypeReference() {
        return this.typeReference;
    }

    public void setTypeReference(
            final com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference) {
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
