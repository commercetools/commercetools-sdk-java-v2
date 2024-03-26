
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchMatchingVariants
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchMatchingVariants productSearchMatchingVariants = ProductSearchMatchingVariants.builder()
 *             .allMatched(true)
 *             .plusMatchedVariants(matchedVariantsBuilder -> matchedVariantsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchMatchingVariantsImpl.class)
public interface ProductSearchMatchingVariants {

    /**
     *  <p>Whether the search criteria definitely matches for all Variants of the returned Product, like for Product-level fields. Is always <code>false</code> for search expressions on Variant-level fields.</p>
     * @return allMatched
     */
    @NotNull
    @JsonProperty("allMatched")
    public Boolean getAllMatched();

    /**
     *  <p>The variants matching the search criteria or empty if all matched.</p>
     * @return matchedVariants
     */
    @NotNull
    @Valid
    @JsonProperty("matchedVariants")
    public List<ProductSearchMatchingVariantEntry> getMatchedVariants();

    /**
     *  <p>Whether the search criteria definitely matches for all Variants of the returned Product, like for Product-level fields. Is always <code>false</code> for search expressions on Variant-level fields.</p>
     * @param allMatched value to be set
     */

    public void setAllMatched(final Boolean allMatched);

    /**
     *  <p>The variants matching the search criteria or empty if all matched.</p>
     * @param matchedVariants values to be set
     */

    @JsonIgnore
    public void setMatchedVariants(final ProductSearchMatchingVariantEntry... matchedVariants);

    /**
     *  <p>The variants matching the search criteria or empty if all matched.</p>
     * @param matchedVariants values to be set
     */

    public void setMatchedVariants(final List<ProductSearchMatchingVariantEntry> matchedVariants);

    /**
     * factory method
     * @return instance of ProductSearchMatchingVariants
     */
    public static ProductSearchMatchingVariants of() {
        return new ProductSearchMatchingVariantsImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchMatchingVariants
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchMatchingVariants of(final ProductSearchMatchingVariants template) {
        ProductSearchMatchingVariantsImpl instance = new ProductSearchMatchingVariantsImpl();
        instance.setAllMatched(template.getAllMatched());
        instance.setMatchedVariants(template.getMatchedVariants());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchMatchingVariants
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchMatchingVariants deepCopy(@Nullable final ProductSearchMatchingVariants template) {
        if (template == null) {
            return null;
        }
        ProductSearchMatchingVariantsImpl instance = new ProductSearchMatchingVariantsImpl();
        instance.setAllMatched(template.getAllMatched());
        instance.setMatchedVariants(Optional.ofNullable(template.getMatchedVariants())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSearchMatchingVariants
     * @return builder
     */
    public static ProductSearchMatchingVariantsBuilder builder() {
        return ProductSearchMatchingVariantsBuilder.of();
    }

    /**
     * create builder for ProductSearchMatchingVariants instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchMatchingVariantsBuilder builder(final ProductSearchMatchingVariants template) {
        return ProductSearchMatchingVariantsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchMatchingVariants(Function<ProductSearchMatchingVariants, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchMatchingVariants> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchMatchingVariants>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchMatchingVariants>";
            }
        };
    }
}
