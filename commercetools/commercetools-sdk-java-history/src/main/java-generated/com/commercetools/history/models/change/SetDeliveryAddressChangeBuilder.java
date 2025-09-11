
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDeliveryAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryAddressChange setDeliveryAddressChange = SetDeliveryAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDeliveryAddressChangeBuilder implements Builder<SetDeliveryAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address previousValue;

    private com.commercetools.history.models.common.Address nextValue;

    private String deliveryId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDeliveryAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDeliveryAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDeliveryAddressChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDeliveryAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDeliveryAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDeliveryAddressChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDeliveryAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public SetDeliveryAddressChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
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

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * builds SetDeliveryAddressChange with checking for non-null required values
     * @return SetDeliveryAddressChange
     */
    public SetDeliveryAddressChange build() {
        Objects.requireNonNull(change, SetDeliveryAddressChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetDeliveryAddressChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDeliveryAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(deliveryId, SetDeliveryAddressChange.class + ": deliveryId is missing");
        return new SetDeliveryAddressChangeImpl(change, previousValue, nextValue, deliveryId);
    }

    /**
     * builds SetDeliveryAddressChange without checking for non-null required values
     * @return SetDeliveryAddressChange
     */
    public SetDeliveryAddressChange buildUnchecked() {
        return new SetDeliveryAddressChangeImpl(change, previousValue, nextValue, deliveryId);
    }

    /**
     * factory method for an instance of SetDeliveryAddressChangeBuilder
     * @return builder
     */
    public static SetDeliveryAddressChangeBuilder of() {
        return new SetDeliveryAddressChangeBuilder();
    }

    /**
     * create builder for SetDeliveryAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryAddressChangeBuilder of(final SetDeliveryAddressChange template) {
        SetDeliveryAddressChangeBuilder builder = new SetDeliveryAddressChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.deliveryId = template.getDeliveryId();
        return builder;
    }

}
