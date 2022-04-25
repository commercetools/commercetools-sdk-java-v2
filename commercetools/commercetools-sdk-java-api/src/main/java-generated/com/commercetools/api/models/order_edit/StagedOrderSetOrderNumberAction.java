
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetOrderNumberActionImpl.class)
public interface StagedOrderSetOrderNumberAction extends StagedOrderUpdateAction {

    String SET_ORDER_NUMBER = "setOrderNumber";

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    public void setOrderNumber(final String orderNumber);

    public static StagedOrderSetOrderNumberAction of() {
        return new StagedOrderSetOrderNumberActionImpl();
    }

    public static StagedOrderSetOrderNumberAction of(final StagedOrderSetOrderNumberAction template) {
        StagedOrderSetOrderNumberActionImpl instance = new StagedOrderSetOrderNumberActionImpl();
        instance.setOrderNumber(template.getOrderNumber());
        return instance;
    }

    public static StagedOrderSetOrderNumberActionBuilder builder() {
        return StagedOrderSetOrderNumberActionBuilder.of();
    }

    public static StagedOrderSetOrderNumberActionBuilder builder(final StagedOrderSetOrderNumberAction template) {
        return StagedOrderSetOrderNumberActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetOrderNumberAction(Function<StagedOrderSetOrderNumberAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetOrderNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetOrderNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetOrderNumberAction>";
            }
        };
    }
}
