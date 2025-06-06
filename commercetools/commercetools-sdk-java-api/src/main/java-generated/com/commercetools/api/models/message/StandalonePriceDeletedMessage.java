
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Delete StandalonePrice request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDeletedMessage standalonePriceDeletedMessage = StandalonePriceDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceDeletedMessageImpl.class)
public interface StandalonePriceDeletedMessage extends Message {

    /**
     * discriminator value for StandalonePriceDeletedMessage
     */
    String STANDALONE_PRICE_DELETED = "StandalonePriceDeleted";

    /**
     *  <p>SKU of the ProductVariant to which the deleted Standalone Price was associated.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>SKU of the ProductVariant to which the deleted Standalone Price was associated.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     * factory method
     * @return instance of StandalonePriceDeletedMessage
     */
    public static StandalonePriceDeletedMessage of() {
        return new StandalonePriceDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceDeletedMessage of(final StandalonePriceDeletedMessage template) {
        StandalonePriceDeletedMessageImpl instance = new StandalonePriceDeletedMessageImpl();
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
        instance.setSku(template.getSku());
        return instance;
    }

    public StandalonePriceDeletedMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceDeletedMessage deepCopy(@Nullable final StandalonePriceDeletedMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceDeletedMessageImpl instance = new StandalonePriceDeletedMessageImpl();
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
        instance.setSku(template.getSku());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceDeletedMessage
     * @return builder
     */
    public static StandalonePriceDeletedMessageBuilder builder() {
        return StandalonePriceDeletedMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceDeletedMessageBuilder builder(final StandalonePriceDeletedMessage template) {
        return StandalonePriceDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceDeletedMessage(Function<StandalonePriceDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceDeletedMessage>";
            }
        };
    }
}
