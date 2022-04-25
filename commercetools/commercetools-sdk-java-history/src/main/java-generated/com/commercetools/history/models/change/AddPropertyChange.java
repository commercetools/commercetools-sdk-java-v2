
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddPropertyChangeImpl.class)
public interface AddPropertyChange extends Change {

    String ADD_PROPERTY_CHANGE = "AddPropertyChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addProperty</code> on custom objects</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>Value path to the property that was added</p>
    */
    @NotNull
    @JsonProperty("path")
    public String getPath();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    public void setChange(final String change);

    public void setPath(final String path);

    public void setNextValue(final Object nextValue);

    public static AddPropertyChange of() {
        return new AddPropertyChangeImpl();
    }

    public static AddPropertyChange of(final AddPropertyChange template) {
        AddPropertyChangeImpl instance = new AddPropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPath(template.getPath());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddPropertyChangeBuilder builder() {
        return AddPropertyChangeBuilder.of();
    }

    public static AddPropertyChangeBuilder builder(final AddPropertyChange template) {
        return AddPropertyChangeBuilder.of(template);
    }

    default <T> T withAddPropertyChange(Function<AddPropertyChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddPropertyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddPropertyChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddPropertyChange>";
            }
        };
    }
}
