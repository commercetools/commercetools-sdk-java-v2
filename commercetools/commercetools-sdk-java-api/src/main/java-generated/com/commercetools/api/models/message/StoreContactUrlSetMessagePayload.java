
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetContactUrlAction" rel="nofollow">Set Contact Url</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreContactUrlSetMessagePayload storeContactUrlSetMessagePayload = StoreContactUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreContactUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreContactUrlSetMessagePayloadImpl.class)
public interface StoreContactUrlSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreContactUrlSetMessagePayload
     */
    String STORE_CONTACT_URL_SET = "StoreContactUrlSet";

    /**
     *  <p>The <code>contactUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetContactUrlAction" rel="nofollow">Set Contact Url</a> update action.</p>
     * @return contactUrl
     */

    @JsonProperty("contactUrl")
    public String getContactUrl();

    /**
     *  <p>The <code>contactUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetContactUrlAction" rel="nofollow">Set Contact Url</a> update action.</p>
     * @param contactUrl value to be set
     */

    public void setContactUrl(final String contactUrl);

    /**
     * factory method
     * @return instance of StoreContactUrlSetMessagePayload
     */
    public static StoreContactUrlSetMessagePayload of() {
        return new StoreContactUrlSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreContactUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreContactUrlSetMessagePayload of(final StoreContactUrlSetMessagePayload template) {
        StoreContactUrlSetMessagePayloadImpl instance = new StoreContactUrlSetMessagePayloadImpl();
        instance.setContactUrl(template.getContactUrl());
        return instance;
    }

    public StoreContactUrlSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreContactUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreContactUrlSetMessagePayload deepCopy(@Nullable final StoreContactUrlSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreContactUrlSetMessagePayloadImpl instance = new StoreContactUrlSetMessagePayloadImpl();
        instance.setContactUrl(template.getContactUrl());
        return instance;
    }

    /**
     * builder factory method for StoreContactUrlSetMessagePayload
     * @return builder
     */
    public static StoreContactUrlSetMessagePayloadBuilder builder() {
        return StoreContactUrlSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreContactUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreContactUrlSetMessagePayloadBuilder builder(final StoreContactUrlSetMessagePayload template) {
        return StoreContactUrlSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreContactUrlSetMessagePayload(Function<StoreContactUrlSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreContactUrlSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreContactUrlSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreContactUrlSetMessagePayload>";
            }
        };
    }
}
