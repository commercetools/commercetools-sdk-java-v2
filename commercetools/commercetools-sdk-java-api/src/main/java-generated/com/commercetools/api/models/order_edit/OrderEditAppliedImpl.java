
package com.commercetools.api.models.order_edit;

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
 *  <p>Result of a successful application of <code>stagedActions</code> to the Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditAppliedImpl implements OrderEditApplied, ModelBase {

    private String type;

    private java.time.ZonedDateTime appliedAt;

    private com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit;

    private com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditAppliedImpl(@JsonProperty("appliedAt") final java.time.ZonedDateTime appliedAt,
            @JsonProperty("excerptBeforeEdit") final com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit,
            @JsonProperty("excerptAfterEdit") final com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit) {
        this.appliedAt = appliedAt;
        this.excerptBeforeEdit = excerptBeforeEdit;
        this.excerptAfterEdit = excerptAfterEdit;
        this.type = APPLIED;
    }

    /**
     * create empty instance
     */
    public OrderEditAppliedImpl() {
        this.type = APPLIED;
    }

    /**
     *  <p>This field is queryable.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Date and time (UTC) the Order was edited.</p>
     */

    public java.time.ZonedDateTime getAppliedAt() {
        return this.appliedAt;
    }

    /**
     *  <p>Prices of the Order before the edit.</p>
     */

    public com.commercetools.api.models.order_edit.OrderExcerpt getExcerptBeforeEdit() {
        return this.excerptBeforeEdit;
    }

    /**
     *  <p>Prices of the Order after the edit.</p>
     */

    public com.commercetools.api.models.order_edit.OrderExcerpt getExcerptAfterEdit() {
        return this.excerptAfterEdit;
    }

    public void setAppliedAt(final java.time.ZonedDateTime appliedAt) {
        this.appliedAt = appliedAt;
    }

    public void setExcerptBeforeEdit(final com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit) {
        this.excerptBeforeEdit = excerptBeforeEdit;
    }

    public void setExcerptAfterEdit(final com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit) {
        this.excerptAfterEdit = excerptAfterEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditAppliedImpl that = (OrderEditAppliedImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(appliedAt, that.appliedAt)
                .append(excerptBeforeEdit, that.excerptBeforeEdit)
                .append(excerptAfterEdit, that.excerptAfterEdit)
                .append(type, that.type)
                .append(appliedAt, that.appliedAt)
                .append(excerptBeforeEdit, that.excerptBeforeEdit)
                .append(excerptAfterEdit, that.excerptAfterEdit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(appliedAt)
                .append(excerptBeforeEdit)
                .append(excerptAfterEdit)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("appliedAt", appliedAt)
                .append("excerptBeforeEdit", excerptBeforeEdit)
                .append("excerptAfterEdit", excerptAfterEdit)
                .build();
    }

    @Override
    public OrderEditApplied copyDeep() {
        return OrderEditApplied.deepCopy(this);
    }
}
