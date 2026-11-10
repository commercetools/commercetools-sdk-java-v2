
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetRefundPolicyUrlActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetRefundPolicyUrlAction storeSetRefundPolicyUrlAction = StoreSetRefundPolicyUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetRefundPolicyUrlActionBuilder implements Builder<StoreSetRefundPolicyUrlAction> {

    @Nullable
    private String refundPolicyUrl;

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param refundPolicyUrl value to be set
     * @return Builder
     */

    public StoreSetRefundPolicyUrlActionBuilder refundPolicyUrl(@Nullable final String refundPolicyUrl) {
        this.refundPolicyUrl = refundPolicyUrl;
        return this;
    }

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return refundPolicyUrl
     */

    @Nullable
    public String getRefundPolicyUrl() {
        return this.refundPolicyUrl;
    }

    /**
     * builds StoreSetRefundPolicyUrlAction with checking for non-null required values
     * @return StoreSetRefundPolicyUrlAction
     */
    public StoreSetRefundPolicyUrlAction build() {
        return new StoreSetRefundPolicyUrlActionImpl(refundPolicyUrl);
    }

    /**
     * builds StoreSetRefundPolicyUrlAction without checking for non-null required values
     * @return StoreSetRefundPolicyUrlAction
     */
    public StoreSetRefundPolicyUrlAction buildUnchecked() {
        return new StoreSetRefundPolicyUrlActionImpl(refundPolicyUrl);
    }

    /**
     * factory method for an instance of StoreSetRefundPolicyUrlActionBuilder
     * @return builder
     */
    public static StoreSetRefundPolicyUrlActionBuilder of() {
        return new StoreSetRefundPolicyUrlActionBuilder();
    }

    /**
     * create builder for StoreSetRefundPolicyUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetRefundPolicyUrlActionBuilder of(final StoreSetRefundPolicyUrlAction template) {
        StoreSetRefundPolicyUrlActionBuilder builder = new StoreSetRefundPolicyUrlActionBuilder();
        builder.refundPolicyUrl = template.getRefundPolicyUrl();
        return builder;
    }

}
