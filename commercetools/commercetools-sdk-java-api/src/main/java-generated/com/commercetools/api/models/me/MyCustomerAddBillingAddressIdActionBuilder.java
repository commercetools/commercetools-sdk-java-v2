
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerAddBillingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerAddBillingAddressIdAction myCustomerAddBillingAddressIdAction = MyCustomerAddBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerAddBillingAddressIdActionBuilder implements Builder<MyCustomerAddBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a billing address.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyCustomerAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a billing address.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyCustomerAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a billing address.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become a billing address.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds MyCustomerAddBillingAddressIdAction with checking for non-null required values
     * @return MyCustomerAddBillingAddressIdAction
     */
    public MyCustomerAddBillingAddressIdAction build() {
        return new MyCustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerAddBillingAddressIdAction without checking for non-null required values
     * @return MyCustomerAddBillingAddressIdAction
     */
    public MyCustomerAddBillingAddressIdAction buildUnchecked() {
        return new MyCustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyCustomerAddBillingAddressIdActionBuilder
     * @return builder
     */
    public static MyCustomerAddBillingAddressIdActionBuilder of() {
        return new MyCustomerAddBillingAddressIdActionBuilder();
    }

    /**
     * create builder for MyCustomerAddBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerAddBillingAddressIdActionBuilder of(final MyCustomerAddBillingAddressIdAction template) {
        MyCustomerAddBillingAddressIdActionBuilder builder = new MyCustomerAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
