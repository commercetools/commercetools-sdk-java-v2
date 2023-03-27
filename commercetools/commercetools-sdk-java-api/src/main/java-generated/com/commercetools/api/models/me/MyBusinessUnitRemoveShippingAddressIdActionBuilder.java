
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitRemoveShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitRemoveShippingAddressIdAction myBusinessUnitRemoveShippingAddressIdAction = MyBusinessUnitRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitRemoveShippingAddressIdActionBuilder
        implements Builder<MyBusinessUnitRemoveShippingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyBusinessUnitRemoveShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyBusinessUnitRemoveShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>ID of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Key of the shipping address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds MyBusinessUnitRemoveShippingAddressIdAction with checking for non-null required values
     * @return MyBusinessUnitRemoveShippingAddressIdAction
     */
    public MyBusinessUnitRemoveShippingAddressIdAction build() {
        return new MyBusinessUnitRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyBusinessUnitRemoveShippingAddressIdAction without checking for non-null required values
     * @return MyBusinessUnitRemoveShippingAddressIdAction
     */
    public MyBusinessUnitRemoveShippingAddressIdAction buildUnchecked() {
        return new MyBusinessUnitRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyBusinessUnitRemoveShippingAddressIdActionBuilder
     * @return builder
     */
    public static MyBusinessUnitRemoveShippingAddressIdActionBuilder of() {
        return new MyBusinessUnitRemoveShippingAddressIdActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitRemoveShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitRemoveShippingAddressIdActionBuilder of(
            final MyBusinessUnitRemoveShippingAddressIdAction template) {
        MyBusinessUnitRemoveShippingAddressIdActionBuilder builder = new MyBusinessUnitRemoveShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
