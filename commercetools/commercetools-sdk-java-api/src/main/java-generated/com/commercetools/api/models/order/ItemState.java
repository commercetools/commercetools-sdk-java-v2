
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ItemStateImpl.class)
public interface ItemState {

    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    public void setQuantity(final Double quantity);

    public void setState(final StateReference state);

    public static ItemState of() {
        return new ItemStateImpl();
    }

    public static ItemState of(final ItemState template) {
        ItemStateImpl instance = new ItemStateImpl();
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        return instance;
    }

    public static ItemStateBuilder builder() {
        return ItemStateBuilder.of();
    }

    public static ItemStateBuilder builder(final ItemState template) {
        return ItemStateBuilder.of(template);
    }

    default <T> T withItemState(Function<ItemState, T> helper) {
        return helper.apply(this);
    }
}
