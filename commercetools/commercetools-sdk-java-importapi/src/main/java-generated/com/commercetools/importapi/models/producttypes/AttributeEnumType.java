package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributePlainEnumValue;
import com.commercetools.importapi.models.producttypes.AttributeType;
import com.commercetools.importapi.models.producttypes.AttributeEnumTypeImpl;

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
@JsonDeserialize(as = AttributeEnumTypeImpl.class)
public interface AttributeEnumType extends AttributeType {

    
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributePlainEnumValue> getValues();

    @JsonIgnore
    public void setValues(final AttributePlainEnumValue ...values);
    public void setValues(final List<AttributePlainEnumValue> values);

    public static AttributeEnumType of(){
        return new AttributeEnumTypeImpl();
    }
    

    public static AttributeEnumType of(final AttributeEnumType template) {
        AttributeEnumTypeImpl instance = new AttributeEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    public static AttributeEnumTypeBuilder builder(){
        return AttributeEnumTypeBuilder.of();
    }
    
    public static AttributeEnumTypeBuilder builder(final AttributeEnumType template){
        return AttributeEnumTypeBuilder.of(template);
    }
    

    default <T> T withAttributeEnumType(Function<AttributeEnumType, T> helper) {
        return helper.apply(this);
    }
}
