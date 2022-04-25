
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantChannelAvailabilityImpl.class)
public interface ProductVariantChannelAvailability {

    @JsonProperty("isOnStock")
    public Boolean getIsOnStock();

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    public void setIsOnStock(final Boolean isOnStock);

    public void setRestockableInDays(final Long restockableInDays);

    public void setAvailableQuantity(final Long availableQuantity);

    public static ProductVariantChannelAvailability of() {
        return new ProductVariantChannelAvailabilityImpl();
    }

    public static ProductVariantChannelAvailability of(final ProductVariantChannelAvailability template) {
        ProductVariantChannelAvailabilityImpl instance = new ProductVariantChannelAvailabilityImpl();
        instance.setIsOnStock(template.getIsOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        return instance;
    }

    public static ProductVariantChannelAvailabilityBuilder builder() {
        return ProductVariantChannelAvailabilityBuilder.of();
    }

    public static ProductVariantChannelAvailabilityBuilder builder(final ProductVariantChannelAvailability template) {
        return ProductVariantChannelAvailabilityBuilder.of(template);
    }

    default <T> T withProductVariantChannelAvailability(Function<ProductVariantChannelAvailability, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantChannelAvailability> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantChannelAvailability>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantChannelAvailability>";
            }
        };
    }
}
