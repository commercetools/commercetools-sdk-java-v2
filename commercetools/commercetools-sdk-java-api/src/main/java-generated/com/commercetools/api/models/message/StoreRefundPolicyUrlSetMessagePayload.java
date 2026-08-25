
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetRefundPolicyUrlAction" rel="nofollow">Set Refund Policy Url</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRefundPolicyUrlSetMessagePayload storeRefundPolicyUrlSetMessagePayload = StoreRefundPolicyUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreRefundPolicyUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreRefundPolicyUrlSetMessagePayloadImpl.class)
public interface StoreRefundPolicyUrlSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StoreRefundPolicyUrlSetMessagePayload
     */
    String STORE_REFUND_POLICY_URL_SET = "StoreRefundPolicyUrlSet";

    /**
     *  <p>The <code>refundPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetRefundPolicyUrlAction" rel="nofollow">Set Refund Policy Url</a> update action.</p>
     * @return refundPolicyUrl
     */

    @JsonProperty("refundPolicyUrl")
    public String getRefundPolicyUrl();

    /**
     *  <p>The <code>refundPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetRefundPolicyUrlAction" rel="nofollow">Set Refund Policy Url</a> update action.</p>
     * @param refundPolicyUrl value to be set
     */

    public void setRefundPolicyUrl(final String refundPolicyUrl);

    /**
     * factory method
     * @return instance of StoreRefundPolicyUrlSetMessagePayload
     */
    public static StoreRefundPolicyUrlSetMessagePayload of() {
        return new StoreRefundPolicyUrlSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StoreRefundPolicyUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreRefundPolicyUrlSetMessagePayload of(final StoreRefundPolicyUrlSetMessagePayload template) {
        StoreRefundPolicyUrlSetMessagePayloadImpl instance = new StoreRefundPolicyUrlSetMessagePayloadImpl();
        instance.setRefundPolicyUrl(template.getRefundPolicyUrl());
        return instance;
    }

    public StoreRefundPolicyUrlSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StoreRefundPolicyUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreRefundPolicyUrlSetMessagePayload deepCopy(
            @Nullable final StoreRefundPolicyUrlSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StoreRefundPolicyUrlSetMessagePayloadImpl instance = new StoreRefundPolicyUrlSetMessagePayloadImpl();
        instance.setRefundPolicyUrl(template.getRefundPolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StoreRefundPolicyUrlSetMessagePayload
     * @return builder
     */
    public static StoreRefundPolicyUrlSetMessagePayloadBuilder builder() {
        return StoreRefundPolicyUrlSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StoreRefundPolicyUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreRefundPolicyUrlSetMessagePayloadBuilder builder(
            final StoreRefundPolicyUrlSetMessagePayload template) {
        return StoreRefundPolicyUrlSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreRefundPolicyUrlSetMessagePayload(Function<StoreRefundPolicyUrlSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreRefundPolicyUrlSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreRefundPolicyUrlSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StoreRefundPolicyUrlSetMessagePayload>";
            }
        };
    }
}
