
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetAnonymousIdChangeImpl.class)
public interface SetAnonymousIdChange extends Change {

    String SET_ANONYMOUS_ID_CHANGE = "SetAnonymousIdChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setAnonymousId</code></p>
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

    public static SetAnonymousIdChange of() {
        return new SetAnonymousIdChangeImpl();
    }

    public static SetAnonymousIdChange of(final SetAnonymousIdChange template) {
        SetAnonymousIdChangeImpl instance = new SetAnonymousIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetAnonymousIdChangeBuilder builder() {
        return SetAnonymousIdChangeBuilder.of();
    }

    public static SetAnonymousIdChangeBuilder builder(final SetAnonymousIdChange template) {
        return SetAnonymousIdChangeBuilder.of(template);
    }

    default <T> T withSetAnonymousIdChange(Function<SetAnonymousIdChange, T> helper) {
        return helper.apply(this);
    }
}
