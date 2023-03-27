
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryAddressDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryAddressDraft deliveryAddressDraft = DeliveryAddressDraft.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryAddressDraftBuilder implements Builder<DeliveryAddressDraft> {

    private String deliveryId;

    @Nullable
    private com.commercetools.importapi.models.common.Address address;

    /**
     * set the value to the deliveryId
     * @param deliveryId value to be set
     * @return Builder
     */

    public DeliveryAddressDraftBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     * set the value to the address using the builder function
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryAddressDraftBuilder address(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the address
     * @param address value to be set
     * @return Builder
     */

    public DeliveryAddressDraftBuilder address(
            @Nullable final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     * value of deliveryId}
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * value of address}
     * @return address
     */

    @Nullable
    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds DeliveryAddressDraft with checking for non-null required values
     * @return DeliveryAddressDraft
     */
    public DeliveryAddressDraft build() {
        Objects.requireNonNull(deliveryId, DeliveryAddressDraft.class + ": deliveryId is missing");
        return new DeliveryAddressDraftImpl(deliveryId, address);
    }

    /**
     * builds DeliveryAddressDraft without checking for non-null required values
     * @return DeliveryAddressDraft
     */
    public DeliveryAddressDraft buildUnchecked() {
        return new DeliveryAddressDraftImpl(deliveryId, address);
    }

    /**
     * factory method for an instance of DeliveryAddressDraftBuilder
     * @return builder
     */
    public static DeliveryAddressDraftBuilder of() {
        return new DeliveryAddressDraftBuilder();
    }

    /**
     * create builder for DeliveryAddressDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryAddressDraftBuilder of(final DeliveryAddressDraft template) {
        DeliveryAddressDraftBuilder builder = new DeliveryAddressDraftBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.address = template.getAddress();
        return builder;
    }

}
