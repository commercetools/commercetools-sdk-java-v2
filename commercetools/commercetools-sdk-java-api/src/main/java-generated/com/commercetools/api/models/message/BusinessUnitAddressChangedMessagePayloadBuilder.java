
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddressChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressChangedMessagePayload businessUnitAddressChangedMessagePayload = BusinessUnitAddressChangedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressChangedMessagePayloadBuilder
        implements Builder<BusinessUnitAddressChangedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>Updated address of the Business Unit.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitAddressChangedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Updated address of the Business Unit.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitAddressChangedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Updated address of the Business Unit.</p>
     * @param address value to be set
     * @return Builder
     */

    public BusinessUnitAddressChangedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Updated address of the Business Unit.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds BusinessUnitAddressChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitAddressChangedMessagePayload
     */
    public BusinessUnitAddressChangedMessagePayload build() {
        Objects.requireNonNull(address, BusinessUnitAddressChangedMessagePayload.class + ": address is missing");
        return new BusinessUnitAddressChangedMessagePayloadImpl(address);
    }

    /**
     * builds BusinessUnitAddressChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitAddressChangedMessagePayload
     */
    public BusinessUnitAddressChangedMessagePayload buildUnchecked() {
        return new BusinessUnitAddressChangedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of BusinessUnitAddressChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitAddressChangedMessagePayloadBuilder of() {
        return new BusinessUnitAddressChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAddressChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressChangedMessagePayloadBuilder of(
            final BusinessUnitAddressChangedMessagePayload template) {
        BusinessUnitAddressChangedMessagePayloadBuilder builder = new BusinessUnitAddressChangedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
