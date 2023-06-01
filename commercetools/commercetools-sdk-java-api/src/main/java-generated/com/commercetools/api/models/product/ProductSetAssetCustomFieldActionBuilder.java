package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.product.ProductSetAssetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAssetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetCustomFieldAction productSetAssetCustomFieldAction = ProductSetAssetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSetAssetCustomFieldActionBuilder implements Builder<ProductSetAssetCustomFieldAction> {

    
    @Nullable
    private Long variantId;
    
    
    @Nullable
    private String sku;
    
    
    @Nullable
    private Boolean staged;
    
    
    @Nullable
    private String assetId;
    
    
    @Nullable
    private String assetKey;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductSetAssetCustomFieldActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */
    
    public ProductSetAssetCustomFieldActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductSetAssetCustomFieldActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */
    
    public ProductSetAssetCustomFieldActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */
    
    public ProductSetAssetCustomFieldActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ProductSetAssetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public ProductSetAssetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @return staged
     */
    
    @Nullable
    public Boolean getStaged(){
        return this.staged;
    }
    
    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */
    
    @Nullable
    public String getAssetId(){
        return this.assetId;
    }
    
    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */
    
    @Nullable
    public String getAssetKey(){
        return this.assetKey;
    }
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    /**
     * builds ProductSetAssetCustomFieldAction with checking for non-null required values
     * @return ProductSetAssetCustomFieldAction
     */
    public ProductSetAssetCustomFieldAction build() {
        Objects.requireNonNull(name, ProductSetAssetCustomFieldAction.class + ": name is missing");
        return new ProductSetAssetCustomFieldActionImpl(variantId, sku, staged, assetId, assetKey, name, value);
    }
    
    /**
     * builds ProductSetAssetCustomFieldAction without checking for non-null required values
     * @return ProductSetAssetCustomFieldAction
     */
    public ProductSetAssetCustomFieldAction buildUnchecked() {
        return new ProductSetAssetCustomFieldActionImpl(variantId, sku, staged, assetId, assetKey, name, value);
    }

    /**
     * factory method for an instance of ProductSetAssetCustomFieldActionBuilder
     * @return builder 
     */
    public static ProductSetAssetCustomFieldActionBuilder of() {
        return new ProductSetAssetCustomFieldActionBuilder();
    }

    /**
     * create builder for ProductSetAssetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetAssetCustomFieldActionBuilder of(final ProductSetAssetCustomFieldAction template) {
        ProductSetAssetCustomFieldActionBuilder builder = new ProductSetAssetCustomFieldActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
