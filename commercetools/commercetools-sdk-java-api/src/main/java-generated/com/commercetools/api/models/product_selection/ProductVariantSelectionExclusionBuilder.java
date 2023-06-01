package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product_selection.ProductVariantSelection;
import com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum;
import com.commercetools.api.models.product_selection.ProductVariantSelectionExclusion;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionExclusionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantSelectionExclusion productVariantSelectionExclusion = ProductVariantSelectionExclusion.builder()
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@Deprecated
public class ProductVariantSelectionExclusionBuilder implements Builder<ProductVariantSelectionExclusion> {

    
    
    private java.util.List<String> skus;

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     * @param skus value to be set
     * @return Builder
     */
    
    public ProductVariantSelectionExclusionBuilder skus( final String ...skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }
    
    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     * @param skus value to be set
     * @return Builder
     */
    
    public ProductVariantSelectionExclusionBuilder skus( final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }
    
    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     * @param skus value to be set
     * @return Builder
     */
    
    public ProductVariantSelectionExclusionBuilder plusSkus( final String ...skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }
    
    
    

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     * @return skus
     */
    
    
    public java.util.List<String> getSkus(){
        return this.skus;
    }

    /**
     * builds ProductVariantSelectionExclusion with checking for non-null required values
     * @return ProductVariantSelectionExclusion
     */
    public ProductVariantSelectionExclusion build() {
        Objects.requireNonNull(skus, ProductVariantSelectionExclusion.class + ": skus is missing");
        return new ProductVariantSelectionExclusionImpl(skus);
    }
    
    /**
     * builds ProductVariantSelectionExclusion without checking for non-null required values
     * @return ProductVariantSelectionExclusion
     */
    public ProductVariantSelectionExclusion buildUnchecked() {
        return new ProductVariantSelectionExclusionImpl(skus);
    }

    /**
     * factory method for an instance of ProductVariantSelectionExclusionBuilder
     * @return builder 
     */
    public static ProductVariantSelectionExclusionBuilder of() {
        return new ProductVariantSelectionExclusionBuilder();
    }

    /**
     * create builder for ProductVariantSelectionExclusion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantSelectionExclusionBuilder of(final ProductVariantSelectionExclusion template) {
        ProductVariantSelectionExclusionBuilder builder = new ProductVariantSelectionExclusionBuilder();
        builder.skus = template.getSkus();
        return builder;
    }

}
