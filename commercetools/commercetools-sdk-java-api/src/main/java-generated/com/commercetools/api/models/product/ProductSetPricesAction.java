package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetPricesActionImpl;

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
@JsonDeserialize(as = ProductSetPricesActionImpl.class)
public interface ProductSetPricesAction extends ProductUpdateAction {

    
    
    @JsonProperty("variantId")
    public Long getVariantId();
    
    
    @JsonProperty("sku")
    public String getSku();
    
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);
    
    public void setSku(final String sku);
    
    @JsonIgnore
    public void setPrices(final PriceDraft ...prices);
    public void setPrices(final List<PriceDraft> prices);
    
    public void setStaged(final Boolean staged);

    public static ProductSetPricesActionImpl of(){
        return new ProductSetPricesActionImpl();
    }
    

    public static ProductSetPricesActionImpl of(final ProductSetPricesAction template) {
        ProductSetPricesActionImpl instance = new ProductSetPricesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setStaged(template.getStaged());
        return instance;
    }

    default <T> T withProductSetPricesAction(Function<ProductSetPricesAction, T> helper) {
        return helper.apply(this);
    }
}
