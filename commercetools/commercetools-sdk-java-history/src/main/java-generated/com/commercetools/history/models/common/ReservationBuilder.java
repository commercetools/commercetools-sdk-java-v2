
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReservationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Reservation reservation = Reservation.builder()
 *             .quantity(1)
 *             .owner(ownerBuilder -> ownerBuilder)
 *             .createdAt("{createdAt}")
 *             .checkoutStartedAt("{checkoutStartedAt}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReservationBuilder implements Builder<Reservation> {

    private Integer quantity;

    private com.commercetools.history.models.common.Reference owner;

    private String createdAt;

    private String checkoutStartedAt;

    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */

    public ReservationBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelReference" rel="nofollow">ChannelReference</a>. A referenced resource can be embedded through <span>Reference Expansion</span>. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @param owner value to be set
     * @return Builder
     */

    public ReservationBuilder owner(final com.commercetools.history.models.common.Reference owner) {
        this.owner = owner;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelReference" rel="nofollow">ChannelReference</a>. A referenced resource can be embedded through <span>Reference Expansion</span>. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @param builder function to build the owner value
     * @return Builder
     */

    public ReservationBuilder owner(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.owner = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the createdAt
     * @param createdAt value to be set
     * @return Builder
     */

    public ReservationBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set the value to the checkoutStartedAt
     * @param checkoutStartedAt value to be set
     * @return Builder
     */

    public ReservationBuilder checkoutStartedAt(final String checkoutStartedAt) {
        this.checkoutStartedAt = checkoutStartedAt;
        return this;
    }

    /**
     * value of quantity}
     * @return quantity
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelReference" rel="nofollow">ChannelReference</a>. A referenced resource can be embedded through <span>Reference Expansion</span>. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @return owner
     */

    public com.commercetools.history.models.common.Reference getOwner() {
        return this.owner;
    }

    /**
     * value of createdAt}
     * @return createdAt
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * value of checkoutStartedAt}
     * @return checkoutStartedAt
     */

    public String getCheckoutStartedAt() {
        return this.checkoutStartedAt;
    }

    /**
     * builds Reservation with checking for non-null required values
     * @return Reservation
     */
    public Reservation build() {
        Objects.requireNonNull(quantity, Reservation.class + ": quantity is missing");
        Objects.requireNonNull(owner, Reservation.class + ": owner is missing");
        Objects.requireNonNull(createdAt, Reservation.class + ": createdAt is missing");
        Objects.requireNonNull(checkoutStartedAt, Reservation.class + ": checkoutStartedAt is missing");
        return new ReservationImpl(quantity, owner, createdAt, checkoutStartedAt);
    }

    /**
     * builds Reservation without checking for non-null required values
     * @return Reservation
     */
    public Reservation buildUnchecked() {
        return new ReservationImpl(quantity, owner, createdAt, checkoutStartedAt);
    }

    /**
     * factory method for an instance of ReservationBuilder
     * @return builder
     */
    public static ReservationBuilder of() {
        return new ReservationBuilder();
    }

    /**
     * create builder for Reservation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReservationBuilder of(final Reservation template) {
        ReservationBuilder builder = new ReservationBuilder();
        builder.quantity = template.getQuantity();
        builder.owner = template.getOwner();
        builder.createdAt = template.getCreatedAt();
        builder.checkoutStartedAt = template.getCheckoutStartedAt();
        return builder;
    }

}
