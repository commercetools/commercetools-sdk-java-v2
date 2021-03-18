
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FieldDefinitionBuilder {

    private java.lang.Object type;

    private String name;

    private com.commercetools.history.models.LocalizedString label;

    private com.commercetools.history.models.TextInputHint inputHint;

    public FieldDefinitionBuilder type(final java.lang.Object type) {
        this.type = type;
        return this;
    }

    public FieldDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public FieldDefinitionBuilder label(final com.commercetools.history.models.LocalizedString label) {
        this.label = label;
        return this;
    }

    public FieldDefinitionBuilder inputHint(final com.commercetools.history.models.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public java.lang.Object getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.history.models.LocalizedString getLabel() {
        return this.label;
    }

    public com.commercetools.history.models.TextInputHint getInputHint() {
        return this.inputHint;
    }

    public FieldDefinition build() {
        return new FieldDefinitionImpl(type, name, label, inputHint);
    }

    public static FieldDefinitionBuilder of() {
        return new FieldDefinitionBuilder();
    }

    public static FieldDefinitionBuilder of(final FieldDefinition template) {
        FieldDefinitionBuilder builder = new FieldDefinitionBuilder();
        builder.type = template.getType();
        builder.name = template.getName();
        builder.label = template.getLabel();
        builder.inputHint = template.getInputHint();
        return builder;
    }

}
