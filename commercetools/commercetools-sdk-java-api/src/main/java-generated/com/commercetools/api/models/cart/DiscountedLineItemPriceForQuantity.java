package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.DiscountedLineItemPrice;
import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl;

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
@JsonDeserialize(as = DiscountedLineItemPriceForQuantityImpl.class)
public interface DiscountedLineItemPriceForQuantity  {

    
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();
    
    @NotNull
    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPrice getDiscountedPrice();

    public void setQuantity(final Double quantity);
    
    public void setDiscountedPrice(final DiscountedLineItemPrice discountedPrice);

    public static DiscountedLineItemPriceForQuantityImpl of(){
        return new DiscountedLineItemPriceForQuantityImpl();
    }
    

    public static DiscountedLineItemPriceForQuantityImpl of(final DiscountedLineItemPriceForQuantity template) {
        DiscountedLineItemPriceForQuantityImpl instance = new DiscountedLineItemPriceForQuantityImpl();
        instance.setQuantity(template.getQuantity());
        instance.setDiscountedPrice(template.getDiscountedPrice());
        return instance;
    }

    default <T> T withDiscountedLineItemPriceForQuantity(Function<DiscountedLineItemPriceForQuantity, T> helper) {
        return helper.apply(this);
    }
}
