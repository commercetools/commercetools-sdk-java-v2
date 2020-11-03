package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductVariantChannelAvailability;
import com.commercetools.api.models.product.ProductVariantChannelAvailabilityMapImpl;

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
@JsonDeserialize(as = ProductVariantChannelAvailabilityMapImpl.class)
public interface ProductVariantChannelAvailabilityMap  {

    
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, ProductVariantChannelAvailability> values();

    @JsonAnySetter
    public void setValue(String key, ProductVariantChannelAvailability value);

    public static ProductVariantChannelAvailabilityMapImpl of(){
        return new ProductVariantChannelAvailabilityMapImpl();
    }
    

    public static ProductVariantChannelAvailabilityMapImpl of(final ProductVariantChannelAvailabilityMap template) {
        ProductVariantChannelAvailabilityMapImpl instance = new ProductVariantChannelAvailabilityMapImpl();
        return instance;
    }

    default <T> T withProductVariantChannelAvailabilityMap(Function<ProductVariantChannelAvailabilityMap, T> helper) {
        return helper.apply(this);
    }
}
