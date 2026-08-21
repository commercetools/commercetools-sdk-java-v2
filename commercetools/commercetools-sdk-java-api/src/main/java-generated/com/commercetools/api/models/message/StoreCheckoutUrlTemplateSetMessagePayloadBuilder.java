
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCheckoutUrlTemplateSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCheckoutUrlTemplateSetMessagePayload storeCheckoutUrlTemplateSetMessagePayload = StoreCheckoutUrlTemplateSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCheckoutUrlTemplateSetMessagePayloadBuilder
        implements Builder<StoreCheckoutUrlTemplateSetMessagePayload> {

    @Nullable
    private String checkoutUrlTemplate;

    /**
     *  <p>The <code>checkoutUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
     * @param checkoutUrlTemplate value to be set
     * @return Builder
     */

    public StoreCheckoutUrlTemplateSetMessagePayloadBuilder checkoutUrlTemplate(
            @Nullable final String checkoutUrlTemplate) {
        this.checkoutUrlTemplate = checkoutUrlTemplate;
        return this;
    }

    /**
     *  <p>The <code>checkoutUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
     * @return checkoutUrlTemplate
     */

    @Nullable
    public String getCheckoutUrlTemplate() {
        return this.checkoutUrlTemplate;
    }

    /**
     * builds StoreCheckoutUrlTemplateSetMessagePayload with checking for non-null required values
     * @return StoreCheckoutUrlTemplateSetMessagePayload
     */
    public StoreCheckoutUrlTemplateSetMessagePayload build() {
        return new StoreCheckoutUrlTemplateSetMessagePayloadImpl(checkoutUrlTemplate);
    }

    /**
     * builds StoreCheckoutUrlTemplateSetMessagePayload without checking for non-null required values
     * @return StoreCheckoutUrlTemplateSetMessagePayload
     */
    public StoreCheckoutUrlTemplateSetMessagePayload buildUnchecked() {
        return new StoreCheckoutUrlTemplateSetMessagePayloadImpl(checkoutUrlTemplate);
    }

    /**
     * factory method for an instance of StoreCheckoutUrlTemplateSetMessagePayloadBuilder
     * @return builder
     */
    public static StoreCheckoutUrlTemplateSetMessagePayloadBuilder of() {
        return new StoreCheckoutUrlTemplateSetMessagePayloadBuilder();
    }

    /**
     * create builder for StoreCheckoutUrlTemplateSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCheckoutUrlTemplateSetMessagePayloadBuilder of(
            final StoreCheckoutUrlTemplateSetMessagePayload template) {
        StoreCheckoutUrlTemplateSetMessagePayloadBuilder builder = new StoreCheckoutUrlTemplateSetMessagePayloadBuilder();
        builder.checkoutUrlTemplate = template.getCheckoutUrlTemplate();
        return builder;
    }

}
