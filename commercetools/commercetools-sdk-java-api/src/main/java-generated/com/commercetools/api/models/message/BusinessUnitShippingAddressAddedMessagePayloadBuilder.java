
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
     */

    public BusinessUnitShippingAddressAddedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was added to the Business Unit as shipping address.</p>
     */

    public BusinessUnitShippingAddressAddedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public BusinessUnitShippingAddressAddedMessagePayload build() {
        Objects.requireNonNull(address, BusinessUnitShippingAddressAddedMessagePayload.class + ": address is missing");
        return new BusinessUnitShippingAddressAddedMessagePayloadImpl(address);
    }

    /**
     * builds BusinessUnitShippingAddressAddedMessagePayload without checking for non null required values
     */
    public BusinessUnitShippingAddressAddedMessagePayload buildUnchecked() {
        return new BusinessUnitShippingAddressAddedMessagePayloadImpl(address);
    }

    public static BusinessUnitShippingAddressAddedMessagePayloadBuilder of() {
        return new BusinessUnitShippingAddressAddedMessagePayloadBuilder();
    }

    public static BusinessUnitShippingAddressAddedMessagePayloadBuilder of(
            final BusinessUnitShippingAddressAddedMessagePayload template) {
        BusinessUnitShippingAddressAddedMessagePayloadBuilder builder = new BusinessUnitShippingAddressAddedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
