
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreTermsOfServiceUrlSetMessagePayload storeTermsOfServiceUrlSetMessagePayload = StoreTermsOfServiceUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreTermsOfServiceUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreTermsOfServiceUrlSetMessagePayloadImpl.class)
public interface StoreTermsOfServiceUrlSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreTermsOfServiceUrlSetMessagePayload
     */
    String STORE_TERMS_OF_SERVICE_URL_SET = "StoreTermsOfServiceUrlSet";

    /**
     *  <p>The <code>termsOfServiceUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
     * @return termsOfServiceUrl
     */

    @JsonProperty("termsOfServiceUrl")
    public String getTermsOfServiceUrl();

    /**
     *  <p>The <code>termsOfServiceUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
     * @param termsOfServiceUrl value to be set
     */

    public void setTermsOfServiceUrl(final String termsOfServiceUrl);

    /**
     * factory method
     * @return instance of StoreTermsOfServiceUrlSetMessagePayload
     */
    public static StoreTermsOfServiceUrlSetMessagePayload of() {
        return new StoreTermsOfServiceUrlSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreTermsOfServiceUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreTermsOfServiceUrlSetMessagePayload of(final StoreTermsOfServiceUrlSetMessagePayload template) {
        StoreTermsOfServiceUrlSetMessagePayloadImpl instance = new StoreTermsOfServiceUrlSetMessagePayloadImpl();
        instance.setTermsOfServiceUrl(template.getTermsOfServiceUrl());
        return instance;
    }

    public StoreTermsOfServiceUrlSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreTermsOfServiceUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreTermsOfServiceUrlSetMessagePayload deepCopy(
            @Nullable final StoreTermsOfServiceUrlSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreTermsOfServiceUrlSetMessagePayloadImpl instance = new StoreTermsOfServiceUrlSetMessagePayloadImpl();
        instance.setTermsOfServiceUrl(template.getTermsOfServiceUrl());
        return instance;
    }

    /**
     * builder factory method for StoreTermsOfServiceUrlSetMessagePayload
     * @return builder
     */
    public static StoreTermsOfServiceUrlSetMessagePayloadBuilder builder() {
        return StoreTermsOfServiceUrlSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreTermsOfServiceUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreTermsOfServiceUrlSetMessagePayloadBuilder builder(
            final StoreTermsOfServiceUrlSetMessagePayload template) {
        return StoreTermsOfServiceUrlSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreTermsOfServiceUrlSetMessagePayload(
            Function<StoreTermsOfServiceUrlSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreTermsOfServiceUrlSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreTermsOfServiceUrlSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreTermsOfServiceUrlSetMessagePayload>";
            }
        };
    }
}
