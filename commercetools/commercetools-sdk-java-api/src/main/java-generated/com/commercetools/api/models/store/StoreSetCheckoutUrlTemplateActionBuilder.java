
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetCheckoutUrlTemplateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCheckoutUrlTemplateAction storeSetCheckoutUrlTemplateAction = StoreSetCheckoutUrlTemplateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetCheckoutUrlTemplateActionBuilder implements Builder<StoreSetCheckoutUrlTemplateAction> {

    @Nullable
    private String checkoutUrlTemplate;

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>checkoutId</code> variable. If empty, any existing value is removed.</p>
     * @param checkoutUrlTemplate value to be set
     * @return Builder
     */

    public StoreSetCheckoutUrlTemplateActionBuilder checkoutUrlTemplate(@Nullable final String checkoutUrlTemplate) {
        this.checkoutUrlTemplate = checkoutUrlTemplate;
        return this;
    }

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>checkoutId</code> variable. If empty, any existing value is removed.</p>
     * @return checkoutUrlTemplate
     */

    @Nullable
    public String getCheckoutUrlTemplate() {
        return this.checkoutUrlTemplate;
    }

    /**
     * builds StoreSetCheckoutUrlTemplateAction with checking for non-null required values
     * @return StoreSetCheckoutUrlTemplateAction
     */
    public StoreSetCheckoutUrlTemplateAction build() {
        return new StoreSetCheckoutUrlTemplateActionImpl(checkoutUrlTemplate);
    }

    /**
     * builds StoreSetCheckoutUrlTemplateAction without checking for non-null required values
     * @return StoreSetCheckoutUrlTemplateAction
     */
    public StoreSetCheckoutUrlTemplateAction buildUnchecked() {
        return new StoreSetCheckoutUrlTemplateActionImpl(checkoutUrlTemplate);
    }

    /**
     * factory method for an instance of StoreSetCheckoutUrlTemplateActionBuilder
     * @return builder
     */
    public static StoreSetCheckoutUrlTemplateActionBuilder of() {
        return new StoreSetCheckoutUrlTemplateActionBuilder();
    }

    /**
     * create builder for StoreSetCheckoutUrlTemplateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetCheckoutUrlTemplateActionBuilder of(final StoreSetCheckoutUrlTemplateAction template) {
        StoreSetCheckoutUrlTemplateActionBuilder builder = new StoreSetCheckoutUrlTemplateActionBuilder();
        builder.checkoutUrlTemplate = template.getCheckoutUrlTemplate();
        return builder;
    }

}
