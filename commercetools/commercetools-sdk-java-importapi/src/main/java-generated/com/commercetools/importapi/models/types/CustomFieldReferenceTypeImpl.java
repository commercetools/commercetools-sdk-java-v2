
package com.commercetools.importapi.models.types;

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
 *  <p>Field type for Reference values.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldReferenceTypeImpl implements CustomFieldReferenceType, ModelBase {

    private String name;

    private com.commercetools.importapi.models.types.CustomFieldReferenceValue referenceTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomFieldReferenceTypeImpl(
            @JsonProperty("referenceTypeId") final com.commercetools.importapi.models.types.CustomFieldReferenceValue referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        this.name = REFERENCE;
    }

    /**
     * create empty instance
     */
    public CustomFieldReferenceTypeImpl() {
        this.name = REFERENCE;
    }

    /**
     *
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Resource type the Custom Field can reference.</p>
     */

    public com.commercetools.importapi.models.types.CustomFieldReferenceValue getReferenceTypeId() {
        return this.referenceTypeId;
    }

    public void setReferenceTypeId(
            final com.commercetools.importapi.models.types.CustomFieldReferenceValue referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldReferenceTypeImpl that = (CustomFieldReferenceTypeImpl) o;

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

    @Override
    public CustomFieldReferenceType copyDeep() {
        return CustomFieldReferenceType.deepCopy(this);
    }
}
