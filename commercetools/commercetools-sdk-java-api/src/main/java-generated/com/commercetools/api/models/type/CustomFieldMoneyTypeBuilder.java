
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldMoneyTypeBuilder implements Builder<CustomFieldMoneyType> {

    public CustomFieldMoneyType build() {
        return new CustomFieldMoneyTypeImpl();
    }

    /**
     * builds CustomFieldMoneyType without checking for non null required values
     */
    public CustomFieldMoneyType buildUnchecked() {
        return new CustomFieldMoneyTypeImpl();
    }

    public static CustomFieldMoneyTypeBuilder of() {
        return new CustomFieldMoneyTypeBuilder();
    }

    public static CustomFieldMoneyTypeBuilder of(final CustomFieldMoneyType template) {
        CustomFieldMoneyTypeBuilder builder = new CustomFieldMoneyTypeBuilder();
        return builder;
    }

}
