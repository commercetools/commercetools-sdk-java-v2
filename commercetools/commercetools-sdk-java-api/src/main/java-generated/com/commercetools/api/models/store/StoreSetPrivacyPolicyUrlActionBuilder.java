
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetPrivacyPolicyUrlActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetPrivacyPolicyUrlAction storeSetPrivacyPolicyUrlAction = StoreSetPrivacyPolicyUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetPrivacyPolicyUrlActionBuilder implements Builder<StoreSetPrivacyPolicyUrlAction> {

    @Nullable
    private String privacyPolicyUrl;

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param privacyPolicyUrl value to be set
     * @return Builder
     */

    public StoreSetPrivacyPolicyUrlActionBuilder privacyPolicyUrl(@Nullable final String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        return this;
    }

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return privacyPolicyUrl
     */

    @Nullable
    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    /**
     * builds StoreSetPrivacyPolicyUrlAction with checking for non-null required values
     * @return StoreSetPrivacyPolicyUrlAction
     */
    public StoreSetPrivacyPolicyUrlAction build() {
        return new StoreSetPrivacyPolicyUrlActionImpl(privacyPolicyUrl);
    }

    /**
     * builds StoreSetPrivacyPolicyUrlAction without checking for non-null required values
     * @return StoreSetPrivacyPolicyUrlAction
     */
    public StoreSetPrivacyPolicyUrlAction buildUnchecked() {
        return new StoreSetPrivacyPolicyUrlActionImpl(privacyPolicyUrl);
    }

    /**
     * factory method for an instance of StoreSetPrivacyPolicyUrlActionBuilder
     * @return builder
     */
    public static StoreSetPrivacyPolicyUrlActionBuilder of() {
        return new StoreSetPrivacyPolicyUrlActionBuilder();
    }

    /**
     * create builder for StoreSetPrivacyPolicyUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetPrivacyPolicyUrlActionBuilder of(final StoreSetPrivacyPolicyUrlAction template) {
        StoreSetPrivacyPolicyUrlActionBuilder builder = new StoreSetPrivacyPolicyUrlActionBuilder();
        builder.privacyPolicyUrl = template.getPrivacyPolicyUrl();
        return builder;
    }

}
