
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
 *  <p>Generated after a successful Set Variant Selection update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantSelectionChangedMessage productSelectionVariantSelectionChangedMessage = ProductSelectionVariantSelectionChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .oldVariantSelection(oldVariantSelectionBuilder -> oldVariantSelectionBuilder)
 *             .newVariantSelection(newVariantSelectionBuilder -> newVariantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSelectionVariantSelectionChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionVariantSelectionChangedMessageImpl.class)
public interface ProductSelectionVariantSelectionChangedMessage extends Message {

    /**
     * discriminator value for ProductSelectionVariantSelectionChangedMessage
     */
    String PRODUCT_SELECTION_VARIANT_SELECTION_CHANGED = "ProductSelectionVariantSelectionChanged";

    /**
     *  <p>Product for which the Product Variant Selection changed.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Selection before the Set Variant Selection update action.</p>
     * @return oldVariantSelection
     */
    @NotNull
    @Valid
    @JsonProperty("oldVariantSelection")
    public ProductVariantSelection getOldVariantSelection();

    /**
     *  <p>Product Variant Selection after the Set Variant Selection update action.</p>
     * @return newVariantSelection
     */
    @NotNull
    @Valid
    @JsonProperty("newVariantSelection")
    public ProductVariantSelection getNewVariantSelection();

    /**
     *  <p>Product for which the Product Variant Selection changed.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>Product Variant Selection before the Set Variant Selection update action.</p>
     * @param oldVariantSelection value to be set
     */

    public void setOldVariantSelection(final ProductVariantSelection oldVariantSelection);

    /**
     *  <p>Product Variant Selection after the Set Variant Selection update action.</p>
     * @param newVariantSelection value to be set
     */

    public void setNewVariantSelection(final ProductVariantSelection newVariantSelection);

    /**
     * factory method
     * @return instance of ProductSelectionVariantSelectionChangedMessage
     */
    public static ProductSelectionVariantSelectionChangedMessage of() {
        return new ProductSelectionVariantSelectionChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionVariantSelectionChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionVariantSelectionChangedMessage of(
            final ProductSelectionVariantSelectionChangedMessage template) {
        ProductSelectionVariantSelectionChangedMessageImpl instance = new ProductSelectionVariantSelectionChangedMessageImpl();
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
        instance.setOldVariantSelection(template.getOldVariantSelection());
        instance.setNewVariantSelection(template.getNewVariantSelection());
        return instance;
    }

    public ProductSelectionVariantSelectionChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionVariantSelectionChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionVariantSelectionChangedMessage deepCopy(
            @Nullable final ProductSelectionVariantSelectionChangedMessage template) {
        if (template == null) {
            return null;
        }
        ProductSelectionVariantSelectionChangedMessageImpl instance = new ProductSelectionVariantSelectionChangedMessageImpl();
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
        instance.setOldVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getOldVariantSelection()));
        instance.setNewVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getNewVariantSelection()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionVariantSelectionChangedMessage
     * @return builder
     */
    public static ProductSelectionVariantSelectionChangedMessageBuilder builder() {
        return ProductSelectionVariantSelectionChangedMessageBuilder.of();
    }

    /**
     * create builder for ProductSelectionVariantSelectionChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionVariantSelectionChangedMessageBuilder builder(
            final ProductSelectionVariantSelectionChangedMessage template) {
        return ProductSelectionVariantSelectionChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionVariantSelectionChangedMessage(
            Function<ProductSelectionVariantSelectionChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantSelectionChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantSelectionChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionVariantSelectionChangedMessage>";
            }
        };
    }
}
