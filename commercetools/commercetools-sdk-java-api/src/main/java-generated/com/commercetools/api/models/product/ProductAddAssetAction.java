package com.commercetools.api.models.product;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddAssetActionImpl;

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
@JsonDeserialize(as = ProductAddAssetActionImpl.class)
public interface ProductAddAssetAction extends ProductUpdateAction {

    
    
    @JsonProperty("variantId")
    public Long getVariantId();
    
    
    @JsonProperty("sku")
    public String getSku();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();
    
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetDraft getAsset();
    /**
    *  <p>Position of the new asset inside the existing list (from <code>0</code> to the size of the list)</p>
    */
    
    @JsonProperty("position")
    public Integer getPosition();

    public void setVariantId(final Long variantId);
    
    public void setSku(final String sku);
    
    public void setStaged(final Boolean staged);
    
    public void setAsset(final AssetDraft asset);
    
    public void setPosition(final Integer position);

    public static ProductAddAssetActionImpl of(){
        return new ProductAddAssetActionImpl();
    }
    

    public static ProductAddAssetActionImpl of(final ProductAddAssetAction template) {
        ProductAddAssetActionImpl instance = new ProductAddAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAsset(template.getAsset());
        instance.setPosition(template.getPosition());
        return instance;
    }

    default <T> T withProductAddAssetAction(Function<ProductAddAssetAction, T> helper) {
        return helper.apply(this);
    }
}
