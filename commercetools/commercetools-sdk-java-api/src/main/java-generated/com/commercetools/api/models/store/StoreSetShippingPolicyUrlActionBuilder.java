
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetShippingPolicyUrlActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetShippingPolicyUrlAction storeSetShippingPolicyUrlAction = StoreSetShippingPolicyUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetShippingPolicyUrlActionBuilder implements Builder<StoreSetShippingPolicyUrlAction> {

    @Nullable
    private String shippingPolicyUrl;

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param shippingPolicyUrl value to be set
     * @return Builder
     */

    public StoreSetShippingPolicyUrlActionBuilder shippingPolicyUrl(@Nullable final String shippingPolicyUrl) {
        this.shippingPolicyUrl = shippingPolicyUrl;
        return this;
    }

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return shippingPolicyUrl
     */

    @Nullable
    public String getShippingPolicyUrl() {
        return this.shippingPolicyUrl;
    }

    /**
     * builds StoreSetShippingPolicyUrlAction with checking for non-null required values
     * @return StoreSetShippingPolicyUrlAction
     */
    public StoreSetShippingPolicyUrlAction build() {
        return new StoreSetShippingPolicyUrlActionImpl(shippingPolicyUrl);
    }

    /**
     * builds StoreSetShippingPolicyUrlAction without checking for non-null required values
     * @return StoreSetShippingPolicyUrlAction
     */
    public StoreSetShippingPolicyUrlAction buildUnchecked() {
        return new StoreSetShippingPolicyUrlActionImpl(shippingPolicyUrl);
    }

    /**
     * factory method for an instance of StoreSetShippingPolicyUrlActionBuilder
     * @return builder
     */
    public static StoreSetShippingPolicyUrlActionBuilder of() {
        return new StoreSetShippingPolicyUrlActionBuilder();
    }

    /**
     * create builder for StoreSetShippingPolicyUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetShippingPolicyUrlActionBuilder of(final StoreSetShippingPolicyUrlAction template) {
        StoreSetShippingPolicyUrlActionBuilder builder = new StoreSetShippingPolicyUrlActionBuilder();
        builder.shippingPolicyUrl = template.getShippingPolicyUrl();
        return builder;
    }

}
