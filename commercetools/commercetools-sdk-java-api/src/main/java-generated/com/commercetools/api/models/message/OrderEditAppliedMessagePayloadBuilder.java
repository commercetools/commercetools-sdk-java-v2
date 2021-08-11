
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditAppliedMessagePayloadBuilder implements Builder<OrderEditAppliedMessagePayload> {

    private com.commercetools.api.models.order_edit.OrderEditReference edit;

    private com.commercetools.api.models.order_edit.OrderEditApplied result;

    public OrderEditAppliedMessagePayloadBuilder edit(
            Function<com.commercetools.api.models.order_edit.OrderEditReferenceBuilder, com.commercetools.api.models.order_edit.OrderEditReferenceBuilder> builder) {
        this.edit = builder.apply(com.commercetools.api.models.order_edit.OrderEditReferenceBuilder.of()).build();
        return this;
    }

    public OrderEditAppliedMessagePayloadBuilder edit(
            final com.commercetools.api.models.order_edit.OrderEditReference edit) {
        this.edit = edit;
        return this;
    }

    public OrderEditAppliedMessagePayloadBuilder result(
            Function<com.commercetools.api.models.order_edit.OrderEditAppliedBuilder, com.commercetools.api.models.order_edit.OrderEditAppliedBuilder> builder) {
        this.result = builder.apply(com.commercetools.api.models.order_edit.OrderEditAppliedBuilder.of()).build();
        return this;
    }

    public OrderEditAppliedMessagePayloadBuilder result(
            final com.commercetools.api.models.order_edit.OrderEditApplied result) {
        this.result = result;
        return this;
    }

    public com.commercetools.api.models.order_edit.OrderEditReference getEdit() {
        return this.edit;
    }

    public com.commercetools.api.models.order_edit.OrderEditApplied getResult() {
        return this.result;
    }

    public OrderEditAppliedMessagePayload build() {
        Objects.requireNonNull(edit, OrderEditAppliedMessagePayload.class + ": edit is missing");
        Objects.requireNonNull(result, OrderEditAppliedMessagePayload.class + ": result is missing");
        return new OrderEditAppliedMessagePayloadImpl(edit, result);
    }

    /**
     * builds OrderEditAppliedMessagePayload without checking for non null required values
     */
    public OrderEditAppliedMessagePayload buildUnchecked() {
        return new OrderEditAppliedMessagePayloadImpl(edit, result);
    }

    public static OrderEditAppliedMessagePayloadBuilder of() {
        return new OrderEditAppliedMessagePayloadBuilder();
    }

    public static OrderEditAppliedMessagePayloadBuilder of(final OrderEditAppliedMessagePayload template) {
        OrderEditAppliedMessagePayloadBuilder builder = new OrderEditAppliedMessagePayloadBuilder();
        builder.edit = template.getEdit();
        builder.result = template.getResult();
        return builder;
    }

}
