
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
 *  <p>Generated after a successful Add Embedded Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceAddedMessage productPriceAddedMessage = ProductPriceAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variantId(0.3)
 *             .price(priceBuilder -> priceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceAddedMessageImpl.class)
public interface ProductPriceAddedMessage extends Message {

    String PRODUCT_PRICE_ADDED = "ProductPriceAdded";

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was added.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The Embedded Price that was added to the ProductVariant.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Price getPrice();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setPrice(final Price price);

    public void setStaged(final Boolean staged);

    public static ProductPriceAddedMessage of() {
        return new ProductPriceAddedMessageImpl();
    }

    public static ProductPriceAddedMessage of(final ProductPriceAddedMessage template) {
        ProductPriceAddedMessageImpl instance = new ProductPriceAddedMessageImpl();
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
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductPriceAddedMessageBuilder builder() {
        return ProductPriceAddedMessageBuilder.of();
    }

    public static ProductPriceAddedMessageBuilder builder(final ProductPriceAddedMessage template) {
        return ProductPriceAddedMessageBuilder.of(template);
    }

    default <T> T withProductPriceAddedMessage(Function<ProductPriceAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceAddedMessage>";
            }
        };
    }
}
