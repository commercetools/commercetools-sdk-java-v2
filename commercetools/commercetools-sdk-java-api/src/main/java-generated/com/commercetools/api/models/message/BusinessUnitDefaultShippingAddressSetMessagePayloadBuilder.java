
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDefaultShippingAddressSetMessagePayload businessUnitDefaultShippingAddressSetMessagePayload = BusinessUnitDefaultShippingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder
        implements Builder<BusinessUnitDefaultShippingAddressSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @return Builder
     */

    public BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @param address
     * @return Builder
     */

    public BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public BusinessUnitDefaultShippingAddressSetMessagePayload build() {
        return new BusinessUnitDefaultShippingAddressSetMessagePayloadImpl(address);
    }

    /**
     * builds BusinessUnitDefaultShippingAddressSetMessagePayload without checking for non null required values
     */
    public BusinessUnitDefaultShippingAddressSetMessagePayload buildUnchecked() {
        return new BusinessUnitDefaultShippingAddressSetMessagePayloadImpl(address);
    }

    public static BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder of() {
        return new BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder();
    }

    public static BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder of(
            final BusinessUnitDefaultShippingAddressSetMessagePayload template) {
        BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder builder = new BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
