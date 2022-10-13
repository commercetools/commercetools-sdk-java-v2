
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitRemoveBillingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveBillingAddressIdAction businessUnitRemoveBillingAddressIdAction = BusinessUnitRemoveBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitRemoveBillingAddressIdActionBuilder
        implements Builder<BusinessUnitRemoveBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to be removed from <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitRemoveBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to be removed from <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public BusinessUnitRemoveBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public BusinessUnitRemoveBillingAddressIdAction build() {
        return new BusinessUnitRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds BusinessUnitRemoveBillingAddressIdAction without checking for non null required values
     */
    public BusinessUnitRemoveBillingAddressIdAction buildUnchecked() {
        return new BusinessUnitRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static BusinessUnitRemoveBillingAddressIdActionBuilder of() {
        return new BusinessUnitRemoveBillingAddressIdActionBuilder();
    }

    public static BusinessUnitRemoveBillingAddressIdActionBuilder of(
            final BusinessUnitRemoveBillingAddressIdAction template) {
        BusinessUnitRemoveBillingAddressIdActionBuilder builder = new BusinessUnitRemoveBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
