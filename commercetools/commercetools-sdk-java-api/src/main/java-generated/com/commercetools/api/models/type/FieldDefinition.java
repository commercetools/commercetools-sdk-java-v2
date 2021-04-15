
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FieldDefinitionImpl.class)
public interface FieldDefinition {

    /**
    *  <p>Describes the type of the field.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("type")
    public FieldType getType();

    /**
    *  <p>The name of the field.
    *  The name must be between two and 36 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>).
    *  The name must be unique for a given resource type ID.
    *  In case there is a field with the same name in another type it has to have the same FieldType also.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>A human-readable label for the field.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
    *  <p>Whether the field is required to have a value.</p>
    */
    @NotNull
    @JsonProperty("required")
    public Boolean getRequired();

    /**
    *  <p>Provides a visual representation type for this field.
    *  It is only relevant for string-based field types like StringType and LocalizedStringType.</p>
    */

    @JsonProperty("inputHint")
    public TypeTextInputHint getInputHint();

    public void setType(final FieldType type);

    public void setName(final String name);

    public void setLabel(final LocalizedString label);

    public void setRequired(final Boolean required);

    public void setInputHint(final TypeTextInputHint inputHint);

    public static FieldDefinition of() {
        return new FieldDefinitionImpl();
    }

    public static FieldDefinition of(final FieldDefinition template) {
        FieldDefinitionImpl instance = new FieldDefinitionImpl();
        instance.setType(template.getType());
        instance.setName(template.getName());
        instance.setLabel(template.getLabel());
        instance.setRequired(template.getRequired());
        instance.setInputHint(template.getInputHint());
        return instance;
    }

    public static FieldDefinitionBuilder builder() {
        return FieldDefinitionBuilder.of();
    }

    public static FieldDefinitionBuilder builder(final FieldDefinition template) {
        return FieldDefinitionBuilder.of(template);
    }

    default <T> T withFieldDefinition(Function<FieldDefinition, T> helper) {
        return helper.apply(this);
    }
}
