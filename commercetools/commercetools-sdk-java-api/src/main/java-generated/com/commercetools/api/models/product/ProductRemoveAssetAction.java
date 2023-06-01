package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRemoveAssetActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required. The Asset to remove must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveAssetAction productRemoveAssetAction = ProductRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductRemoveAssetActionImpl.class)
public interface ProductRemoveAssetAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductRemoveAssetAction
     */
    String REMOVE_ASSET = "removeAsset";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */
    
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */
    
    @JsonProperty("sku")
    public String getSku();
    /**
     *  <p>If <code>true</code>, only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     * @return staged
     */
    
    @JsonProperty("staged")
    public Boolean getStaged();
    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     * @return assetId
     */
    
    @JsonProperty("assetId")
    public String getAssetId();
    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     * @return assetKey
     */
    
    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     */
    
    public void setVariantId(final Long variantId);
    
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     */
    
    public void setSku(final String sku);
    
    
    /**
     *  <p>If <code>true</code>, only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    
    
    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     * @param assetId value to be set
     */
    
    public void setAssetId(final String assetId);
    
    
    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     * @param assetKey value to be set
     */
    
    public void setAssetKey(final String assetKey);
    

    /**
     * factory method
     * @return instance of ProductRemoveAssetAction
     */
    public static ProductRemoveAssetAction of(){
        return new ProductRemoveAssetActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductRemoveAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRemoveAssetAction of(final ProductRemoveAssetAction template) {
        ProductRemoveAssetActionImpl instance = new ProductRemoveAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductRemoveAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRemoveAssetAction deepCopy(@Nullable final ProductRemoveAssetAction template) {
        if (template == null) {
            return null;
        }
        ProductRemoveAssetActionImpl instance = new ProductRemoveAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * builder factory method for ProductRemoveAssetAction
     * @return builder
     */
    public static ProductRemoveAssetActionBuilder builder() {
        return ProductRemoveAssetActionBuilder.of();
    }
    
    /**
     * create builder for ProductRemoveAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemoveAssetActionBuilder builder(final ProductRemoveAssetAction template) {
        return ProductRemoveAssetActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRemoveAssetAction(Function<ProductRemoveAssetAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveAssetAction>";
            }
        };
    }
}
