package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldTimeTypeImpl;

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
@JsonDeserialize(as = CustomFieldTimeTypeImpl.class)
public interface CustomFieldTimeType extends FieldType {

    String TIME = "Time";



    public static CustomFieldTimeType of(){
        return new CustomFieldTimeTypeImpl();
    }
    

    public static CustomFieldTimeType of(final CustomFieldTimeType template) {
        CustomFieldTimeTypeImpl instance = new CustomFieldTimeTypeImpl();
        return instance;
    }

    public static CustomFieldTimeTypeBuilder builder(){
        return CustomFieldTimeTypeBuilder.of();
    }
    
    public static CustomFieldTimeTypeBuilder builder(final CustomFieldTimeType template){
        return CustomFieldTimeTypeBuilder.of(template);
    }
    

    default <T> T withCustomFieldTimeType(Function<CustomFieldTimeType, T> helper) {
        return helper.apply(this);
    }
}
