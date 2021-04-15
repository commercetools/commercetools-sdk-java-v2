
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditAppliedImpl.class)
public interface OrderEditApplied extends OrderEditResult {

    String APPLIED = "Applied";

    @NotNull
    @JsonProperty("appliedAt")
    public ZonedDateTime getAppliedAt();

    @NotNull
    @Valid
    @JsonProperty("excerptBeforeEdit")
    public OrderExcerpt getExcerptBeforeEdit();

    @NotNull
    @Valid
    @JsonProperty("excerptAfterEdit")
    public OrderExcerpt getExcerptAfterEdit();

    public void setAppliedAt(final ZonedDateTime appliedAt);

    public void setExcerptBeforeEdit(final OrderExcerpt excerptBeforeEdit);

    public void setExcerptAfterEdit(final OrderExcerpt excerptAfterEdit);

    public static OrderEditApplied of() {
        return new OrderEditAppliedImpl();
    }

    public static OrderEditApplied of(final OrderEditApplied template) {
        OrderEditAppliedImpl instance = new OrderEditAppliedImpl();
        instance.setAppliedAt(template.getAppliedAt());
        instance.setExcerptBeforeEdit(template.getExcerptBeforeEdit());
        instance.setExcerptAfterEdit(template.getExcerptAfterEdit());
        return instance;
    }

    public static OrderEditAppliedBuilder builder() {
        return OrderEditAppliedBuilder.of();
    }

    public static OrderEditAppliedBuilder builder(final OrderEditApplied template) {
        return OrderEditAppliedBuilder.of(template);
    }

    default <T> T withOrderEditApplied(Function<OrderEditApplied, T> helper) {
        return helper.apply(this);
    }
}
