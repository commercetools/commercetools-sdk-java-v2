
package com.commercetools.api.models.type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFieldStringType;
import com.commercetools.api.models.type.FieldType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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
