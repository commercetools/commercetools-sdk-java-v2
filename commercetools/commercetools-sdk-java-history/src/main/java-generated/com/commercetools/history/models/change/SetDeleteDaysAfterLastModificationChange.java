
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetDeleteDaysAfterLastModificationChangeImpl.class)
public interface SetDeleteDaysAfterLastModificationChange extends Change {

    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION_CHANGE = "SetDeleteDaysAfterLastModificationChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setDeleteDaysAfterLastModification</code></p>
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

    public static SetDeleteDaysAfterLastModificationChange of() {
        return new SetDeleteDaysAfterLastModificationChangeImpl();
    }

    public static SetDeleteDaysAfterLastModificationChange of(final SetDeleteDaysAfterLastModificationChange template) {
        SetDeleteDaysAfterLastModificationChangeImpl instance = new SetDeleteDaysAfterLastModificationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetDeleteDaysAfterLastModificationChangeBuilder builder() {
        return SetDeleteDaysAfterLastModificationChangeBuilder.of();
    }

    public static SetDeleteDaysAfterLastModificationChangeBuilder builder(
            final SetDeleteDaysAfterLastModificationChange template) {
        return SetDeleteDaysAfterLastModificationChangeBuilder.of(template);
    }

    default <T> T withSetDeleteDaysAfterLastModificationChange(
            Function<SetDeleteDaysAfterLastModificationChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetDeleteDaysAfterLastModificationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDeleteDaysAfterLastModificationChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDeleteDaysAfterLastModificationChange>";
            }
        };
    }
}
