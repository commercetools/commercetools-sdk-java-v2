
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
 *     ProductVariantSelectionIncludeAllExcept productVariantSelectionIncludeAllExcept = ProductVariantSelectionIncludeAllExcept.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantSelectionIncludeAllExceptImpl.class)
public interface ProductVariantSelectionIncludeAllExcept extends ProductVariantSelection {

    String INCLUDE_ALL_EXCEPT = "includeAllExcept";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     * @return skus
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    @JsonIgnore
    public void setSkus(final String... skus);

    public void setSkus(final List<String> skus);

    public static ProductVariantSelectionIncludeAllExcept of() {
        return new ProductVariantSelectionIncludeAllExceptImpl();
    }

    public static ProductVariantSelectionIncludeAllExcept of(final ProductVariantSelectionIncludeAllExcept template) {
        ProductVariantSelectionIncludeAllExceptImpl instance = new ProductVariantSelectionIncludeAllExceptImpl();
        instance.setSkus(template.getSkus());
        return instance;
    }

    public static ProductVariantSelectionIncludeAllExceptBuilder builder() {
        return ProductVariantSelectionIncludeAllExceptBuilder.of();
    }

    public static ProductVariantSelectionIncludeAllExceptBuilder builder(
            final ProductVariantSelectionIncludeAllExcept template) {
        return ProductVariantSelectionIncludeAllExceptBuilder.of(template);
    }

    default <T> T withProductVariantSelectionIncludeAllExcept(
            Function<ProductVariantSelectionIncludeAllExcept, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionIncludeAllExcept> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelectionIncludeAllExcept>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelectionIncludeAllExcept>";
            }
        };
    }
}
