
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.order.OrderReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ReplicaMyCartDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReplicaMyCartDraftImpl implements ReplicaMyCartDraft, ModelBase {

    private java.lang.Object reference;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReplicaMyCartDraftImpl(@JsonProperty("reference") final java.lang.Object reference) {
        this.reference = reference;
    }

    /**
     * create empty instance
     */
    public ReplicaMyCartDraftImpl() {
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that is replicated.</p>
     */

    public java.lang.Object getReference() {
        return this.reference;
    }

    @JsonIgnore
    public void setReference(final CartReference reference) {
        this.reference = reference;
    }

    @JsonIgnore
    public void setReference(final OrderReference reference) {
        this.reference = reference;
    }

    public void setReference(final java.lang.Object reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReplicaMyCartDraftImpl that = (ReplicaMyCartDraftImpl) o;

        return new EqualsBuilder().append(reference, that.reference).append(reference, that.reference).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(reference).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("reference", reference).build();
    }

    @Override
    public ReplicaMyCartDraft copyDeep() {
        return ReplicaMyCartDraft.deepCopy(this);
    }
}
