
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
 *  <p>Generated after a successful Set Embedded Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceSetMessage productPriceSetMessage = ProductPriceSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variantId(0.3)
 *             .plusPrices(pricesBuilder -> pricesBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceSetMessageImpl.class)
public interface ProductPriceSetMessage extends Message {

    String PRODUCT_PRICE_SET = "ProductPriceSet";

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was set.</p>
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<Price> getPrices();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    @JsonIgnore
    public void setPrices(final Price... prices);

    public void setPrices(final List<Price> prices);

    public void setStaged(final Boolean staged);

    public static ProductPriceSetMessage of() {
        return new ProductPriceSetMessageImpl();
    }

    public static ProductPriceSetMessage of(final ProductPriceSetMessage template) {
        ProductPriceSetMessageImpl instance = new ProductPriceSetMessageImpl();
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
        instance.setPrices(template.getPrices());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductPriceSetMessageBuilder builder() {
        return ProductPriceSetMessageBuilder.of();
    }

    public static ProductPriceSetMessageBuilder builder(final ProductPriceSetMessage template) {
        return ProductPriceSetMessageBuilder.of(template);
    }

    default <T> T withProductPriceSetMessage(Function<ProductPriceSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceSetMessage>";
            }
        };
    }
}
