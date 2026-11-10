
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreOrderUrlTemplateSetMessagePayload storeOrderUrlTemplateSetMessagePayload = StoreOrderUrlTemplateSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreOrderUrlTemplateSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreOrderUrlTemplateSetMessagePayloadImpl.class)
public interface StoreOrderUrlTemplateSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreOrderUrlTemplateSetMessagePayload
     */
    String STORE_ORDER_URL_TEMPLATE_SET = "StoreOrderUrlTemplateSet";

    /**
     *  <p>The <code>orderUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
     * @return orderUrlTemplate
     */

    @JsonProperty("orderUrlTemplate")
    public String getOrderUrlTemplate();

    /**
     *  <p>The <code>orderUrlTemplate</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetOrderUrlTemplateAction" rel="nofollow">Set Order Url Template</a> update action.</p>
     * @param orderUrlTemplate value to be set
     */

    public void setOrderUrlTemplate(final String orderUrlTemplate);

    /**
     * factory method
     * @return instance of StoreOrderUrlTemplateSetMessagePayload
     */
    public static StoreOrderUrlTemplateSetMessagePayload of() {
        return new StoreOrderUrlTemplateSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreOrderUrlTemplateSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreOrderUrlTemplateSetMessagePayload of(final StoreOrderUrlTemplateSetMessagePayload template) {
        StoreOrderUrlTemplateSetMessagePayloadImpl instance = new StoreOrderUrlTemplateSetMessagePayloadImpl();
        instance.setOrderUrlTemplate(template.getOrderUrlTemplate());
        return instance;
    }

    public StoreOrderUrlTemplateSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreOrderUrlTemplateSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreOrderUrlTemplateSetMessagePayload deepCopy(
            @Nullable final StoreOrderUrlTemplateSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreOrderUrlTemplateSetMessagePayloadImpl instance = new StoreOrderUrlTemplateSetMessagePayloadImpl();
        instance.setOrderUrlTemplate(template.getOrderUrlTemplate());
        return instance;
    }

    /**
     * builder factory method for StoreOrderUrlTemplateSetMessagePayload
     * @return builder
     */
    public static StoreOrderUrlTemplateSetMessagePayloadBuilder builder() {
        return StoreOrderUrlTemplateSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreOrderUrlTemplateSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreOrderUrlTemplateSetMessagePayloadBuilder builder(
            final StoreOrderUrlTemplateSetMessagePayload template) {
        return StoreOrderUrlTemplateSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreOrderUrlTemplateSetMessagePayload(
            Function<StoreOrderUrlTemplateSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreOrderUrlTemplateSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreOrderUrlTemplateSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreOrderUrlTemplateSetMessagePayload>";
            }
        };
    }
}
