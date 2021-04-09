
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetLocaleChangeImpl.class)
public interface SetLocaleChange extends Change {

    String SET_LOCALE_CHANGE = "SetLocaleChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLocale</code> on reviews</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>A locale of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>.</p>
    */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
    *  <p>A locale of <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a>.</p>
    */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetLocaleChange of() {
        return new SetLocaleChangeImpl();
    }

    public static SetLocaleChange of(final SetLocaleChange template) {
        SetLocaleChangeImpl instance = new SetLocaleChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetLocaleChangeBuilder builder() {
        return SetLocaleChangeBuilder.of();
    }

    public static SetLocaleChangeBuilder builder(final SetLocaleChange template) {
        return SetLocaleChangeBuilder.of(template);
    }

    default <T> T withSetLocaleChange(Function<SetLocaleChange, T> helper) {
        return helper.apply(this);
    }
}
