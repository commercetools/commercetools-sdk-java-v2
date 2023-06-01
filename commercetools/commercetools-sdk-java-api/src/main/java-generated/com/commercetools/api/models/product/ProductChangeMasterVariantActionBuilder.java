package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductChangeMasterVariantAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangeMasterVariantActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeMasterVariantAction productChangeMasterVariantAction = ProductChangeMasterVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductChangeMasterVariantActionBuilder implements Builder<ProductChangeMasterVariantAction> {

    
    @Nullable
    private Long variantId;
    
    
    @Nullable
    private String sku;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>The <code>id</code> of the ProductVariant to become the Master Variant.</p>
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductChangeMasterVariantActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to become the Master Variant.</p>
     * @param sku value to be set
     * @return Builder
     */
    
    public ProductChangeMasterVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged Master Variant is changed. If <code>false</code>, both the current and staged Master Variant are changed.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductChangeMasterVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     *  <p>The <code>id</code> of the ProductVariant to become the Master Variant.</p>
     * @return variantId
     */
    
    @Nullable
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to become the Master Variant.</p>
     * @return sku
     */
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged Master Variant is changed. If <code>false</code>, both the current and staged Master Variant are changed.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductChangeMasterVariantAction with checking for non-null required values
     * @return ProductChangeMasterVariantAction
     */
    public ProductChangeMasterVariantAction build() {
        return new ProductChangeMasterVariantActionImpl(variantId, sku, staged);
    }
    
    /**
     * builds ProductChangeMasterVariantAction without checking for non-null required values
     * @return ProductChangeMasterVariantAction
     */
    public ProductChangeMasterVariantAction buildUnchecked() {
        return new ProductChangeMasterVariantActionImpl(variantId, sku, staged);
    }

    /**
     * factory method for an instance of ProductChangeMasterVariantActionBuilder
     * @return builder 
     */
    public static ProductChangeMasterVariantActionBuilder of() {
        return new ProductChangeMasterVariantActionBuilder();
    }

    /**
     * create builder for ProductChangeMasterVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductChangeMasterVariantActionBuilder of(final ProductChangeMasterVariantAction template) {
        ProductChangeMasterVariantActionBuilder builder = new ProductChangeMasterVariantActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
