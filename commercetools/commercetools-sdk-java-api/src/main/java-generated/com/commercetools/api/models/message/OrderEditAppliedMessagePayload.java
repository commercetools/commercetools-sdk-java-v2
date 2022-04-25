
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order_edit.OrderEditApplied;
import com.commercetools.api.models.order_edit.OrderEditReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditAppliedMessagePayloadImpl.class)
public interface OrderEditAppliedMessagePayload extends OrderMessagePayload {

    String ORDER_EDIT_APPLIED = "OrderEditApplied";

    @NotNull
    @Valid
    @JsonProperty("edit")
    public OrderEditReference getEdit();

    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditApplied getResult();

    public void setEdit(final OrderEditReference edit);

    public void setResult(final OrderEditApplied result);

    public static OrderEditAppliedMessagePayload of() {
        return new OrderEditAppliedMessagePayloadImpl();
    }

    public static OrderEditAppliedMessagePayload of(final OrderEditAppliedMessagePayload template) {
        OrderEditAppliedMessagePayloadImpl instance = new OrderEditAppliedMessagePayloadImpl();
        instance.setEdit(template.getEdit());
        instance.setResult(template.getResult());
        return instance;
    }

    public static OrderEditAppliedMessagePayloadBuilder builder() {
        return OrderEditAppliedMessagePayloadBuilder.of();
    }

    public static OrderEditAppliedMessagePayloadBuilder builder(final OrderEditAppliedMessagePayload template) {
        return OrderEditAppliedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderEditAppliedMessagePayload(Function<OrderEditAppliedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditAppliedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditAppliedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditAppliedMessagePayload>";
            }
        };
    }
}
