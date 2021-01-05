package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductChangeMasterVariantActionImpl;

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
@JsonDeserialize(as = ProductChangeMasterVariantActionImpl.class)
public interface ProductChangeMasterVariantAction extends ProductUpdateAction {

    
    
    @JsonProperty("variantId")
    public Long getVariantId();
    
    
    @JsonProperty("sku")
    public String getSku();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);
    
    public void setSku(final String sku);
    
    public void setStaged(final Boolean staged);

    public static ProductChangeMasterVariantAction of(){
        return new ProductChangeMasterVariantActionImpl();
    }
    

    public static ProductChangeMasterVariantAction of(final ProductChangeMasterVariantAction template) {
        ProductChangeMasterVariantActionImpl instance = new ProductChangeMasterVariantActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductChangeMasterVariantActionBuilder builder(){
        return ProductChangeMasterVariantActionBuilder.of();
    }
    
    public static ProductChangeMasterVariantActionBuilder builder(final ProductChangeMasterVariantAction template){
        return ProductChangeMasterVariantActionBuilder.of(template);
    }
    

    default <T> T withProductChangeMasterVariantAction(Function<ProductChangeMasterVariantAction, T> helper) {
        return helper.apply(this);
    }
}
