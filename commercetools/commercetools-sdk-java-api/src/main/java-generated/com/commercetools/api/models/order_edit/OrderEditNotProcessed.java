
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditNotProcessedImpl.class)
public interface OrderEditNotProcessed extends OrderEditResult {

    String NOT_PROCESSED = "NotProcessed";

    public static OrderEditNotProcessed of() {
        return new OrderEditNotProcessedImpl();
    }

    public static OrderEditNotProcessed of(final OrderEditNotProcessed template) {
        OrderEditNotProcessedImpl instance = new OrderEditNotProcessedImpl();
        return instance;
    }

    public static OrderEditNotProcessedBuilder builder() {
        return OrderEditNotProcessedBuilder.of();
    }

    public static OrderEditNotProcessedBuilder builder(final OrderEditNotProcessed template) {
        return OrderEditNotProcessedBuilder.of(template);
    }

    default <T> T withOrderEditNotProcessed(Function<OrderEditNotProcessed, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditNotProcessed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditNotProcessed>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditNotProcessed>";
            }
        };
    }
}
