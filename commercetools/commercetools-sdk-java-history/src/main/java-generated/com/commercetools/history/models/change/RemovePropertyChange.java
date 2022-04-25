
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemovePropertyChangeImpl.class)
public interface RemovePropertyChange extends Change {

    String REMOVE_PROPERTY_CHANGE = "RemovePropertyChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeProperty</code> on custom objects</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>Value path to the property that was removed</p>
    */
    @NotNull
    @JsonProperty("path")
    public String getPath();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setPath(final String path);

    public void setPreviousValue(final Object previousValue);

    public static RemovePropertyChange of() {
        return new RemovePropertyChangeImpl();
    }

    public static RemovePropertyChange of(final RemovePropertyChange template) {
        RemovePropertyChangeImpl instance = new RemovePropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPath(template.getPath());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemovePropertyChangeBuilder builder() {
        return RemovePropertyChangeBuilder.of();
    }

    public static RemovePropertyChangeBuilder builder(final RemovePropertyChange template) {
        return RemovePropertyChangeBuilder.of(template);
    }

    default <T> T withRemovePropertyChange(Function<RemovePropertyChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemovePropertyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemovePropertyChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemovePropertyChange>";
            }
        };
    }
}
