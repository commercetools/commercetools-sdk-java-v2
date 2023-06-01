package com.commercetools.api.models.product;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddVariantActionImpl;

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
 * ProductAddVariantAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddVariantAction productAddVariantAction = ProductAddVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductAddVariantActionImpl.class)
public interface ProductAddVariantAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductAddVariantAction
     */
    String ADD_VARIANT = "addVariant";

    /**
     *  <p>Value to set. Must be unique.</p>
     * @return sku
     */
    
    @JsonProperty("sku")
    public String getSku();
    /**
     *  <p>Value to set. Must be unique.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();
    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @return prices
     */
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();
    /**
     *  <p>Images for the Product Variant.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();
    /**
     *  <p>Attributes for the Product Variant.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();
    /**
     *  <p>If <code>true</code> the new Product Variant is only staged. If <code>false</code> the new Product Variant is both current and staged.</p>
     * @return staged
     */
    
    @JsonProperty("staged")
    public Boolean getStaged();
    /**
     *  <p>Media assets for the Product Variant.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<AssetDraft> getAssets();

    /**
     *  <p>Value to set. Must be unique.</p>
     * @param sku value to be set
     */
    
    public void setSku(final String sku);
    
    
    /**
     *  <p>Value to set. Must be unique.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @param prices values to be set
     */
    
    @JsonIgnore
    public void setPrices(final PriceDraft ...prices);
    /**
     *  <p>Embedded Prices for the Product Variant.</p>
     * @param prices values to be set
     */
    
    public void setPrices(final List<PriceDraft> prices);
    
    /**
     *  <p>Images for the Product Variant.</p>
     * @param images values to be set
     */
    
    @JsonIgnore
    public void setImages(final Image ...images);
    /**
     *  <p>Images for the Product Variant.</p>
     * @param images values to be set
     */
    
    public void setImages(final List<Image> images);
    
    /**
     *  <p>Attributes for the Product Variant.</p>
     * @param attributes values to be set
     */
    
    @JsonIgnore
    public void setAttributes(final Attribute ...attributes);
    /**
     *  <p>Attributes for the Product Variant.</p>
     * @param attributes values to be set
     */
    
    public void setAttributes(final List<Attribute> attributes);
    
    /**
     *  <p>If <code>true</code> the new Product Variant is only staged. If <code>false</code> the new Product Variant is both current and staged.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    
    
    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets values to be set
     */
    
    @JsonIgnore
    public void setAssets(final AssetDraft ...assets);
    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets values to be set
     */
    
    public void setAssets(final List<AssetDraft> assets);

    /**
     * factory method
     * @return instance of ProductAddVariantAction
     */
    public static ProductAddVariantAction of(){
        return new ProductAddVariantActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductAddVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductAddVariantAction of(final ProductAddVariantAction template) {
        ProductAddVariantActionImpl instance = new ProductAddVariantActionImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(template.getPrices());
        instance.setImages(template.getImages());
        instance.setAttributes(template.getAttributes());
        instance.setStaged(template.getStaged());
        instance.setAssets(template.getAssets());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductAddVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductAddVariantAction deepCopy(@Nullable final ProductAddVariantAction template) {
        if (template == null) {
            return null;
        }
        ProductAddVariantActionImpl instance = new ProductAddVariantActionImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream().map(com.commercetools.api.models.common.PriceDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream().map(com.commercetools.api.models.common.Image::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream().map(com.commercetools.api.models.product.Attribute::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream().map(com.commercetools.api.models.common.AssetDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductAddVariantAction
     * @return builder
     */
    public static ProductAddVariantActionBuilder builder() {
        return ProductAddVariantActionBuilder.of();
    }
    
    /**
     * create builder for ProductAddVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddVariantActionBuilder builder(final ProductAddVariantAction template) {
        return ProductAddVariantActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductAddVariantAction(Function<ProductAddVariantAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddVariantAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddVariantAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddVariantAction>";
            }
        };
    }
}
