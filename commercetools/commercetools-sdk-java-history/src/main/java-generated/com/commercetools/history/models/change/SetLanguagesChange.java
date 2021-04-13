
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetLanguagesChangeImpl.class)
public interface SetLanguagesChange extends Change {

    String SET_LANGUAGES_CHANGE = "SetLanguagesChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLanguages</code> on stores</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    public void setPreviousValue(final List<String> previousValue);

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    public void setNextValue(final List<String> nextValue);

    public static SetLanguagesChange of() {
        return new SetLanguagesChangeImpl();
    }

    public static SetLanguagesChange of(final SetLanguagesChange template) {
        SetLanguagesChangeImpl instance = new SetLanguagesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetLanguagesChangeBuilder builder() {
        return SetLanguagesChangeBuilder.of();
    }

    public static SetLanguagesChangeBuilder builder(final SetLanguagesChange template) {
        return SetLanguagesChangeBuilder.of(template);
    }

    default <T> T withSetLanguagesChange(Function<SetLanguagesChange, T> helper) {
        return helper.apply(this);
    }
}
