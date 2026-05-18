
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerRemoveBillingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerRemoveBillingAddressIdAction myCustomerRemoveBillingAddressIdAction = MyCustomerRemoveBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerRemoveBillingAddressIdActionBuilder implements Builder<MyCustomerRemoveBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to remove from <code>billingAddressIds</code>.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyCustomerRemoveBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to remove from <code>billingAddressIds</code>.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyCustomerRemoveBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to remove from <code>billingAddressIds</code>.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to remove from <code>billingAddressIds</code>.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds MyCustomerRemoveBillingAddressIdAction with checking for non-null required values
     * @return MyCustomerRemoveBillingAddressIdAction
     */
    public MyCustomerRemoveBillingAddressIdAction build() {
        return new MyCustomerRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerRemoveBillingAddressIdAction without checking for non-null required values
     * @return MyCustomerRemoveBillingAddressIdAction
     */
    public MyCustomerRemoveBillingAddressIdAction buildUnchecked() {
        return new MyCustomerRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyCustomerRemoveBillingAddressIdActionBuilder
     * @return builder
     */
    public static MyCustomerRemoveBillingAddressIdActionBuilder of() {
        return new MyCustomerRemoveBillingAddressIdActionBuilder();
    }

    /**
     * create builder for MyCustomerRemoveBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerRemoveBillingAddressIdActionBuilder of(
            final MyCustomerRemoveBillingAddressIdAction template) {
        MyCustomerRemoveBillingAddressIdActionBuilder builder = new MyCustomerRemoveBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
