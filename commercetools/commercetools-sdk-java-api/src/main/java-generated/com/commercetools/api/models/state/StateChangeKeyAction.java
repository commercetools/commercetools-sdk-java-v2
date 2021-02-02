
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateChangeKeyActionImpl.class)
public interface StateChangeKeyAction extends StateUpdateAction {

    String CHANGE_KEY = "changeKey";

    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static StateChangeKeyAction of() {
        return new StateChangeKeyActionImpl();
    }

    public static StateChangeKeyAction of(final StateChangeKeyAction template) {
        StateChangeKeyActionImpl instance = new StateChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static StateChangeKeyActionBuilder builder() {
        return StateChangeKeyActionBuilder.of();
    }

    public static StateChangeKeyActionBuilder builder(final StateChangeKeyAction template) {
        return StateChangeKeyActionBuilder.of(template);
    }

    default <T> T withStateChangeKeyAction(Function<StateChangeKeyAction, T> helper) {
        return helper.apply(this);
    }
}
