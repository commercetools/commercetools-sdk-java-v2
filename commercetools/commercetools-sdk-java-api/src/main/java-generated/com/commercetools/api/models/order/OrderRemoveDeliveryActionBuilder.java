
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderRemoveDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemoveDeliveryAction orderRemoveDeliveryAction = OrderRemoveDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderRemoveDeliveryActionBuilder implements Builder<OrderRemoveDeliveryAction> {

    @Nullable
    private String deliveryId;

    @Nullable
    private String deliveryKey;

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public OrderRemoveDeliveryActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public OrderRemoveDeliveryActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     * builds OrderRemoveDeliveryAction with checking for non-null required values
     * @return OrderRemoveDeliveryAction
     */
    public OrderRemoveDeliveryAction build() {
        return new OrderRemoveDeliveryActionImpl(deliveryId, deliveryKey);
    }

    /**
     * builds OrderRemoveDeliveryAction without checking for non-null required values
     * @return OrderRemoveDeliveryAction
     */
    public OrderRemoveDeliveryAction buildUnchecked() {
        return new OrderRemoveDeliveryActionImpl(deliveryId, deliveryKey);
    }

    /**
     * factory method for an instance of OrderRemoveDeliveryActionBuilder
     * @return builder
     */
    public static OrderRemoveDeliveryActionBuilder of() {
        return new OrderRemoveDeliveryActionBuilder();
    }

    /**
     * create builder for OrderRemoveDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderRemoveDeliveryActionBuilder of(final OrderRemoveDeliveryAction template) {
        OrderRemoveDeliveryActionBuilder builder = new OrderRemoveDeliveryActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        return builder;
    }

}
