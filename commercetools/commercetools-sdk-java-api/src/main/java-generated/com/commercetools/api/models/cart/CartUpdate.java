
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartUpdateImpl.class)
public interface CartUpdate extends com.commercetools.api.models.ResourceUpdate<CartUpdate, CartUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CartUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final CartUpdateAction... actions);

    public void setActions(final List<CartUpdateAction> actions);

    public static CartUpdate of() {
        return new CartUpdateImpl();
    }

    public static CartUpdate of(final CartUpdate template) {
        CartUpdateImpl instance = new CartUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static CartUpdateBuilder builder() {
        return CartUpdateBuilder.of();
    }

    public static CartUpdateBuilder builder(final CartUpdate template) {
        return CartUpdateBuilder.of(template);
    }

    default <T> T withCartUpdate(Function<CartUpdate, T> helper) {
        return helper.apply(this);
    }
}
