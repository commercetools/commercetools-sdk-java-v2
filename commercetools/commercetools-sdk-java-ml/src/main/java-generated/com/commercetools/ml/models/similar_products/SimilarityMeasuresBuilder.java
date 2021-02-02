
package com.commercetools.ml.models.similar_products;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SimilarityMeasuresBuilder {

    @Nullable
    private Long name;

    @Nullable
    private Long description;

    @Nullable
    private Long attribute;

    @Nullable
    private Long variantCount;

    @Nullable
    private Long price;

    public SimilarityMeasuresBuilder name(@Nullable final Long name) {
        this.name = name;
        return this;
    }

    public SimilarityMeasuresBuilder description(@Nullable final Long description) {
        this.description = description;
        return this;
    }

    public SimilarityMeasuresBuilder attribute(@Nullable final Long attribute) {
        this.attribute = attribute;
        return this;
    }

    public SimilarityMeasuresBuilder variantCount(@Nullable final Long variantCount) {
        this.variantCount = variantCount;
        return this;
    }

    public SimilarityMeasuresBuilder price(@Nullable final Long price) {
        this.price = price;
        return this;
    }

    @Nullable
    public Long getName() {
        return this.name;
    }

    @Nullable
    public Long getDescription() {
        return this.description;
    }

    @Nullable
    public Long getAttribute() {
        return this.attribute;
    }

    @Nullable
    public Long getVariantCount() {
        return this.variantCount;
    }

    @Nullable
    public Long getPrice() {
        return this.price;
    }

    public SimilarityMeasures build() {
        return new SimilarityMeasuresImpl(name, description, attribute, variantCount, price);
    }

    public static SimilarityMeasuresBuilder of() {
        return new SimilarityMeasuresBuilder();
    }

    public static SimilarityMeasuresBuilder of(final SimilarityMeasures template) {
        SimilarityMeasuresBuilder builder = new SimilarityMeasuresBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attribute = template.getAttribute();
        builder.variantCount = template.getVariantCount();
        builder.price = template.getPrice();
        return builder;
    }

}
