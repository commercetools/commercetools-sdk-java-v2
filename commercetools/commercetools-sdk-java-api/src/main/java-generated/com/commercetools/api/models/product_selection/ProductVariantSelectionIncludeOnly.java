
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
 *     ProductVariantSelectionIncludeOnly productVariantSelectionIncludeOnly = ProductVariantSelectionIncludeOnly.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionIncludeOnlyImpl.class)
public interface ProductVariantSelectionIncludeOnly extends ProductVariantSelection {

    String INCLUDE_ONLY = "includeOnly";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included into the Product Selection.</p>
     * @return skus
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    @JsonIgnore
    public void setSkus(final String... skus);

    public void setSkus(final List<String> skus);

    public static ProductVariantSelectionIncludeOnly of() {
        return new ProductVariantSelectionIncludeOnlyImpl();
    }

    public static ProductVariantSelectionIncludeOnly of(final ProductVariantSelectionIncludeOnly template) {
        ProductVariantSelectionIncludeOnlyImpl instance = new ProductVariantSelectionIncludeOnlyImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    public static ProductVariantSelectionIncludeOnlyBuilder builder() {
        return ProductVariantSelectionIncludeOnlyBuilder.of();
    }

    public static ProductVariantSelectionIncludeOnlyBuilder builder(final ProductVariantSelectionIncludeOnly template) {
        return ProductVariantSelectionIncludeOnlyBuilder.of(template);
    }

    default <T> T withProductVariantSelectionIncludeOnly(Function<ProductVariantSelectionIncludeOnly, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionIncludeOnly> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionIncludeOnly>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelectionIncludeOnly>";
            }
        };
    }
}
