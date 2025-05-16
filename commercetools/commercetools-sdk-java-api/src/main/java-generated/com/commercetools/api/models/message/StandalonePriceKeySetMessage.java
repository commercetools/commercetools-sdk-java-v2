
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Key update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceKeySetMessage standalonePriceKeySetMessage = StandalonePriceKeySetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceKeySetMessageImpl.class)
public interface StandalonePriceKeySetMessage extends Message {

    /**
     * discriminator value for StandalonePriceKeySetMessage
     */
    String STANDALONE_PRICE_KEY_SET = "StandalonePriceKeySet";

    /**
     *  <p><code>key</code> value of the StandalonePrice after the Set Key update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the StandalonePrice before the Set Key update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the StandalonePrice after the Set Key update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>key</code> value of the StandalonePrice before the Set Key update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     * factory method
     * @return instance of StandalonePriceKeySetMessage
     */
    public static StandalonePriceKeySetMessage of() {
        return new StandalonePriceKeySetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceKeySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceKeySetMessage of(final StandalonePriceKeySetMessage template) {
        StandalonePriceKeySetMessageImpl instance = new StandalonePriceKeySetMessageImpl();
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
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public StandalonePriceKeySetMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceKeySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceKeySetMessage deepCopy(@Nullable final StandalonePriceKeySetMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceKeySetMessageImpl instance = new StandalonePriceKeySetMessageImpl();
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
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceKeySetMessage
     * @return builder
     */
    public static StandalonePriceKeySetMessageBuilder builder() {
        return StandalonePriceKeySetMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceKeySetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceKeySetMessageBuilder builder(final StandalonePriceKeySetMessage template) {
        return StandalonePriceKeySetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceKeySetMessage(Function<StandalonePriceKeySetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceKeySetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceKeySetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceKeySetMessage>";
            }
        };
    }
}
