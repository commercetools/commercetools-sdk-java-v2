
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
@JsonDeserialize(as = AddLocationChangeImpl.class)
public interface AddLocationChange extends Change {

    String ADD_LOCATION_CHANGE = "AddLocationChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addLocation</code> on zones</p>
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

    public static AddLocationChange of() {
        return new AddLocationChangeImpl();
    }

    public static AddLocationChange of(final AddLocationChange template) {
        AddLocationChangeImpl instance = new AddLocationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddLocationChangeBuilder builder() {
        return AddLocationChangeBuilder.of();
    }

    public static AddLocationChangeBuilder builder(final AddLocationChange template) {
        return AddLocationChangeBuilder.of(template);
    }

    default <T> T withAddLocationChange(Function<AddLocationChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddLocationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddLocationChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddLocationChange>";
            }
        };
    }
}
