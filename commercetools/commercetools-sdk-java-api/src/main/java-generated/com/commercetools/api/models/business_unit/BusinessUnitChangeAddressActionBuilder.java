
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
     * @param addressId value to be set
     * @return Builder
     */

    public BusinessUnitChangeAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public BusinessUnitChangeAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>New address to set.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitChangeAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New address to set.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitChangeAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>New address to set.</p>
     * @param address value to be set
     * @return Builder
     */

    public BusinessUnitChangeAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>ID of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     *  <p>New address to set.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds BusinessUnitChangeAddressAction with checking for non-null required values
     * @return BusinessUnitChangeAddressAction
     */
    public BusinessUnitChangeAddressAction build() {
        Objects.requireNonNull(address, BusinessUnitChangeAddressAction.class + ": address is missing");
        return new BusinessUnitChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * builds BusinessUnitChangeAddressAction without checking for non-null required values
     * @return BusinessUnitChangeAddressAction
     */
    public BusinessUnitChangeAddressAction buildUnchecked() {
        return new BusinessUnitChangeAddressActionImpl(addressId, addressKey, address);
    }

    /**
     * factory method for an instance of BusinessUnitChangeAddressActionBuilder
     * @return builder
     */
    public static BusinessUnitChangeAddressActionBuilder of() {
        return new BusinessUnitChangeAddressActionBuilder();
    }

    /**
     * create builder for BusinessUnitChangeAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeAddressActionBuilder of(final BusinessUnitChangeAddressAction template) {
        BusinessUnitChangeAddressActionBuilder builder = new BusinessUnitChangeAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        builder.address = template.getAddress();
        return builder;
    }

}
