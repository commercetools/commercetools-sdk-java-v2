
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetContactUrlActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetContactUrlAction storeSetContactUrlAction = StoreSetContactUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetContactUrlActionBuilder implements Builder<StoreSetContactUrlAction> {

    @Nullable
    private String contactUrl;

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param contactUrl value to be set
     * @return Builder
     */

    public StoreSetContactUrlActionBuilder contactUrl(@Nullable final String contactUrl) {
        this.contactUrl = contactUrl;
        return this;
    }

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return contactUrl
     */

    @Nullable
    public String getContactUrl() {
        return this.contactUrl;
    }

    /**
     * builds StoreSetContactUrlAction with checking for non-null required values
     * @return StoreSetContactUrlAction
     */
    public StoreSetContactUrlAction build() {
        return new StoreSetContactUrlActionImpl(contactUrl);
    }

    /**
     * builds StoreSetContactUrlAction without checking for non-null required values
     * @return StoreSetContactUrlAction
     */
    public StoreSetContactUrlAction buildUnchecked() {
        return new StoreSetContactUrlActionImpl(contactUrl);
    }

    /**
     * factory method for an instance of StoreSetContactUrlActionBuilder
     * @return builder
     */
    public static StoreSetContactUrlActionBuilder of() {
        return new StoreSetContactUrlActionBuilder();
    }

    /**
     * create builder for StoreSetContactUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetContactUrlActionBuilder of(final StoreSetContactUrlAction template) {
        StoreSetContactUrlActionBuilder builder = new StoreSetContactUrlActionBuilder();
        builder.contactUrl = template.getContactUrl();
        return builder;
    }

}
