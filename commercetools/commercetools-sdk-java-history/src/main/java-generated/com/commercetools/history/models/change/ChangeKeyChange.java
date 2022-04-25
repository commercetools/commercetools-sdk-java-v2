
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeKeyChangeImpl.class)
public interface ChangeKeyChange extends Change {

    String CHANGE_KEY_CHANGE = "ChangeKeyChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeKey</code></p>
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

    public static ChangeKeyChange of() {
        return new ChangeKeyChangeImpl();
    }

    public static ChangeKeyChange of(final ChangeKeyChange template) {
        ChangeKeyChangeImpl instance = new ChangeKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeKeyChangeBuilder builder() {
        return ChangeKeyChangeBuilder.of();
    }

    public static ChangeKeyChangeBuilder builder(final ChangeKeyChange template) {
        return ChangeKeyChangeBuilder.of(template);
    }

    default <T> T withChangeKeyChange(Function<ChangeKeyChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeKeyChange>";
            }
        };
    }
}
