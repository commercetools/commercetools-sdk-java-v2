
package com.commercetools.api.models.type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FieldDefinitionBuilder {

    private com.commercetools.api.models.type.FieldType type;

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private Boolean required;

    @Nullable
    private com.commercetools.api.models.type.TypeTextInputHint inputHint;

    public FieldDefinitionBuilder type(final com.commercetools.api.models.type.FieldType type) {
        this.type = type;
        return this;
    }

    public FieldDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public FieldDefinitionBuilder label(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public FieldDefinitionBuilder required(final Boolean required) {
        this.required = required;
        return this;
    }

    public FieldDefinitionBuilder inputHint(
            @Nullable final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public com.commercetools.api.models.type.FieldType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public Boolean getRequired() {
        return this.required;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeTextInputHint getInputHint() {
        return this.inputHint;
    }

    public FieldDefinition build() {
        return new FieldDefinitionImpl(type, name, label, required, inputHint);
    }

    public static FieldDefinitionBuilder of() {
        return new FieldDefinitionBuilder();
    }

    public static FieldDefinitionBuilder of(final FieldDefinition template) {
        FieldDefinitionBuilder builder = new FieldDefinitionBuilder();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.label = template.getLabel();
        builder.required = template.getRequired();
        builder.inputHint = template.getInputHint();
        return builder;
    }

}
