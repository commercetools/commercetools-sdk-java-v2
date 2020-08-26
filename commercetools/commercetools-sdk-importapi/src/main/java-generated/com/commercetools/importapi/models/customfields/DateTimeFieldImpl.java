package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.CustomField;
import java.time.ZonedDateTime;
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
*  <p>A field with a date time value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DateTimeFieldImpl implements DateTimeField {

    private String type;

    private java.time.ZonedDateTime value;

    @JsonCreator
    DateTimeFieldImpl(@JsonProperty("value") final java.time.ZonedDateTime value) {
        this.value = value;
        this.type = "DateTime";
    }
    public DateTimeFieldImpl() {

    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType(){
        return this.type;
    }


    public java.time.ZonedDateTime getValue(){
        return this.value;
    }

    public void setValue(final java.time.ZonedDateTime value){
        this.value = value;
    }

}
