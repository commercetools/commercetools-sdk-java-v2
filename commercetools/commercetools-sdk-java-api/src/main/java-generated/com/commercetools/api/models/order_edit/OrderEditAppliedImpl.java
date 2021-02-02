
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditAppliedImpl implements OrderEditApplied {

    private String type;

    private java.time.ZonedDateTime appliedAt;

    private com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit;

    private com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit;

    @JsonCreator
    OrderEditAppliedImpl(@JsonProperty("appliedAt") final java.time.ZonedDateTime appliedAt,
            @JsonProperty("excerptBeforeEdit") final com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit,
            @JsonProperty("excerptAfterEdit") final com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit) {
        this.appliedAt = appliedAt;
        this.excerptBeforeEdit = excerptBeforeEdit;
        this.excerptAfterEdit = excerptAfterEdit;
        this.type = APPLIED;
    }

    public OrderEditAppliedImpl() {
        this.type = APPLIED;
    }

    public String getType() {
        return this.type;
    }

    public java.time.ZonedDateTime getAppliedAt() {
        return this.appliedAt;
    }

    public com.commercetools.api.models.order_edit.OrderExcerpt getExcerptBeforeEdit() {
        return this.excerptBeforeEdit;
    }

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

        return new EqualsBuilder().append(type, that.type).append(appliedAt, that.appliedAt).append(excerptBeforeEdit,
            that.excerptBeforeEdit).append(excerptAfterEdit, that.excerptAfterEdit).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(appliedAt).append(excerptBeforeEdit).append(
            excerptAfterEdit).toHashCode();
    }

}
