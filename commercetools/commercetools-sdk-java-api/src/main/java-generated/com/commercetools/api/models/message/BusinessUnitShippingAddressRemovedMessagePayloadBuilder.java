
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitShippingAddressRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitShippingAddressRemovedMessagePayload businessUnitShippingAddressRemovedMessagePayload = BusinessUnitShippingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitShippingAddressRemovedMessagePayloadBuilder
        implements Builder<BusinessUnitShippingAddressRemovedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was removed from shipping addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitShippingAddressRemovedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was removed from shipping addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitShippingAddressRemovedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>The address that was removed from shipping addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param address value to be set
     * @return Builder
     */

    public BusinessUnitShippingAddressRemovedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address that was removed from shipping addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds BusinessUnitShippingAddressRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitShippingAddressRemovedMessagePayload
     */
    public BusinessUnitShippingAddressRemovedMessagePayload build() {
        Objects.requireNonNull(address,
            BusinessUnitShippingAddressRemovedMessagePayload.class + ": address is missing");
        return new BusinessUnitShippingAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * builds BusinessUnitShippingAddressRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitShippingAddressRemovedMessagePayload
     */
    public BusinessUnitShippingAddressRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitShippingAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of BusinessUnitShippingAddressRemovedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitShippingAddressRemovedMessagePayloadBuilder of() {
        return new BusinessUnitShippingAddressRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitShippingAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitShippingAddressRemovedMessagePayloadBuilder of(
            final BusinessUnitShippingAddressRemovedMessagePayload template) {
        BusinessUnitShippingAddressRemovedMessagePayloadBuilder builder = new BusinessUnitShippingAddressRemovedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
