
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateChangeInitialActionImpl.class)
public interface StateChangeInitialAction extends StateUpdateAction {

    String CHANGE_INITIAL = "changeInitial";

    @NotNull
    @JsonProperty("initial")
    public Boolean getInitial();

    public void setInitial(final Boolean initial);

    public static StateChangeInitialAction of() {
        return new StateChangeInitialActionImpl();
    }

    public static StateChangeInitialAction of(final StateChangeInitialAction template) {
        StateChangeInitialActionImpl instance = new StateChangeInitialActionImpl();
        instance.setInitial(template.getInitial());
        return instance;
    }

    public static StateChangeInitialActionBuilder builder() {
        return StateChangeInitialActionBuilder.of();
    }

    public static StateChangeInitialActionBuilder builder(final StateChangeInitialAction template) {
        return StateChangeInitialActionBuilder.of(template);
    }

    default <T> T withStateChangeInitialAction(Function<StateChangeInitialAction, T> helper) {
        return helper.apply(this);
    }
}
