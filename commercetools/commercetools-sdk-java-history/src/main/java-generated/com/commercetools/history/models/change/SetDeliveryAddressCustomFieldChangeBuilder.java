
package com.commercetools.history.models.change;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDeliveryAddressCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeliveryAddressCustomFieldChange setDeliveryAddressCustomFieldChange = SetDeliveryAddressCustomFieldChange.builder()
 *             .change("{change}")
 *             .deliveryId("{deliveryId}")
 *             .addressId("{addressId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDeliveryAddressCustomFieldChangeBuilder implements Builder<SetDeliveryAddressCustomFieldChange> {

    private String change;

    private String deliveryId;

    private String addressId;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    @Nullable
    private String shippingKey;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomFieldChangeBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a>.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomFieldChangeBuilder addressId(final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> associated with the Delivery. Only present when the Order uses the <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public SetDeliveryAddressCustomFieldChangeBuilder shippingKey(@Nullable final String shippingKey) {
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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
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
     * builds SetDeliveryAddressCustomFieldChange with checking for non-null required values
     * @return SetDeliveryAddressCustomFieldChange
     */
    public SetDeliveryAddressCustomFieldChange build() {
        Objects.requireNonNull(change, SetDeliveryAddressCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(deliveryId, SetDeliveryAddressCustomFieldChange.class + ": deliveryId is missing");
        Objects.requireNonNull(addressId, SetDeliveryAddressCustomFieldChange.class + ": addressId is missing");
        Objects.requireNonNull(name, SetDeliveryAddressCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetDeliveryAddressCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue, SetDeliveryAddressCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDeliveryAddressCustomFieldChange.class + ": nextValue is missing");
        return new SetDeliveryAddressCustomFieldChangeImpl(change, deliveryId, addressId, name, customTypeId,
            previousValue, nextValue, shippingKey);
    }

    /**
     * builds SetDeliveryAddressCustomFieldChange without checking for non-null required values
     * @return SetDeliveryAddressCustomFieldChange
     */
    public SetDeliveryAddressCustomFieldChange buildUnchecked() {
        return new SetDeliveryAddressCustomFieldChangeImpl(change, deliveryId, addressId, name, customTypeId,
            previousValue, nextValue, shippingKey);
    }

    /**
     * factory method for an instance of SetDeliveryAddressCustomFieldChangeBuilder
     * @return builder
     */
    public static SetDeliveryAddressCustomFieldChangeBuilder of() {
        return new SetDeliveryAddressCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetDeliveryAddressCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeliveryAddressCustomFieldChangeBuilder of(final SetDeliveryAddressCustomFieldChange template) {
        SetDeliveryAddressCustomFieldChangeBuilder builder = new SetDeliveryAddressCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.deliveryId = template.getDeliveryId();
        builder.addressId = template.getAddressId();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
