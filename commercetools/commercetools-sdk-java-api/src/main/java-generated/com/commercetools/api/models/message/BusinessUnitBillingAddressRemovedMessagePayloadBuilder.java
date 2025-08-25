
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitBillingAddressRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitBillingAddressRemovedMessagePayload businessUnitBillingAddressRemovedMessagePayload = BusinessUnitBillingAddressRemovedMessagePayload.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitBillingAddressRemovedMessagePayloadBuilder
        implements Builder<BusinessUnitBillingAddressRemovedMessagePayload> {

    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was removed from the billing addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitBillingAddressRemovedMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was removed from the billing addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitBillingAddressRemovedMessagePayloadBuilder withAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>The address that was removed from the billing addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param address value to be set
     * @return Builder
     */

    public BusinessUnitBillingAddressRemovedMessagePayloadBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address that was removed from the billing addresses of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @return address
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds BusinessUnitBillingAddressRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitBillingAddressRemovedMessagePayload
     */
    public BusinessUnitBillingAddressRemovedMessagePayload build() {
        Objects.requireNonNull(address, BusinessUnitBillingAddressRemovedMessagePayload.class + ": address is missing");
        return new BusinessUnitBillingAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * builds BusinessUnitBillingAddressRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitBillingAddressRemovedMessagePayload
     */
    public BusinessUnitBillingAddressRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitBillingAddressRemovedMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of BusinessUnitBillingAddressRemovedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitBillingAddressRemovedMessagePayloadBuilder of() {
        return new BusinessUnitBillingAddressRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitBillingAddressRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitBillingAddressRemovedMessagePayloadBuilder of(
            final BusinessUnitBillingAddressRemovedMessagePayload template) {
        BusinessUnitBillingAddressRemovedMessagePayloadBuilder builder = new BusinessUnitBillingAddressRemovedMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
