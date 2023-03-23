
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitBillingAddressAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitBillingAddressAddedMessagePayload businessUnitBillingAddressAddedMessagePayload = BusinessUnitBillingAddressAddedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitBillingAddressAddedMessagePayloadBuilder
        implements Builder<BusinessUnitBillingAddressAddedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was added to the Business Unit as billing address.</p>
     * @return Builder
     */

    public BusinessUnitBillingAddressAddedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was added to the Business Unit as billing address.</p>
     * @param address
     * @return Builder
     */

    public BusinessUnitBillingAddressAddedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public BusinessUnitBillingAddressAddedMessagePayload build() {
        Objects.requireNonNull(address, BusinessUnitBillingAddressAddedMessagePayload.class + ": address is missing");
        return new BusinessUnitBillingAddressAddedMessagePayloadImpl(address);
    }

    /**
     * builds BusinessUnitBillingAddressAddedMessagePayload without checking for non null required values
     */
    public BusinessUnitBillingAddressAddedMessagePayload buildUnchecked() {
        return new BusinessUnitBillingAddressAddedMessagePayloadImpl(address);
    }

    public static BusinessUnitBillingAddressAddedMessagePayloadBuilder of() {
        return new BusinessUnitBillingAddressAddedMessagePayloadBuilder();
    }

    public static BusinessUnitBillingAddressAddedMessagePayloadBuilder of(
            final BusinessUnitBillingAddressAddedMessagePayload template) {
        BusinessUnitBillingAddressAddedMessagePayloadBuilder builder = new BusinessUnitBillingAddressAddedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
