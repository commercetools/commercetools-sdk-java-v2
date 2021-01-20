
package com.commercetools.api.models.cart_discount;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountChangeStackingModeActionImpl;
import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.StackingMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeStackingModeActionImpl.class)
public interface CartDiscountChangeStackingModeAction extends CartDiscountUpdateAction {

    @NotNull
    @JsonProperty("stackingMode")
    public StackingMode getStackingMode();

    public void setStackingMode(final StackingMode stackingMode);

    public static CartDiscountChangeStackingModeAction of() {
        return new CartDiscountChangeStackingModeActionImpl();
    }

    public static CartDiscountChangeStackingModeAction of(final CartDiscountChangeStackingModeAction template) {
        CartDiscountChangeStackingModeActionImpl instance = new CartDiscountChangeStackingModeActionImpl();
        instance.setStackingMode(template.getStackingMode());
        return instance;
    }

    public static CartDiscountChangeStackingModeActionBuilder builder() {
        return CartDiscountChangeStackingModeActionBuilder.of();
    }

    public static CartDiscountChangeStackingModeActionBuilder builder(
            final CartDiscountChangeStackingModeAction template) {
        return CartDiscountChangeStackingModeActionBuilder.of(template);
    }

    default <T> T withCartDiscountChangeStackingModeAction(Function<CartDiscountChangeStackingModeAction, T> helper) {
        return helper.apply(this);
    }
}
