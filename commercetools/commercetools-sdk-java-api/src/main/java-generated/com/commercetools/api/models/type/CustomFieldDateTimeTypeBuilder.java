
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldDateTimeTypeBuilder implements Builder<CustomFieldDateTimeType> {

    public CustomFieldDateTimeType build() {
        return new CustomFieldDateTimeTypeImpl();
    }

    /**
     * builds CustomFieldDateTimeType without checking for non null required values
     */
    public CustomFieldDateTimeType buildUnchecked() {
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
