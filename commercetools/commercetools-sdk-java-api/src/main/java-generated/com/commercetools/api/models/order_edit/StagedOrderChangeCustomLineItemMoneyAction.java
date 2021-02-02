
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeCustomLineItemMoneyActionImpl.class)
public interface StagedOrderChangeCustomLineItemMoneyAction extends StagedOrderUpdateAction {

    String CHANGE_CUSTOM_LINE_ITEM_MONEY = "changeCustomLineItemMoney";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    public void setCustomLineItemId(final String customLineItemId);

    public void setMoney(final Money money);

    public static StagedOrderChangeCustomLineItemMoneyAction of() {
        return new StagedOrderChangeCustomLineItemMoneyActionImpl();
    }

    public static StagedOrderChangeCustomLineItemMoneyAction of(
            final StagedOrderChangeCustomLineItemMoneyAction template) {
        StagedOrderChangeCustomLineItemMoneyActionImpl instance = new StagedOrderChangeCustomLineItemMoneyActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static StagedOrderChangeCustomLineItemMoneyActionBuilder builder() {
        return StagedOrderChangeCustomLineItemMoneyActionBuilder.of();
    }

    public static StagedOrderChangeCustomLineItemMoneyActionBuilder builder(
            final StagedOrderChangeCustomLineItemMoneyAction template) {
        return StagedOrderChangeCustomLineItemMoneyActionBuilder.of(template);
    }

    default <T> T withStagedOrderChangeCustomLineItemMoneyAction(
            Function<StagedOrderChangeCustomLineItemMoneyAction, T> helper) {
        return helper.apply(this);
    }
}
