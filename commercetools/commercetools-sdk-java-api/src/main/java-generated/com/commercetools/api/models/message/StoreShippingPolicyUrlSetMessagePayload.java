
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetShippingPolicyUrlAction" rel="nofollow">Set Shipping Policy Url</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreShippingPolicyUrlSetMessagePayload storeShippingPolicyUrlSetMessagePayload = StoreShippingPolicyUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreShippingPolicyUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreShippingPolicyUrlSetMessagePayloadImpl.class)
public interface StoreShippingPolicyUrlSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreShippingPolicyUrlSetMessagePayload
     */
    String STORE_SHIPPING_POLICY_URL_SET = "StoreShippingPolicyUrlSet";

    /**
     *  <p>The <code>shippingPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetShippingPolicyUrlAction" rel="nofollow">Set Shipping Policy Url</a> update action.</p>
     * @return shippingPolicyUrl
     */

    @JsonProperty("shippingPolicyUrl")
    public String getShippingPolicyUrl();

    /**
     *  <p>The <code>shippingPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetShippingPolicyUrlAction" rel="nofollow">Set Shipping Policy Url</a> update action.</p>
     * @param shippingPolicyUrl value to be set
     */

    public void setShippingPolicyUrl(final String shippingPolicyUrl);

    /**
     * factory method
     * @return instance of StoreShippingPolicyUrlSetMessagePayload
     */
    public static StoreShippingPolicyUrlSetMessagePayload of() {
        return new StoreShippingPolicyUrlSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreShippingPolicyUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreShippingPolicyUrlSetMessagePayload of(final StoreShippingPolicyUrlSetMessagePayload template) {
        StoreShippingPolicyUrlSetMessagePayloadImpl instance = new StoreShippingPolicyUrlSetMessagePayloadImpl();
        instance.setShippingPolicyUrl(template.getShippingPolicyUrl());
        return instance;
    }

    public StoreShippingPolicyUrlSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreShippingPolicyUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreShippingPolicyUrlSetMessagePayload deepCopy(
            @Nullable final StoreShippingPolicyUrlSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreShippingPolicyUrlSetMessagePayloadImpl instance = new StoreShippingPolicyUrlSetMessagePayloadImpl();
        instance.setShippingPolicyUrl(template.getShippingPolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StoreShippingPolicyUrlSetMessagePayload
     * @return builder
     */
    public static StoreShippingPolicyUrlSetMessagePayloadBuilder builder() {
        return StoreShippingPolicyUrlSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreShippingPolicyUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreShippingPolicyUrlSetMessagePayloadBuilder builder(
            final StoreShippingPolicyUrlSetMessagePayload template) {
        return StoreShippingPolicyUrlSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreShippingPolicyUrlSetMessagePayload(
            Function<StoreShippingPolicyUrlSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreShippingPolicyUrlSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreShippingPolicyUrlSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreShippingPolicyUrlSetMessagePayload>";
            }
        };
    }
}
