
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitRemoveAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveAddressAction businessUnitRemoveAddressAction = BusinessUnitRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitRemoveAddressActionBuilder implements Builder<BusinessUnitRemoveAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p>ID of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public BusinessUnitRemoveAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public BusinessUnitRemoveAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    /**
     * builds BusinessUnitRemoveAddressAction with checking for non-null required values
     * @return BusinessUnitRemoveAddressAction
     */
    public BusinessUnitRemoveAddressAction build() {
        return new BusinessUnitRemoveAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds BusinessUnitRemoveAddressAction without checking for non-null required values
     * @return BusinessUnitRemoveAddressAction
     */
    public BusinessUnitRemoveAddressAction buildUnchecked() {
        return new BusinessUnitRemoveAddressActionImpl(addressId, addressKey);
    }

    public static BusinessUnitRemoveAddressActionBuilder of() {
        return new BusinessUnitRemoveAddressActionBuilder();
    }

    public static BusinessUnitRemoveAddressActionBuilder of(final BusinessUnitRemoveAddressAction template) {
        BusinessUnitRemoveAddressActionBuilder builder = new BusinessUnitRemoveAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
