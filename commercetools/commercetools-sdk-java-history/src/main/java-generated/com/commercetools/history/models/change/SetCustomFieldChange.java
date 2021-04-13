
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomFieldChangeImpl.class)
public interface SetCustomFieldChange extends Change {

    String SET_CUSTOM_FIELD_CHANGE = "SetCustomFieldChange";

    /**
    *  <p>Update action for setting a custom field</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Custom field name</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setName(final String name);

    public void setCustomTypeId(final String customTypeId);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final Object previousValue);

    public static SetCustomFieldChange of() {
        return new SetCustomFieldChangeImpl();
    }

    public static SetCustomFieldChange of(final SetCustomFieldChange template) {
        SetCustomFieldChangeImpl instance = new SetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomFieldChangeBuilder builder() {
        return SetCustomFieldChangeBuilder.of();
    }

    public static SetCustomFieldChangeBuilder builder(final SetCustomFieldChange template) {
        return SetCustomFieldChangeBuilder.of(template);
    }

    default <T> T withSetCustomFieldChange(Function<SetCustomFieldChange, T> helper) {
        return helper.apply(this);
    }
}
