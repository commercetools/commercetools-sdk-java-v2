package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributePlainEnumValue;
import com.commercetools.importapi.models.producttypes.AttributeType;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeEnumTypeImpl implements AttributeEnumType {

    private String name;
    
    private java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values;

    @JsonCreator
    AttributeEnumTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values) {
        this.values = values;
        this.name = "enum";
    }
    public AttributeEnumTypeImpl() {
        this.name = "enum";
    }

    
    public String getName(){
        return this.name;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> getValues(){
        return this.values;
    }

    public void setValues(final com.commercetools.importapi.models.producttypes.AttributePlainEnumValue ...values){
       this.values = new ArrayList<>(Arrays.asList(values));
    }
    
    public void setValues(final java.util.List<com.commercetools.importapi.models.producttypes.AttributePlainEnumValue> values){
       this.values = values;
    }

}
