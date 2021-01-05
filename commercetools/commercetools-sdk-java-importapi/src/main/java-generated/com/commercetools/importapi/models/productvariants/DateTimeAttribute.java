package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.productvariants.DateTimeAttributeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>This type represents an attribute which value is a date with time.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DateTimeAttributeImpl.class)
public interface DateTimeAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public ZonedDateTime getValue();

    public void setValue(final ZonedDateTime value);

    public static DateTimeAttribute of(){
        return new DateTimeAttributeImpl();
    }
    

    public static DateTimeAttribute of(final DateTimeAttribute template) {
        DateTimeAttributeImpl instance = new DateTimeAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static DateTimeAttributeBuilder builder(){
        return DateTimeAttributeBuilder.of();
    }
    
    public static DateTimeAttributeBuilder builder(final DateTimeAttribute template){
        return DateTimeAttributeBuilder.of(template);
    }
    

    default <T> T withDateTimeAttribute(Function<DateTimeAttribute, T> helper) {
        return helper.apply(this);
    }
}
