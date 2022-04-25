
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnInfoActionImpl.class)
public interface OrderSetReturnInfoAction extends OrderUpdateAction {

    String SET_RETURN_INFO = "setReturnInfo";

    @Valid
    @JsonProperty("items")
    public List<ReturnInfoDraft> getItems();

    @JsonIgnore
    public void setItems(final ReturnInfoDraft... items);

    public void setItems(final List<ReturnInfoDraft> items);

    public static OrderSetReturnInfoAction of() {
        return new OrderSetReturnInfoActionImpl();
    }

    public static OrderSetReturnInfoAction of(final OrderSetReturnInfoAction template) {
        OrderSetReturnInfoActionImpl instance = new OrderSetReturnInfoActionImpl();
        instance.setItems(template.getItems());
        return instance;
    }

    public static OrderSetReturnInfoActionBuilder builder() {
        return OrderSetReturnInfoActionBuilder.of();
    }

    public static OrderSetReturnInfoActionBuilder builder(final OrderSetReturnInfoAction template) {
        return OrderSetReturnInfoActionBuilder.of(template);
    }

    default <T> T withOrderSetReturnInfoAction(Function<OrderSetReturnInfoAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnInfoAction>";
            }
        };
    }
}
