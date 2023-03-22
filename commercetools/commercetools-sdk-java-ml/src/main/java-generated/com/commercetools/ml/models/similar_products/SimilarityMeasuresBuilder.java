
package com.commercetools.ml.models.similar_products;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarityMeasuresBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarityMeasures similarityMeasures = SimilarityMeasures.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SimilarityMeasuresBuilder implements Builder<SimilarityMeasures> {

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

    /**
     *  <p>Importance of the <code>name</code> attribute in overall similarity.</p>
     * @param name
     * @return Builder
     */

    public SimilarityMeasuresBuilder name(@Nullable final Long name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @param description
     * @return Builder
     */

    public SimilarityMeasuresBuilder description(@Nullable final Long description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @param attribute
     * @return Builder
     */

    public SimilarityMeasuresBuilder attribute(@Nullable final Long attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     *  <p>Importance of the number of product variants in overall similarity.</p>
     * @param variantCount
     * @return Builder
     */

    public SimilarityMeasuresBuilder variantCount(@Nullable final Long variantCount) {
        this.variantCount = variantCount;
        return this;
    }

    /**
     *  <p>Importance of the <code>price</code> attribute in overall similarity.</p>
     * @param price
     * @return Builder
     */

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

    /**
     * builds SimilarityMeasures without checking for non null required values
     */
    public SimilarityMeasures buildUnchecked() {
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
