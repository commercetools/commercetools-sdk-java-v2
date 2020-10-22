package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Asset;
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
@JsonDeserialize(as = ProductAddVariantActionImpl.class)
public interface ProductAddVariantAction extends ProductUpdateAction {

    
    
    @JsonProperty("sku")
    public String getSku();
    
    
    @JsonProperty("key")
    public String getKey();
    
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();
    
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();
    
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();
    
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    public void setSku(final String sku);
    
    public void setKey(final String key);
    
    public void setPrices(final List<PriceDraft> prices);
    
    public void setImages(final List<Image> images);
    
    public void setAttributes(final List<Attribute> attributes);
    
    public void setStaged(final Boolean staged);
    
    public void setAssets(final List<Asset> assets);

    public static ProductAddVariantActionImpl of(){
        return new ProductAddVariantActionImpl();
    }
    

    public static ProductAddVariantActionImpl of(final ProductAddVariantAction template) {
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

    default <T extends Accessor<ProductAddVariantAction>> T withProductAddVariantAction(Function<ProductAddVariantAction, T> helper) {
        return helper.apply(this);
    }
}
