
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateChangeTypeActionImpl.class)
public interface StateChangeTypeAction extends StateUpdateAction {

    String CHANGE_TYPE = "changeType";

    /**
    *  <p>Resource or object types the State shall be assigned to.
    *  Must not be empty.</p>
    */
    @NotNull
    @JsonProperty("type")
    public StateTypeEnum getType();

    public void setType(final StateTypeEnum type);

    public static StateChangeTypeAction of() {
        return new StateChangeTypeActionImpl();
    }

    public static StateChangeTypeAction of(final StateChangeTypeAction template) {
        StateChangeTypeActionImpl instance = new StateChangeTypeActionImpl();
        instance.setType(template.getType());
        return instance;
    }

    public static StateChangeTypeActionBuilder builder() {
        return StateChangeTypeActionBuilder.of();
    }

    public static StateChangeTypeActionBuilder builder(final StateChangeTypeAction template) {
        return StateChangeTypeActionBuilder.of(template);
    }

    default <T> T withStateChangeTypeAction(Function<StateChangeTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StateChangeTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateChangeTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateChangeTypeAction>";
            }
        };
    }
}
