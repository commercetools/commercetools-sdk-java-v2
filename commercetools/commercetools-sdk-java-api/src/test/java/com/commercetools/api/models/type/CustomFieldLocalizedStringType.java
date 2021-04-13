package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldLocalizedStringTypeImpl;

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
@JsonDeserialize(as = CustomFieldLocalizedStringTypeImpl.class)
public interface CustomFieldLocalizedStringType extends FieldType {

    String LOCALIZED_STRING = "LocalizedString";



    public static CustomFieldLocalizedStringType of(){
        return new CustomFieldLocalizedStringTypeImpl();
    }
    

    public static CustomFieldLocalizedStringType of(final CustomFieldLocalizedStringType template) {
        CustomFieldLocalizedStringTypeImpl instance = new CustomFieldLocalizedStringTypeImpl();
        return instance;
    }

    public static CustomFieldLocalizedStringTypeBuilder builder(){
        return CustomFieldLocalizedStringTypeBuilder.of();
    }
    
    public static CustomFieldLocalizedStringTypeBuilder builder(final CustomFieldLocalizedStringType template){
        return CustomFieldLocalizedStringTypeBuilder.of(template);
    }
    

    default <T> T withCustomFieldLocalizedStringType(Function<CustomFieldLocalizedStringType, T> helper) {
        return helper.apply(this);
    }
}
