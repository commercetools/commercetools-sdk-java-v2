
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Location;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveLocationChangeImpl.class)
public interface RemoveLocationChange extends Change {

    String REMOVE_LOCATION_CHANGE = "RemoveLocationChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeLocation</code> on zones</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Location getPreviousValue();

    /**
    *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Location getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Location previousValue);

    public void setNextValue(final Location nextValue);

    public static RemoveLocationChange of() {
        return new RemoveLocationChangeImpl();
    }

    public static RemoveLocationChange of(final RemoveLocationChange template) {
        RemoveLocationChangeImpl instance = new RemoveLocationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveLocationChangeBuilder builder() {
        return RemoveLocationChangeBuilder.of();
    }

    public static RemoveLocationChangeBuilder builder(final RemoveLocationChange template) {
        return RemoveLocationChangeBuilder.of(template);
    }

    default <T> T withRemoveLocationChange(Function<RemoveLocationChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveLocationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveLocationChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveLocationChange>";
            }
        };
    }
}
