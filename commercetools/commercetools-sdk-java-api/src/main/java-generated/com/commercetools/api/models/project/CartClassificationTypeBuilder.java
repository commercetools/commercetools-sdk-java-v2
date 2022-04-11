
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartClassificationTypeBuilder implements Builder<CartClassificationType> {

    private java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values;

    public CartClassificationTypeBuilder values(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    public CartClassificationTypeBuilder values(
            final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    public CartClassificationTypeBuilder plusValues(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue... values) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.addAll(Arrays.asList(values));
        return this;
    }

    public CartClassificationTypeBuilder plusValues(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(
            builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    public CartClassificationTypeBuilder withValues(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(
            builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> getValues() {
        return this.values;
    }

    public CartClassificationType build() {
        Objects.requireNonNull(values, CartClassificationType.class + ": values is missing");
        return new CartClassificationTypeImpl(values);
    }

    /**
     * builds CartClassificationType without checking for non null required values
     */
    public CartClassificationType buildUnchecked() {
        return new CartClassificationTypeImpl(values);
    }

    public static CartClassificationTypeBuilder of() {
        return new CartClassificationTypeBuilder();
    }

    public static CartClassificationTypeBuilder of(final CartClassificationType template) {
        CartClassificationTypeBuilder builder = new CartClassificationTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
