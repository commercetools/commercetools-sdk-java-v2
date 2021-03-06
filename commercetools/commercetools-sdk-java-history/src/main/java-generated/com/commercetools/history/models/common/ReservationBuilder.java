
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReservationBuilder {

    private Integer quantity;

    private com.commercetools.history.models.common.Reference owner;

    private String createdAt;

    private String checkoutStartedAt;

    public ReservationBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ReservationBuilder owner(final com.commercetools.history.models.common.Reference owner) {
        this.owner = owner;
        return this;
    }

    public ReservationBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ReservationBuilder checkoutStartedAt(final String checkoutStartedAt) {
        this.checkoutStartedAt = checkoutStartedAt;
        return this;
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

    public Reservation build() {
        return new ReservationImpl(quantity, owner, createdAt, checkoutStartedAt);
    }

    public static ReservationBuilder of() {
        return new ReservationBuilder();
    }

    public static ReservationBuilder of(final Reservation template) {
        ReservationBuilder builder = new ReservationBuilder();
        builder.quantity = template.getQuantity();
        builder.owner = template.getOwner();
        builder.createdAt = template.getCreatedAt();
        builder.checkoutStartedAt = template.getCheckoutStartedAt();
        return builder;
    }

}
