package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.producttypes.AttributePlainEnumValue;
import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.AttributeEnumTypeImpl;

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
@JsonDeserialize(as = AttributeEnumTypeImpl.class)
public interface AttributeEnumType extends AttributeType {

    
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributePlainEnumValue> getValues();

    public void setValues(final List<AttributePlainEnumValue> values);

    public static AttributeEnumTypeImpl of(){
        return new AttributeEnumTypeImpl();
    }
    

    public static AttributeEnumTypeImpl of(final AttributeEnumType template) {
        AttributeEnumTypeImpl instance = new AttributeEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

}
