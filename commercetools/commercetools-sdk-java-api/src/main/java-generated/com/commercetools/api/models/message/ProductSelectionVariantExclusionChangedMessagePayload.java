
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Variant Exclusion update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantExclusionChangedMessagePayload productSelectionVariantExclusionChangedMessagePayload = ProductSelectionVariantExclusionChangedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .oldVariantExclusion(oldVariantExclusionBuilder -> oldVariantExclusionBuilder)
 *             .newVariantExclusion(newVariantExclusionBuilder -> newVariantExclusionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionVariantExclusionChangedMessagePayloadImpl.class)
public interface ProductSelectionVariantExclusionChangedMessagePayload extends MessagePayload {

    String PRODUCT_SELECTION_VARIANT_EXCLUSION_CHANGED = "ProductSelectionVariantExclusionChanged";

    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @return oldVariantExclusion
     */
    @NotNull
    @Valid
    @JsonProperty("oldVariantExclusion")
    public ProductVariantExclusion getOldVariantExclusion();

    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @return newVariantExclusion
     */
    @NotNull
    @Valid
    @JsonProperty("newVariantExclusion")
    public ProductVariantExclusion getNewVariantExclusion();

    public void setProduct(final ProductReference product);

    public void setOldVariantExclusion(final ProductVariantExclusion oldVariantExclusion);

    public void setNewVariantExclusion(final ProductVariantExclusion newVariantExclusion);

    public static ProductSelectionVariantExclusionChangedMessagePayload of() {
        return new ProductSelectionVariantExclusionChangedMessagePayloadImpl();
    }

    public static ProductSelectionVariantExclusionChangedMessagePayload of(
            final ProductSelectionVariantExclusionChangedMessagePayload template) {
        ProductSelectionVariantExclusionChangedMessagePayloadImpl instance = new ProductSelectionVariantExclusionChangedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        instance.setOldVariantExclusion(template.getOldVariantExclusion());
        instance.setNewVariantExclusion(template.getNewVariantExclusion());
        return instance;
    }

    public static ProductSelectionVariantExclusionChangedMessagePayloadBuilder builder() {
        return ProductSelectionVariantExclusionChangedMessagePayloadBuilder.of();
    }

    public static ProductSelectionVariantExclusionChangedMessagePayloadBuilder builder(
            final ProductSelectionVariantExclusionChangedMessagePayload template) {
        return ProductSelectionVariantExclusionChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductSelectionVariantExclusionChangedMessagePayload(
            Function<ProductSelectionVariantExclusionChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantExclusionChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantExclusionChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionVariantExclusionChangedMessagePayload>";
            }
        };
    }
}
