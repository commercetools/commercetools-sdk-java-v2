package com.commercetools.api.models.type;

import com.commercetools.api.models.type.CustomFieldEnumValue;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeEnumValueLabelActionImpl;

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
@JsonDeserialize(as = TypeChangeEnumValueLabelActionImpl.class)
public interface TypeChangeEnumValueLabelAction extends TypeUpdateAction {

    
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();
    
    @NotNull
    @Valid
    @JsonProperty("value")
    public CustomFieldEnumValue getValue();

    public void setFieldName(final String fieldName);
    
    public void setValue(final CustomFieldEnumValue value);

    public static TypeChangeEnumValueLabelAction of(){
        return new TypeChangeEnumValueLabelActionImpl();
    }
    

    public static TypeChangeEnumValueLabelAction of(final TypeChangeEnumValueLabelAction template) {
        TypeChangeEnumValueLabelActionImpl instance = new TypeChangeEnumValueLabelActionImpl();
        instance.setFieldName(template.getFieldName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TypeChangeEnumValueLabelActionBuilder builder(){
        return TypeChangeEnumValueLabelActionBuilder.of();
    }
    
    public static TypeChangeEnumValueLabelActionBuilder builder(final TypeChangeEnumValueLabelAction template){
        return TypeChangeEnumValueLabelActionBuilder.of(template);
    }
    

    default <T> T withTypeChangeEnumValueLabelAction(Function<TypeChangeEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }
}
