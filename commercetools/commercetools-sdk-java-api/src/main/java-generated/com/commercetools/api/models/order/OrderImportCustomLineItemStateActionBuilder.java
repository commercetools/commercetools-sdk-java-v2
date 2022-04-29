
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderImportCustomLineItemStateActionBuilder implements Builder<OrderImportCustomLineItemStateAction> {

    private String customLineItemId;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    public OrderImportCustomLineItemStateActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public OrderImportCustomLineItemStateActionBuilder state(
            final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public OrderImportCustomLineItemStateActionBuilder state(
            final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    public OrderImportCustomLineItemStateActionBuilder plusState(
            final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    public OrderImportCustomLineItemStateActionBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public OrderImportCustomLineItemStateActionBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    public OrderImportCustomLineItemStateAction build() {
        Objects.requireNonNull(customLineItemId,
            OrderImportCustomLineItemStateAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(state, OrderImportCustomLineItemStateAction.class + ": state is missing");
        return new OrderImportCustomLineItemStateActionImpl(customLineItemId, state);
    }

    /**
     * builds OrderImportCustomLineItemStateAction without checking for non null required values
     */
    public OrderImportCustomLineItemStateAction buildUnchecked() {
        return new OrderImportCustomLineItemStateActionImpl(customLineItemId, state);
    }

    public static OrderImportCustomLineItemStateActionBuilder of() {
        return new OrderImportCustomLineItemStateActionBuilder();
    }

    public static OrderImportCustomLineItemStateActionBuilder of(final OrderImportCustomLineItemStateAction template) {
        OrderImportCustomLineItemStateActionBuilder builder = new OrderImportCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.state = template.getState();
        return builder;
    }

}
