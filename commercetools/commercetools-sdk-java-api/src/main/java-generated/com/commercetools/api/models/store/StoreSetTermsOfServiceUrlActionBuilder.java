
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetTermsOfServiceUrlActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetTermsOfServiceUrlAction storeSetTermsOfServiceUrlAction = StoreSetTermsOfServiceUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetTermsOfServiceUrlActionBuilder implements Builder<StoreSetTermsOfServiceUrlAction> {

    @Nullable
    private String termsOfServiceUrl;

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param termsOfServiceUrl value to be set
     * @return Builder
     */

    public StoreSetTermsOfServiceUrlActionBuilder termsOfServiceUrl(@Nullable final String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
        return this;
    }

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return termsOfServiceUrl
     */

    @Nullable
    public String getTermsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }

    /**
     * builds StoreSetTermsOfServiceUrlAction with checking for non-null required values
     * @return StoreSetTermsOfServiceUrlAction
     */
    public StoreSetTermsOfServiceUrlAction build() {
        return new StoreSetTermsOfServiceUrlActionImpl(termsOfServiceUrl);
    }

    /**
     * builds StoreSetTermsOfServiceUrlAction without checking for non-null required values
     * @return StoreSetTermsOfServiceUrlAction
     */
    public StoreSetTermsOfServiceUrlAction buildUnchecked() {
        return new StoreSetTermsOfServiceUrlActionImpl(termsOfServiceUrl);
    }

    /**
     * factory method for an instance of StoreSetTermsOfServiceUrlActionBuilder
     * @return builder
     */
    public static StoreSetTermsOfServiceUrlActionBuilder of() {
        return new StoreSetTermsOfServiceUrlActionBuilder();
    }

    /**
     * create builder for StoreSetTermsOfServiceUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetTermsOfServiceUrlActionBuilder of(final StoreSetTermsOfServiceUrlAction template) {
        StoreSetTermsOfServiceUrlActionBuilder builder = new StoreSetTermsOfServiceUrlActionBuilder();
        builder.termsOfServiceUrl = template.getTermsOfServiceUrl();
        return builder;
    }

}
