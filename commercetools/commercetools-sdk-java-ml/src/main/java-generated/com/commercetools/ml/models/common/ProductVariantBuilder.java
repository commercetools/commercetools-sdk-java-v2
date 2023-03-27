
package com.commercetools.ml.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariant productVariant = ProductVariant.builder()
 *             .product(productBuilder -> productBuilder)
 *             .staged(true)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantBuilder implements Builder<ProductVariant> {

    private com.commercetools.ml.models.common.ProductReference product;

    private Boolean staged;

    private Integer variantId;

    /**
     *  <p>The product that contains this variant.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantBuilder product(
            Function<com.commercetools.ml.models.common.ProductReferenceBuilder, com.commercetools.ml.models.common.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.ml.models.common.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The product that contains this variant.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductVariantBuilder product(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The state of the product variant.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductVariantBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The id of the product variant.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductVariantBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The product that contains this variant.</p>
     * @return product
     */

    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>The state of the product variant.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The id of the product variant.</p>
     * @return variantId
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     * builds ProductVariant with checking for non-null required values
     * @return ProductVariant
     */
    public ProductVariant build() {
        Objects.requireNonNull(product, ProductVariant.class + ": product is missing");
        Objects.requireNonNull(staged, ProductVariant.class + ": staged is missing");
        Objects.requireNonNull(variantId, ProductVariant.class + ": variantId is missing");
        return new ProductVariantImpl(product, staged, variantId);
    }

    /**
     * builds ProductVariant without checking for non-null required values
     * @return ProductVariant
     */
    public ProductVariant buildUnchecked() {
        return new ProductVariantImpl(product, staged, variantId);
    }

    /**
     * factory method for an instance of ProductVariantBuilder
     * @return builder
     */
    public static ProductVariantBuilder of() {
        return new ProductVariantBuilder();
    }

    /**
     * create builder for ProductVariant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantBuilder of(final ProductVariant template) {
        ProductVariantBuilder builder = new ProductVariantBuilder();
        builder.product = template.getProduct();
        builder.staged = template.getStaged();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
