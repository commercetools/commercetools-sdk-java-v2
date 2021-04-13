
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
*  <p>Shape of the value for action <code>changeFieldDefinitionOrder</code></p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FieldDefinitionOrderValueImpl.class)
public interface FieldDefinitionOrderValue {

    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    public void setName(final String name);

    public void setLabel(final LocalizedString label);

    public static FieldDefinitionOrderValue of() {
        return new FieldDefinitionOrderValueImpl();
    }

    public static FieldDefinitionOrderValue of(final FieldDefinitionOrderValue template) {
        FieldDefinitionOrderValueImpl instance = new FieldDefinitionOrderValueImpl();
        instance.setName(template.getName());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static FieldDefinitionOrderValueBuilder builder() {
        return FieldDefinitionOrderValueBuilder.of();
    }

    public static FieldDefinitionOrderValueBuilder builder(final FieldDefinitionOrderValue template) {
        return FieldDefinitionOrderValueBuilder.of(template);
    }

    default <T> T withFieldDefinitionOrderValue(Function<FieldDefinitionOrderValue, T> helper) {
        return helper.apply(this);
    }
}
