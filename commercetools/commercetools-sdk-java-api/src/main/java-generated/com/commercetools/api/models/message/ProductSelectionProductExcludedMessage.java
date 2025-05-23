
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Exclude Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductExcludedMessage productSelectionProductExcludedMessage = ProductSelectionProductExcludedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .variantExclusion(variantExclusionBuilder -> variantExclusionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSelectionProductExcluded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductExcludedMessageImpl.class)
public interface ProductSelectionProductExcludedMessage extends Message {

    /**
     * discriminator value for ProductSelectionProductExcludedMessage
     */
    String PRODUCT_SELECTION_PRODUCT_EXCLUDED = "ProductSelectionProductExcluded";

    /**
     *  <p>Product that was excluded from the Product Selection.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Exclusion after the Exclude Product update action.</p>
     * @return variantExclusion
     */
    @NotNull
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    /**
     *  <p>Product that was excluded from the Product Selection.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>Product Variant Exclusion after the Exclude Product update action.</p>
     * @param variantExclusion value to be set
     */

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    /**
     * factory method
     * @return instance of ProductSelectionProductExcludedMessage
     */
    public static ProductSelectionProductExcludedMessage of() {
        return new ProductSelectionProductExcludedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionProductExcludedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionProductExcludedMessage of(final ProductSelectionProductExcludedMessage template) {
        ProductSelectionProductExcludedMessageImpl instance = new ProductSelectionProductExcludedMessageImpl();
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
        instance.setProduct(template.getProduct());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public ProductSelectionProductExcludedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionProductExcludedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionProductExcludedMessage deepCopy(
            @Nullable final ProductSelectionProductExcludedMessage template) {
        if (template == null) {
            return null;
        }
        ProductSelectionProductExcludedMessageImpl instance = new ProductSelectionProductExcludedMessageImpl();
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
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantExclusion(com.commercetools.api.models.product_selection.ProductVariantExclusion
                .deepCopy(template.getVariantExclusion()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionProductExcludedMessage
     * @return builder
     */
    public static ProductSelectionProductExcludedMessageBuilder builder() {
        return ProductSelectionProductExcludedMessageBuilder.of();
    }

    /**
     * create builder for ProductSelectionProductExcludedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductExcludedMessageBuilder builder(
            final ProductSelectionProductExcludedMessage template) {
        return ProductSelectionProductExcludedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionProductExcludedMessage(
            Function<ProductSelectionProductExcludedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductExcludedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductExcludedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductExcludedMessage>";
            }
        };
    }
}
