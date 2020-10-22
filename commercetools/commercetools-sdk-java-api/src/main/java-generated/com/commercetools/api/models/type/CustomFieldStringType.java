package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldStringTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomFieldStringTypeImpl.class)
public interface CustomFieldStringType extends FieldType {



    public static CustomFieldStringTypeImpl of(){
        return new CustomFieldStringTypeImpl();
    }
    

    public static CustomFieldStringTypeImpl of(final CustomFieldStringType template) {
        CustomFieldStringTypeImpl instance = new CustomFieldStringTypeImpl();
        return instance;
    }

    default <T extends Accessor<CustomFieldStringType>> T withCustomFieldStringType(Function<CustomFieldStringType, T> helper) {
        return helper.apply(this);
    }
}
