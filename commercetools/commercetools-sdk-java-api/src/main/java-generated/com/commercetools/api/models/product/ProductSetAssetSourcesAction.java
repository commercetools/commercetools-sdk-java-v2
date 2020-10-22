package com.commercetools.api.models.product;

import com.commercetools.api.models.common.AssetSource;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetAssetSourcesActionImpl;

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
@JsonDeserialize(as = ProductSetAssetSourcesActionImpl.class)
public interface ProductSetAssetSourcesAction extends ProductUpdateAction {

    
    
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
    
    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();

    public void setVariantId(final Long variantId);
    
    public void setSku(final String sku);
    
    public void setStaged(final Boolean staged);
    
    public void setAssetId(final String assetId);
    
    public void setAssetKey(final String assetKey);
    
    public void setSources(final List<AssetSource> sources);

    public static ProductSetAssetSourcesActionImpl of(){
        return new ProductSetAssetSourcesActionImpl();
    }
    

    public static ProductSetAssetSourcesActionImpl of(final ProductSetAssetSourcesAction template) {
        ProductSetAssetSourcesActionImpl instance = new ProductSetAssetSourcesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setSources(template.getSources());
        return instance;
    }

    default <T extends Accessor<ProductSetAssetSourcesAction>> T withProductSetAssetSourcesAction(Function<ProductSetAssetSourcesAction, T> helper) {
        return helper.apply(this);
    }
}
