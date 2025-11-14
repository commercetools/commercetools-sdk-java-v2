
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDeliveryAddressCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryAddressCustomTypeChange setDeliveryAddressCustomTypeChange = SetDeliveryAddressCustomTypeChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .addressId("{addressId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDeliveryAddressCustomTypeChangeBuilder implements Builder<SetDeliveryAddressCustomTypeChange> {

    private String change;

    private String deliveryId;

    private String addressId;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomTypeChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomTypeChangeBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDeliveryAddressCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetDeliveryAddressCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDeliveryAddressCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetDeliveryAddressCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     * @return addressId
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetDeliveryAddressCustomTypeChange with checking for non-null required values
     * @return SetDeliveryAddressCustomTypeChange
     */
    public SetDeliveryAddressCustomTypeChange build() {
        Objects.requireNonNull(change, SetDeliveryAddressCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, SetDeliveryAddressCustomTypeChange.class + ": deliveryId is missing");
        Objects.requireNonNull(addressId, SetDeliveryAddressCustomTypeChange.class + ": addressId is missing");
        Objects.requireNonNull(previousValue, SetDeliveryAddressCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDeliveryAddressCustomTypeChange.class + ": nextValue is missing");
        return new SetDeliveryAddressCustomTypeChangeImpl(change, deliveryId, addressId, previousValue, nextValue);
    }

    /**
     * builds SetDeliveryAddressCustomTypeChange without checking for non-null required values
     * @return SetDeliveryAddressCustomTypeChange
     */
    public SetDeliveryAddressCustomTypeChange buildUnchecked() {
        return new SetDeliveryAddressCustomTypeChangeImpl(change, deliveryId, addressId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetDeliveryAddressCustomTypeChangeBuilder
     * @return builder
     */
    public static SetDeliveryAddressCustomTypeChangeBuilder of() {
        return new SetDeliveryAddressCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetDeliveryAddressCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryAddressCustomTypeChangeBuilder of(final SetDeliveryAddressCustomTypeChange template) {
        SetDeliveryAddressCustomTypeChangeBuilder builder = new SetDeliveryAddressCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.addressId = template.getAddressId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
