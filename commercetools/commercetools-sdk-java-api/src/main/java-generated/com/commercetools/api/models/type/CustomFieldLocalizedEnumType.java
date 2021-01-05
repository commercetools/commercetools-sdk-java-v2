package com.commercetools.api.models.type;

import com.commercetools.api.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldLocalizedEnumTypeImpl;

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
@JsonDeserialize(as = CustomFieldLocalizedEnumTypeImpl.class)
public interface CustomFieldLocalizedEnumType extends FieldType {

    
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<CustomFieldLocalizedEnumValue> getValues();

    @JsonIgnore
    public void setValues(final CustomFieldLocalizedEnumValue ...values);
    public void setValues(final List<CustomFieldLocalizedEnumValue> values);

    public static CustomFieldLocalizedEnumType of(){
        return new CustomFieldLocalizedEnumTypeImpl();
    }
    

    public static CustomFieldLocalizedEnumType of(final CustomFieldLocalizedEnumType template) {
        CustomFieldLocalizedEnumTypeImpl instance = new CustomFieldLocalizedEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    public static CustomFieldLocalizedEnumTypeBuilder builder(){
        return CustomFieldLocalizedEnumTypeBuilder.of();
    }
    
    public static CustomFieldLocalizedEnumTypeBuilder builder(final CustomFieldLocalizedEnumType template){
        return CustomFieldLocalizedEnumTypeBuilder.of(template);
    }
    

    default <T> T withCustomFieldLocalizedEnumType(Function<CustomFieldLocalizedEnumType, T> helper) {
        return helper.apply(this);
    }
}
