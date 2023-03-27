
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductPairBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductPair similarProductPair = SimilarProductPair.builder()
 *             .confidence(0.3)
 *             .plusProducts(productsBuilder -> productsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SimilarProductPairBuilder implements Builder<SimilarProductPair> {

    private Double confidence;

    private java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> products;

    /**
     *  <p>The probability of product similarity.</p>
     * @param confidence value to be set
     * @return Builder
     */

    public SimilarProductPairBuilder confidence(final Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * set values to the products
     * @param products value to be set
     * @return Builder
     */

    public SimilarProductPairBuilder products(
            final com.commercetools.ml.models.similar_products.SimilarProduct... products) {
        this.products = new ArrayList<>(Arrays.asList(products));
        return this;
    }

    /**
     * set value to the products
     * @param products value to be set
     * @return Builder
     */

    public SimilarProductPairBuilder products(
            final java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> products) {
        this.products = products;
        return this;
    }

    /**
     * add values to the products
     * @param products value to be set
     * @return Builder
     */

    public SimilarProductPairBuilder plusProducts(
            final com.commercetools.ml.models.similar_products.SimilarProduct... products) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.addAll(Arrays.asList(products));
        return this;
    }

    /**
     * add the value to the products using the builder function
     * @param builder function to build the products value
     * @return Builder
     */

    public SimilarProductPairBuilder plusProducts(
            Function<com.commercetools.ml.models.similar_products.SimilarProductBuilder, com.commercetools.ml.models.similar_products.SimilarProductBuilder> builder) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products
                .add(builder.apply(com.commercetools.ml.models.similar_products.SimilarProductBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the products using the builder function
     * @param builder function to build the products value
     * @return Builder
     */

    public SimilarProductPairBuilder withProducts(
            Function<com.commercetools.ml.models.similar_products.SimilarProductBuilder, com.commercetools.ml.models.similar_products.SimilarProductBuilder> builder) {
        this.products = new ArrayList<>();
        this.products
                .add(builder.apply(com.commercetools.ml.models.similar_products.SimilarProductBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The probability of product similarity.</p>
     * @return confidence
     */

    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * value of products}
     * @return products
     */

    public java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> getProducts() {
        return this.products;
    }

    /**
     * builds SimilarProductPair with checking for non-null required values
     * @return SimilarProductPair
     */
    public SimilarProductPair build() {
        Objects.requireNonNull(confidence, SimilarProductPair.class + ": confidence is missing");
        Objects.requireNonNull(products, SimilarProductPair.class + ": products is missing");
        return new SimilarProductPairImpl(confidence, products);
    }

    /**
     * builds SimilarProductPair without checking for non-null required values
     * @return SimilarProductPair
     */
    public SimilarProductPair buildUnchecked() {
        return new SimilarProductPairImpl(confidence, products);
    }

    /**
     * factory method for an instance of SimilarProductPairBuilder
     * @return builder
     */
    public static SimilarProductPairBuilder of() {
        return new SimilarProductPairBuilder();
    }

    /**
     * create builder for SimilarProductPair instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductPairBuilder of(final SimilarProductPair template) {
        SimilarProductPairBuilder builder = new SimilarProductPairBuilder();
        builder.confidence = template.getConfidence();
        builder.products = template.getProducts();
        return builder;
    }

}
