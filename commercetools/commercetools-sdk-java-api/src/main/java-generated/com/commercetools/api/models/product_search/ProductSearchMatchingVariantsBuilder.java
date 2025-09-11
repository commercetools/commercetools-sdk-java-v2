
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchMatchingVariantsBuilder
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
public class ProductSearchMatchingVariantsBuilder implements Builder<ProductSearchMatchingVariants> {

    private Boolean allMatched;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry> matchedVariants;

    /**
     *  <p><code>true</code> if all Variants of the returned Product match the search query, or if search query does not specify any expression for a <span>Product Variant field</span>.</p>
     *  <p><code>false</code> if only a subset of the Product Variants match the search query.</p>
     *  <p>Is always <code>false</code> for query expressions on Product Variant fields.</p>
     * @param allMatched value to be set
     * @return Builder
     */

    public ProductSearchMatchingVariantsBuilder allMatched(final Boolean allMatched) {
        this.allMatched = allMatched;
        return this;
    }

    /**
     *  <p>Identifiers of the Product Variants that match the search query.</p>
     *  <p>Empty if all Product Variants of the returned Product match.</p>
     * @param matchedVariants value to be set
     * @return Builder
     */

    public ProductSearchMatchingVariantsBuilder matchedVariants(
            final com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry... matchedVariants) {
        this.matchedVariants = new ArrayList<>(Arrays.asList(matchedVariants));
        return this;
    }

    /**
     *  <p>Identifiers of the Product Variants that match the search query.</p>
     *  <p>Empty if all Product Variants of the returned Product match.</p>
     * @param matchedVariants value to be set
     * @return Builder
     */

    public ProductSearchMatchingVariantsBuilder matchedVariants(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry> matchedVariants) {
        this.matchedVariants = matchedVariants;
        return this;
    }

    /**
     *  <p>Identifiers of the Product Variants that match the search query.</p>
     *  <p>Empty if all Product Variants of the returned Product match.</p>
     * @param matchedVariants value to be set
     * @return Builder
     */

    public ProductSearchMatchingVariantsBuilder plusMatchedVariants(
            final com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry... matchedVariants) {
        if (this.matchedVariants == null) {
            this.matchedVariants = new ArrayList<>();
        }
        this.matchedVariants.addAll(Arrays.asList(matchedVariants));
        return this;
    }

    /**
     *  <p>Identifiers of the Product Variants that match the search query.</p>
     *  <p>Empty if all Product Variants of the returned Product match.</p>
     * @param builder function to build the matchedVariants value
     * @return Builder
     */

    public ProductSearchMatchingVariantsBuilder plusMatchedVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder> builder) {
        if (this.matchedVariants == null) {
            this.matchedVariants = new ArrayList<>();
        }
        this.matchedVariants.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Identifiers of the Product Variants that match the search query.</p>
     *  <p>Empty if all Product Variants of the returned Product match.</p>
     * @param builder function to build the matchedVariants value
     * @return Builder
     */

    public ProductSearchMatchingVariantsBuilder withMatchedVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder> builder) {
        this.matchedVariants = new ArrayList<>();
        this.matchedVariants.add(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Identifiers of the Product Variants that match the search query.</p>
     *  <p>Empty if all Product Variants of the returned Product match.</p>
     * @param builder function to build the matchedVariants value
     * @return Builder
     */

    public ProductSearchMatchingVariantsBuilder addMatchedVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry> builder) {
        return plusMatchedVariants(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder.of()));
    }

    /**
     *  <p>Identifiers of the Product Variants that match the search query.</p>
     *  <p>Empty if all Product Variants of the returned Product match.</p>
     * @param builder function to build the matchedVariants value
     * @return Builder
     */

    public ProductSearchMatchingVariantsBuilder setMatchedVariants(
            Function<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder, com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry> builder) {
        return matchedVariants(
            builder.apply(com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntryBuilder.of()));
    }

    /**
     *  <p><code>true</code> if all Variants of the returned Product match the search query, or if search query does not specify any expression for a <span>Product Variant field</span>.</p>
     *  <p><code>false</code> if only a subset of the Product Variants match the search query.</p>
     *  <p>Is always <code>false</code> for query expressions on Product Variant fields.</p>
     * @return allMatched
     */

    public Boolean getAllMatched() {
        return this.allMatched;
    }

    /**
     *  <p>Identifiers of the Product Variants that match the search query.</p>
     *  <p>Empty if all Product Variants of the returned Product match.</p>
     * @return matchedVariants
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry> getMatchedVariants() {
        return this.matchedVariants;
    }

    /**
     * builds ProductSearchMatchingVariants with checking for non-null required values
     * @return ProductSearchMatchingVariants
     */
    public ProductSearchMatchingVariants build() {
        Objects.requireNonNull(allMatched, ProductSearchMatchingVariants.class + ": allMatched is missing");
        Objects.requireNonNull(matchedVariants, ProductSearchMatchingVariants.class + ": matchedVariants is missing");
        return new ProductSearchMatchingVariantsImpl(allMatched, matchedVariants);
    }

    /**
     * builds ProductSearchMatchingVariants without checking for non-null required values
     * @return ProductSearchMatchingVariants
     */
    public ProductSearchMatchingVariants buildUnchecked() {
        return new ProductSearchMatchingVariantsImpl(allMatched, matchedVariants);
    }

    /**
     * factory method for an instance of ProductSearchMatchingVariantsBuilder
     * @return builder
     */
    public static ProductSearchMatchingVariantsBuilder of() {
        return new ProductSearchMatchingVariantsBuilder();
    }

    /**
     * create builder for ProductSearchMatchingVariants instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchMatchingVariantsBuilder of(final ProductSearchMatchingVariants template) {
        ProductSearchMatchingVariantsBuilder builder = new ProductSearchMatchingVariantsBuilder();
        builder.allMatched = template.getAllMatched();
        builder.matchedVariants = template.getMatchedVariants();
        return builder;
    }

}
