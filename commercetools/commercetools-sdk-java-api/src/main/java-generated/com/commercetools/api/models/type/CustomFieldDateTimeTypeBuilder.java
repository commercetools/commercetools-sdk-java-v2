
package com.commercetools.api.models.type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFieldDateTimeType;
import com.commercetools.api.models.type.FieldType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldDateTimeTypeBuilder {

    public CustomFieldDateTimeType build() {
        return new CustomFieldDateTimeTypeImpl();
    }

    public static CustomFieldDateTimeTypeBuilder of() {
        return new CustomFieldDateTimeTypeBuilder();
    }

    public static CustomFieldDateTimeTypeBuilder of(final CustomFieldDateTimeType template) {
        CustomFieldDateTimeTypeBuilder builder = new CustomFieldDateTimeTypeBuilder();
        return builder;
    }

}
