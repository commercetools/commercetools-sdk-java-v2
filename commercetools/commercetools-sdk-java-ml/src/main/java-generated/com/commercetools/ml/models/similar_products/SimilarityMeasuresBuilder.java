package com.commercetools.ml.models.similar_products;


import com.commercetools.ml.models.similar_products.SimilarityMeasures;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
     * @param name value to be set
     * @return Builder
     */
    
    public SimilarityMeasuresBuilder name(@Nullable final Long name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public SimilarityMeasuresBuilder description(@Nullable final Long description) {
        this.description = description;
        return this;
    }
    
    
    
    
    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @param attribute value to be set
     * @return Builder
     */
    
    public SimilarityMeasuresBuilder attribute(@Nullable final Long attribute) {
        this.attribute = attribute;
        return this;
    }
    
    
    
    
    /**
     *  <p>Importance of the number of product variants in overall similarity.</p>
     * @param variantCount value to be set
     * @return Builder
     */
    
    public SimilarityMeasuresBuilder variantCount(@Nullable final Long variantCount) {
        this.variantCount = variantCount;
        return this;
    }
    
    
    
    
    /**
     *  <p>Importance of the <code>price</code> attribute in overall similarity.</p>
     * @param price value to be set
     * @return Builder
     */
    
    public SimilarityMeasuresBuilder price(@Nullable final Long price) {
        this.price = price;
        return this;
    }
    
    

    /**
     *  <p>Importance of the <code>name</code> attribute in overall similarity.</p>
     * @return name
     */
    
    @Nullable
    public Long getName(){
        return this.name;
    }
    
    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @return description
     */
    
    @Nullable
    public Long getDescription(){
        return this.description;
    }
    
    /**
     *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
     * @return attribute
     */
    
    @Nullable
    public Long getAttribute(){
        return this.attribute;
    }
    
    /**
     *  <p>Importance of the number of product variants in overall similarity.</p>
     * @return variantCount
     */
    
    @Nullable
    public Long getVariantCount(){
        return this.variantCount;
    }
    
    /**
     *  <p>Importance of the <code>price</code> attribute in overall similarity.</p>
     * @return price
     */
    
    @Nullable
    public Long getPrice(){
        return this.price;
    }

    /**
     * builds SimilarityMeasures with checking for non-null required values
     * @return SimilarityMeasures
     */
    public SimilarityMeasures build() {
        return new SimilarityMeasuresImpl(name, description, attribute, variantCount, price);
    }
    
    /**
     * builds SimilarityMeasures without checking for non-null required values
     * @return SimilarityMeasures
     */
    public SimilarityMeasures buildUnchecked() {
        return new SimilarityMeasuresImpl(name, description, attribute, variantCount, price);
    }

    /**
     * factory method for an instance of SimilarityMeasuresBuilder
     * @return builder 
     */
    public static SimilarityMeasuresBuilder of() {
        return new SimilarityMeasuresBuilder();
    }

    /**
     * create builder for SimilarityMeasures instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
