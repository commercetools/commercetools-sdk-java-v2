
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetMethodInfoMethodChangeImpl.class)
public interface SetMethodInfoMethodChange extends Change {

    String SET_METHOD_INFO_METHOD_CHANGE = "SetMethodInfoMethodChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setMethodInfoMethod</code></p>
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

    public static SetMethodInfoMethodChange of() {
        return new SetMethodInfoMethodChangeImpl();
    }

    public static SetMethodInfoMethodChange of(final SetMethodInfoMethodChange template) {
        SetMethodInfoMethodChangeImpl instance = new SetMethodInfoMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetMethodInfoMethodChangeBuilder builder() {
        return SetMethodInfoMethodChangeBuilder.of();
    }

    public static SetMethodInfoMethodChangeBuilder builder(final SetMethodInfoMethodChange template) {
        return SetMethodInfoMethodChangeBuilder.of(template);
    }

    default <T> T withSetMethodInfoMethodChange(Function<SetMethodInfoMethodChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoMethodChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoMethodChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoMethodChange>";
            }
        };
    }
}
