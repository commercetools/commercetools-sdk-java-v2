
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetFaqUrlActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetFaqUrlAction storeSetFaqUrlAction = StoreSetFaqUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetFaqUrlActionBuilder implements Builder<StoreSetFaqUrlAction> {

    @Nullable
    private String faqUrl;

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param faqUrl value to be set
     * @return Builder
     */

    public StoreSetFaqUrlActionBuilder faqUrl(@Nullable final String faqUrl) {
        this.faqUrl = faqUrl;
        return this;
    }

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return faqUrl
     */

    @Nullable
    public String getFaqUrl() {
        return this.faqUrl;
    }

    /**
     * builds StoreSetFaqUrlAction with checking for non-null required values
     * @return StoreSetFaqUrlAction
     */
    public StoreSetFaqUrlAction build() {
        return new StoreSetFaqUrlActionImpl(faqUrl);
    }

    /**
     * builds StoreSetFaqUrlAction without checking for non-null required values
     * @return StoreSetFaqUrlAction
     */
    public StoreSetFaqUrlAction buildUnchecked() {
        return new StoreSetFaqUrlActionImpl(faqUrl);
    }

    /**
     * factory method for an instance of StoreSetFaqUrlActionBuilder
     * @return builder
     */
    public static StoreSetFaqUrlActionBuilder of() {
        return new StoreSetFaqUrlActionBuilder();
    }

    /**
     * create builder for StoreSetFaqUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetFaqUrlActionBuilder of(final StoreSetFaqUrlAction template) {
        StoreSetFaqUrlActionBuilder builder = new StoreSetFaqUrlActionBuilder();
        builder.faqUrl = template.getFaqUrl();
        return builder;
    }

}
