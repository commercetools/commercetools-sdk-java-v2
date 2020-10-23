package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import java.time.LocalDate;
import com.commercetools.importapi.models.productvariants.DateSetAttributeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>This type represents an attribute which value is a set of dates.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DateSetAttributeImpl.class)
public interface DateSetAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public List<LocalDate> getValue();

    public void setValue(final List<LocalDate> value);

    public static DateSetAttributeImpl of(){
        return new DateSetAttributeImpl();
    }
    

    public static DateSetAttributeImpl of(final DateSetAttribute template) {
        DateSetAttributeImpl instance = new DateSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withDateSetAttribute(Function<DateSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
