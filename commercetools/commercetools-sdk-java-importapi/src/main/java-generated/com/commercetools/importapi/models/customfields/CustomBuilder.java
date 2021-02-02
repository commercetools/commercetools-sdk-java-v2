
package com.commercetools.importapi.models.customfields;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomBuilder {

    private com.commercetools.importapi.models.common.TypeKeyReference type;

    @Nullable
    private com.commercetools.importapi.models.customfields.FieldContainer fields;

    public CustomBuilder type(final com.commercetools.importapi.models.common.TypeKeyReference type) {
        this.type = type;
        return this;
    }

    public CustomBuilder fields(@Nullable final com.commercetools.importapi.models.customfields.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.importapi.models.common.TypeKeyReference getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.FieldContainer getFields() {
        return this.fields;
    }

    public Custom build() {
        return new CustomImpl(type, fields);
    }

    public static CustomBuilder of() {
        return new CustomBuilder();
    }

    public static CustomBuilder of(final Custom template) {
        CustomBuilder builder = new CustomBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
