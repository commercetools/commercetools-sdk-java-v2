
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetStoreChangeImpl.class)
public interface SetStoreChange extends Change {

    String SET_STORE_CHANGE = "SetStoreChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setStore</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Reference previousValue);

    public void setNextValue(final Reference nextValue);

    public static SetStoreChange of() {
        return new SetStoreChangeImpl();
    }

    public static SetStoreChange of(final SetStoreChange template) {
        SetStoreChangeImpl instance = new SetStoreChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetStoreChangeBuilder builder() {
        return SetStoreChangeBuilder.of();
    }

    public static SetStoreChangeBuilder builder(final SetStoreChange template) {
        return SetStoreChangeBuilder.of(template);
    }

    default <T> T withSetStoreChange(Function<SetStoreChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetStoreChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetStoreChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetStoreChange>";
            }
        };
    }
}
