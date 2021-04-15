
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateUpdateImpl.class)
public interface StateUpdate extends com.commercetools.api.models.ResourceUpdate<StateUpdate, StateUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<StateUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final StateUpdateAction... actions);

    public void setActions(final List<StateUpdateAction> actions);

    public static StateUpdate of() {
        return new StateUpdateImpl();
    }

    public static StateUpdate of(final StateUpdate template) {
        StateUpdateImpl instance = new StateUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static StateUpdateBuilder builder() {
        return StateUpdateBuilder.of();
    }

    public static StateUpdateBuilder builder(final StateUpdate template) {
        return StateUpdateBuilder.of(template);
    }

    default <T> T withStateUpdate(Function<StateUpdate, T> helper) {
        return helper.apply(this);
    }
}
