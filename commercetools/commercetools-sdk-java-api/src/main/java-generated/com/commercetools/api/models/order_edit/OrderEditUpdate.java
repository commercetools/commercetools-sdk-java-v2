
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditUpdateImpl.class)
public interface OrderEditUpdate
        extends com.commercetools.api.models.ResourceUpdate<OrderEditUpdate, OrderEditUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<OrderEditUpdateAction> getActions();

    @JsonProperty("dryRun")
    public Boolean getDryRun();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final OrderEditUpdateAction... actions);

    public void setActions(final List<OrderEditUpdateAction> actions);

    public void setDryRun(final Boolean dryRun);

    public static OrderEditUpdate of() {
        return new OrderEditUpdateImpl();
    }

    public static OrderEditUpdate of(final OrderEditUpdate template) {
        OrderEditUpdateImpl instance = new OrderEditUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        instance.setDryRun(template.getDryRun());
        return instance;
    }

    public static OrderEditUpdateBuilder builder() {
        return OrderEditUpdateBuilder.of();
    }

    public static OrderEditUpdateBuilder builder(final OrderEditUpdate template) {
        return OrderEditUpdateBuilder.of(template);
    }

    default <T> T withOrderEditUpdate(Function<OrderEditUpdate, T> helper) {
        return helper.apply(this);
    }
}
