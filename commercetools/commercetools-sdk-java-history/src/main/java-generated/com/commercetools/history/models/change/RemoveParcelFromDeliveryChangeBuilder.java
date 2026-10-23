
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveParcelFromDeliveryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveParcelFromDeliveryChange removeParcelFromDeliveryChange = RemoveParcelFromDeliveryChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveParcelFromDeliveryChangeBuilder implements Builder<RemoveParcelFromDeliveryChange> {

    private String change;

    private com.commercetools.history.models.common.Parcel previousValue;

    private String deliveryId;

    @Nullable
    private String shippingKey;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.Parcel> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ParcelBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Parcel previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> from which the Parcel was removed.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> associated with the Delivery. Only present when the Order uses the <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public RemoveParcelFromDeliveryChangeBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.Parcel getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> from which the Parcel was removed.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> associated with the Delivery. Only present when the Order uses the <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds RemoveParcelFromDeliveryChange with checking for non-null required values
     * @return RemoveParcelFromDeliveryChange
     */
    public RemoveParcelFromDeliveryChange build() {
        Objects.requireNonNull(change, RemoveParcelFromDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveParcelFromDeliveryChange.class + ": previousValue is missing");
        Objects.requireNonNull(deliveryId, RemoveParcelFromDeliveryChange.class + ": deliveryId is missing");
        return new RemoveParcelFromDeliveryChangeImpl(change, previousValue, deliveryId, shippingKey);
    }

    /**
     * builds RemoveParcelFromDeliveryChange without checking for non-null required values
     * @return RemoveParcelFromDeliveryChange
     */
    public RemoveParcelFromDeliveryChange buildUnchecked() {
        return new RemoveParcelFromDeliveryChangeImpl(change, previousValue, deliveryId, shippingKey);
    }

    /**
     * factory method for an instance of RemoveParcelFromDeliveryChangeBuilder
     * @return builder
     */
    public static RemoveParcelFromDeliveryChangeBuilder of() {
        return new RemoveParcelFromDeliveryChangeBuilder();
    }

    /**
     * create builder for RemoveParcelFromDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveParcelFromDeliveryChangeBuilder of(final RemoveParcelFromDeliveryChange template) {
        RemoveParcelFromDeliveryChangeBuilder builder = new RemoveParcelFromDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.deliveryId = template.getDeliveryId();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
