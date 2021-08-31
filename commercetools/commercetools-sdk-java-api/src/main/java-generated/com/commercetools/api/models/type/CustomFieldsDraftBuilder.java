
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldsDraftBuilder implements Builder<CustomFieldsDraft> {

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public CustomFieldsDraftBuilder type(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public CustomFieldsDraftBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public CustomFieldsDraftBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CustomFieldsDraft build() {
        Objects.requireNonNull(type, CustomFieldsDraft.class + ": type is missing");
        return new CustomFieldsDraftImpl(type, fields);
    }

    /**
     * builds CustomFieldsDraft without checking for non null required values
     */
    public CustomFieldsDraft buildUnchecked() {
        return new CustomFieldsDraftImpl(type, fields);
    }

    public static CustomFieldsDraftBuilder of() {
        return new CustomFieldsDraftBuilder();
    }

    public static CustomFieldsDraftBuilder of(final CustomFieldsDraft template) {
        CustomFieldsDraftBuilder builder = new CustomFieldsDraftBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
