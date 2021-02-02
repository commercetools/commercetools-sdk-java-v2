
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents an attribute which value is set of boolean values.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = BooleanSetAttributeImpl.class)
public interface BooleanSetAttribute extends Attribute {

    String BOOLEAN_SET = "boolean-set";

    @NotNull
    @JsonProperty("value")
    public List<Boolean> getValue();

    @JsonIgnore
    public void setValue(final Boolean... value);

    public void setValue(final List<Boolean> value);

    public static BooleanSetAttribute of() {
        return new BooleanSetAttributeImpl();
    }

    public static BooleanSetAttribute of(final BooleanSetAttribute template) {
        BooleanSetAttributeImpl instance = new BooleanSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static BooleanSetAttributeBuilder builder() {
        return BooleanSetAttributeBuilder.of();
    }

    public static BooleanSetAttributeBuilder builder(final BooleanSetAttribute template) {
        return BooleanSetAttributeBuilder.of(template);
    }

    default <T> T withBooleanSetAttribute(Function<BooleanSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
