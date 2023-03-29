
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a Price is updated due to a Product Discount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceDiscountsSetMessage productPriceDiscountsSetMessage = ProductPriceDiscountsSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusUpdatedPrices(updatedPricesBuilder -> updatedPricesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceDiscountsSetMessageImpl.class)
public interface ProductPriceDiscountsSetMessage extends Message {

    /**
     * discriminator value for ProductPriceDiscountsSetMessage
     */
    String PRODUCT_PRICE_DISCOUNTS_SET = "ProductPriceDiscountsSet";

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @return updatedPrices
     */
    @NotNull
    @Valid
    @JsonProperty("updatedPrices")
    public List<ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices();

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @param updatedPrices values to be set
     */

    @JsonIgnore
    public void setUpdatedPrices(final ProductPriceDiscountsSetUpdatedPrice... updatedPrices);

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     * @param updatedPrices values to be set
     */

    public void setUpdatedPrices(final List<ProductPriceDiscountsSetUpdatedPrice> updatedPrices);

    /**
     * factory method
     * @return instance of ProductPriceDiscountsSetMessage
     */
    public static ProductPriceDiscountsSetMessage of() {
        return new ProductPriceDiscountsSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceDiscountsSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceDiscountsSetMessage of(final ProductPriceDiscountsSetMessage template) {
        ProductPriceDiscountsSetMessageImpl instance = new ProductPriceDiscountsSetMessageImpl();
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
        instance.setUpdatedPrices(template.getUpdatedPrices());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceDiscountsSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceDiscountsSetMessage deepCopy(@Nullable final ProductPriceDiscountsSetMessage template) {
        if (template == null) {
            return null;
        }
        ProductPriceDiscountsSetMessageImpl instance = new ProductPriceDiscountsSetMessageImpl();
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
        instance.setUpdatedPrices(Optional.ofNullable(template.getUpdatedPrices())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductPriceDiscountsSetMessage
     * @return builder
     */
    public static ProductPriceDiscountsSetMessageBuilder builder() {
        return ProductPriceDiscountsSetMessageBuilder.of();
    }

    /**
     * create builder for ProductPriceDiscountsSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceDiscountsSetMessageBuilder builder(final ProductPriceDiscountsSetMessage template) {
        return ProductPriceDiscountsSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceDiscountsSetMessage(Function<ProductPriceDiscountsSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceDiscountsSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceDiscountsSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceDiscountsSetMessage>";
            }
        };
    }
}
