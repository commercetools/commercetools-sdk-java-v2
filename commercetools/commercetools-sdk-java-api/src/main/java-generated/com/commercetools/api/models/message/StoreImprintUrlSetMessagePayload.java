
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetImprintUrlAction" rel="nofollow">Set Imprint Url</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreImprintUrlSetMessagePayload storeImprintUrlSetMessagePayload = StoreImprintUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreImprintUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreImprintUrlSetMessagePayloadImpl.class)
public interface StoreImprintUrlSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreImprintUrlSetMessagePayload
     */
    String STORE_IMPRINT_URL_SET = "StoreImprintUrlSet";

    /**
     *  <p>The <code>imprintUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetImprintUrlAction" rel="nofollow">Set Imprint Url</a> update action.</p>
     * @return imprintUrl
     */

    @JsonProperty("imprintUrl")
    public String getImprintUrl();

    /**
     *  <p>The <code>imprintUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetImprintUrlAction" rel="nofollow">Set Imprint Url</a> update action.</p>
     * @param imprintUrl value to be set
     */

    public void setImprintUrl(final String imprintUrl);

    /**
     * factory method
     * @return instance of StoreImprintUrlSetMessagePayload
     */
    public static StoreImprintUrlSetMessagePayload of() {
        return new StoreImprintUrlSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreImprintUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreImprintUrlSetMessagePayload of(final StoreImprintUrlSetMessagePayload template) {
        StoreImprintUrlSetMessagePayloadImpl instance = new StoreImprintUrlSetMessagePayloadImpl();
        instance.setImprintUrl(template.getImprintUrl());
        return instance;
    }

    public StoreImprintUrlSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreImprintUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreImprintUrlSetMessagePayload deepCopy(@Nullable final StoreImprintUrlSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreImprintUrlSetMessagePayloadImpl instance = new StoreImprintUrlSetMessagePayloadImpl();
        instance.setImprintUrl(template.getImprintUrl());
        return instance;
    }

    /**
     * builder factory method for StoreImprintUrlSetMessagePayload
     * @return builder
     */
    public static StoreImprintUrlSetMessagePayloadBuilder builder() {
        return StoreImprintUrlSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreImprintUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreImprintUrlSetMessagePayloadBuilder builder(final StoreImprintUrlSetMessagePayload template) {
        return StoreImprintUrlSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreImprintUrlSetMessagePayload(Function<StoreImprintUrlSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreImprintUrlSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreImprintUrlSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreImprintUrlSetMessagePayload>";
            }
        };
    }
}
