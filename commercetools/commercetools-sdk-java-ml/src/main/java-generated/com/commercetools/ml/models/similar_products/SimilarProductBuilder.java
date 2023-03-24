
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProduct similarProduct = SimilarProduct.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SimilarProductBuilder implements Builder<SimilarProduct> {

    @Nullable
    private com.commercetools.ml.models.common.ProductReference product;

    @Nullable
    private Long variantId;

    @Nullable
    private com.commercetools.ml.models.similar_products.SimilarProductMeta meta;

    /**
     *  <p>Reference to Product</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public SimilarProductBuilder product(
            Function<com.commercetools.ml.models.common.ProductReferenceBuilder, com.commercetools.ml.models.common.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.ml.models.common.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to Product</p>
     * @param product value to be set
     * @return Builder
     */

    public SimilarProductBuilder product(@Nullable final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>ID of the ProductVariant that was compared.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public SimilarProductBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Supplementary information about the data used for similarity estimation. This information helps you understand the estimated confidence score, but it should not be used to identify a product.</p>
     * @param builder function to build the meta value
     * @return Builder
     */

    public SimilarProductBuilder meta(
            Function<com.commercetools.ml.models.similar_products.SimilarProductMetaBuilder, com.commercetools.ml.models.similar_products.SimilarProductMetaBuilder> builder) {
        this.meta = builder.apply(com.commercetools.ml.models.similar_products.SimilarProductMetaBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Supplementary information about the data used for similarity estimation. This information helps you understand the estimated confidence score, but it should not be used to identify a product.</p>
     * @param meta value to be set
     * @return Builder
     */

    public SimilarProductBuilder meta(
            @Nullable final com.commercetools.ml.models.similar_products.SimilarProductMeta meta) {
        this.meta = meta;
        return this;
    }

    @Nullable
    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public com.commercetools.ml.models.similar_products.SimilarProductMeta getMeta() {
        return this.meta;
    }

    /**
     * builds SimilarProduct with checking for non-null required values
     * @return SimilarProduct
     */
    public SimilarProduct build() {
        return new SimilarProductImpl(product, variantId, meta);
    }

    /**
     * builds SimilarProduct without checking for non-null required values
     * @return SimilarProduct
     */
    public SimilarProduct buildUnchecked() {
        return new SimilarProductImpl(product, variantId, meta);
    }

    public static SimilarProductBuilder of() {
        return new SimilarProductBuilder();
    }

    public static SimilarProductBuilder of(final SimilarProduct template) {
        SimilarProductBuilder builder = new SimilarProductBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.meta = template.getMeta();
        return builder;
    }

}
