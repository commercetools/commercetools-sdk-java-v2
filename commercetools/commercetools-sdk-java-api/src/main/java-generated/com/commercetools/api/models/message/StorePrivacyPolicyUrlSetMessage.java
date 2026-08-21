
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
 *     StorePrivacyPolicyUrlSetMessage storePrivacyPolicyUrlSetMessage = StorePrivacyPolicyUrlSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StorePrivacyPolicyUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StorePrivacyPolicyUrlSetMessageImpl.class)
public interface StorePrivacyPolicyUrlSetMessage extends Message {

    /**
     * discriminator value for StorePrivacyPolicyUrlSetMessage
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
     * @return instance of StorePrivacyPolicyUrlSetMessage
     */
    public static StorePrivacyPolicyUrlSetMessage of() {
        return new StorePrivacyPolicyUrlSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StorePrivacyPolicyUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StorePrivacyPolicyUrlSetMessage of(final StorePrivacyPolicyUrlSetMessage template) {
        StorePrivacyPolicyUrlSetMessageImpl instance = new StorePrivacyPolicyUrlSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setPrivacyPolicyUrl(template.getPrivacyPolicyUrl());
        return instance;
    }

    public StorePrivacyPolicyUrlSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StorePrivacyPolicyUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StorePrivacyPolicyUrlSetMessage deepCopy(@Nullable final StorePrivacyPolicyUrlSetMessage template) {
        if (template == null) {
            return null;
        }
        StorePrivacyPolicyUrlSetMessageImpl instance = new StorePrivacyPolicyUrlSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setPrivacyPolicyUrl(template.getPrivacyPolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StorePrivacyPolicyUrlSetMessage
     * @return builder
     */
    public static StorePrivacyPolicyUrlSetMessageBuilder builder() {
        return StorePrivacyPolicyUrlSetMessageBuilder.of();
    }

    /**
     * create builder for StorePrivacyPolicyUrlSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StorePrivacyPolicyUrlSetMessageBuilder builder(final StorePrivacyPolicyUrlSetMessage template) {
        return StorePrivacyPolicyUrlSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStorePrivacyPolicyUrlSetMessage(Function<StorePrivacyPolicyUrlSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StorePrivacyPolicyUrlSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<StorePrivacyPolicyUrlSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StorePrivacyPolicyUrlSetMessage>";
            }
        };
    }
}
