package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldDateTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldDateTypeImpl.class)
public interface CustomFieldDateType extends FieldType {



    public static CustomFieldDateTypeImpl of(){
        return new CustomFieldDateTypeImpl();
    }
    

    public static CustomFieldDateTypeImpl of(final CustomFieldDateType template) {
        CustomFieldDateTypeImpl instance = new CustomFieldDateTypeImpl();
        return instance;
    }

    default <T> T withCustomFieldDateType(Function<CustomFieldDateType, T> helper) {
        return helper.apply(this);
    }
}
