
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Polymorphic base type for Product Variant Selections. The actual type is determined by the <code>type</code> field.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelection productVariantSelection = ProductVariantSelection.exclusionBuilder()
 *             plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductVariantSelectionExclusionImpl.class, name = ProductVariantSelectionExclusion.EXCLUSION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.ProductVariantSelectionInclusionImpl.class, name = ProductVariantSelectionInclusion.INCLUSION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ProductVariantSelectionImpl.class, visible = true)
@JsonDeserialize(as = ProductVariantSelectionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductVariantSelection {

    /**
     *  <p>Determines whether the SKUs are to be included in, or excluded from, the Product Selection.</p>
     */
    @NotNull
    @JsonProperty("type")
    public ProductVariantSelectionTypeEnum getType();

    public static com.commercetools.api.models.product_selection.ProductVariantSelectionExclusionBuilder exclusionBuilder() {
        return com.commercetools.api.models.product_selection.ProductVariantSelectionExclusionBuilder.of();
    }

    public static com.commercetools.api.models.product_selection.ProductVariantSelectionInclusionBuilder inclusionBuilder() {
        return com.commercetools.api.models.product_selection.ProductVariantSelectionInclusionBuilder.of();
    }

    default <T> T withProductVariantSelection(Function<ProductVariantSelection, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantSelection>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantSelection>";
            }
        };
    }
}
