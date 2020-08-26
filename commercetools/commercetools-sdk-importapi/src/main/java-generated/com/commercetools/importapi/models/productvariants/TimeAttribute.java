package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalTime;
import com.commercetools.importapi.models.productvariants.TimeAttributeImpl;

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
*  <p>This type represents an attribute which value is a time.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TimeAttributeImpl.class)
public interface TimeAttribute extends Attribute {


    @NotNull
    @JsonProperty("value")
    public LocalTime getValue();

    public void setValue(final LocalTime value);

    public static TimeAttributeImpl of(){
        return new TimeAttributeImpl();
    }


    public static TimeAttributeImpl of(final TimeAttribute template) {
        TimeAttributeImpl instance = new TimeAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
