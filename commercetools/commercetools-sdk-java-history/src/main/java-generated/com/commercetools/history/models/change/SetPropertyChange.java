
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetPropertyChangeImpl.class)
public interface SetPropertyChange extends Change {

    String SET_PROPERTY_CHANGE = "SetPropertyChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setProperty</code> on custom objects</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>Value path to the property that was changed</p>
    */
    @NotNull
    @JsonProperty("path")
    public String getPath();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setPath(final String path);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final Object previousValue);

    public static SetPropertyChange of() {
        return new SetPropertyChangeImpl();
    }

    public static SetPropertyChange of(final SetPropertyChange template) {
        SetPropertyChangeImpl instance = new SetPropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPath(template.getPath());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetPropertyChangeBuilder builder() {
        return SetPropertyChangeBuilder.of();
    }

    public static SetPropertyChangeBuilder builder(final SetPropertyChange template) {
        return SetPropertyChangeBuilder.of(template);
    }

    default <T> T withSetPropertyChange(Function<SetPropertyChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetPropertyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPropertyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetPropertyChange>";
            }
        };
    }
}
