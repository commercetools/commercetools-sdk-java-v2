
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
 *     ProductSelectionVariantSelectionChangedMessagePayload productSelectionVariantSelectionChangedMessagePayload = ProductSelectionVariantSelectionChangedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .oldVariantSelection(oldVariantSelectionBuilder -> oldVariantSelectionBuilder)
 *             .newVariantSelection(newVariantSelectionBuilder -> newVariantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSelectionVariantSelectionChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionVariantSelectionChangedMessagePayloadImpl.class)
public interface ProductSelectionVariantSelectionChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductSelectionVariantSelectionChangedMessagePayload
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
     * @return instance of ProductSelectionVariantSelectionChangedMessagePayload
     */
    public static ProductSelectionVariantSelectionChangedMessagePayload of() {
        return new ProductSelectionVariantSelectionChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionVariantSelectionChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionVariantSelectionChangedMessagePayload of(
            final ProductSelectionVariantSelectionChangedMessagePayload template) {
        ProductSelectionVariantSelectionChangedMessagePayloadImpl instance = new ProductSelectionVariantSelectionChangedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        instance.setOldVariantSelection(template.getOldVariantSelection());
        instance.setNewVariantSelection(template.getNewVariantSelection());
        return instance;
    }

    public ProductSelectionVariantSelectionChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionVariantSelectionChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionVariantSelectionChangedMessagePayload deepCopy(
            @Nullable final ProductSelectionVariantSelectionChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductSelectionVariantSelectionChangedMessagePayloadImpl instance = new ProductSelectionVariantSelectionChangedMessagePayloadImpl();
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setOldVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getOldVariantSelection()));
        instance.setNewVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getNewVariantSelection()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionVariantSelectionChangedMessagePayload
     * @return builder
     */
    public static ProductSelectionVariantSelectionChangedMessagePayloadBuilder builder() {
        return ProductSelectionVariantSelectionChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductSelectionVariantSelectionChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionVariantSelectionChangedMessagePayloadBuilder builder(
            final ProductSelectionVariantSelectionChangedMessagePayload template) {
        return ProductSelectionVariantSelectionChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionVariantSelectionChangedMessagePayload(
            Function<ProductSelectionVariantSelectionChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantSelectionChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantSelectionChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionVariantSelectionChangedMessagePayload>";
            }
        };
    }
}
