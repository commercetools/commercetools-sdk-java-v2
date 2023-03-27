
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
     * @param addressId value to be set
     * @return Builder
     */

    public BusinessUnitRemoveBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to be removed from <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public BusinessUnitRemoveBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>ID of the address to be removed from <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Key of the address to be removed from <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds BusinessUnitRemoveBillingAddressIdAction with checking for non-null required values
     * @return BusinessUnitRemoveBillingAddressIdAction
     */
    public BusinessUnitRemoveBillingAddressIdAction build() {
        return new BusinessUnitRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds BusinessUnitRemoveBillingAddressIdAction without checking for non-null required values
     * @return BusinessUnitRemoveBillingAddressIdAction
     */
    public BusinessUnitRemoveBillingAddressIdAction buildUnchecked() {
        return new BusinessUnitRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of BusinessUnitRemoveBillingAddressIdActionBuilder
     * @return builder
     */
    public static BusinessUnitRemoveBillingAddressIdActionBuilder of() {
        return new BusinessUnitRemoveBillingAddressIdActionBuilder();
    }

    /**
     * create builder for BusinessUnitRemoveBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveBillingAddressIdActionBuilder of(
            final BusinessUnitRemoveBillingAddressIdAction template) {
        BusinessUnitRemoveBillingAddressIdActionBuilder builder = new BusinessUnitRemoveBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
