
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeReferenceTypeImpl implements AttributeReferenceType {

    private String name;

    private com.commercetools.importapi.models.common.ReferenceType referenceTypeId;

    @JsonCreator
    AttributeReferenceTypeImpl(
            @JsonProperty("referenceTypeId") final com.commercetools.importapi.models.common.ReferenceType referenceTypeId) {
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
    *  <p>The type of the referenced resource.</p>
    */
    public com.commercetools.importapi.models.common.ReferenceType getReferenceTypeId() {
        return this.referenceTypeId;
    }

    public void setReferenceTypeId(final com.commercetools.importapi.models.common.ReferenceType referenceTypeId) {
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
