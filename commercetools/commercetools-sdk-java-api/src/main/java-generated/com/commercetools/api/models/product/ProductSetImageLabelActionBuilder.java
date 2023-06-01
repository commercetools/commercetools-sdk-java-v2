package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetImageLabelAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetImageLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetImageLabelAction productSetImageLabelAction = ProductSetImageLabelAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSetImageLabelActionBuilder implements Builder<ProductSetImageLabelAction> {

    
    @Nullable
    private String sku;
    
    
    @Nullable
    private Long variantId;
    
    
    
    private String imageUrl;
    
    
    @Nullable
    private String label;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */
    
    public ProductSetImageLabelActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductSetImageLabelActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The URL of the image to set the label.</p>
     * @param imageUrl value to be set
     * @return Builder
     */
    
    public ProductSetImageLabelActionBuilder imageUrl( final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param label value to be set
     * @return Builder
     */
    
    public ProductSetImageLabelActionBuilder label(@Nullable final String label) {
        this.label = label;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductSetImageLabelActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
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
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */
    
    @Nullable
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>The URL of the image to set the label.</p>
     * @return imageUrl
     */
    
    
    public String getImageUrl(){
        return this.imageUrl;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return label
     */
    
    @Nullable
    public String getLabel(){
        return this.label;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductSetImageLabelAction with checking for non-null required values
     * @return ProductSetImageLabelAction
     */
    public ProductSetImageLabelAction build() {
        Objects.requireNonNull(imageUrl, ProductSetImageLabelAction.class + ": imageUrl is missing");
        return new ProductSetImageLabelActionImpl(sku, variantId, imageUrl, label, staged);
    }
    
    /**
     * builds ProductSetImageLabelAction without checking for non-null required values
     * @return ProductSetImageLabelAction
     */
    public ProductSetImageLabelAction buildUnchecked() {
        return new ProductSetImageLabelActionImpl(sku, variantId, imageUrl, label, staged);
    }

    /**
     * factory method for an instance of ProductSetImageLabelActionBuilder
     * @return builder 
     */
    public static ProductSetImageLabelActionBuilder of() {
        return new ProductSetImageLabelActionBuilder();
    }

    /**
     * create builder for ProductSetImageLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetImageLabelActionBuilder of(final ProductSetImageLabelAction template) {
        ProductSetImageLabelActionBuilder builder = new ProductSetImageLabelActionBuilder();
        builder.sku = template.getSku();
        builder.variantId = template.getVariantId();
        builder.imageUrl = template.getImageUrl();
        builder.label = template.getLabel();
        builder.staged = template.getStaged();
        return builder;
    }

}
