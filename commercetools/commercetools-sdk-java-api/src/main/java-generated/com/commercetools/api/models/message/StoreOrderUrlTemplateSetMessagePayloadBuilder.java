
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreOrderUrlTemplateSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreOrderUrlTemplateSetMessagePayload storeOrderUrlTemplateSetMessagePayload = StoreOrderUrlTemplateSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreOrderUrlTemplateSetMessagePayloadBuilder implements Builder<StoreOrderUrlTemplateSetMessagePayload> {

    @Nullable
    private String orderUrlTemplate;

    /**
     *  <p>The <code>orderUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
     * @param orderUrlTemplate value to be set
     * @return Builder
     */

    public StoreOrderUrlTemplateSetMessagePayloadBuilder orderUrlTemplate(@Nullable final String orderUrlTemplate) {
        this.orderUrlTemplate = orderUrlTemplate;
        return this;
    }

    /**
     *  <p>The <code>orderUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
     * @return orderUrlTemplate
     */

    @Nullable
    public String getOrderUrlTemplate() {
        return this.orderUrlTemplate;
    }

    /**
     * builds StoreOrderUrlTemplateSetMessagePayload with checking for non-null required values
     * @return StoreOrderUrlTemplateSetMessagePayload
     */
    public StoreOrderUrlTemplateSetMessagePayload build() {
        return new StoreOrderUrlTemplateSetMessagePayloadImpl(orderUrlTemplate);
    }

    /**
     * builds StoreOrderUrlTemplateSetMessagePayload without checking for non-null required values
     * @return StoreOrderUrlTemplateSetMessagePayload
     */
    public StoreOrderUrlTemplateSetMessagePayload buildUnchecked() {
        return new StoreOrderUrlTemplateSetMessagePayloadImpl(orderUrlTemplate);
    }

    /**
     * factory method for an instance of StoreOrderUrlTemplateSetMessagePayloadBuilder
     * @return builder
     */
    public static StoreOrderUrlTemplateSetMessagePayloadBuilder of() {
        return new StoreOrderUrlTemplateSetMessagePayloadBuilder();
    }

    /**
     * create builder for StoreOrderUrlTemplateSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreOrderUrlTemplateSetMessagePayloadBuilder of(
            final StoreOrderUrlTemplateSetMessagePayload template) {
        StoreOrderUrlTemplateSetMessagePayloadBuilder builder = new StoreOrderUrlTemplateSetMessagePayloadBuilder();
        builder.orderUrlTemplate = template.getOrderUrlTemplate();
        return builder;
    }

}
