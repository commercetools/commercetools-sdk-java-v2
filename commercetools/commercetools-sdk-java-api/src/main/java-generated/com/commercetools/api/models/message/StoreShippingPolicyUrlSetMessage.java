
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
 *     StoreShippingPolicyUrlSetMessage storeShippingPolicyUrlSetMessage = StoreShippingPolicyUrlSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StoreShippingPolicyUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreShippingPolicyUrlSetMessageImpl.class)
public interface StoreShippingPolicyUrlSetMessage extends Message {

    /**
     * discriminator value for StoreShippingPolicyUrlSetMessage
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
     * @return instance of StoreShippingPolicyUrlSetMessage
     */
    public static StoreShippingPolicyUrlSetMessage of() {
        return new StoreShippingPolicyUrlSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreShippingPolicyUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreShippingPolicyUrlSetMessage of(final StoreShippingPolicyUrlSetMessage template) {
        StoreShippingPolicyUrlSetMessageImpl instance = new StoreShippingPolicyUrlSetMessageImpl();
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
        instance.setShippingPolicyUrl(template.getShippingPolicyUrl());
        return instance;
    }

    public StoreShippingPolicyUrlSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StoreShippingPolicyUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreShippingPolicyUrlSetMessage deepCopy(@Nullable final StoreShippingPolicyUrlSetMessage template) {
        if (template == null) {
            return null;
        }
        StoreShippingPolicyUrlSetMessageImpl instance = new StoreShippingPolicyUrlSetMessageImpl();
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
        instance.setShippingPolicyUrl(template.getShippingPolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StoreShippingPolicyUrlSetMessage
     * @return builder
     */
    public static StoreShippingPolicyUrlSetMessageBuilder builder() {
        return StoreShippingPolicyUrlSetMessageBuilder.of();
    }

    /**
     * create builder for StoreShippingPolicyUrlSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreShippingPolicyUrlSetMessageBuilder builder(final StoreShippingPolicyUrlSetMessage template) {
        return StoreShippingPolicyUrlSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreShippingPolicyUrlSetMessage(Function<StoreShippingPolicyUrlSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreShippingPolicyUrlSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreShippingPolicyUrlSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreShippingPolicyUrlSetMessage>";
            }
        };
    }
}
