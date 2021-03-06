
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantAvailabilityImpl.class)
public interface ProductVariantAvailability {

    @JsonProperty("isOnStock")
    public Boolean getIsOnStock();

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    @Valid
    @JsonProperty("channels")
    public ProductVariantChannelAvailabilityMap getChannels();

    public void setIsOnStock(final Boolean isOnStock);

    public void setRestockableInDays(final Long restockableInDays);

    public void setAvailableQuantity(final Long availableQuantity);

    public void setChannels(final ProductVariantChannelAvailabilityMap channels);

    public static ProductVariantAvailability of() {
        return new ProductVariantAvailabilityImpl();
    }

    public static ProductVariantAvailability of(final ProductVariantAvailability template) {
        ProductVariantAvailabilityImpl instance = new ProductVariantAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setChannels(template.getChannels());
        return instance;
    }

    public static ProductVariantAvailabilityBuilder builder() {
        return ProductVariantAvailabilityBuilder.of();
    }

    public static ProductVariantAvailabilityBuilder builder(final ProductVariantAvailability template) {
        return ProductVariantAvailabilityBuilder.of(template);
    }

    default <T> T withProductVariantAvailability(Function<ProductVariantAvailability, T> helper) {
        return helper.apply(this);
    }
}
