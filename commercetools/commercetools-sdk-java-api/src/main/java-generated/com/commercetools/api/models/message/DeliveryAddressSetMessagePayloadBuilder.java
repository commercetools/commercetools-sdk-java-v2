
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryAddressSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryAddressSetMessagePayload deliveryAddressSetMessagePayload = DeliveryAddressSetMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryAddressSetMessagePayloadBuilder implements Builder<DeliveryAddressSetMessagePayload> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.common.Address address;

    @Nullable
    private com.commercetools.api.models.common.Address oldAddress;

    @Nullable
    private String shippingKey;

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public DeliveryAddressSetMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Address after the Set Delivery Address update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryAddressSetMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address after the Set Delivery Address update action.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryAddressSetMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address after the Set Delivery Address update action.</p>
     * @param address value to be set
     * @return Builder
     */

    public DeliveryAddressSetMessagePayloadBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Address before the Set Delivery Address update action.</p>
     * @param builder function to build the oldAddress value
     * @return Builder
     */

    public DeliveryAddressSetMessagePayloadBuilder oldAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address before the Set Delivery Address update action.</p>
     * @param builder function to build the oldAddress value
     * @return Builder
     */

    public DeliveryAddressSetMessagePayloadBuilder withOldAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address before the Set Delivery Address update action.</p>
     * @param oldAddress value to be set
     * @return Builder
     */

    public DeliveryAddressSetMessagePayloadBuilder oldAddress(
            @Nullable final com.commercetools.api.models.common.Address oldAddress) {
        this.oldAddress = oldAddress;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public DeliveryAddressSetMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Address after the Set Delivery Address update action.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Address before the Set Delivery Address update action.</p>
     * @return oldAddress
     */

    @Nullable
    public com.commercetools.api.models.common.Address getOldAddress() {
        return this.oldAddress;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds DeliveryAddressSetMessagePayload with checking for non-null required values
     * @return DeliveryAddressSetMessagePayload
     */
    public DeliveryAddressSetMessagePayload build() {
        Objects.requireNonNull(deliveryId, DeliveryAddressSetMessagePayload.class + ": deliveryId is missing");
        return new DeliveryAddressSetMessagePayloadImpl(deliveryId, address, oldAddress, shippingKey);
    }

    /**
     * builds DeliveryAddressSetMessagePayload without checking for non-null required values
     * @return DeliveryAddressSetMessagePayload
     */
    public DeliveryAddressSetMessagePayload buildUnchecked() {
        return new DeliveryAddressSetMessagePayloadImpl(deliveryId, address, oldAddress, shippingKey);
    }

    /**
     * factory method for an instance of DeliveryAddressSetMessagePayloadBuilder
     * @return builder
     */
    public static DeliveryAddressSetMessagePayloadBuilder of() {
        return new DeliveryAddressSetMessagePayloadBuilder();
    }

    /**
     * create builder for DeliveryAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryAddressSetMessagePayloadBuilder of(final DeliveryAddressSetMessagePayload template) {
        DeliveryAddressSetMessagePayloadBuilder builder = new DeliveryAddressSetMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.address = template.getAddress();
        builder.oldAddress = template.getOldAddress();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
