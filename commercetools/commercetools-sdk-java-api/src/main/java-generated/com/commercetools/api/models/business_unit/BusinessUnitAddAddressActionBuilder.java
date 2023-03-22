
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
     * @return Builder
     */

    public BusinessUnitAddAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address to add to the addresses of the Business Unit.</p>
     * @param address
     * @return Builder
     */

    public BusinessUnitAddAddressActionBuilder address(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public BusinessUnitAddAddressAction build() {
        Objects.requireNonNull(address, BusinessUnitAddAddressAction.class + ": address is missing");
        return new BusinessUnitAddAddressActionImpl(address);
    }

    /**
     * builds BusinessUnitAddAddressAction without checking for non null required values
     */
    public BusinessUnitAddAddressAction buildUnchecked() {
        return new BusinessUnitAddAddressActionImpl(address);
    }

    public static BusinessUnitAddAddressActionBuilder of() {
        return new BusinessUnitAddAddressActionBuilder();
    }

    public static BusinessUnitAddAddressActionBuilder of(final BusinessUnitAddAddressAction template) {
        BusinessUnitAddAddressActionBuilder builder = new BusinessUnitAddAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
