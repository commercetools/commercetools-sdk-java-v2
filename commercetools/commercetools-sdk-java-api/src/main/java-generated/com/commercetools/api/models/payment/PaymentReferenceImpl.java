
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.common.ReferenceTypeId;
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
 *  <p>Reference to a Payment.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentReferenceImpl implements PaymentReference, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private com.commercetools.api.models.payment.Payment obj;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentReferenceImpl(@JsonProperty("id") final String id,
            @JsonProperty("obj") final com.commercetools.api.models.payment.Payment obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnum("payment");
    }

    /**
     * create empty instance
     */
    public PaymentReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("payment");
    }

    /**
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique identifier of the referenced Payment.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded Payment. Only present in responses to requests with Reference Expansion for Payments.</p>
     */

    public com.commercetools.api.models.payment.Payment getObj() {
        return this.obj;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setObj(final com.commercetools.api.models.payment.Payment obj) {
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentReferenceImpl that = (PaymentReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId)
                .append(id, that.id)
                .append(obj, that.obj)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(obj, that.obj)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(obj).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("typeId", typeId)
                .append("id", id)
                .append("obj", obj)
                .build();
    }

    @Override
    public PaymentReference copyDeep() {
        return PaymentReference.deepCopy(this);
    }
}
