
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Valid From update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidFromSetMessage standalonePriceValidFromSetMessage = StandalonePriceValidFromSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceValidFromSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceValidFromSetMessageImpl.class)
public interface StandalonePriceValidFromSetMessage extends Message {

    /**
     * discriminator value for StandalonePriceValidFromSetMessage
     */
    String STANDALONE_PRICE_VALID_FROM_SET = "StandalonePriceValidFromSet";

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From update action.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From update action.</p>
     * @return previousValidFrom
     */

    @JsonProperty("previousValidFrom")
    public ZonedDateTime getPreviousValidFrom();

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From update action.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From update action.</p>
     * @param previousValidFrom value to be set
     */

    public void setPreviousValidFrom(final ZonedDateTime previousValidFrom);

    /**
     * factory method
     * @return instance of StandalonePriceValidFromSetMessage
     */
    public static StandalonePriceValidFromSetMessage of() {
        return new StandalonePriceValidFromSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceValidFromSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceValidFromSetMessage of(final StandalonePriceValidFromSetMessage template) {
        StandalonePriceValidFromSetMessageImpl instance = new StandalonePriceValidFromSetMessageImpl();
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
        instance.setValidFrom(template.getValidFrom());
        instance.setPreviousValidFrom(template.getPreviousValidFrom());
        return instance;
    }

    public StandalonePriceValidFromSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceValidFromSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceValidFromSetMessage deepCopy(
            @Nullable final StandalonePriceValidFromSetMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceValidFromSetMessageImpl instance = new StandalonePriceValidFromSetMessageImpl();
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
        instance.setValidFrom(template.getValidFrom());
        instance.setPreviousValidFrom(template.getPreviousValidFrom());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceValidFromSetMessage
     * @return builder
     */
    public static StandalonePriceValidFromSetMessageBuilder builder() {
        return StandalonePriceValidFromSetMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceValidFromSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidFromSetMessageBuilder builder(final StandalonePriceValidFromSetMessage template) {
        return StandalonePriceValidFromSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceValidFromSetMessage(Function<StandalonePriceValidFromSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidFromSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceValidFromSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceValidFromSetMessage>";
            }
        };
    }
}
