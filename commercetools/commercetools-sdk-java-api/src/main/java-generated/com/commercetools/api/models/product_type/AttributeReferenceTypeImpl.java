
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
public class AttributeReferenceTypeImpl implements AttributeReferenceType, ModelBase {

    private String name;

    private com.commercetools.api.models.common.ReferenceTypeId referenceTypeId;

    @JsonCreator
    AttributeReferenceTypeImpl(
            @JsonProperty("referenceTypeId") final com.commercetools.api.models.common.ReferenceTypeId referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        this.name = REFERENCE;
    }

    public AttributeReferenceTypeImpl() {
        this.name = REFERENCE;
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>supported resource type identifiers:</p>
    */
    public com.commercetools.api.models.common.ReferenceTypeId getReferenceTypeId() {
        return this.referenceTypeId;
    }

    public void setReferenceTypeId(final com.commercetools.api.models.common.ReferenceTypeId referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeReferenceTypeImpl that = (AttributeReferenceTypeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(referenceTypeId, that.referenceTypeId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(referenceTypeId).toHashCode();
    }

}
