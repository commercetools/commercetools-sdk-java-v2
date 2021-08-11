
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SimilarProductBuilder implements Builder<SimilarProduct> {

    @Nullable
    private com.commercetools.ml.models.common.ProductReference product;

    @Nullable
    private Long variantId;

    @Nullable
    private com.commercetools.ml.models.similar_products.SimilarProductMeta meta;

    public SimilarProductBuilder product(
            Function<com.commercetools.ml.models.common.ProductReferenceBuilder, com.commercetools.ml.models.common.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.ml.models.common.ProductReferenceBuilder.of()).build();
        return this;
    }

    public SimilarProductBuilder product(@Nullable final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
        return this;
    }

    public SimilarProductBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public SimilarProductBuilder meta(
            Function<com.commercetools.ml.models.similar_products.SimilarProductMetaBuilder, com.commercetools.ml.models.similar_products.SimilarProductMetaBuilder> builder) {
        this.meta = builder.apply(com.commercetools.ml.models.similar_products.SimilarProductMetaBuilder.of()).build();
        return this;
    }

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

    public SimilarProduct build() {
        return new SimilarProductImpl(product, variantId, meta);
    }

    /**
     * builds SimilarProduct without checking for non null required values
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
