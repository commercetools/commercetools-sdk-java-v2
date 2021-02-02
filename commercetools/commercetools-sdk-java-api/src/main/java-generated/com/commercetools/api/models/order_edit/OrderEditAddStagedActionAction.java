
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditAddStagedActionActionImpl.class)
public interface OrderEditAddStagedActionAction extends OrderEditUpdateAction {

    String ADD_STAGED_ACTION = "addStagedAction";

    @NotNull
    @Valid
    @JsonProperty("stagedAction")
    public StagedOrderUpdateAction getStagedAction();

    public void setStagedAction(final StagedOrderUpdateAction stagedAction);

    public static OrderEditAddStagedActionAction of() {
        return new OrderEditAddStagedActionActionImpl();
    }

    public static OrderEditAddStagedActionAction of(final OrderEditAddStagedActionAction template) {
        OrderEditAddStagedActionActionImpl instance = new OrderEditAddStagedActionActionImpl();
        instance.setStagedAction(template.getStagedAction());
        return instance;
    }

    public static OrderEditAddStagedActionActionBuilder builder() {
        return OrderEditAddStagedActionActionBuilder.of();
    }

    public static OrderEditAddStagedActionActionBuilder builder(final OrderEditAddStagedActionAction template) {
        return OrderEditAddStagedActionActionBuilder.of(template);
    }

    default <T> T withOrderEditAddStagedActionAction(Function<OrderEditAddStagedActionAction, T> helper) {
        return helper.apply(this);
    }
}
