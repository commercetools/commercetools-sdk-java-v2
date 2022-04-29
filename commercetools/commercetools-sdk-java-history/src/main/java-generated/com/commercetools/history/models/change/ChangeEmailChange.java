
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeEmailChangeImpl.class)
public interface ChangeEmailChange extends Change {

    String CHANGE_EMAIL_CHANGE = "ChangeEmailChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeEmail</code></p>
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

    public static ChangeEmailChange of() {
        return new ChangeEmailChangeImpl();
    }

    public static ChangeEmailChange of(final ChangeEmailChange template) {
        ChangeEmailChangeImpl instance = new ChangeEmailChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeEmailChangeBuilder builder() {
        return ChangeEmailChangeBuilder.of();
    }

    public static ChangeEmailChangeBuilder builder(final ChangeEmailChange template) {
        return ChangeEmailChangeBuilder.of(template);
    }

    default <T> T withChangeEmailChange(Function<ChangeEmailChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeEmailChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeEmailChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeEmailChange>";
            }
        };
    }
}
