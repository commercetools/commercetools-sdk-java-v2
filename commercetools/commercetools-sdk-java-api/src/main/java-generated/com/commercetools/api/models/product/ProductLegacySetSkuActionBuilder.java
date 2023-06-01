package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductLegacySetSkuAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductLegacySetSkuActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductLegacySetSkuAction productLegacySetSkuAction = ProductLegacySetSkuAction.builder()
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductLegacySetSkuActionBuilder implements Builder<ProductLegacySetSkuAction> {

    
    @Nullable
    private String sku;
    
    
    
    private Integer variantId;

    
    /**
     * set the value to the sku
     * @param sku value to be set
     * @return Builder
     */
    
    public ProductLegacySetSkuActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    
    /**
     * set the value to the variantId
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductLegacySetSkuActionBuilder variantId( final Integer variantId) {
        this.variantId = variantId;
        return this;
    }
    
    

    /**
     * value of sku}
     * @return sku
     */
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    /**
     * value of variantId}
     * @return variantId
     */
    
    
    public Integer getVariantId(){
        return this.variantId;
    }

    /**
     * builds ProductLegacySetSkuAction with checking for non-null required values
     * @return ProductLegacySetSkuAction
     */
    public ProductLegacySetSkuAction build() {
        Objects.requireNonNull(variantId, ProductLegacySetSkuAction.class + ": variantId is missing");
        return new ProductLegacySetSkuActionImpl(sku, variantId);
    }
    
    /**
     * builds ProductLegacySetSkuAction without checking for non-null required values
     * @return ProductLegacySetSkuAction
     */
    public ProductLegacySetSkuAction buildUnchecked() {
        return new ProductLegacySetSkuActionImpl(sku, variantId);
    }

    /**
     * factory method for an instance of ProductLegacySetSkuActionBuilder
     * @return builder 
     */
    public static ProductLegacySetSkuActionBuilder of() {
        return new ProductLegacySetSkuActionBuilder();
    }

    /**
     * create builder for ProductLegacySetSkuAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductLegacySetSkuActionBuilder of(final ProductLegacySetSkuAction template) {
        ProductLegacySetSkuActionBuilder builder = new ProductLegacySetSkuActionBuilder();
        builder.sku = template.getSku();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
