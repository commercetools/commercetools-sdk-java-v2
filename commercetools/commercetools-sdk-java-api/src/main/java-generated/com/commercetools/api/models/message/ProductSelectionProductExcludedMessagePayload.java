
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
 *  <p>Generated after a successful Exclude Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductExcludedMessagePayload productSelectionProductExcludedMessagePayload = ProductSelectionProductExcludedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantExclusion(variantExclusionBuilder -> variantExclusionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductExcludedMessagePayloadImpl.class)
public interface ProductSelectionProductExcludedMessagePayload extends MessagePayload {

    String PRODUCT_SELECTION_PRODUCT_EXCLUDED = "ProductSelectionProductExcluded";

    /**
     *  <p>Product that was excluded from the Product Selection.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Exclusion after the Exclude Product update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    public void setProduct(final ProductReference product);

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    public static ProductSelectionProductExcludedMessagePayload of() {
        return new ProductSelectionProductExcludedMessagePayloadImpl();
    }

    public static ProductSelectionProductExcludedMessagePayload of(
            final ProductSelectionProductExcludedMessagePayload template) {
        ProductSelectionProductExcludedMessagePayloadImpl instance = new ProductSelectionProductExcludedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public static ProductSelectionProductExcludedMessagePayloadBuilder builder() {
        return ProductSelectionProductExcludedMessagePayloadBuilder.of();
    }

    public static ProductSelectionProductExcludedMessagePayloadBuilder builder(
            final ProductSelectionProductExcludedMessagePayload template) {
        return ProductSelectionProductExcludedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductSelectionProductExcludedMessagePayload(
            Function<ProductSelectionProductExcludedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductExcludedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductExcludedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductExcludedMessagePayload>";
            }
        };
    }
}
