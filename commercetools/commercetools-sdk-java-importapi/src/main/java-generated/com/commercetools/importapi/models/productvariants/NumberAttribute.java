
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents an attribute which value is a number.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = NumberAttributeImpl.class)
public interface NumberAttribute extends Attribute {

    String NUMBER = "number";

    @NotNull
    @JsonProperty("value")
    public Double getValue();

    public void setValue(final Double value);

    public static NumberAttribute of() {
        return new NumberAttributeImpl();
    }

    public static NumberAttribute of(final NumberAttribute template) {
        NumberAttributeImpl instance = new NumberAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static NumberAttributeBuilder builder() {
        return NumberAttributeBuilder.of();
    }

    public static NumberAttributeBuilder builder(final NumberAttribute template) {
        return NumberAttributeBuilder.of(template);
    }

    default <T> T withNumberAttribute(Function<NumberAttribute, T> helper) {
        return helper.apply(this);
    }
}
