package com.commercetools.api.models.type;

import com.commercetools.api.models.type.CustomFieldEnumValue;
import com.commercetools.api.models.type.FieldType;
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
public final class CustomFieldEnumTypeImpl implements CustomFieldEnumType {

    private String name;
    
    private java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values;

    @JsonCreator
    CustomFieldEnumTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values) {
        this.values = values;
        this.name = "Enum";
    }
    public CustomFieldEnumTypeImpl() {
        this.name = "Enum";
    }

    
    public String getName(){
        return this.name;
    }
    
    
    public java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> getValues(){
        return this.values;
    }

    public void setValues(final com.commercetools.api.models.type.CustomFieldEnumValue ...values){
       this.values = new ArrayList<>(Arrays.asList(values));
    }
    
    public void setValues(final java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values){
       this.values = values;
    }

}
