
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldsBuilder implements Builder<CustomFields> {

    private com.commercetools.history.models.common.Reference type;

    private java.lang.Object fields;

    public CustomFieldsBuilder type(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public CustomFieldsBuilder type(final com.commercetools.history.models.common.Reference type) {
        this.type = type;
        return this;
    }

    public CustomFieldsBuilder fields(final java.lang.Object fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.history.models.common.Reference getType() {
        return this.type;
    }

    public java.lang.Object getFields() {
        return this.fields;
    }

    public CustomFields build() {
        Objects.requireNonNull(type, CustomFields.class + ": type is missing");
        Objects.requireNonNull(fields, CustomFields.class + ": fields is missing");
        return new CustomFieldsImpl(type, fields);
    }

    /**
     * builds CustomFields without checking for non null required values
     */
    public CustomFields buildUnchecked() {
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
