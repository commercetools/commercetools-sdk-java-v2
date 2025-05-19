
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
 *  <p>Generated after a successful Set Discounted Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceExternalDiscountSetMessage standalonePriceExternalDiscountSetMessage = StandalonePriceExternalDiscountSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("StandalonePriceExternalDiscountSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceExternalDiscountSetMessageImpl.class)
public interface StandalonePriceExternalDiscountSetMessage extends Message {

    /**
     * discriminator value for StandalonePriceExternalDiscountSetMessage
     */
    String STANDALONE_PRICE_EXTERNAL_DISCOUNT_SET = "StandalonePriceExternalDiscountSet";

    /**
     *  <p>The <code>discounted</code> value of the StandalonePrice after the Set Discounted Price update action.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>The <code>discounted</code> value of the StandalonePrice after the Set Discounted Price update action.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     * factory method
     * @return instance of StandalonePriceExternalDiscountSetMessage
     */
    public static StandalonePriceExternalDiscountSetMessage of() {
        return new StandalonePriceExternalDiscountSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceExternalDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceExternalDiscountSetMessage of(
            final StandalonePriceExternalDiscountSetMessage template) {
        StandalonePriceExternalDiscountSetMessageImpl instance = new StandalonePriceExternalDiscountSetMessageImpl();
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

    public StandalonePriceExternalDiscountSetMessage copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceExternalDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceExternalDiscountSetMessage deepCopy(
            @Nullable final StandalonePriceExternalDiscountSetMessage template) {
        if (template == null) {
            return null;
        }
        StandalonePriceExternalDiscountSetMessageImpl instance = new StandalonePriceExternalDiscountSetMessageImpl();
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
     * builder factory method for StandalonePriceExternalDiscountSetMessage
     * @return builder
     */
    public static StandalonePriceExternalDiscountSetMessageBuilder builder() {
        return StandalonePriceExternalDiscountSetMessageBuilder.of();
    }

    /**
     * create builder for StandalonePriceExternalDiscountSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceExternalDiscountSetMessageBuilder builder(
            final StandalonePriceExternalDiscountSetMessage template) {
        return StandalonePriceExternalDiscountSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceExternalDiscountSetMessage(
            Function<StandalonePriceExternalDiscountSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceExternalDiscountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceExternalDiscountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceExternalDiscountSetMessage>";
            }
        };
    }
}
