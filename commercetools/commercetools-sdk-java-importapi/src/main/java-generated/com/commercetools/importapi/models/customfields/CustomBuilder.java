
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomBuilder implements Builder<Custom> {

    private com.commercetools.importapi.models.common.TypeKeyReference type;

    @Nullable
    private com.commercetools.importapi.models.customfields.FieldContainer fields;

    public CustomBuilder type(final com.commercetools.importapi.models.common.TypeKeyReference type) {
        this.type = type;
        return this;
    }

    public CustomBuilder fields(
            Function<com.commercetools.importapi.models.customfields.FieldContainerBuilder, com.commercetools.importapi.models.customfields.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.importapi.models.customfields.FieldContainerBuilder.of()).build();
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
        Objects.requireNonNull(type, Custom.class + ": type is missing");
        return new CustomImpl(type, fields);
    }

    /**
     * builds Custom without checking for non null required values
     */
    public Custom buildUnchecked() {
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
