package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue;
import com.commercetools.importapi.models.producttypes.AttributeType;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeLocalizedEnumTypeImpl implements AttributeLocalizedEnumType {

    private String name;

    private java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> values;

    @JsonCreator
    AttributeLocalizedEnumTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> values) {
        this.values = values;
        this.name = "lenum";
    }
    public AttributeLocalizedEnumTypeImpl() {

    }


    public String getName(){
        return this.name;
    }


    public java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> getValues(){
        return this.values;
    }

    public void setValues(final java.util.List<com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue> values){
        this.values = values;
    }

}
