package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldType;
import com.commercetools.api.models.type.CustomFieldSetTypeImpl;

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
@JsonDeserialize(as = CustomFieldSetTypeImpl.class)
public interface CustomFieldSetType extends FieldType {

    
    @NotNull
    @Valid
    @JsonProperty("elementType")
    public FieldType getElementType();

    public void setElementType(final FieldType elementType);

    public static CustomFieldSetTypeImpl of(){
        return new CustomFieldSetTypeImpl();
    }
    

    public static CustomFieldSetTypeImpl of(final CustomFieldSetType template) {
        CustomFieldSetTypeImpl instance = new CustomFieldSetTypeImpl();
        instance.setElementType(template.getElementType());
        return instance;
    }

    default <T> T withCustomFieldSetType(Function<CustomFieldSetType, T> helper) {
        return helper.apply(this);
    }
}
