
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCheckoutUrlTemplateSetMessagePayload storeCheckoutUrlTemplateSetMessagePayload = StoreCheckoutUrlTemplateSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreCheckoutUrlTemplateSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCheckoutUrlTemplateSetMessagePayloadImpl.class)
public interface StoreCheckoutUrlTemplateSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreCheckoutUrlTemplateSetMessagePayload
     */
    String STORE_CHECKOUT_URL_TEMPLATE_SET = "StoreCheckoutUrlTemplateSet";

    /**
     *  <p>The <code>checkoutUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
     * @return checkoutUrlTemplate
     */

    @JsonProperty("checkoutUrlTemplate")
    public String getCheckoutUrlTemplate();

    /**
     *  <p>The <code>checkoutUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCheckoutUrlTemplateAction" rel="nofollow">Set Checkout Url Template</a> update action.</p>
     * @param checkoutUrlTemplate value to be set
     */

    public void setCheckoutUrlTemplate(final String checkoutUrlTemplate);

    /**
     * factory method
     * @return instance of StoreCheckoutUrlTemplateSetMessagePayload
     */
    public static StoreCheckoutUrlTemplateSetMessagePayload of() {
        return new StoreCheckoutUrlTemplateSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreCheckoutUrlTemplateSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreCheckoutUrlTemplateSetMessagePayload of(
            final StoreCheckoutUrlTemplateSetMessagePayload template) {
        StoreCheckoutUrlTemplateSetMessagePayloadImpl instance = new StoreCheckoutUrlTemplateSetMessagePayloadImpl();
        instance.setCheckoutUrlTemplate(template.getCheckoutUrlTemplate());
        return instance;
    }

    public StoreCheckoutUrlTemplateSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreCheckoutUrlTemplateSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreCheckoutUrlTemplateSetMessagePayload deepCopy(
            @Nullable final StoreCheckoutUrlTemplateSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreCheckoutUrlTemplateSetMessagePayloadImpl instance = new StoreCheckoutUrlTemplateSetMessagePayloadImpl();
        instance.setCheckoutUrlTemplate(template.getCheckoutUrlTemplate());
        return instance;
    }

    /**
     * builder factory method for StoreCheckoutUrlTemplateSetMessagePayload
     * @return builder
     */
    public static StoreCheckoutUrlTemplateSetMessagePayloadBuilder builder() {
        return StoreCheckoutUrlTemplateSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreCheckoutUrlTemplateSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCheckoutUrlTemplateSetMessagePayloadBuilder builder(
            final StoreCheckoutUrlTemplateSetMessagePayload template) {
        return StoreCheckoutUrlTemplateSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreCheckoutUrlTemplateSetMessagePayload(
            Function<StoreCheckoutUrlTemplateSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreCheckoutUrlTemplateSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreCheckoutUrlTemplateSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCheckoutUrlTemplateSetMessagePayload>";
            }
        };
    }
}
