package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldNumberTypeImpl;

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
@JsonDeserialize(as = CustomFieldNumberTypeImpl.class)
public interface CustomFieldNumberType extends FieldType {



    public static CustomFieldNumberType of(){
        return new CustomFieldNumberTypeImpl();
    }
    

    public static CustomFieldNumberType of(final CustomFieldNumberType template) {
        CustomFieldNumberTypeImpl instance = new CustomFieldNumberTypeImpl();
        return instance;
    }

    public static CustomFieldNumberTypeBuilder builder(){
        return CustomFieldNumberTypeBuilder.of();
    }
    
    public static CustomFieldNumberTypeBuilder builder(final CustomFieldNumberType template){
        return CustomFieldNumberTypeBuilder.of(template);
    }
    

    default <T> T withCustomFieldNumberType(Function<CustomFieldNumberType, T> helper) {
        return helper.apply(this);
    }
}
