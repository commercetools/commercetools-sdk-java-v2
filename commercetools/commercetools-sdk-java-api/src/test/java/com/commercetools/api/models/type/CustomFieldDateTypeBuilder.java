package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldDateType;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldDateTypeBuilder {




    public CustomFieldDateType build() {
        return new CustomFieldDateTypeImpl();
    }

    public static CustomFieldDateTypeBuilder of() {
        return new CustomFieldDateTypeBuilder();
    }

    public static CustomFieldDateTypeBuilder of(final CustomFieldDateType template) {
        CustomFieldDateTypeBuilder builder = new CustomFieldDateTypeBuilder();
        return builder;
    }

}
