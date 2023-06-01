package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductMoveImageToPositionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductMoveImageToPositionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductMoveImageToPositionAction productMoveImageToPositionAction = ProductMoveImageToPositionAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .position(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductMoveImageToPositionActionBuilder implements Builder<ProductMoveImageToPositionAction> {

    
    @Nullable
    private Long variantId;
    
    
    @Nullable
    private String sku;
    
    
    
    private String imageUrl;
    
    
    
    private Long position;
    
    
    @Nullable
    private Boolean staged;

    
    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductMoveImageToPositionActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */
    
    public ProductMoveImageToPositionActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    
    /**
     *  <p>The URL of the image to update.</p>
     * @param imageUrl value to be set
     * @return Builder
     */
    
    public ProductMoveImageToPositionActionBuilder imageUrl( final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    
    
    
    
    /**
     *  <p>Position in <code>images</code> where the image should be moved. Must be between <code>0</code> and the total number of images minus <code>1</code>.</p>
     * @param position value to be set
     * @return Builder
     */
    
    public ProductMoveImageToPositionActionBuilder position( final Long position) {
        this.position = position;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductMoveImageToPositionActionBuilder staged(@Nullable final Boolean staged) {
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
     *  <p>The URL of the image to update.</p>
     * @return imageUrl
     */
    
    
    public String getImageUrl(){
        return this.imageUrl;
    }
    
    /**
     *  <p>Position in <code>images</code> where the image should be moved. Must be between <code>0</code> and the total number of images minus <code>1</code>.</p>
     * @return position
     */
    
    
    public Long getPosition(){
        return this.position;
    }
    
    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductMoveImageToPositionAction with checking for non-null required values
     * @return ProductMoveImageToPositionAction
     */
    public ProductMoveImageToPositionAction build() {
        Objects.requireNonNull(imageUrl, ProductMoveImageToPositionAction.class + ": imageUrl is missing");
        Objects.requireNonNull(position, ProductMoveImageToPositionAction.class + ": position is missing");
        return new ProductMoveImageToPositionActionImpl(variantId, sku, imageUrl, position, staged);
    }
    
    /**
     * builds ProductMoveImageToPositionAction without checking for non-null required values
     * @return ProductMoveImageToPositionAction
     */
    public ProductMoveImageToPositionAction buildUnchecked() {
        return new ProductMoveImageToPositionActionImpl(variantId, sku, imageUrl, position, staged);
    }

    /**
     * factory method for an instance of ProductMoveImageToPositionActionBuilder
     * @return builder 
     */
    public static ProductMoveImageToPositionActionBuilder of() {
        return new ProductMoveImageToPositionActionBuilder();
    }

    /**
     * create builder for ProductMoveImageToPositionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductMoveImageToPositionActionBuilder of(final ProductMoveImageToPositionAction template) {
        ProductMoveImageToPositionActionBuilder builder = new ProductMoveImageToPositionActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.imageUrl = template.getImageUrl();
        builder.position = template.getPosition();
        builder.staged = template.getStaged();
        return builder;
    }

}
