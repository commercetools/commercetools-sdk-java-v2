
package com.commercetools.history.models.common;

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
public class ReservationImpl implements Reservation, ModelBase {

    private Integer quantity;

    private com.commercetools.history.models.common.Reference owner;

    private String createdAt;

    private String checkoutStartedAt;

    @JsonCreator
    ReservationImpl(@JsonProperty("quantity") final Integer quantity,
            @JsonProperty("owner") final com.commercetools.history.models.common.Reference owner,
            @JsonProperty("createdAt") final String createdAt,
            @JsonProperty("checkoutStartedAt") final String checkoutStartedAt) {
        this.quantity = quantity;
        this.owner = owner;
        this.createdAt = createdAt;
        this.checkoutStartedAt = checkoutStartedAt;
    }

    public ReservationImpl() {
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public com.commercetools.history.models.common.Reference getOwner() {
        return this.owner;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public String getCheckoutStartedAt() {
        return this.checkoutStartedAt;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public void setOwner(final com.commercetools.history.models.common.Reference owner) {
        this.owner = owner;
    }

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    public void setCheckoutStartedAt(final String checkoutStartedAt) {
        this.checkoutStartedAt = checkoutStartedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReservationImpl that = (ReservationImpl) o;

        return new EqualsBuilder().append(quantity, that.quantity)
                .append(owner, that.owner)
                .append(createdAt, that.createdAt)
                .append(checkoutStartedAt, that.checkoutStartedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quantity)
                .append(owner)
                .append(createdAt)
                .append(checkoutStartedAt)
                .toHashCode();
    }

}
