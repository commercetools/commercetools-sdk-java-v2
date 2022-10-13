
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetDefaultBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetDefaultBillingAddressAction businessUnitSetDefaultBillingAddressAction = BusinessUnitSetDefaultBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetDefaultBillingAddressActionBuilder
        implements Builder<BusinessUnitSetDefaultBillingAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitSetDefaultBillingAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public BusinessUnitSetDefaultBillingAddressAction build() {
        return new BusinessUnitSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds BusinessUnitSetDefaultBillingAddressAction without checking for non null required values
     */
    public BusinessUnitSetDefaultBillingAddressAction buildUnchecked() {
        return new BusinessUnitSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    public static BusinessUnitSetDefaultBillingAddressActionBuilder of() {
        return new BusinessUnitSetDefaultBillingAddressActionBuilder();
    }

    public static BusinessUnitSetDefaultBillingAddressActionBuilder of(
            final BusinessUnitSetDefaultBillingAddressAction template) {
        BusinessUnitSetDefaultBillingAddressActionBuilder builder = new BusinessUnitSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
