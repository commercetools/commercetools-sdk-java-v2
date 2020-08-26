package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
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


/**
*  <p>A field with a enum value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class EnumFieldImpl implements EnumField {

    private String type;
    
    private String value;

    @JsonCreator
    EnumFieldImpl(@JsonProperty("value") final String value) {
        this.value = value;
        this.type = "Enum";
    }
    public EnumFieldImpl() {
       
    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType(){
        return this.type;
    }
    
    
    public String getValue(){
        return this.value;
    }

    public void setValue(final String value){
        this.value = value;
    }

}
