package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRemoveVariantAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemoveVariantActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveVariantAction productRemoveVariantAction = ProductRemoveVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductRemoveVariantActionBuilder implements Builder<ProductRemoveVariantAction> {

    
    @Nullable
    private Long id;
    
    
    @Nullable
    private String sku;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>The <code>id</code> of the ProductVariant to remove.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ProductRemoveVariantActionBuilder id(@Nullable final Long id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove.</p>
     * @param sku value to be set
     * @return Builder
     */
    
    public ProductRemoveVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is removed. If <code>false</code>, both the current and staged ProductVariant is removed.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductRemoveVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove.</p>
     * @return id
     */
    
    @Nullable
    public Long getId(){
        return this.id;
    }
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove.</p>
     * @return sku
     */
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is removed. If <code>false</code>, both the current and staged ProductVariant is removed.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductRemoveVariantAction with checking for non-null required values
     * @return ProductRemoveVariantAction
     */
    public ProductRemoveVariantAction build() {
        return new ProductRemoveVariantActionImpl(id, sku, staged);
    }
    
    /**
     * builds ProductRemoveVariantAction without checking for non-null required values
     * @return ProductRemoveVariantAction
     */
    public ProductRemoveVariantAction buildUnchecked() {
        return new ProductRemoveVariantActionImpl(id, sku, staged);
    }

    /**
     * factory method for an instance of ProductRemoveVariantActionBuilder
     * @return builder 
     */
    public static ProductRemoveVariantActionBuilder of() {
        return new ProductRemoveVariantActionBuilder();
    }

    /**
     * create builder for ProductRemoveVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemoveVariantActionBuilder of(final ProductRemoveVariantAction template) {
        ProductRemoveVariantActionBuilder builder = new ProductRemoveVariantActionBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
