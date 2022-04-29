
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetRatingChangeImpl.class)
public interface SetRatingChange extends Change {

    String SET_RATING_CHANGE = "SetRatingChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setRating</code></p>
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

    public static SetRatingChange of() {
        return new SetRatingChangeImpl();
    }

    public static SetRatingChange of(final SetRatingChange template) {
        SetRatingChangeImpl instance = new SetRatingChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetRatingChangeBuilder builder() {
        return SetRatingChangeBuilder.of();
    }

    public static SetRatingChangeBuilder builder(final SetRatingChange template) {
        return SetRatingChangeBuilder.of(template);
    }

    default <T> T withSetRatingChange(Function<SetRatingChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetRatingChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetRatingChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetRatingChange>";
            }
        };
    }
}
