
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddShippingAddressIdAction businessUnitAddShippingAddressIdAction = BusinessUnitAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddShippingAddressIdActionBuilder implements Builder<BusinessUnitAddShippingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitAddShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitAddShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
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

    public BusinessUnitAddShippingAddressIdAction build() {
        return new BusinessUnitAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds BusinessUnitAddShippingAddressIdAction without checking for non null required values
     */
    public BusinessUnitAddShippingAddressIdAction buildUnchecked() {
        return new BusinessUnitAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    public static BusinessUnitAddShippingAddressIdActionBuilder of() {
        return new BusinessUnitAddShippingAddressIdActionBuilder();
    }

    public static BusinessUnitAddShippingAddressIdActionBuilder of(
            final BusinessUnitAddShippingAddressIdAction template) {
        BusinessUnitAddShippingAddressIdActionBuilder builder = new BusinessUnitAddShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
