package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductVariantChannelAvailability;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantChannelAvailabilityMapImpl implements ProductVariantChannelAvailabilityMap {

    private Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> values;

    @JsonCreator
    ProductVariantChannelAvailabilityMapImpl(@JsonProperty("values") final Map<String, com.commercetools.api.models.product.ProductVariantChannelAvailability> values) {
        this.values = values;
    }
    public ProductVariantChannelAvailabilityMapImpl() {
       
    }

    
    public Map<String,com.commercetools.api.models.product.ProductVariantChannelAvailability> values() {
        return values;
    }

    public void setValue(String key, com.commercetools.api.models.product.ProductVariantChannelAvailability value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

}
