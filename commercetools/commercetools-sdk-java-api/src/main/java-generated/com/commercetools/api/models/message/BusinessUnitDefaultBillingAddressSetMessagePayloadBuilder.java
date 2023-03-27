
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDefaultBillingAddressSetMessagePayload businessUnitDefaultBillingAddressSetMessagePayload = BusinessUnitDefaultBillingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder
        implements Builder<BusinessUnitDefaultBillingAddressSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was set as the default billing address.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was set as the default billing address.</p>
     * @param address value to be set
     * @return Builder
     */

    public BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>The address that was set as the default billing address.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds BusinessUnitDefaultBillingAddressSetMessagePayload with checking for non-null required values
     * @return BusinessUnitDefaultBillingAddressSetMessagePayload
     */
    public BusinessUnitDefaultBillingAddressSetMessagePayload build() {
        return new BusinessUnitDefaultBillingAddressSetMessagePayloadImpl(address);
    }

    /**
     * builds BusinessUnitDefaultBillingAddressSetMessagePayload without checking for non-null required values
     * @return BusinessUnitDefaultBillingAddressSetMessagePayload
     */
    public BusinessUnitDefaultBillingAddressSetMessagePayload buildUnchecked() {
        return new BusinessUnitDefaultBillingAddressSetMessagePayloadImpl(address);
    }

    /**
     * factory method for an instance of BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder of() {
        return new BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitDefaultBillingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder of(
            final BusinessUnitDefaultBillingAddressSetMessagePayload template) {
        BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder builder = new BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
