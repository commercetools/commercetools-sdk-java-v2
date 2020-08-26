package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue;
import com.commercetools.importapi.models.producttypes.AttributeType;
import com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeLocalizedEnumTypeImpl.class)
public interface AttributeLocalizedEnumType extends AttributeType {


    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributeLocalizedEnumValue> getValues();

    public void setValues(final List<AttributeLocalizedEnumValue> values);

    public static AttributeLocalizedEnumTypeImpl of(){
        return new AttributeLocalizedEnumTypeImpl();
    }


    public static AttributeLocalizedEnumTypeImpl of(final AttributeLocalizedEnumType template) {
        AttributeLocalizedEnumTypeImpl instance = new AttributeLocalizedEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

}
