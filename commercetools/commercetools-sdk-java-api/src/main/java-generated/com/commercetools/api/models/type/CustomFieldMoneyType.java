
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomFieldMoneyTypeImpl.class)
public interface CustomFieldMoneyType extends FieldType {

    String MONEY = "Money";

    public static CustomFieldMoneyType of() {
        return new CustomFieldMoneyTypeImpl();
    }

    public static CustomFieldMoneyType of(final CustomFieldMoneyType template) {
        CustomFieldMoneyTypeImpl instance = new CustomFieldMoneyTypeImpl();
        return instance;
    }

    public static CustomFieldMoneyTypeBuilder builder() {
        return CustomFieldMoneyTypeBuilder.of();
    }

    public static CustomFieldMoneyTypeBuilder builder(final CustomFieldMoneyType template) {
        return CustomFieldMoneyTypeBuilder.of(template);
    }

    default <T> T withCustomFieldMoneyType(Function<CustomFieldMoneyType, T> helper) {
        return helper.apply(this);
    }
}
