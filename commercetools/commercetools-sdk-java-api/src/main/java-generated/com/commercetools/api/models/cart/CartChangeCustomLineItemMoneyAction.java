
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartChangeCustomLineItemMoneyActionImpl.class)
public interface CartChangeCustomLineItemMoneyAction extends CartUpdateAction {

    String CHANGE_CUSTOM_LINE_ITEM_MONEY = "changeCustomLineItemMoney";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
    *  <p>For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    public void setCustomLineItemId(final String customLineItemId);

    public void setMoney(final Money money);

    public static CartChangeCustomLineItemMoneyAction of() {
        return new CartChangeCustomLineItemMoneyActionImpl();
    }

    public static CartChangeCustomLineItemMoneyAction of(final CartChangeCustomLineItemMoneyAction template) {
        CartChangeCustomLineItemMoneyActionImpl instance = new CartChangeCustomLineItemMoneyActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static CartChangeCustomLineItemMoneyActionBuilder builder() {
        return CartChangeCustomLineItemMoneyActionBuilder.of();
    }

    public static CartChangeCustomLineItemMoneyActionBuilder builder(
            final CartChangeCustomLineItemMoneyAction template) {
        return CartChangeCustomLineItemMoneyActionBuilder.of(template);
    }

    default <T> T withCartChangeCustomLineItemMoneyAction(Function<CartChangeCustomLineItemMoneyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemMoneyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemMoneyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeCustomLineItemMoneyAction>";
            }
        };
    }
}
