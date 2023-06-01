package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetProductVariantKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetProductVariantKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetProductVariantKeyAction productSetProductVariantKeyAction = ProductSetProductVariantKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSetProductVariantKeyActionBuilder implements Builder<ProductSetProductVariantKeyAction> {

    
    @Nullable
    private Long variantId;
    
    
    @Nullable
    private String sku;
    
    
    @Nullable
    private String key;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductSetProductVariantKeyActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */
    
    public ProductSetProductVariantKeyActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ProductSetProductVariantKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged <code>key</code> is set. If <code>false</code>, both the current and staged <code>key</code> are set.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductSetProductVariantKeyActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */
    
    @Nullable
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged <code>key</code> is set. If <code>false</code>, both the current and staged <code>key</code> are set.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductSetProductVariantKeyAction with checking for non-null required values
     * @return ProductSetProductVariantKeyAction
     */
    public ProductSetProductVariantKeyAction build() {
        return new ProductSetProductVariantKeyActionImpl(variantId, sku, key, staged);
    }
    
    /**
     * builds ProductSetProductVariantKeyAction without checking for non-null required values
     * @return ProductSetProductVariantKeyAction
     */
    public ProductSetProductVariantKeyAction buildUnchecked() {
        return new ProductSetProductVariantKeyActionImpl(variantId, sku, key, staged);
    }

    /**
     * factory method for an instance of ProductSetProductVariantKeyActionBuilder
     * @return builder 
     */
    public static ProductSetProductVariantKeyActionBuilder of() {
        return new ProductSetProductVariantKeyActionBuilder();
    }

    /**
     * create builder for ProductSetProductVariantKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetProductVariantKeyActionBuilder of(final ProductSetProductVariantKeyAction template) {
        ProductSetProductVariantKeyActionBuilder builder = new ProductSetProductVariantKeyActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.staged = template.getStaged();
        return builder;
    }

}
