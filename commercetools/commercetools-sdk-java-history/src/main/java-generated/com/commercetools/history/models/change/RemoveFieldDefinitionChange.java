
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
@JsonDeserialize(as = RemoveFieldDefinitionChangeImpl.class)
public interface RemoveFieldDefinitionChange extends Change {

    String REMOVE_FIELD_DEFINITION_CHANGE = "RemoveFieldDefinitionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeFieldDefinition</code> on payments</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public FieldDefinition getPreviousValue();

    public void setChange(final String change);

    public void setPreviousValue(final FieldDefinition previousValue);

    public static RemoveFieldDefinitionChange of() {
        return new RemoveFieldDefinitionChangeImpl();
    }

    public static RemoveFieldDefinitionChange of(final RemoveFieldDefinitionChange template) {
        RemoveFieldDefinitionChangeImpl instance = new RemoveFieldDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveFieldDefinitionChangeBuilder builder() {
        return RemoveFieldDefinitionChangeBuilder.of();
    }

    public static RemoveFieldDefinitionChangeBuilder builder(final RemoveFieldDefinitionChange template) {
        return RemoveFieldDefinitionChangeBuilder.of(template);
    }

    default <T> T withRemoveFieldDefinitionChange(Function<RemoveFieldDefinitionChange, T> helper) {
        return helper.apply(this);
    }
}
