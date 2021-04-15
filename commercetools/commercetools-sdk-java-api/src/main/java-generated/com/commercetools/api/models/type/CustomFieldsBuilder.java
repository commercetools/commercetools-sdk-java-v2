
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldsBuilder {

    private com.commercetools.api.models.type.TypeReference type;

    private com.commercetools.api.models.type.FieldContainer fields;

    public CustomFieldsBuilder type(final com.commercetools.api.models.type.TypeReference type) {
        this.type = type;
        return this;
    }

    public CustomFieldsBuilder fields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.api.models.type.TypeReference getType() {
        return this.type;
    }

    public com.commercetools.api.models.type.FieldContainer getFields() {
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
