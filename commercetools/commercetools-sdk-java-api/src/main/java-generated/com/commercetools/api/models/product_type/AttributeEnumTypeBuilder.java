
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeEnumTypeBuilder implements Builder<AttributeEnumType> {

    private java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values;

    public AttributeEnumTypeBuilder values(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    public AttributeEnumTypeBuilder withValues(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    public AttributeEnumTypeBuilder plusValues(
            Function<com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder, com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.api.models.product_type.AttributePlainEnumValueBuilder.of()).build());
        return this;
    }

    public AttributeEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> values) {
        this.values = values;
        return this;
    }

    public java.util.List<com.commercetools.api.models.product_type.AttributePlainEnumValue> getValues() {
        return this.values;
    }

    public AttributeEnumType build() {
        Objects.requireNonNull(values, AttributeEnumType.class + ": values is missing");
        return new AttributeEnumTypeImpl(values);
    }

    /**
     * builds AttributeEnumType without checking for non null required values
     */
    public AttributeEnumType buildUnchecked() {
        return new AttributeEnumTypeImpl(values);
    }

    public static AttributeEnumTypeBuilder of() {
        return new AttributeEnumTypeBuilder();
    }

    public static AttributeEnumTypeBuilder of(final AttributeEnumType template) {
        AttributeEnumTypeBuilder builder = new AttributeEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
