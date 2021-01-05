package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalTime;
import com.commercetools.importapi.models.productvariants.TimeSetAttributeImpl;

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

    @JsonIgnore
    public void setValue(final LocalTime ...value);
    public void setValue(final List<LocalTime> value);

    public static TimeSetAttribute of(){
        return new TimeSetAttributeImpl();
    }
    

    public static TimeSetAttribute of(final TimeSetAttribute template) {
        TimeSetAttributeImpl instance = new TimeSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TimeSetAttributeBuilder builder(){
        return TimeSetAttributeBuilder.of();
    }
    
    public static TimeSetAttributeBuilder builder(final TimeSetAttribute template){
        return TimeSetAttributeBuilder.of(template);
    }
    

    default <T> T withTimeSetAttribute(Function<TimeSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
