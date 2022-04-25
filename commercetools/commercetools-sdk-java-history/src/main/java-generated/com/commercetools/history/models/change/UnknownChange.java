
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = UnknownChangeImpl.class)
public interface UnknownChange extends Change {

    String UNKNOWN_CHANGE = "UnknownChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Object previousValue);

    public void setNextValue(final Object nextValue);

    public static UnknownChange of() {
        return new UnknownChangeImpl();
    }

    public static UnknownChange of(final UnknownChange template) {
        UnknownChangeImpl instance = new UnknownChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static UnknownChangeBuilder builder() {
        return UnknownChangeBuilder.of();
    }

    public static UnknownChangeBuilder builder(final UnknownChange template) {
        return UnknownChangeBuilder.of(template);
    }

    default <T> T withUnknownChange(Function<UnknownChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<UnknownChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UnknownChange>() {
            @Override
            public String toString() {
                return "TypeReference<UnknownChange>";
            }
        };
    }
}
