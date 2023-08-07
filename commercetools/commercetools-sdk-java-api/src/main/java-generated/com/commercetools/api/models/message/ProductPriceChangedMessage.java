
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceChangedMessage productPriceChangedMessage = ProductPriceChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variantId(0.3)
 *             .oldPrice(oldPriceBuilder -> oldPriceBuilder)
 *             .newPrice(newPriceBuilder -> newPriceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceChangedMessageImpl.class)
public interface ProductPriceChangedMessage extends Message {

    /**
     * discriminator value for ProductPriceChangedMessage
     */
    String PRODUCT_PRICE_CHANGED = "ProductPriceChanged";

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was changed.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @return oldPrice
     */
    @NotNull
    @Valid
    @JsonProperty("oldPrice")
    public Price getOldPrice();

    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @return newPrice
     */
    @NotNull
    @Valid
    @JsonProperty("newPrice")
    public Price getNewPrice();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @return oldStagedPrice
     */
    @Valid
    @JsonProperty("oldStagedPrice")
    public Price getOldStagedPrice();

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was changed.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @param oldPrice value to be set
     */

    public void setOldPrice(final Price oldPrice);

    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @param newPrice value to be set
     */

    public void setNewPrice(final Price newPrice);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @param oldStagedPrice value to be set
     */

    public void setOldStagedPrice(final Price oldStagedPrice);

    /**
     * factory method
     * @return instance of ProductPriceChangedMessage
     */
    public static ProductPriceChangedMessage of() {
        return new ProductPriceChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceChangedMessage of(final ProductPriceChangedMessage template) {
        ProductPriceChangedMessageImpl instance = new ProductPriceChangedMessageImpl();
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
        instance.setVariantId(template.getVariantId());
        instance.setOldPrice(template.getOldPrice());
        instance.setNewPrice(template.getNewPrice());
        instance.setStaged(template.getStaged());
        instance.setOldStagedPrice(template.getOldStagedPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceChangedMessage deepCopy(@Nullable final ProductPriceChangedMessage template) {
        if (template == null) {
            return null;
        }
        ProductPriceChangedMessageImpl instance = new ProductPriceChangedMessageImpl();
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
        instance.setVariantId(template.getVariantId());
        instance.setOldPrice(com.commercetools.api.models.common.Price.deepCopy(template.getOldPrice()));
        instance.setNewPrice(com.commercetools.api.models.common.Price.deepCopy(template.getNewPrice()));
        instance.setStaged(template.getStaged());
        instance.setOldStagedPrice(com.commercetools.api.models.common.Price.deepCopy(template.getOldStagedPrice()));
        return instance;
    }

    /**
     * builder factory method for ProductPriceChangedMessage
     * @return builder
     */
    public static ProductPriceChangedMessageBuilder builder() {
        return ProductPriceChangedMessageBuilder.of();
    }

    /**
     * create builder for ProductPriceChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceChangedMessageBuilder builder(final ProductPriceChangedMessage template) {
        return ProductPriceChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceChangedMessage(Function<ProductPriceChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceChangedMessage>";
            }
        };
    }
}
