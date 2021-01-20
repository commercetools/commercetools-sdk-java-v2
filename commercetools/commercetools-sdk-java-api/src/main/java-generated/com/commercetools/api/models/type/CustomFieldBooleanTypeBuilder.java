
package com.commercetools.api.models.type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFieldBooleanType;
import com.commercetools.api.models.type.FieldType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldBooleanTypeBuilder {

    public CustomFieldBooleanType build() {
        return new CustomFieldBooleanTypeImpl();
    }

    public static CustomFieldBooleanTypeBuilder of() {
        return new CustomFieldBooleanTypeBuilder();
    }

    public static CustomFieldBooleanTypeBuilder of(final CustomFieldBooleanType template) {
        CustomFieldBooleanTypeBuilder builder = new CustomFieldBooleanTypeBuilder();
        return builder;
    }

}
