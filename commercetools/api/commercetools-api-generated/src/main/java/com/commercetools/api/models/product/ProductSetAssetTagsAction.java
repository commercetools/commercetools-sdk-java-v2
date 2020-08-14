package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetAssetTagsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductSetAssetTagsActionImpl.class)
public interface ProductSetAssetTagsAction extends ProductUpdateAction {

    
    
    @JsonProperty("variantId")
    public Long getVariantId();
    
    
    @JsonProperty("sku")
    public String getSku();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();
    
    
    @JsonProperty("assetId")
    public String getAssetId();
    
    
    @JsonProperty("assetKey")
    public String getAssetKey();
    
    
    @JsonProperty("tags")
    public List<String> getTags();

    public void setVariantId(final Long variantId);
    
    public void setSku(final String sku);
    
    public void setStaged(final Boolean staged);
    
    public void setAssetId(final String assetId);
    
    public void setAssetKey(final String assetKey);
    
    public void setTags(final List<String> tags);

    public static ProductSetAssetTagsActionImpl of(){
        return new ProductSetAssetTagsActionImpl();
    }
    

    public static ProductSetAssetTagsActionImpl of(final ProductSetAssetTagsAction template) {
        ProductSetAssetTagsActionImpl instance = new ProductSetAssetTagsActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(template.getTags());
        return instance;
    }

}
