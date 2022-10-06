
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddBillingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddBillingAddressIdAction businessUnitAddBillingAddressIdAction = BusinessUnitAddBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddBillingAddressIdActionBuilder implements Builder<BusinessUnitAddBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public BusinessUnitAddBillingAddressIdAction build() {
        return new BusinessUnitAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds BusinessUnitAddBillingAddressIdAction without checking for non null required values
     */
    public BusinessUnitAddBillingAddressIdAction buildUnchecked() {
        return new BusinessUnitAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static BusinessUnitAddBillingAddressIdActionBuilder of() {
        return new BusinessUnitAddBillingAddressIdActionBuilder();
    }

    public static BusinessUnitAddBillingAddressIdActionBuilder of(
            final BusinessUnitAddBillingAddressIdAction template) {
        BusinessUnitAddBillingAddressIdActionBuilder builder = new BusinessUnitAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
