
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetImprintUrlActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetImprintUrlAction storeSetImprintUrlAction = StoreSetImprintUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetImprintUrlActionBuilder implements Builder<StoreSetImprintUrlAction> {

    @Nullable
    private String imprintUrl;

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param imprintUrl value to be set
     * @return Builder
     */

    public StoreSetImprintUrlActionBuilder imprintUrl(@Nullable final String imprintUrl) {
        this.imprintUrl = imprintUrl;
        return this;
    }

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return imprintUrl
     */

    @Nullable
    public String getImprintUrl() {
        return this.imprintUrl;
    }

    /**
     * builds StoreSetImprintUrlAction with checking for non-null required values
     * @return StoreSetImprintUrlAction
     */
    public StoreSetImprintUrlAction build() {
        return new StoreSetImprintUrlActionImpl(imprintUrl);
    }

    /**
     * builds StoreSetImprintUrlAction without checking for non-null required values
     * @return StoreSetImprintUrlAction
     */
    public StoreSetImprintUrlAction buildUnchecked() {
        return new StoreSetImprintUrlActionImpl(imprintUrl);
    }

    /**
     * factory method for an instance of StoreSetImprintUrlActionBuilder
     * @return builder
     */
    public static StoreSetImprintUrlActionBuilder of() {
        return new StoreSetImprintUrlActionBuilder();
    }

    /**
     * create builder for StoreSetImprintUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetImprintUrlActionBuilder of(final StoreSetImprintUrlAction template) {
        StoreSetImprintUrlActionBuilder builder = new StoreSetImprintUrlActionBuilder();
        builder.imprintUrl = template.getImprintUrl();
        return builder;
    }

}
