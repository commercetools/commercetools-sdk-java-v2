
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchHit
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchHit productSearchHit = ProductSearchHit.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchHitImpl.class)
public interface ProductSearchHit {

    /**
     *  <p>Unique identifier of the Product.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains Product Projection data for Products matching the <code>projection</code> field in the Search Products request.</p>
     * @return productProjection
     */
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @return matchingVariants
     */
    @Valid
    @JsonProperty("matchingVariants")
    public List<ProductSearchMatchingVariant> getMatchingVariants();

    /**
     *  <p>Unique identifier of the Product.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Contains Product Projection data for Products matching the <code>projection</code> field in the Search Products request.</p>
     * @param productProjection value to be set
     */

    public void setProductProjection(final ProductProjection productProjection);

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @param matchingVariants values to be set
     */

    @JsonIgnore
    public void setMatchingVariants(final ProductSearchMatchingVariant... matchingVariants);

    /**
     *  <p>Contains a list of identifiers (id and SKU) of the matching variants.</p>
     * @param matchingVariants values to be set
     */

    public void setMatchingVariants(final List<ProductSearchMatchingVariant> matchingVariants);

    /**
     * factory method
     * @return instance of ProductSearchHit
     */
    public static ProductSearchHit of() {
        return new ProductSearchHitImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchHit
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchHit of(final ProductSearchHit template) {
        ProductSearchHitImpl instance = new ProductSearchHitImpl();
        instance.setId(template.getId());
        instance.setProductProjection(template.getProductProjection());
        instance.setMatchingVariants(template.getMatchingVariants());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchHit
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchHit deepCopy(@Nullable final ProductSearchHit template) {
        if (template == null) {
            return null;
        }
        ProductSearchHitImpl instance = new ProductSearchHitImpl();
        instance.setId(template.getId());
        instance.setProductProjection(
            com.commercetools.api.models.product.ProductProjection.deepCopy(template.getProductProjection()));
        instance.setMatchingVariants(Optional.ofNullable(template.getMatchingVariants())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchMatchingVariant::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSearchHit
     * @return builder
     */
    public static ProductSearchHitBuilder builder() {
        return ProductSearchHitBuilder.of();
    }

    /**
     * create builder for ProductSearchHit instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchHitBuilder builder(final ProductSearchHit template) {
        return ProductSearchHitBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchHit(Function<ProductSearchHit, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchHit> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchHit>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchHit>";
            }
        };
    }
}
