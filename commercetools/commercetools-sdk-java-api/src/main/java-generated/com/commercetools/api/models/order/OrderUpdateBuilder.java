
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderUpdateBuilder implements Builder<OrderUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.order.OrderUpdateAction> actions;

    public OrderUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderUpdateBuilder actions(final com.commercetools.api.models.order.OrderUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public OrderUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.order.OrderUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public OrderUpdateBuilder plusActions(final com.commercetools.api.models.order.OrderUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public OrderUpdateBuilder plusActions(
            Function<com.commercetools.api.models.order.OrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.OrderUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.order.OrderUpdateActionBuilder.of()).build());
        return this;
    }

    public OrderUpdateBuilder withActions(
            Function<com.commercetools.api.models.order.OrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.OrderUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.order.OrderUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.order.OrderUpdateAction> getActions() {
        return this.actions;
    }

    public OrderUpdate build() {
        Objects.requireNonNull(version, OrderUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, OrderUpdate.class + ": actions is missing");
        return new OrderUpdateImpl(version, actions);
    }

    /**
     * builds OrderUpdate without checking for non null required values
     */
    public OrderUpdate buildUnchecked() {
        return new OrderUpdateImpl(version, actions);
    }

    public static OrderUpdateBuilder of() {
        return new OrderUpdateBuilder();
    }

    public static OrderUpdateBuilder of(final OrderUpdate template) {
        OrderUpdateBuilder builder = new OrderUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
