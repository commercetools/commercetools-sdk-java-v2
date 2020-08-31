package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalTime;
import com.commercetools.importapi.models.productvariants.TimeSetAttributeImpl;

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
*  <p>This type represents an attribute which value is a set of times.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TimeSetAttributeImpl.class)
public interface TimeSetAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public List<LocalTime> getValue();

    public void setValue(final List<LocalTime> value);

    public static TimeSetAttributeImpl of(){
        return new TimeSetAttributeImpl();
    }
    

    public static TimeSetAttributeImpl of(final TimeSetAttribute template) {
        TimeSetAttributeImpl instance = new TimeSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
