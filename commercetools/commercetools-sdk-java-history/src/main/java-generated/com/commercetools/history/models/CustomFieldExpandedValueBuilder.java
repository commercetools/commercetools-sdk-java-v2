
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldExpandedValueBuilder {

    private String name;

    private java.lang.Object value;

    private com.commercetools.history.models.LocalizedString label;

    public CustomFieldExpandedValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CustomFieldExpandedValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public CustomFieldExpandedValueBuilder label(final com.commercetools.history.models.LocalizedString label) {
        this.label = label;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public com.commercetools.history.models.LocalizedString getLabel() {
        return this.label;
    }

    public CustomFieldExpandedValue build() {
        return new CustomFieldExpandedValueImpl(name, value, label);
    }

    public static CustomFieldExpandedValueBuilder of() {
        return new CustomFieldExpandedValueBuilder();
    }

    public static CustomFieldExpandedValueBuilder of(final CustomFieldExpandedValue template) {
        CustomFieldExpandedValueBuilder builder = new CustomFieldExpandedValueBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.label = template.getLabel();
        return builder;
    }

}
