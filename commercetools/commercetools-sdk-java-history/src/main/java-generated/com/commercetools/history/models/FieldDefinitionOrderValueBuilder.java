
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class FieldDefinitionOrderValueBuilder {

    private String name;

    private com.commercetools.history.models.LocalizedString label;

    public FieldDefinitionOrderValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public FieldDefinitionOrderValueBuilder label(final com.commercetools.history.models.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.history.models.LocalizedString getLabel() {
        return this.label;
    }

    public FieldDefinitionOrderValue build() {
        return new FieldDefinitionOrderValueImpl(name, label);
    }

    public static FieldDefinitionOrderValueBuilder of() {
        return new FieldDefinitionOrderValueBuilder();
    }

    public static FieldDefinitionOrderValueBuilder of(final FieldDefinitionOrderValue template) {
        FieldDefinitionOrderValueBuilder builder = new FieldDefinitionOrderValueBuilder();
        builder.name = template.getName();
        builder.label = template.getLabel();
        return builder;
    }

}
