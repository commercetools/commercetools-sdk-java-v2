
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetCookiePolicyUrlActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCookiePolicyUrlAction storeSetCookiePolicyUrlAction = StoreSetCookiePolicyUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetCookiePolicyUrlActionBuilder implements Builder<StoreSetCookiePolicyUrlAction> {

    @Nullable
    private String cookiePolicyUrl;

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param cookiePolicyUrl value to be set
     * @return Builder
     */

    public StoreSetCookiePolicyUrlActionBuilder cookiePolicyUrl(@Nullable final String cookiePolicyUrl) {
        this.cookiePolicyUrl = cookiePolicyUrl;
        return this;
    }

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return cookiePolicyUrl
     */

    @Nullable
    public String getCookiePolicyUrl() {
        return this.cookiePolicyUrl;
    }

    /**
     * builds StoreSetCookiePolicyUrlAction with checking for non-null required values
     * @return StoreSetCookiePolicyUrlAction
     */
    public StoreSetCookiePolicyUrlAction build() {
        return new StoreSetCookiePolicyUrlActionImpl(cookiePolicyUrl);
    }

    /**
     * builds StoreSetCookiePolicyUrlAction without checking for non-null required values
     * @return StoreSetCookiePolicyUrlAction
     */
    public StoreSetCookiePolicyUrlAction buildUnchecked() {
        return new StoreSetCookiePolicyUrlActionImpl(cookiePolicyUrl);
    }

    /**
     * factory method for an instance of StoreSetCookiePolicyUrlActionBuilder
     * @return builder
     */
    public static StoreSetCookiePolicyUrlActionBuilder of() {
        return new StoreSetCookiePolicyUrlActionBuilder();
    }

    /**
     * create builder for StoreSetCookiePolicyUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetCookiePolicyUrlActionBuilder of(final StoreSetCookiePolicyUrlAction template) {
        StoreSetCookiePolicyUrlActionBuilder builder = new StoreSetCookiePolicyUrlActionBuilder();
        builder.cookiePolicyUrl = template.getCookiePolicyUrl();
        return builder;
    }

}
