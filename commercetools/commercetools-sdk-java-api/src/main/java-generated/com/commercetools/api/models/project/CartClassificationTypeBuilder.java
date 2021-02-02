
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartClassificationTypeBuilder {

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

    public java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> getValues() {
        return this.values;
    }

    public CartClassificationType build() {
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
