package com.commercetools.ml.models.similar_products;

import com.commercetools.ml.models.common.LocalizedString;
import com.commercetools.ml.models.common.Money;
import com.commercetools.ml.models.similar_products.SimilarProductMeta;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductMetaBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductMeta similarProductMeta = SimilarProductMeta.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SimilarProductMetaBuilder implements Builder<SimilarProductMeta> {

    
    @Nullable
    private com.commercetools.ml.models.common.LocalizedString name;
    
    
    @Nullable
    private com.commercetools.ml.models.common.LocalizedString description;
    
    
    @Nullable
    private com.commercetools.ml.models.common.Money price;
    
    
    @Nullable
    private Long variantCount;

    
    /**
     *  <p>Localized product name used for similarity estimation.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public SimilarProductMetaBuilder name(Function<com.commercetools.ml.models.common.LocalizedStringBuilder, com.commercetools.ml.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.ml.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Localized product name used for similarity estimation.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public SimilarProductMetaBuilder withName(Function<com.commercetools.ml.models.common.LocalizedStringBuilder, com.commercetools.ml.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.ml.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Localized product name used for similarity estimation.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public SimilarProductMetaBuilder name(@Nullable final com.commercetools.ml.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Localized product description used for similarity estimation.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public SimilarProductMetaBuilder description(Function<com.commercetools.ml.models.common.LocalizedStringBuilder, com.commercetools.ml.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.ml.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Localized product description used for similarity estimation.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public SimilarProductMetaBuilder withDescription(Function<com.commercetools.ml.models.common.LocalizedStringBuilder, com.commercetools.ml.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.ml.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Localized product description used for similarity estimation.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public SimilarProductMetaBuilder description(@Nullable final com.commercetools.ml.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    
    /**
     *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public SimilarProductMetaBuilder price(Function<com.commercetools.ml.models.common.MoneyBuilder, com.commercetools.ml.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.ml.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public SimilarProductMetaBuilder withPrice(Function<com.commercetools.ml.models.common.MoneyBuilder, com.commercetools.ml.models.common.Money> builder) {
        this.price = builder.apply(com.commercetools.ml.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
     * @param price value to be set
     * @return Builder
     */
    
    public SimilarProductMetaBuilder price(@Nullable final com.commercetools.ml.models.common.Money price) {
        this.price = price;
        return this;
    }
    
    
    
    
    /**
     *  <p>Total number of variants associated with the product.</p>
     * @param variantCount value to be set
     * @return Builder
     */
    
    public SimilarProductMetaBuilder variantCount(@Nullable final Long variantCount) {
        this.variantCount = variantCount;
        return this;
    }
    
    

    /**
     *  <p>Localized product name used for similarity estimation.</p>
     * @return name
     */
    
    @Nullable
    public com.commercetools.ml.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Localized product description used for similarity estimation.</p>
     * @return description
     */
    
    @Nullable
    public com.commercetools.ml.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
     * @return price
     */
    
    @Nullable
    public com.commercetools.ml.models.common.Money getPrice(){
        return this.price;
    }
    
    /**
     *  <p>Total number of variants associated with the product.</p>
     * @return variantCount
     */
    
    @Nullable
    public Long getVariantCount(){
        return this.variantCount;
    }

    /**
     * builds SimilarProductMeta with checking for non-null required values
     * @return SimilarProductMeta
     */
    public SimilarProductMeta build() {
        return new SimilarProductMetaImpl(name, description, price, variantCount);
    }
    
    /**
     * builds SimilarProductMeta without checking for non-null required values
     * @return SimilarProductMeta
     */
    public SimilarProductMeta buildUnchecked() {
        return new SimilarProductMetaImpl(name, description, price, variantCount);
    }

    /**
     * factory method for an instance of SimilarProductMetaBuilder
     * @return builder 
     */
    public static SimilarProductMetaBuilder of() {
        return new SimilarProductMetaBuilder();
    }

    /**
     * create builder for SimilarProductMeta instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductMetaBuilder of(final SimilarProductMeta template) {
        SimilarProductMetaBuilder builder = new SimilarProductMetaBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.price = template.getPrice();
        builder.variantCount = template.getVariantCount();
        return builder;
    }

}
