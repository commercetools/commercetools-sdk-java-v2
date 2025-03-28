
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Attribute type for Reference type values.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeReferenceTypeImpl implements AttributeReferenceType, ModelBase {

    private String name;

    private com.commercetools.api.models.product_type.AttributeReferenceTypeId referenceTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeReferenceTypeImpl(
            @JsonProperty("referenceTypeId") final com.commercetools.api.models.product_type.AttributeReferenceTypeId referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        this.name = REFERENCE;
    }

    /**
     * create empty instance
     */
    public AttributeReferenceTypeImpl() {
        this.name = REFERENCE;
    }

    /**
     *
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Name of the resource type that the value should reference.</p>
     */

    public com.commercetools.api.models.product_type.AttributeReferenceTypeId getReferenceTypeId() {
        return this.referenceTypeId;
    }

    public void setReferenceTypeId(
            final com.commercetools.api.models.product_type.AttributeReferenceTypeId referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeReferenceTypeImpl that = (AttributeReferenceTypeImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(referenceTypeId, that.referenceTypeId)
                .append(name, that.name)
                .append(referenceTypeId, that.referenceTypeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(referenceTypeId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("referenceTypeId", referenceTypeId)
                .build();
    }

}
