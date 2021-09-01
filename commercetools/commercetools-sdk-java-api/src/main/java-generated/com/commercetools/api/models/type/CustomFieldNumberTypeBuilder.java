
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldNumberTypeBuilder implements Builder<CustomFieldNumberType> {

    public CustomFieldNumberType build() {
        return new CustomFieldNumberTypeImpl();
    }

    /**
     * builds CustomFieldNumberType without checking for non null required values
     */
    public CustomFieldNumberType buildUnchecked() {
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
