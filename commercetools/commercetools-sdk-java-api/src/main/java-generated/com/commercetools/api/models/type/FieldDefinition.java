
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

/**
*  <p>Defines a <a href="/../api/projects/custom-fields">Custom Field</a> and its meta-information.
*  This FieldDefinition is similar to an <a href="ctp:api:type:AttributeDefinition">AttributeDefinition</a> of <a href="/../api/projects/productTypes">Product Types</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FieldDefinitionImpl.class)
public interface FieldDefinition {

    /**
    *  <p>Data type of the Custom Field to define.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("type")
    public FieldType getType();

    /**
    *  <p>Name of the Custom Field to define.
    *  Must be unique for a given <a href="ctp:api:type:ResourceTypeId">ResourceTypeId</a>.
    *  In case there is a FieldDefinition with the same <code>name</code> in another <a href="ctp:api:type:Type">Type</a>, both FieldDefinitions must have the same <code>type</code>.</p>
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
    *  <p>Defines whether the field is required to have a value.</p>
    */
    @NotNull
    @JsonProperty("required")
    public Boolean getRequired();

    /**
    *  <p>Must be either <code>SingleLine</code> or <code>MultiLine</code>.
    *  Defines the visual representation of the field in user interfaces like the Merchant Center.
    *  It is only relevant for string-based <a href="ctp:api:type:FieldType">FieldTypes</a> like <a href="ctp:api:type:CustomFieldStringType">CustomFieldStringType</a> and <a href="ctp:api:type:CustomFieldLocalizedStringType">CustomFieldLocalizedStringType</a>.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<FieldDefinition> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldDefinition>() {
            @Override
            public String toString() {
                return "TypeReference<FieldDefinition>";
            }
        };
    }
}
