
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Only Product Variants with explicitly stated SKUs are part of the Product Selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionInclusion productVariantSelectionInclusion = ProductVariantSelectionInclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionInclusionImpl.class)
public interface ProductVariantSelectionInclusion extends ProductVariantSelection {

    String INCLUSION = "inclusion";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    @JsonIgnore
    public void setSkus(final String... skus);

    public void setSkus(final List<String> skus);

    public static ProductVariantSelectionInclusion of() {
        return new ProductVariantSelectionInclusionImpl();
    }

    public static ProductVariantSelectionInclusion of(final ProductVariantSelectionInclusion template) {
        ProductVariantSelectionInclusionImpl instance = new ProductVariantSelectionInclusionImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    public static ProductVariantSelectionInclusionBuilder builder() {
        return ProductVariantSelectionInclusionBuilder.of();
    }

    public static ProductVariantSelectionInclusionBuilder builder(final ProductVariantSelectionInclusion template) {
        return ProductVariantSelectionInclusionBuilder.of(template);
    }

    default <T> T withProductVariantSelectionInclusion(Function<ProductVariantSelectionInclusion, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionInclusion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionInclusion>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelectionInclusion>";
            }
        };
    }
}
