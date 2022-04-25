
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.CustomFieldExpandedValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddInterfaceInteractionChangeImpl.class)
public interface AddInterfaceInteractionChange extends Change {

    String ADD_INTERFACE_INTERACTION_CHANGE = "AddInterfaceInteractionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addInterfaceInteraction</code> on payments</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>Only available if <code>expand</code> is set to true</p>
    */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFieldExpandedValue getNextValue();

    public void setChange(final String change);

    public void setNextValue(final CustomFieldExpandedValue nextValue);

    public static AddInterfaceInteractionChange of() {
        return new AddInterfaceInteractionChangeImpl();
    }

    public static AddInterfaceInteractionChange of(final AddInterfaceInteractionChange template) {
        AddInterfaceInteractionChangeImpl instance = new AddInterfaceInteractionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddInterfaceInteractionChangeBuilder builder() {
        return AddInterfaceInteractionChangeBuilder.of();
    }

    public static AddInterfaceInteractionChangeBuilder builder(final AddInterfaceInteractionChange template) {
        return AddInterfaceInteractionChangeBuilder.of(template);
    }

    default <T> T withAddInterfaceInteractionChange(Function<AddInterfaceInteractionChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddInterfaceInteractionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddInterfaceInteractionChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddInterfaceInteractionChange>";
            }
        };
    }
}
