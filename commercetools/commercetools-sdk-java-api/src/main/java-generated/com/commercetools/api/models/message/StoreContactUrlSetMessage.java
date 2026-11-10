
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
 *     StoreContactUrlSetMessage storeContactUrlSetMessage = StoreContactUrlSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StoreContactUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreContactUrlSetMessageImpl.class)
public interface StoreContactUrlSetMessage extends Message {

    /**
     * discriminator value for StoreContactUrlSetMessage
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
     * @return instance of StoreContactUrlSetMessage
     */
    public static StoreContactUrlSetMessage of() {
        return new StoreContactUrlSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreContactUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreContactUrlSetMessage of(final StoreContactUrlSetMessage template) {
        StoreContactUrlSetMessageImpl instance = new StoreContactUrlSetMessageImpl();
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
        instance.setContactUrl(template.getContactUrl());
        return instance;
    }

    public StoreContactUrlSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StoreContactUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreContactUrlSetMessage deepCopy(@Nullable final StoreContactUrlSetMessage template) {
        if (template == null) {
            return null;
        }
        StoreContactUrlSetMessageImpl instance = new StoreContactUrlSetMessageImpl();
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
        instance.setContactUrl(template.getContactUrl());
        return instance;
    }

    /**
     * builder factory method for StoreContactUrlSetMessage
     * @return builder
     */
    public static StoreContactUrlSetMessageBuilder builder() {
        return StoreContactUrlSetMessageBuilder.of();
    }

    /**
     * create builder for StoreContactUrlSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreContactUrlSetMessageBuilder builder(final StoreContactUrlSetMessage template) {
        return StoreContactUrlSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreContactUrlSetMessage(Function<StoreContactUrlSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreContactUrlSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreContactUrlSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreContactUrlSetMessage>";
            }
        };
    }
}
