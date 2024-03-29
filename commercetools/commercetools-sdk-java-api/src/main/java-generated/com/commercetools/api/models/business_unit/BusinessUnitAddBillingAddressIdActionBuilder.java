
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
     * @param addressId value to be set
     * @return Builder
     */

    public BusinessUnitAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public BusinessUnitAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>ID of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Key of the address to add as a billing address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds BusinessUnitAddBillingAddressIdAction with checking for non-null required values
     * @return BusinessUnitAddBillingAddressIdAction
     */
    public BusinessUnitAddBillingAddressIdAction build() {
        return new BusinessUnitAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds BusinessUnitAddBillingAddressIdAction without checking for non-null required values
     * @return BusinessUnitAddBillingAddressIdAction
     */
    public BusinessUnitAddBillingAddressIdAction buildUnchecked() {
        return new BusinessUnitAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of BusinessUnitAddBillingAddressIdActionBuilder
     * @return builder
     */
    public static BusinessUnitAddBillingAddressIdActionBuilder of() {
        return new BusinessUnitAddBillingAddressIdActionBuilder();
    }

    /**
     * create builder for BusinessUnitAddBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddBillingAddressIdActionBuilder of(
            final BusinessUnitAddBillingAddressIdAction template) {
        BusinessUnitAddBillingAddressIdActionBuilder builder = new BusinessUnitAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
