
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.FieldDefinition;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddFieldDefinitionChangeImpl.class)
public interface AddFieldDefinitionChange extends Change {

    String ADD_FIELD_DEFINITION_CHANGE = "AddFieldDefinitionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addFieldDefinition</code> on payments</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public FieldDefinition getNextValue();

    public void setChange(final String change);

    public void setNextValue(final FieldDefinition nextValue);

    public static AddFieldDefinitionChange of() {
        return new AddFieldDefinitionChangeImpl();
    }

    public static AddFieldDefinitionChange of(final AddFieldDefinitionChange template) {
        AddFieldDefinitionChangeImpl instance = new AddFieldDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddFieldDefinitionChangeBuilder builder() {
        return AddFieldDefinitionChangeBuilder.of();
    }

    public static AddFieldDefinitionChangeBuilder builder(final AddFieldDefinitionChange template) {
        return AddFieldDefinitionChangeBuilder.of(template);
    }

    default <T> T withAddFieldDefinitionChange(Function<AddFieldDefinitionChange, T> helper) {
        return helper.apply(this);
    }
}
