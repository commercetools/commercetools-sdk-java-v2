
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeNameActionImpl.class)
public interface CartDiscountChangeNameAction extends CartDiscountUpdateAction {

    String CHANGE_NAME = "changeName";

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static CartDiscountChangeNameAction of() {
        return new CartDiscountChangeNameActionImpl();
    }

    public static CartDiscountChangeNameAction of(final CartDiscountChangeNameAction template) {
        CartDiscountChangeNameActionImpl instance = new CartDiscountChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static CartDiscountChangeNameActionBuilder builder() {
        return CartDiscountChangeNameActionBuilder.of();
    }

    public static CartDiscountChangeNameActionBuilder builder(final CartDiscountChangeNameAction template) {
        return CartDiscountChangeNameActionBuilder.of(template);
    }

    default <T> T withCartDiscountChangeNameAction(Function<CartDiscountChangeNameAction, T> helper) {
        return helper.apply(this);
    }
}
