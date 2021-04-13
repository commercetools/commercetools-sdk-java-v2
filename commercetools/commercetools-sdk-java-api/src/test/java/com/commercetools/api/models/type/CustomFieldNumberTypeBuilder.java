package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldNumberType;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldNumberTypeBuilder {




    public CustomFieldNumberType build() {
        return new CustomFieldNumberTypeImpl();
    }

    public static CustomFieldNumberTypeBuilder of() {
        return new CustomFieldNumberTypeBuilder();
    }

    public static CustomFieldNumberTypeBuilder of(final CustomFieldNumberType template) {
        CustomFieldNumberTypeBuilder builder = new CustomFieldNumberTypeBuilder();
        return builder;
    }

}
