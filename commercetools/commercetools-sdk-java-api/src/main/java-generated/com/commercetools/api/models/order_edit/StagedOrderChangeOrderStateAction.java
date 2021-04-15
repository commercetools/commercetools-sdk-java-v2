
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeOrderStateActionImpl.class)
public interface StagedOrderChangeOrderStateAction extends StagedOrderUpdateAction {

    String CHANGE_ORDER_STATE = "changeOrderState";

    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    public void setOrderState(final OrderState orderState);

    public static StagedOrderChangeOrderStateAction of() {
        return new StagedOrderChangeOrderStateActionImpl();
    }

    public static StagedOrderChangeOrderStateAction of(final StagedOrderChangeOrderStateAction template) {
        StagedOrderChangeOrderStateActionImpl instance = new StagedOrderChangeOrderStateActionImpl();
        instance.setOrderState(template.getOrderState());
        return instance;
    }

    public static StagedOrderChangeOrderStateActionBuilder builder() {
        return StagedOrderChangeOrderStateActionBuilder.of();
    }

    public static StagedOrderChangeOrderStateActionBuilder builder(final StagedOrderChangeOrderStateAction template) {
        return StagedOrderChangeOrderStateActionBuilder.of(template);
    }

    default <T> T withStagedOrderChangeOrderStateAction(Function<StagedOrderChangeOrderStateAction, T> helper) {
        return helper.apply(this);
    }
}
