package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeSortOrderActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeSortOrderActionImpl.class)
public interface CartDiscountChangeSortOrderAction extends CartDiscountUpdateAction {

    /**
    *  <p>The string must contain a number between 0 and 1.
    *  A discount with greater sortOrder is prioritized higher than a discount with lower sortOrder.</p>
    */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    public void setSortOrder(final String sortOrder);

    public static CartDiscountChangeSortOrderAction of(){
        return new CartDiscountChangeSortOrderActionImpl();
    }
    

    public static CartDiscountChangeSortOrderAction of(final CartDiscountChangeSortOrderAction template) {
        CartDiscountChangeSortOrderActionImpl instance = new CartDiscountChangeSortOrderActionImpl();
        instance.setSortOrder(template.getSortOrder());
        return instance;
    }

    public static CartDiscountChangeSortOrderActionBuilder builder(){
        return CartDiscountChangeSortOrderActionBuilder.of();
    }
    
    public static CartDiscountChangeSortOrderActionBuilder builder(final CartDiscountChangeSortOrderAction template){
        return CartDiscountChangeSortOrderActionBuilder.of(template);
    }
    

    default <T> T withCartDiscountChangeSortOrderAction(Function<CartDiscountChangeSortOrderAction, T> helper) {
        return helper.apply(this);
    }
}
