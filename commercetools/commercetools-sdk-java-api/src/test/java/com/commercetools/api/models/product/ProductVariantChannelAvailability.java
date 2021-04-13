package com.commercetools.api.models.product;


import com.commercetools.api.models.product.ProductVariantChannelAvailabilityImpl;

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
@JsonDeserialize(as = ProductVariantChannelAvailabilityImpl.class)
public interface ProductVariantChannelAvailability  {


    
    
    @JsonProperty("isOnStock")
    public Boolean getIsOnStock();
    
    
    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();
    
    
    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    
    public void setIsOnStock(final Boolean isOnStock);
    
    
    
    public void setRestockableInDays(final Long restockableInDays);
    
    
    
    public void setAvailableQuantity(final Long availableQuantity);
    

    public static ProductVariantChannelAvailability of(){
        return new ProductVariantChannelAvailabilityImpl();
    }
    

    public static ProductVariantChannelAvailability of(final ProductVariantChannelAvailability template) {
        ProductVariantChannelAvailabilityImpl instance = new ProductVariantChannelAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        return instance;
    }

    public static ProductVariantChannelAvailabilityBuilder builder(){
        return ProductVariantChannelAvailabilityBuilder.of();
    }
    
    public static ProductVariantChannelAvailabilityBuilder builder(final ProductVariantChannelAvailability template){
        return ProductVariantChannelAvailabilityBuilder.of(template);
    }
    

    default <T> T withProductVariantChannelAvailability(Function<ProductVariantChannelAvailability, T> helper) {
        return helper.apply(this);
    }
}
