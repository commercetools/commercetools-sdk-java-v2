
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderEditApplyImpl.class)
public interface OrderEditApply {

    @NotNull
    @JsonProperty("editVersion")
    public Integer getEditVersion();

    @NotNull
    @JsonProperty("resourceVersion")
    public Integer getResourceVersion();

    public void setEditVersion(final Integer editVersion);

    public void setResourceVersion(final Integer resourceVersion);

    public static OrderEditApply of() {
        return new OrderEditApplyImpl();
    }

    public static OrderEditApply of(final OrderEditApply template) {
        OrderEditApplyImpl instance = new OrderEditApplyImpl();
        instance.setEditVersion(template.getEditVersion());
        instance.setResourceVersion(template.getResourceVersion());
        return instance;
    }

    public static OrderEditApplyBuilder builder() {
        return OrderEditApplyBuilder.of();
    }

    public static OrderEditApplyBuilder builder(final OrderEditApply template) {
        return OrderEditApplyBuilder.of(template);
    }

    default <T> T withOrderEditApply(Function<OrderEditApply, T> helper) {
        return helper.apply(this);
    }
}
