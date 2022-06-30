
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>All Product Variants except the explicitly stated SKUs are part of the Product Selection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionExclusion productVariantSelectionExclusion = ProductVariantSelectionExclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionExclusionImpl.class)
public interface ProductVariantSelectionExclusion extends ProductVariantSelection {

    String EXCLUSION = "exclusion";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    @JsonIgnore
    public void setSkus(final String... skus);

    public void setSkus(final List<String> skus);

    public static ProductVariantSelectionExclusion of() {
        return new ProductVariantSelectionExclusionImpl();
    }

    public static ProductVariantSelectionExclusion of(final ProductVariantSelectionExclusion template) {
        ProductVariantSelectionExclusionImpl instance = new ProductVariantSelectionExclusionImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    public static ProductVariantSelectionExclusionBuilder builder() {
        return ProductVariantSelectionExclusionBuilder.of();
    }

    public static ProductVariantSelectionExclusionBuilder builder(final ProductVariantSelectionExclusion template) {
        return ProductVariantSelectionExclusionBuilder.of(template);
    }

    default <T> T withProductVariantSelectionExclusion(Function<ProductVariantSelectionExclusion, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionExclusion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionExclusion>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelectionExclusion>";
            }
        };
    }
}
