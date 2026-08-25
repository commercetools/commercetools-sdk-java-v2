
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
 *     StoreImprintUrlSetMessage storeImprintUrlSetMessage = StoreImprintUrlSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StoreImprintUrlSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreImprintUrlSetMessageImpl.class)
public interface StoreImprintUrlSetMessage extends Message {

    /**
     * discriminator value for StoreImprintUrlSetMessage
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
     * @return instance of StoreImprintUrlSetMessage
     */
    public static StoreImprintUrlSetMessage of() {
        return new StoreImprintUrlSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StoreImprintUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreImprintUrlSetMessage of(final StoreImprintUrlSetMessage template) {
        StoreImprintUrlSetMessageImpl instance = new StoreImprintUrlSetMessageImpl();
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
        instance.setImprintUrl(template.getImprintUrl());
        return instance;
    }

    public StoreImprintUrlSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StoreImprintUrlSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreImprintUrlSetMessage deepCopy(@Nullable final StoreImprintUrlSetMessage template) {
        if (template == null) {
            return null;
        }
        StoreImprintUrlSetMessageImpl instance = new StoreImprintUrlSetMessageImpl();
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
        instance.setImprintUrl(template.getImprintUrl());
        return instance;
    }

    /**
     * builder factory method for StoreImprintUrlSetMessage
     * @return builder
     */
    public static StoreImprintUrlSetMessageBuilder builder() {
        return StoreImprintUrlSetMessageBuilder.of();
    }

    /**
     * create builder for StoreImprintUrlSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreImprintUrlSetMessageBuilder builder(final StoreImprintUrlSetMessage template) {
        return StoreImprintUrlSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreImprintUrlSetMessage(Function<StoreImprintUrlSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreImprintUrlSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreImprintUrlSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreImprintUrlSetMessage>";
            }
        };
    }
}
