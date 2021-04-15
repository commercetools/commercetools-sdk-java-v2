package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeRequiresDiscountCodeActionImpl;

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
@JsonDeserialize(as = CartDiscountChangeRequiresDiscountCodeActionImpl.class)
public interface CartDiscountChangeRequiresDiscountCodeAction extends CartDiscountUpdateAction {

    String CHANGE_REQUIRES_DISCOUNT_CODE = "changeRequiresDiscountCode";

    
    @NotNull
    @JsonProperty("requiresDiscountCode")
    public Boolean getRequiresDiscountCode();

    
    public void setRequiresDiscountCode(final Boolean requiresDiscountCode);
    

    public static CartDiscountChangeRequiresDiscountCodeAction of(){
        return new CartDiscountChangeRequiresDiscountCodeActionImpl();
    }
    

    public static CartDiscountChangeRequiresDiscountCodeAction of(final CartDiscountChangeRequiresDiscountCodeAction template) {
        CartDiscountChangeRequiresDiscountCodeActionImpl instance = new CartDiscountChangeRequiresDiscountCodeActionImpl();
        instance.setRequiresDiscountCode(template.getRequiresDiscountCode());
        return instance;
    }

    public static CartDiscountChangeRequiresDiscountCodeActionBuilder builder(){
        return CartDiscountChangeRequiresDiscountCodeActionBuilder.of();
    }
    
    public static CartDiscountChangeRequiresDiscountCodeActionBuilder builder(final CartDiscountChangeRequiresDiscountCodeAction template){
        return CartDiscountChangeRequiresDiscountCodeActionBuilder.of(template);
    }
    

    default <T> T withCartDiscountChangeRequiresDiscountCodeAction(Function<CartDiscountChangeRequiresDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }
}
