
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Embedded Price update action.</p>
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

    public void setVariantId(final Long variantId);

    public void setOldPrice(final Price oldPrice);

    public void setNewPrice(final Price newPrice);

    public void setStaged(final Boolean staged);

    public void setOldStagedPrice(final Price oldStagedPrice);

    public static ProductPriceChangedMessage of() {
        return new ProductPriceChangedMessageImpl();
    }

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

    public static ProductPriceChangedMessageBuilder builder() {
        return ProductPriceChangedMessageBuilder.of();
    }

    public static ProductPriceChangedMessageBuilder builder(final ProductPriceChangedMessage template) {
        return ProductPriceChangedMessageBuilder.of(template);
    }

    default <T> T withProductPriceChangedMessage(Function<ProductPriceChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceChangedMessage>";
            }
        };
    }
}
