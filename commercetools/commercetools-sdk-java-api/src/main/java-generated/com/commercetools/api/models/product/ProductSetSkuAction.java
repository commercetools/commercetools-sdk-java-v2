package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetSkuActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductSetSkuActionImpl.class)
public interface ProductSetSkuAction extends ProductUpdateAction {

    
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
    *  <p>SKU must be unique.
    *  If left blank or set to <code>null</code>, the sku is unset/removed.</p>
    */
    
    @JsonProperty("sku")
    public String getSku();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);
    
    public void setSku(final String sku);
    
    public void setStaged(final Boolean staged);

    public static ProductSetSkuActionImpl of(){
        return new ProductSetSkuActionImpl();
    }
    

    public static ProductSetSkuActionImpl of(final ProductSetSkuAction template) {
        ProductSetSkuActionImpl instance = new ProductSetSkuActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    default <T> T withProductSetSkuAction(Function<ProductSetSkuAction, T> helper) {
        return helper.apply(this);
    }
}
