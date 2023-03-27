
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitRemoveAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitRemoveAddressAction myBusinessUnitRemoveAddressAction = MyBusinessUnitRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitRemoveAddressActionBuilder implements Builder<MyBusinessUnitRemoveAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyBusinessUnitRemoveAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyBusinessUnitRemoveAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p>ID of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds MyBusinessUnitRemoveAddressAction with checking for non-null required values
     * @return MyBusinessUnitRemoveAddressAction
     */
    public MyBusinessUnitRemoveAddressAction build() {
        return new MyBusinessUnitRemoveAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds MyBusinessUnitRemoveAddressAction without checking for non-null required values
     * @return MyBusinessUnitRemoveAddressAction
     */
    public MyBusinessUnitRemoveAddressAction buildUnchecked() {
        return new MyBusinessUnitRemoveAddressActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyBusinessUnitRemoveAddressActionBuilder
     * @return builder
     */
    public static MyBusinessUnitRemoveAddressActionBuilder of() {
        return new MyBusinessUnitRemoveAddressActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitRemoveAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitRemoveAddressActionBuilder of(final MyBusinessUnitRemoveAddressAction template) {
        MyBusinessUnitRemoveAddressActionBuilder builder = new MyBusinessUnitRemoveAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
