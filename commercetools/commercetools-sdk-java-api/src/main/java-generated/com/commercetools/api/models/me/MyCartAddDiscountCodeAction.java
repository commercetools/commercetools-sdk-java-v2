
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartAddDiscountCodeActionImpl.class)
public interface MyCartAddDiscountCodeAction extends MyCartUpdateAction {

    String ADD_DISCOUNT_CODE = "addDiscountCode";

    @NotNull
    @JsonProperty("code")
    public String getCode();

    public void setCode(final String code);

    public static MyCartAddDiscountCodeAction of() {
        return new MyCartAddDiscountCodeActionImpl();
    }

    public static MyCartAddDiscountCodeAction of(final MyCartAddDiscountCodeAction template) {
        MyCartAddDiscountCodeActionImpl instance = new MyCartAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    public static MyCartAddDiscountCodeActionBuilder builder() {
        return MyCartAddDiscountCodeActionBuilder.of();
    }

    public static MyCartAddDiscountCodeActionBuilder builder(final MyCartAddDiscountCodeAction template) {
        return MyCartAddDiscountCodeActionBuilder.of(template);
    }

    default <T> T withMyCartAddDiscountCodeAction(Function<MyCartAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartAddDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartAddDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartAddDiscountCodeAction>";
            }
        };
    }
}
