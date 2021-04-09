
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.AttributeDefinition;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveAttributeDefinitionChangeImpl.class)
public interface RemoveAttributeDefinitionChange extends Change {

    String REMOVE_ATTRIBUTE_DEFINITION_CHANGE = "RemoveAttributeDefinitionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeAttributeDefinition</code> on product types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public AttributeDefinition getPreviousValue();

    public void setChange(final String change);

    public void setPreviousValue(final AttributeDefinition previousValue);

    public static RemoveAttributeDefinitionChange of() {
        return new RemoveAttributeDefinitionChangeImpl();
    }

    public static RemoveAttributeDefinitionChange of(final RemoveAttributeDefinitionChange template) {
        RemoveAttributeDefinitionChangeImpl instance = new RemoveAttributeDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveAttributeDefinitionChangeBuilder builder() {
        return RemoveAttributeDefinitionChangeBuilder.of();
    }

    public static RemoveAttributeDefinitionChangeBuilder builder(final RemoveAttributeDefinitionChange template) {
        return RemoveAttributeDefinitionChangeBuilder.of(template);
    }

    default <T> T withRemoveAttributeDefinitionChange(Function<RemoveAttributeDefinitionChange, T> helper) {
        return helper.apply(this);
    }
}
