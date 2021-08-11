
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldBooleanTypeBuilder implements Builder<CustomFieldBooleanType> {

    public CustomFieldBooleanType build() {
        return new CustomFieldBooleanTypeImpl();
    }

    /**
     * builds CustomFieldBooleanType without checking for non null required values
     */
    public CustomFieldBooleanType buildUnchecked() {
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
