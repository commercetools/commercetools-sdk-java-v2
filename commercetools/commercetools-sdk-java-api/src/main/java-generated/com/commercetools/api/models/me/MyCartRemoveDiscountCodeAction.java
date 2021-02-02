
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartRemoveDiscountCodeActionImpl.class)
public interface MyCartRemoveDiscountCodeAction extends MyCartUpdateAction {

    String REMOVE_DISCOUNT_CODE = "removeDiscountCode";

    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static MyCartRemoveDiscountCodeAction of() {
        return new MyCartRemoveDiscountCodeActionImpl();
    }

    public static MyCartRemoveDiscountCodeAction of(final MyCartRemoveDiscountCodeAction template) {
        MyCartRemoveDiscountCodeActionImpl instance = new MyCartRemoveDiscountCodeActionImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public static MyCartRemoveDiscountCodeActionBuilder builder() {
        return MyCartRemoveDiscountCodeActionBuilder.of();
    }

    public static MyCartRemoveDiscountCodeActionBuilder builder(final MyCartRemoveDiscountCodeAction template) {
        return MyCartRemoveDiscountCodeActionBuilder.of(template);
    }

    default <T> T withMyCartRemoveDiscountCodeAction(Function<MyCartRemoveDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }
}
