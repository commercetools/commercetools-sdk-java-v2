package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.LocalTime;
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


/**
*  <p>A field with a time set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TimeSetFieldImpl implements TimeSetField {

    private String type;
    
    private java.util.List<java.time.LocalTime> value;

    @JsonCreator
    TimeSetFieldImpl(@JsonProperty("value") final java.util.List<java.time.LocalTime> value) {
        this.value = value;
        this.type = "TimeSet";
    }
    public TimeSetFieldImpl() {
       
    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<java.time.LocalTime> getValue(){
        return this.value;
    }

    public void setValue(final java.time.LocalTime ...value){
       this.value = new ArrayList<>(Arrays.asList(value));
    }
    
    public void setValue(final java.util.List<java.time.LocalTime> value){
       this.value = value;
    }

}
