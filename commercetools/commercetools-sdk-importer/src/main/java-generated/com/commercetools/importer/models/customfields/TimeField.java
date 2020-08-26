package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.CustomField;
import java.time.LocalTime;
import com.commercetools.importer.models.customfields.TimeFieldImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>A field with a time value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TimeFieldImpl.class)
public interface TimeField extends CustomField {

    
    @NotNull
    @JsonProperty("value")
    public LocalTime getValue();

    public void setValue(final LocalTime value);

    public static TimeFieldImpl of(){
        return new TimeFieldImpl();
    }
    

    public static TimeFieldImpl of(final TimeField template) {
        TimeFieldImpl instance = new TimeFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
