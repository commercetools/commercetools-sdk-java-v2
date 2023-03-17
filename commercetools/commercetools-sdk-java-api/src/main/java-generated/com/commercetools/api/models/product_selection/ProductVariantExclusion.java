
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Only Product Variants with the explicitly listed SKUs are part of the Product Selection of type Individual Exclusion.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantExclusion productVariantExclusion = ProductVariantExclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantExclusionImpl.class)
public interface ProductVariantExclusion {

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included in the Product Selection of type Individual Exclusion.</p>
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    @JsonIgnore
    public void setSkus(final String... skus);

    public void setSkus(final List<String> skus);

    public static ProductVariantExclusion of() {
        return new ProductVariantExclusionImpl();
    }

    public static ProductVariantExclusion of(final ProductVariantExclusion template) {
        ProductVariantExclusionImpl instance = new ProductVariantExclusionImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    public static ProductVariantExclusionBuilder builder() {
        return ProductVariantExclusionBuilder.of();
    }

    public static ProductVariantExclusionBuilder builder(final ProductVariantExclusion template) {
        return ProductVariantExclusionBuilder.of(template);
    }

    default <T> T withProductVariantExclusion(Function<ProductVariantExclusion, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantExclusion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantExclusion>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantExclusion>";
            }
        };
    }
}
