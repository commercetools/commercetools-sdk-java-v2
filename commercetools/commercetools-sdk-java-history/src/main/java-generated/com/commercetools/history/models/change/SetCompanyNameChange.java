
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCompanyNameChangeImpl.class)
public interface SetCompanyNameChange extends Change {

    String SET_COMPANY_NAME_CHANGE = "SetCompanyNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setCompanyName</code></p>
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

    public static SetCompanyNameChange of() {
        return new SetCompanyNameChangeImpl();
    }

    public static SetCompanyNameChange of(final SetCompanyNameChange template) {
        SetCompanyNameChangeImpl instance = new SetCompanyNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCompanyNameChangeBuilder builder() {
        return SetCompanyNameChangeBuilder.of();
    }

    public static SetCompanyNameChangeBuilder builder(final SetCompanyNameChange template) {
        return SetCompanyNameChangeBuilder.of(template);
    }

    default <T> T withSetCompanyNameChange(Function<SetCompanyNameChange, T> helper) {
        return helper.apply(this);
    }
}
