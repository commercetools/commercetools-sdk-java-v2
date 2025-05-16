
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.standalone_price.StandalonePrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create StandalonePrice request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceCreatedMessage standalonePriceCreatedMessage = StandalonePriceCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .standalonePrice(standalonePriceBuilder -> standalonePriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceCreatedMessageImpl.class)
public interface StandalonePriceCreatedMessage extends Message {

    /**
     * discriminator value for StandalonePriceCreatedMessage
     */
    String STANDALONE_PRICE_CREATED = "StandalonePriceCreated";

    /**
     *  <p>Standalone Price that was created.</p>
     * @return standalonePrice
     */
    @NotNull
    @Valid
    @JsonProperty("standalonePrice")
    public StandalonePrice getStandalonePrice();

    /**
     *  <p>Standalone Price that was created.</p>
     * @param standalonePrice value to be set
     */

    public void setStandalonePrice(final StandalonePrice standalonePrice);

    /**
     * factory method
     * @return instance of StandalonePriceCreatedMessage
     */
    public static StandalonePriceCreatedMessage of() {
        return new StandalonePriceCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceCreatedMessage of(final StandalonePriceCreatedMessage template) {
        StandalonePriceCreatedMessageImpl instance = new StandalonePriceCreatedMessageImpl();
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
        instance.setStandalonePrice(template.getStandalonePrice());
        return instance;
    }

    public StandalonePriceCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceCreatedMessage deepCopy(@Nullable final StandalonePriceCreatedMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceCreatedMessageImpl instance = new StandalonePriceCreatedMessageImpl();
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
        instance.setStandalonePrice(
            com.commercetools.api.models.standalone_price.StandalonePrice.deepCopy(template.getStandalonePrice()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceCreatedMessage
     * @return builder
     */
    public static StandalonePriceCreatedMessageBuilder builder() {
        return StandalonePriceCreatedMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceCreatedMessageBuilder builder(final StandalonePriceCreatedMessage template) {
        return StandalonePriceCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceCreatedMessage(Function<StandalonePriceCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceCreatedMessage>";
            }
        };
    }
}
