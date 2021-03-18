
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldsBuilder {

    private com.commercetools.history.models.Reference type;

    private java.lang.Object fields;

    public CustomFieldsBuilder type(final com.commercetools.history.models.Reference type) {
        this.type = type;
        return this;
    }

    public CustomFieldsBuilder fields(final java.lang.Object fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.history.models.Reference getType() {
        return this.type;
    }

    public java.lang.Object getFields() {
        return this.fields;
    }

    public CustomFields build() {
        return new CustomFieldsImpl(type, fields);
    }

    public static CustomFieldsBuilder of() {
        return new CustomFieldsBuilder();
    }

    public static CustomFieldsBuilder of(final CustomFields template) {
        CustomFieldsBuilder builder = new CustomFieldsBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
