
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
@JsonDeserialize(as = AddAttributeDefinitionChangeImpl.class)
public interface AddAttributeDefinitionChange extends Change {

    String ADD_ATTRIBUTE_DEFINITION_CHANGE = "AddAttributeDefinitionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addAttributeDefinition</code> on product types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public AttributeDefinition getNextValue();

    public void setChange(final String change);

    public void setNextValue(final AttributeDefinition nextValue);

    public static AddAttributeDefinitionChange of() {
        return new AddAttributeDefinitionChangeImpl();
    }

    public static AddAttributeDefinitionChange of(final AddAttributeDefinitionChange template) {
        AddAttributeDefinitionChangeImpl instance = new AddAttributeDefinitionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddAttributeDefinitionChangeBuilder builder() {
        return AddAttributeDefinitionChangeBuilder.of();
    }

    public static AddAttributeDefinitionChangeBuilder builder(final AddAttributeDefinitionChange template) {
        return AddAttributeDefinitionChangeBuilder.of(template);
    }

    default <T> T withAddAttributeDefinitionChange(Function<AddAttributeDefinitionChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddAttributeDefinitionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddAttributeDefinitionChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddAttributeDefinitionChange>";
            }
        };
    }
}
