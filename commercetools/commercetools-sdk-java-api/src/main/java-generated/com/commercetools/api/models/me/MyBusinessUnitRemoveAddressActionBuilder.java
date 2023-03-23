
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
     * @param addressId
     * @return Builder
     */

    public MyBusinessUnitRemoveAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey
     * @return Builder
     */

    public MyBusinessUnitRemoveAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyBusinessUnitRemoveAddressAction build() {
        return new MyBusinessUnitRemoveAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds MyBusinessUnitRemoveAddressAction without checking for non null required values
     */
    public MyBusinessUnitRemoveAddressAction buildUnchecked() {
        return new MyBusinessUnitRemoveAddressActionImpl(addressId, addressKey);
    }

    public static MyBusinessUnitRemoveAddressActionBuilder of() {
        return new MyBusinessUnitRemoveAddressActionBuilder();
    }

    public static MyBusinessUnitRemoveAddressActionBuilder of(final MyBusinessUnitRemoveAddressAction template) {
        MyBusinessUnitRemoveAddressActionBuilder builder = new MyBusinessUnitRemoveAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
