
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class FieldDefinitionBuilder implements Builder<FieldDefinition> {

    private com.commercetools.history.models.common.FieldType type;

    private String name;

    private com.commercetools.history.models.common.LocalizedString label;

    private com.commercetools.history.models.common.TextInputHint inputHint;

    public FieldDefinitionBuilder type(
            Function<com.commercetools.history.models.common.FieldTypeBuilder, com.commercetools.history.models.common.FieldTypeBuilder> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.FieldTypeBuilder.of()).build();
        return this;
    }

    public FieldDefinitionBuilder type(final com.commercetools.history.models.common.FieldType type) {
        this.type = type;
        return this;
    }

    public FieldDefinitionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public FieldDefinitionBuilder label(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.label = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public FieldDefinitionBuilder label(final com.commercetools.history.models.common.LocalizedString label) {
        this.label = label;
        return this;
    }

    public FieldDefinitionBuilder inputHint(final com.commercetools.history.models.common.TextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public com.commercetools.history.models.common.FieldType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.history.models.common.LocalizedString getLabel() {
        return this.label;
    }

    public com.commercetools.history.models.common.TextInputHint getInputHint() {
        return this.inputHint;
    }

    public FieldDefinition build() {
        Objects.requireNonNull(type, FieldDefinition.class + ": type is missing");
        Objects.requireNonNull(name, FieldDefinition.class + ": name is missing");
        Objects.requireNonNull(label, FieldDefinition.class + ": label is missing");
        Objects.requireNonNull(inputHint, FieldDefinition.class + ": inputHint is missing");
        return new FieldDefinitionImpl(type, name, label, inputHint);
    }

    /**
     * builds FieldDefinition without checking for non null required values
     */
    public FieldDefinition buildUnchecked() {
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
