
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateSetNameActionImpl.class)
public interface StateSetNameAction extends StateUpdateAction {

    String SET_NAME = "setName";

    /**
    *  <p>Value to set.
    *  If empty, any existing value will be removed.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static StateSetNameAction of() {
        return new StateSetNameActionImpl();
    }

    public static StateSetNameAction of(final StateSetNameAction template) {
        StateSetNameActionImpl instance = new StateSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static StateSetNameActionBuilder builder() {
        return StateSetNameActionBuilder.of();
    }

    public static StateSetNameActionBuilder builder(final StateSetNameAction template) {
        return StateSetNameActionBuilder.of(template);
    }

    default <T> T withStateSetNameAction(Function<StateSetNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StateSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateSetNameAction>";
            }
        };
    }
}
