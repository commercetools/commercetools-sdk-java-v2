
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeSortOrderChangeImpl.class)
public interface ChangeSortOrderChange extends Change {

    String CHANGE_SORT_ORDER_CHANGE = "ChangeSortOrderChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeSortOrder</code></p>
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

    public static ChangeSortOrderChange of() {
        return new ChangeSortOrderChangeImpl();
    }

    public static ChangeSortOrderChange of(final ChangeSortOrderChange template) {
        ChangeSortOrderChangeImpl instance = new ChangeSortOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeSortOrderChangeBuilder builder() {
        return ChangeSortOrderChangeBuilder.of();
    }

    public static ChangeSortOrderChangeBuilder builder(final ChangeSortOrderChange template) {
        return ChangeSortOrderChangeBuilder.of(template);
    }

    default <T> T withChangeSortOrderChange(Function<ChangeSortOrderChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeSortOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeSortOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeSortOrderChange>";
            }
        };
    }
}
