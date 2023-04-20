
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddAddressAction businessUnitAddAddressAction = BusinessUnitAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddAddressActionBuilder implements Builder<BusinessUnitAddAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Address to add to the addresses of the Business Unit.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitAddAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address to add to the addresses of the Business Unit.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitAddAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address to add to the addresses of the Business Unit.</p>
     * @param address value to be set
     * @return Builder
     */

    public BusinessUnitAddAddressActionBuilder address(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Address to add to the addresses of the Business Unit.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds BusinessUnitAddAddressAction with checking for non-null required values
     * @return BusinessUnitAddAddressAction
     */
    public BusinessUnitAddAddressAction build() {
        Objects.requireNonNull(address, BusinessUnitAddAddressAction.class + ": address is missing");
        return new BusinessUnitAddAddressActionImpl(address);
    }

    /**
     * builds BusinessUnitAddAddressAction without checking for non-null required values
     * @return BusinessUnitAddAddressAction
     */
    public BusinessUnitAddAddressAction buildUnchecked() {
        return new BusinessUnitAddAddressActionImpl(address);
    }

    /**
     * factory method for an instance of BusinessUnitAddAddressActionBuilder
     * @return builder
     */
    public static BusinessUnitAddAddressActionBuilder of() {
        return new BusinessUnitAddAddressActionBuilder();
    }

    /**
     * create builder for BusinessUnitAddAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddAddressActionBuilder of(final BusinessUnitAddAddressAction template) {
        BusinessUnitAddAddressActionBuilder builder = new BusinessUnitAddAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
