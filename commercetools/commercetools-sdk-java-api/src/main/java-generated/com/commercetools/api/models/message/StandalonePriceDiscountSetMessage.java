
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.DiscountedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a Product Discount is successfully applied to a StandalonePrice.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDiscountSetMessage standalonePriceDiscountSetMessage = StandalonePriceDiscountSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceDiscountSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceDiscountSetMessageImpl.class)
public interface StandalonePriceDiscountSetMessage extends Message {

    /**
     * discriminator value for StandalonePriceDiscountSetMessage
     */
    String STANDALONE_PRICE_DISCOUNT_SET = "StandalonePriceDiscountSet";

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     * factory method
     * @return instance of StandalonePriceDiscountSetMessage
     */
    public static StandalonePriceDiscountSetMessage of() {
        return new StandalonePriceDiscountSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceDiscountSetMessage of(final StandalonePriceDiscountSetMessage template) {
        StandalonePriceDiscountSetMessageImpl instance = new StandalonePriceDiscountSetMessageImpl();
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
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    public StandalonePriceDiscountSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceDiscountSetMessage deepCopy(
            @Nullable final StandalonePriceDiscountSetMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceDiscountSetMessageImpl instance = new StandalonePriceDiscountSetMessageImpl();
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
        instance.setDiscounted(com.commercetools.api.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceDiscountSetMessage
     * @return builder
     */
    public static StandalonePriceDiscountSetMessageBuilder builder() {
        return StandalonePriceDiscountSetMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceDiscountSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceDiscountSetMessageBuilder builder(final StandalonePriceDiscountSetMessage template) {
        return StandalonePriceDiscountSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceDiscountSetMessage(Function<StandalonePriceDiscountSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDiscountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDiscountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceDiscountSetMessage>";
            }
        };
    }
}
