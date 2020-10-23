package com.commercetools.api.models.product;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.ProductVariantDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantDraftImpl.class)
public interface ProductVariantDraft  {

    
    
    @JsonProperty("sku")
    public String getSku();
    
    
    @JsonProperty("key")
    public String getKey();
    
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();
    
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();
    
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();
    
    @Valid
    @JsonProperty("assets")
    public List<AssetDraft> getAssets();

    public void setSku(final String sku);
    
    public void setKey(final String key);
    
    public void setPrices(final List<PriceDraft> prices);
    
    public void setAttributes(final List<Attribute> attributes);
    
    public void setImages(final List<Image> images);
    
    public void setAssets(final List<AssetDraft> assets);

    public static ProductVariantDraftImpl of(){
        return new ProductVariantDraftImpl();
    }
    

    public static ProductVariantDraftImpl of(final ProductVariantDraft template) {
        ProductVariantDraftImpl instance = new ProductVariantDraftImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        return instance;
    }

    default <T> T withProductVariantDraft(Function<ProductVariantDraft, T> helper) {
        return helper.apply(this);
    }
}
