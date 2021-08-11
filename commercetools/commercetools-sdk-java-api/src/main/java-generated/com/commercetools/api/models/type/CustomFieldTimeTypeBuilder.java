
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldTimeTypeBuilder implements Builder<CustomFieldTimeType> {

    public CustomFieldTimeType build() {
        return new CustomFieldTimeTypeImpl();
    }

    /**
     * builds CustomFieldTimeType without checking for non null required values
     */
    public CustomFieldTimeType buildUnchecked() {
        return new CustomFieldTimeTypeImpl();
    }

    public static CustomFieldTimeTypeBuilder of() {
        return new CustomFieldTimeTypeBuilder();
    }

    public static CustomFieldTimeTypeBuilder of(final CustomFieldTimeType template) {
        CustomFieldTimeTypeBuilder builder = new CustomFieldTimeTypeBuilder();
        return builder;
    }

}
