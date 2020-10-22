package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.NumberSetAttributeImpl;

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
*  <p>This type represents an attribute which value is a set of numbers.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = NumberSetAttributeImpl.class)
public interface NumberSetAttribute extends Attribute {

    
    @NotNull
    @JsonProperty("value")
    public List<Double> getValue();

    public void setValue(final List<Double> value);

    public static NumberSetAttributeImpl of(){
        return new NumberSetAttributeImpl();
    }
    

    public static NumberSetAttributeImpl of(final NumberSetAttribute template) {
        NumberSetAttributeImpl instance = new NumberSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<NumberSetAttribute>> T withNumberSetAttribute(Function<NumberSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
