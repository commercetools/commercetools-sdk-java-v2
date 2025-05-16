
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductAddedMessage productSelectionProductAddedMessage = ProductSelectionProductAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .variantSelection(variantSelectionBuilder -> variantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSelectionProductAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductAddedMessageImpl.class)
public interface ProductSelectionProductAddedMessage extends Message {

    /**
     * discriminator value for ProductSelectionProductAddedMessage
     */
    String PRODUCT_SELECTION_PRODUCT_ADDED = "ProductSelectionProductAdded";

    /**
     *  <p>Product that was added to the Product Selection.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Selection after the Add Product update action.</p>
     * @return variantSelection
     */
    @NotNull
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    /**
     *  <p>Product that was added to the Product Selection.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>Product Variant Selection after the Add Product update action.</p>
     * @param variantSelection value to be set
     */

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    /**
     * factory method
     * @return instance of ProductSelectionProductAddedMessage
     */
    public static ProductSelectionProductAddedMessage of() {
        return new ProductSelectionProductAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionProductAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionProductAddedMessage of(final ProductSelectionProductAddedMessage template) {
        ProductSelectionProductAddedMessageImpl instance = new ProductSelectionProductAddedMessageImpl();
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
        instance.setVariantSelection(template.getVariantSelection());
        return instance;
    }

    public ProductSelectionProductAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionProductAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionProductAddedMessage deepCopy(
            @Nullable final ProductSelectionProductAddedMessage template) {
        if (template == null) {
            return null;
        }
        ProductSelectionProductAddedMessageImpl instance = new ProductSelectionProductAddedMessageImpl();
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
        instance.setVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getVariantSelection()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionProductAddedMessage
     * @return builder
     */
    public static ProductSelectionProductAddedMessageBuilder builder() {
        return ProductSelectionProductAddedMessageBuilder.of();
    }

    /**
     * create builder for ProductSelectionProductAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductAddedMessageBuilder builder(
            final ProductSelectionProductAddedMessage template) {
        return ProductSelectionProductAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionProductAddedMessage(Function<ProductSelectionProductAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductAddedMessage>";
            }
        };
    }
}
