package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldBooleanTypeImpl;

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
@JsonDeserialize(as = CustomFieldBooleanTypeImpl.class)
public interface CustomFieldBooleanType extends FieldType {



    public static CustomFieldBooleanType of(){
        return new CustomFieldBooleanTypeImpl();
    }
    

    public static CustomFieldBooleanType of(final CustomFieldBooleanType template) {
        CustomFieldBooleanTypeImpl instance = new CustomFieldBooleanTypeImpl();
        return instance;
    }

    public static CustomFieldBooleanTypeBuilder builder(){
        return CustomFieldBooleanTypeBuilder.of();
    }
    
    public static CustomFieldBooleanTypeBuilder builder(final CustomFieldBooleanType template){
        return CustomFieldBooleanTypeBuilder.of(template);
    }
    

    default <T> T withCustomFieldBooleanType(Function<CustomFieldBooleanType, T> helper) {
        return helper.apply(this);
    }
}
