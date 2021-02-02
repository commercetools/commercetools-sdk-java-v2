
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodUpdateImpl.class)
public interface ShippingMethodUpdate
        extends com.commercetools.api.models.ResourceUpdate<ShippingMethodUpdate, ShippingMethodUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ShippingMethodUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ShippingMethodUpdateAction... actions);

    public void setActions(final List<ShippingMethodUpdateAction> actions);

    public static ShippingMethodUpdate of() {
        return new ShippingMethodUpdateImpl();
    }

    public static ShippingMethodUpdate of(final ShippingMethodUpdate template) {
        ShippingMethodUpdateImpl instance = new ShippingMethodUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ShippingMethodUpdateBuilder builder() {
        return ShippingMethodUpdateBuilder.of();
    }

    public static ShippingMethodUpdateBuilder builder(final ShippingMethodUpdate template) {
        return ShippingMethodUpdateBuilder.of(template);
    }

    default <T> T withShippingMethodUpdate(Function<ShippingMethodUpdate, T> helper) {
        return helper.apply(this);
    }
}
