
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerRemoveAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveAddressAction customerRemoveAddressAction = CustomerRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerRemoveAddressActionBuilder implements Builder<CustomerRemoveAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the Address to remove.</p>
     * @param addressId
     * @return Builder
     */

    public CustomerRemoveAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to remove.</p>
     * @param addressKey
     * @return Builder
     */

    public CustomerRemoveAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public CustomerRemoveAddressAction build() {
        return new CustomerRemoveAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds CustomerRemoveAddressAction without checking for non null required values
     */
    public CustomerRemoveAddressAction buildUnchecked() {
        return new CustomerRemoveAddressActionImpl(addressId, addressKey);
    }

    public static CustomerRemoveAddressActionBuilder of() {
        return new CustomerRemoveAddressActionBuilder();
    }

    public static CustomerRemoveAddressActionBuilder of(final CustomerRemoveAddressAction template) {
        CustomerRemoveAddressActionBuilder builder = new CustomerRemoveAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
