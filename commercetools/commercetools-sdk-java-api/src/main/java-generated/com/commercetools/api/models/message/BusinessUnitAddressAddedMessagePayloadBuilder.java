
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddressAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressAddedMessagePayload businessUnitAddressAddedMessagePayload = BusinessUnitAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressAddedMessagePayloadBuilder implements Builder<BusinessUnitAddressAddedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was added to the Business Unit.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitAddressAddedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was added to the Business Unit.</p>
     * @param address value to be set
     * @return Builder
     */

    public BusinessUnitAddressAddedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds BusinessUnitAddressAddedMessagePayload with checking for non-null required values
     * @return BusinessUnitAddressAddedMessagePayload
     */
    public BusinessUnitAddressAddedMessagePayload build() {
        Objects.requireNonNull(address, BusinessUnitAddressAddedMessagePayload.class + ": address is missing");
        return new BusinessUnitAddressAddedMessagePayloadImpl(address);
    }

    /**
     * builds BusinessUnitAddressAddedMessagePayload without checking for non-null required values
     * @return BusinessUnitAddressAddedMessagePayload
     */
    public BusinessUnitAddressAddedMessagePayload buildUnchecked() {
        return new BusinessUnitAddressAddedMessagePayloadImpl(address);
    }

    public static BusinessUnitAddressAddedMessagePayloadBuilder of() {
        return new BusinessUnitAddressAddedMessagePayloadBuilder();
    }

    public static BusinessUnitAddressAddedMessagePayloadBuilder of(
            final BusinessUnitAddressAddedMessagePayload template) {
        BusinessUnitAddressAddedMessagePayloadBuilder builder = new BusinessUnitAddressAddedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
