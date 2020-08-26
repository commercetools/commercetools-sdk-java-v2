package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.productvariants.DateTimeSetAttributeImpl;

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
*  <p>This type represents an attribute which value is a set of dates with time.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DateTimeSetAttributeImpl.class)
public interface DateTimeSetAttribute extends Attribute {


    @NotNull
    @JsonProperty("value")
    public List<ZonedDateTime> getValue();

    public void setValue(final List<ZonedDateTime> value);

    public static DateTimeSetAttributeImpl of(){
        return new DateTimeSetAttributeImpl();
    }


    public static DateTimeSetAttributeImpl of(final DateTimeSetAttribute template) {
        DateTimeSetAttributeImpl instance = new DateTimeSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

}
