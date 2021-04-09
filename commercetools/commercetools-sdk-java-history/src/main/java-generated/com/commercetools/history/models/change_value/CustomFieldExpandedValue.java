
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Only available if <code>expand</code> is set to true</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldExpandedValueImpl.class)
public interface CustomFieldExpandedValue {

    /**
    *  <p>Name of a custom field.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("value")
    public Object getValue();

    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setName(final String name);

    public void setValue(final Object value);

    public void setLabel(final LocalizedString label);

    public static CustomFieldExpandedValue of() {
        return new CustomFieldExpandedValueImpl();
    }

    public static CustomFieldExpandedValue of(final CustomFieldExpandedValue template) {
        CustomFieldExpandedValueImpl instance = new CustomFieldExpandedValueImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static CustomFieldExpandedValueBuilder builder() {
        return CustomFieldExpandedValueBuilder.of();
    }

    public static CustomFieldExpandedValueBuilder builder(final CustomFieldExpandedValue template) {
        return CustomFieldExpandedValueBuilder.of(template);
    }

    default <T> T withCustomFieldExpandedValue(Function<CustomFieldExpandedValue, T> helper) {
        return helper.apply(this);
    }
}
