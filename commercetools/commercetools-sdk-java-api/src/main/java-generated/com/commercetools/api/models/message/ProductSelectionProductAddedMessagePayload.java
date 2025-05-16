
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
 *     ProductSelectionProductAddedMessagePayload productSelectionProductAddedMessagePayload = ProductSelectionProductAddedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantSelection(variantSelectionBuilder -> variantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSelectionProductAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductAddedMessagePayloadImpl.class)
public interface ProductSelectionProductAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductSelectionProductAddedMessagePayload
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
     * @return instance of ProductSelectionProductAddedMessagePayload
     */
    public static ProductSelectionProductAddedMessagePayload of() {
        return new ProductSelectionProductAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionProductAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionProductAddedMessagePayload of(
            final ProductSelectionProductAddedMessagePayload template) {
        ProductSelectionProductAddedMessagePayloadImpl instance = new ProductSelectionProductAddedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantSelection(template.getVariantSelection());
        return instance;
    }

    public ProductSelectionProductAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionProductAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionProductAddedMessagePayload deepCopy(
            @Nullable final ProductSelectionProductAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductSelectionProductAddedMessagePayloadImpl instance = new ProductSelectionProductAddedMessagePayloadImpl();
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getVariantSelection()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionProductAddedMessagePayload
     * @return builder
     */
    public static ProductSelectionProductAddedMessagePayloadBuilder builder() {
        return ProductSelectionProductAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductSelectionProductAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductAddedMessagePayloadBuilder builder(
            final ProductSelectionProductAddedMessagePayload template) {
        return ProductSelectionProductAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionProductAddedMessagePayload(
            Function<ProductSelectionProductAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductAddedMessagePayload>";
            }
        };
    }
}
