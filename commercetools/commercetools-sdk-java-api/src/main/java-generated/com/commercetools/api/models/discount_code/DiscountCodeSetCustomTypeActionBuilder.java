
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountCodeSetCustomTypeActionBuilder implements Builder<DiscountCodeSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public DiscountCodeSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public DiscountCodeSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public DiscountCodeSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public DiscountCodeSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public DiscountCodeSetCustomTypeAction build() {
        return new DiscountCodeSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds DiscountCodeSetCustomTypeAction without checking for non null required values
     */
    public DiscountCodeSetCustomTypeAction buildUnchecked() {
        return new DiscountCodeSetCustomTypeActionImpl(type, fields);
    }

    public static DiscountCodeSetCustomTypeActionBuilder of() {
        return new DiscountCodeSetCustomTypeActionBuilder();
    }

    public static DiscountCodeSetCustomTypeActionBuilder of(final DiscountCodeSetCustomTypeAction template) {
        DiscountCodeSetCustomTypeActionBuilder builder = new DiscountCodeSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
