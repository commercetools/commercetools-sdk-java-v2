
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCookiePolicyUrlAction" rel="nofollow">Set Cookie Policy Url</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCookiePolicyUrlSetMessagePayload storeCookiePolicyUrlSetMessagePayload = StoreCookiePolicyUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreCookiePolicyUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreCookiePolicyUrlSetMessagePayloadImpl.class)
public interface StoreCookiePolicyUrlSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreCookiePolicyUrlSetMessagePayload
     */
    String STORE_COOKIE_POLICY_URL_SET = "StoreCookiePolicyUrlSet";

    /**
     *  <p>The <code>cookiePolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCookiePolicyUrlAction" rel="nofollow">Set Cookie Policy Url</a> update action.</p>
     * @return cookiePolicyUrl
     */

    @JsonProperty("cookiePolicyUrl")
    public String getCookiePolicyUrl();

    /**
     *  <p>The <code>cookiePolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCookiePolicyUrlAction" rel="nofollow">Set Cookie Policy Url</a> update action.</p>
     * @param cookiePolicyUrl value to be set
     */

    public void setCookiePolicyUrl(final String cookiePolicyUrl);

    /**
     * factory method
     * @return instance of StoreCookiePolicyUrlSetMessagePayload
     */
    public static StoreCookiePolicyUrlSetMessagePayload of() {
        return new StoreCookiePolicyUrlSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreCookiePolicyUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreCookiePolicyUrlSetMessagePayload of(final StoreCookiePolicyUrlSetMessagePayload template) {
        StoreCookiePolicyUrlSetMessagePayloadImpl instance = new StoreCookiePolicyUrlSetMessagePayloadImpl();
        instance.setCookiePolicyUrl(template.getCookiePolicyUrl());
        return instance;
    }

    public StoreCookiePolicyUrlSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreCookiePolicyUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreCookiePolicyUrlSetMessagePayload deepCopy(
            @Nullable final StoreCookiePolicyUrlSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreCookiePolicyUrlSetMessagePayloadImpl instance = new StoreCookiePolicyUrlSetMessagePayloadImpl();
        instance.setCookiePolicyUrl(template.getCookiePolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StoreCookiePolicyUrlSetMessagePayload
     * @return builder
     */
    public static StoreCookiePolicyUrlSetMessagePayloadBuilder builder() {
        return StoreCookiePolicyUrlSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreCookiePolicyUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCookiePolicyUrlSetMessagePayloadBuilder builder(
            final StoreCookiePolicyUrlSetMessagePayload template) {
        return StoreCookiePolicyUrlSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreCookiePolicyUrlSetMessagePayload(Function<StoreCookiePolicyUrlSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreCookiePolicyUrlSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreCookiePolicyUrlSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreCookiePolicyUrlSetMessagePayload>";
            }
        };
    }
}
