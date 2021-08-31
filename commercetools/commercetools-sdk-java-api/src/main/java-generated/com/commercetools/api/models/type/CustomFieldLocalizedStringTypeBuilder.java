
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldLocalizedStringTypeBuilder implements Builder<CustomFieldLocalizedStringType> {

    public CustomFieldLocalizedStringType build() {
        return new CustomFieldLocalizedStringTypeImpl();
    }

    /**
     * builds CustomFieldLocalizedStringType without checking for non null required values
     */
    public CustomFieldLocalizedStringType buildUnchecked() {
        return new CustomFieldLocalizedStringTypeImpl();
    }

    public static CustomFieldLocalizedStringTypeBuilder of() {
        return new CustomFieldLocalizedStringTypeBuilder();
    }

    public static CustomFieldLocalizedStringTypeBuilder of(final CustomFieldLocalizedStringType template) {
        CustomFieldLocalizedStringTypeBuilder builder = new CustomFieldLocalizedStringTypeBuilder();
        return builder;
    }

}
