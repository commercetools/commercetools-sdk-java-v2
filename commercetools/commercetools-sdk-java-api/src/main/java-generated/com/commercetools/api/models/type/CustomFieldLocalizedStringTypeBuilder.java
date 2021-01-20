
package com.commercetools.api.models.type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFieldLocalizedStringType;
import com.commercetools.api.models.type.FieldType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldLocalizedStringTypeBuilder {

    public CustomFieldLocalizedStringType build() {
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
