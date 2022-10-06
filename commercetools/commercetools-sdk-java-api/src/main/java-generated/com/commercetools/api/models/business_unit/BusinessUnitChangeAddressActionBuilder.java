
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitChangeAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeAddressAction businessUnitChangeAddressAction = BusinessUnitChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeAddressActionBuilder implements Builder<BusinessUnitChangeAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>ID of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitChangeAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitChangeAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>New address to set.</p>
     */

    public BusinessUnitChangeAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New address to set.</p>
     */

    public BusinessUnitChangeAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public BusinessUnitChangeAddressAction build() {
        Objects.requireNonNull(address, BusinessUnitChangeAddressAction.class + ": address is missing");
        return new BusinessUnitChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * builds BusinessUnitChangeAddressAction without checking for non null required values
     */
    public BusinessUnitChangeAddressAction buildUnchecked() {
        return new BusinessUnitChangeAddressActionImpl(addressId, addressKey, address);
    }

    public static BusinessUnitChangeAddressActionBuilder of() {
        return new BusinessUnitChangeAddressActionBuilder();
    }

    public static BusinessUnitChangeAddressActionBuilder of(final BusinessUnitChangeAddressAction template) {
        BusinessUnitChangeAddressActionBuilder builder = new BusinessUnitChangeAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        builder.address = template.getAddress();
        return builder;
    }

}
