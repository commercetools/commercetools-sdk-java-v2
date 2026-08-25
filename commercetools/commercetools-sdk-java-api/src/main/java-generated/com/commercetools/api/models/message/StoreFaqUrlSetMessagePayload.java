
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetFaqUrlAction" rel="nofollow">Set Faq Url</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreFaqUrlSetMessagePayload storeFaqUrlSetMessagePayload = StoreFaqUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreFaqUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreFaqUrlSetMessagePayloadImpl.class)
public interface StoreFaqUrlSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreFaqUrlSetMessagePayload
     */
    String STORE_FAQ_URL_SET = "StoreFaqUrlSet";

    /**
     *  <p>The <code>faqUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetFaqUrlAction" rel="nofollow">Set Faq Url</a> update action.</p>
     * @return faqUrl
     */

    @JsonProperty("faqUrl")
    public String getFaqUrl();

    /**
     *  <p>The <code>faqUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetFaqUrlAction" rel="nofollow">Set Faq Url</a> update action.</p>
     * @param faqUrl value to be set
     */

    public void setFaqUrl(final String faqUrl);

    /**
     * factory method
     * @return instance of StoreFaqUrlSetMessagePayload
     */
    public static StoreFaqUrlSetMessagePayload of() {
        return new StoreFaqUrlSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreFaqUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreFaqUrlSetMessagePayload of(final StoreFaqUrlSetMessagePayload template) {
        StoreFaqUrlSetMessagePayloadImpl instance = new StoreFaqUrlSetMessagePayloadImpl();
        instance.setFaqUrl(template.getFaqUrl());
        return instance;
    }

    public StoreFaqUrlSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreFaqUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreFaqUrlSetMessagePayload deepCopy(@Nullable final StoreFaqUrlSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreFaqUrlSetMessagePayloadImpl instance = new StoreFaqUrlSetMessagePayloadImpl();
        instance.setFaqUrl(template.getFaqUrl());
        return instance;
    }

    /**
     * builder factory method for StoreFaqUrlSetMessagePayload
     * @return builder
     */
    public static StoreFaqUrlSetMessagePayloadBuilder builder() {
        return StoreFaqUrlSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreFaqUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreFaqUrlSetMessagePayloadBuilder builder(final StoreFaqUrlSetMessagePayload template) {
        return StoreFaqUrlSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreFaqUrlSetMessagePayload(Function<StoreFaqUrlSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreFaqUrlSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreFaqUrlSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreFaqUrlSetMessagePayload>";
            }
        };
    }
}
