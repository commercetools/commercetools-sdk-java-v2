
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldStringTypeBuilder implements Builder<CustomFieldStringType> {

    public CustomFieldStringType build() {
        return new CustomFieldStringTypeImpl();
    }

    /**
     * builds CustomFieldStringType without checking for non null required values
     */
    public CustomFieldStringType buildUnchecked() {
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
