package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldStringType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldStringTypeBuilder {




    public CustomFieldStringType build() {
        return new CustomFieldStringTypeImpl();
    }

    public static CustomFieldStringTypeBuilder of() {
        return new CustomFieldStringTypeBuilder();
    }

    public static CustomFieldStringTypeBuilder of(final CustomFieldStringType template) {
        CustomFieldStringTypeBuilder builder = new CustomFieldStringTypeBuilder();
        return builder;
    }

}
