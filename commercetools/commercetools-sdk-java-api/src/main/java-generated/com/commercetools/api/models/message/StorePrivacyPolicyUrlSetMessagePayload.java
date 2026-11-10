
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetPrivacyPolicyUrlAction" rel="nofollow">Set Privacy Policy Url</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StorePrivacyPolicyUrlSetMessagePayload storePrivacyPolicyUrlSetMessagePayload = StorePrivacyPolicyUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StorePrivacyPolicyUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StorePrivacyPolicyUrlSetMessagePayloadImpl.class)
public interface StorePrivacyPolicyUrlSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for StorePrivacyPolicyUrlSetMessagePayload
     */
    String STORE_PRIVACY_POLICY_URL_SET = "StorePrivacyPolicyUrlSet";

    /**
     *  <p>The <code>privacyPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetPrivacyPolicyUrlAction" rel="nofollow">Set Privacy Policy Url</a> update action.</p>
     * @return privacyPolicyUrl
     */

    @JsonProperty("privacyPolicyUrl")
    public String getPrivacyPolicyUrl();

    /**
     *  <p>The <code>privacyPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetPrivacyPolicyUrlAction" rel="nofollow">Set Privacy Policy Url</a> update action.</p>
     * @param privacyPolicyUrl value to be set
     */

    public void setPrivacyPolicyUrl(final String privacyPolicyUrl);

    /**
     * factory method
     * @return instance of StorePrivacyPolicyUrlSetMessagePayload
     */
    public static StorePrivacyPolicyUrlSetMessagePayload of() {
        return new StorePrivacyPolicyUrlSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy StorePrivacyPolicyUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static StorePrivacyPolicyUrlSetMessagePayload of(final StorePrivacyPolicyUrlSetMessagePayload template) {
        StorePrivacyPolicyUrlSetMessagePayloadImpl instance = new StorePrivacyPolicyUrlSetMessagePayloadImpl();
        instance.setPrivacyPolicyUrl(template.getPrivacyPolicyUrl());
        return instance;
    }

    public StorePrivacyPolicyUrlSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of StorePrivacyPolicyUrlSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StorePrivacyPolicyUrlSetMessagePayload deepCopy(
            @Nullable final StorePrivacyPolicyUrlSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        StorePrivacyPolicyUrlSetMessagePayloadImpl instance = new StorePrivacyPolicyUrlSetMessagePayloadImpl();
        instance.setPrivacyPolicyUrl(template.getPrivacyPolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StorePrivacyPolicyUrlSetMessagePayload
     * @return builder
     */
    public static StorePrivacyPolicyUrlSetMessagePayloadBuilder builder() {
        return StorePrivacyPolicyUrlSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for StorePrivacyPolicyUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StorePrivacyPolicyUrlSetMessagePayloadBuilder builder(
            final StorePrivacyPolicyUrlSetMessagePayload template) {
        return StorePrivacyPolicyUrlSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStorePrivacyPolicyUrlSetMessagePayload(
            Function<StorePrivacyPolicyUrlSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StorePrivacyPolicyUrlSetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<StorePrivacyPolicyUrlSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StorePrivacyPolicyUrlSetMessagePayload>";
            }
        };
    }
}
