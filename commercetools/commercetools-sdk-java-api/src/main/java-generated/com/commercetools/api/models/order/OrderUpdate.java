
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderUpdateImpl.class)
public interface OrderUpdate
        extends com.commercetools.api.models.ResourceUpdate<OrderUpdate, OrderUpdateAction, OrderUpdateBuilder> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<OrderUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final OrderUpdateAction... actions);

    public void setActions(final List<OrderUpdateAction> actions);

    public static OrderUpdate of() {
        return new OrderUpdateImpl();
    }

    public static OrderUpdate of(final OrderUpdate template) {
        OrderUpdateImpl instance = new OrderUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static OrderUpdateBuilder builder() {
        return OrderUpdateBuilder.of();
    }

    public static OrderUpdateBuilder builder(final OrderUpdate template) {
        return OrderUpdateBuilder.of(template);
    }

    default <T> T withOrderUpdate(Function<OrderUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<OrderUpdate>";
            }
        };
    }
}
