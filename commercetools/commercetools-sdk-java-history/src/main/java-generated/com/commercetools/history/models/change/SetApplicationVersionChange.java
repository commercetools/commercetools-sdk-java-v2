
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetApplicationVersionChangeImpl.class)
public interface SetApplicationVersionChange extends Change {

    String SET_APPLICATION_VERSION_CHANGE = "SetApplicationVersionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Internal Update action for <code>setApplicationVersion</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Integer previousValue);

    public void setNextValue(final Integer nextValue);

    public static SetApplicationVersionChange of() {
        return new SetApplicationVersionChangeImpl();
    }

    public static SetApplicationVersionChange of(final SetApplicationVersionChange template) {
        SetApplicationVersionChangeImpl instance = new SetApplicationVersionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetApplicationVersionChangeBuilder builder() {
        return SetApplicationVersionChangeBuilder.of();
    }

    public static SetApplicationVersionChangeBuilder builder(final SetApplicationVersionChange template) {
        return SetApplicationVersionChangeBuilder.of(template);
    }

    default <T> T withSetApplicationVersionChange(Function<SetApplicationVersionChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationVersionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationVersionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationVersionChange>";
            }
        };
    }
}
