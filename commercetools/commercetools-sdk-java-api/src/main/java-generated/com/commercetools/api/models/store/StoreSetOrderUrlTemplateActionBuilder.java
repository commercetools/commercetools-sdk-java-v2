
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetOrderUrlTemplateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetOrderUrlTemplateAction storeSetOrderUrlTemplateAction = StoreSetOrderUrlTemplateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetOrderUrlTemplateActionBuilder implements Builder<StoreSetOrderUrlTemplateAction> {

    @Nullable
    private String orderUrlTemplate;

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>orderId</code> variable. If empty, any existing value is removed.</p>
     * @param orderUrlTemplate value to be set
     * @return Builder
     */

    public StoreSetOrderUrlTemplateActionBuilder orderUrlTemplate(@Nullable final String orderUrlTemplate) {
        this.orderUrlTemplate = orderUrlTemplate;
        return this;
    }

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>orderId</code> variable. If empty, any existing value is removed.</p>
     * @return orderUrlTemplate
     */

    @Nullable
    public String getOrderUrlTemplate() {
        return this.orderUrlTemplate;
    }

    /**
     * builds StoreSetOrderUrlTemplateAction with checking for non-null required values
     * @return StoreSetOrderUrlTemplateAction
     */
    public StoreSetOrderUrlTemplateAction build() {
        return new StoreSetOrderUrlTemplateActionImpl(orderUrlTemplate);
    }

    /**
     * builds StoreSetOrderUrlTemplateAction without checking for non-null required values
     * @return StoreSetOrderUrlTemplateAction
     */
    public StoreSetOrderUrlTemplateAction buildUnchecked() {
        return new StoreSetOrderUrlTemplateActionImpl(orderUrlTemplate);
    }

    /**
     * factory method for an instance of StoreSetOrderUrlTemplateActionBuilder
     * @return builder
     */
    public static StoreSetOrderUrlTemplateActionBuilder of() {
        return new StoreSetOrderUrlTemplateActionBuilder();
    }

    /**
     * create builder for StoreSetOrderUrlTemplateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetOrderUrlTemplateActionBuilder of(final StoreSetOrderUrlTemplateAction template) {
        StoreSetOrderUrlTemplateActionBuilder builder = new StoreSetOrderUrlTemplateActionBuilder();
        builder.orderUrlTemplate = template.getOrderUrlTemplate();
        return builder;
    }

}
