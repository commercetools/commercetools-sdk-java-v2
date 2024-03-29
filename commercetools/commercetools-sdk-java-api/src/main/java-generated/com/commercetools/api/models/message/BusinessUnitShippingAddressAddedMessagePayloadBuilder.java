
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitShippingAddressAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitShippingAddressAddedMessagePayload businessUnitShippingAddressAddedMessagePayload = BusinessUnitShippingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitShippingAddressAddedMessagePayloadBuilder
        implements Builder<BusinessUnitShippingAddressAddedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was added to the Business Unit as shipping address.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitShippingAddressAddedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was added to the Business Unit as shipping address.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitShippingAddressAddedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>The address that was added to the Business Unit as shipping address.</p>
     * @param address value to be set
     * @return Builder
     */

    public BusinessUnitShippingAddressAddedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address that was added to the Business Unit as shipping address.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds BusinessUnitShippingAddressAddedMessagePayload with checking for non-null required values
     * @return BusinessUnitShippingAddressAddedMessagePayload
     */
    public BusinessUnitShippingAddressAddedMessagePayload build() {
        Objects.requireNonNull(address, BusinessUnitShippingAddressAddedMessagePayload.class + ": address is missing");
        return new BusinessUnitShippingAddressAddedMessagePayloadImpl(address);
    }

    /**
     * builds BusinessUnitShippingAddressAddedMessagePayload without checking for non-null required values
     * @return BusinessUnitShippingAddressAddedMessagePayload
     */
    public BusinessUnitShippingAddressAddedMessagePayload buildUnchecked() {
        return new BusinessUnitShippingAddressAddedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of BusinessUnitShippingAddressAddedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitShippingAddressAddedMessagePayloadBuilder of() {
        return new BusinessUnitShippingAddressAddedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitShippingAddressAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitShippingAddressAddedMessagePayloadBuilder of(
            final BusinessUnitShippingAddressAddedMessagePayload template) {
        BusinessUnitShippingAddressAddedMessagePayloadBuilder builder = new BusinessUnitShippingAddressAddedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
