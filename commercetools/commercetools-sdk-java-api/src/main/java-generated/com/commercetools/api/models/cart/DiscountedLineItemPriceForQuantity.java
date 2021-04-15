
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPriceForQuantityImpl.class)
public interface DiscountedLineItemPriceForQuantity {

    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    @NotNull
    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPrice getDiscountedPrice();

    public void setQuantity(final Double quantity);

    public void setDiscountedPrice(final DiscountedLineItemPrice discountedPrice);

    public static DiscountedLineItemPriceForQuantity of() {
        return new DiscountedLineItemPriceForQuantityImpl();
    }

    public static DiscountedLineItemPriceForQuantity of(final DiscountedLineItemPriceForQuantity template) {
        DiscountedLineItemPriceForQuantityImpl instance = new DiscountedLineItemPriceForQuantityImpl();
        instance.setQuantity(template.getQuantity());
        instance.setDiscountedPrice(template.getDiscountedPrice());
        return instance;
    }

    public static DiscountedLineItemPriceForQuantityBuilder builder() {
        return DiscountedLineItemPriceForQuantityBuilder.of();
    }

    public static DiscountedLineItemPriceForQuantityBuilder builder(final DiscountedLineItemPriceForQuantity template) {
        return DiscountedLineItemPriceForQuantityBuilder.of(template);
    }

    default <T> T withDiscountedLineItemPriceForQuantity(Function<DiscountedLineItemPriceForQuantity, T> helper) {
        return helper.apply(this);
    }
}
