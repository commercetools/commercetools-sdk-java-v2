package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
    public void setActions(final StateUpdateAction ...actions);
    public void setActions(final List<StateUpdateAction> actions);

    public static StateUpdateImpl of(){
        return new StateUpdateImpl();
    }
    

    public static StateUpdateImpl of(final StateUpdate template) {
        StateUpdateImpl instance = new StateUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withStateUpdate(Function<StateUpdate, T> helper) {
        return helper.apply(this);
    }
}
