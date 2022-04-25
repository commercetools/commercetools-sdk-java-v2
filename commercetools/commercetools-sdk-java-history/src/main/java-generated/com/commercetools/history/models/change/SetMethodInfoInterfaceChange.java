
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetMethodInfoInterfaceChangeImpl.class)
public interface SetMethodInfoInterfaceChange extends Change {

    String SET_METHOD_INFO_INTERFACE_CHANGE = "SetMethodInfoInterfaceChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setMethodInfoInterface</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetMethodInfoInterfaceChange of() {
        return new SetMethodInfoInterfaceChangeImpl();
    }

    public static SetMethodInfoInterfaceChange of(final SetMethodInfoInterfaceChange template) {
        SetMethodInfoInterfaceChangeImpl instance = new SetMethodInfoInterfaceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetMethodInfoInterfaceChangeBuilder builder() {
        return SetMethodInfoInterfaceChangeBuilder.of();
    }

    public static SetMethodInfoInterfaceChangeBuilder builder(final SetMethodInfoInterfaceChange template) {
        return SetMethodInfoInterfaceChangeBuilder.of(template);
    }

    default <T> T withSetMethodInfoInterfaceChange(Function<SetMethodInfoInterfaceChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoInterfaceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoInterfaceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoInterfaceChange>";
            }
        };
    }
}
