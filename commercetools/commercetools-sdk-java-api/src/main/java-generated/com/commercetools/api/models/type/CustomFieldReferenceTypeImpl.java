
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Field type for <a href="ctp:api:type:Reference">Reference</a> values.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomFieldReferenceTypeImpl implements CustomFieldReferenceType, ModelBase {

    private String name;

    private com.commercetools.api.models.type.CustomFieldReferenceValue referenceTypeId;

    @JsonCreator
    CustomFieldReferenceTypeImpl(
            @JsonProperty("referenceTypeId") final com.commercetools.api.models.type.CustomFieldReferenceValue referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        this.name = REFERENCE;
    }

    public CustomFieldReferenceTypeImpl() {
        this.name = REFERENCE;
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>Resource type the Custom Field can reference.</p>
    */
    public com.commercetools.api.models.type.CustomFieldReferenceValue getReferenceTypeId() {
        return this.referenceTypeId;
    }

    public void setReferenceTypeId(final com.commercetools.api.models.type.CustomFieldReferenceValue referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldReferenceTypeImpl that = (CustomFieldReferenceTypeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(referenceTypeId, that.referenceTypeId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(referenceTypeId).toHashCode();
    }

}
