package com.commercetools.api.models.product;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetAssetDescriptionActionImpl;

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
 *  <p>Either <code>variantId</code> or <code>sku</code> is required. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetDescriptionAction productSetAssetDescriptionAction = ProductSetAssetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductSetAssetDescriptionActionImpl.class)
public interface ProductSetAssetDescriptionAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetAssetDescriptionAction
     */
    String SET_ASSET_DESCRIPTION = "setAssetDescription";

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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @return staged
     */
    
    @JsonProperty("staged")
    public Boolean getStaged();
    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */
    
    @JsonProperty("assetId")
    public String getAssetId();
    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */
    
    @JsonProperty("assetKey")
    public String getAssetKey();
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    
    
    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     */
    
    public void setAssetId(final String assetId);
    
    
    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     */
    
    public void setAssetKey(final String assetKey);
    
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */
    
    public void setDescription(final LocalizedString description);
    

    /**
     * factory method
     * @return instance of ProductSetAssetDescriptionAction
     */
    public static ProductSetAssetDescriptionAction of(){
        return new ProductSetAssetDescriptionActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductSetAssetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetAssetDescriptionAction of(final ProductSetAssetDescriptionAction template) {
        ProductSetAssetDescriptionActionImpl instance = new ProductSetAssetDescriptionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSetAssetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetAssetDescriptionAction deepCopy(@Nullable final ProductSetAssetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ProductSetAssetDescriptionActionImpl instance = new ProductSetAssetDescriptionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for ProductSetAssetDescriptionAction
     * @return builder
     */
    public static ProductSetAssetDescriptionActionBuilder builder() {
        return ProductSetAssetDescriptionActionBuilder.of();
    }
    
    /**
     * create builder for ProductSetAssetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetAssetDescriptionActionBuilder builder(final ProductSetAssetDescriptionAction template) {
        return ProductSetAssetDescriptionActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetAssetDescriptionAction(Function<ProductSetAssetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetDescriptionAction>";
            }
        };
    }
}
