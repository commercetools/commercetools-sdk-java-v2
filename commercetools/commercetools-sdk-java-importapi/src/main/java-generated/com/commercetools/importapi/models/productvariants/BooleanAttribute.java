
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents an attribute which value is either &quot;true&quot; or &quot;false&quot;.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = BooleanAttributeImpl.class)
public interface BooleanAttribute extends Attribute {

    String BOOLEAN = "boolean";

    @NotNull
    @JsonProperty("value")
    public Boolean getValue();

    public void setValue(final Boolean value);

    public static BooleanAttribute of() {
        return new BooleanAttributeImpl();
    }

    public static BooleanAttribute of(final BooleanAttribute template) {
        BooleanAttributeImpl instance = new BooleanAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static BooleanAttributeBuilder builder() {
        return BooleanAttributeBuilder.of();
    }

    public static BooleanAttributeBuilder builder(final BooleanAttribute template) {
        return BooleanAttributeBuilder.of(template);
    }

    default <T> T withBooleanAttribute(Function<BooleanAttribute, T> helper) {
        return helper.apply(this);
    }
}
