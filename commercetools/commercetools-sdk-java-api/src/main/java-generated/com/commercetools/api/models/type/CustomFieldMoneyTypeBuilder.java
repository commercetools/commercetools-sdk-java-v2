
package com.commercetools.api.models.type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFieldMoneyType;
import com.commercetools.api.models.type.FieldType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldMoneyTypeBuilder {

    public CustomFieldMoneyType build() {
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
