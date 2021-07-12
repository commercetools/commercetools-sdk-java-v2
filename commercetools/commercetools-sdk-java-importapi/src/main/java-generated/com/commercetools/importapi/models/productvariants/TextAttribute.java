
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents an attribute whose value is a string.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TextAttributeImpl.class)
public interface TextAttribute extends Attribute {

    String TEXT = "text";

    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setValue(final String value);

    public static TextAttribute of() {
        return new TextAttributeImpl();
    }

    public static TextAttribute of(final TextAttribute template) {
        TextAttributeImpl instance = new TextAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TextAttributeBuilder builder() {
        return TextAttributeBuilder.of();
    }

    public static TextAttributeBuilder builder(final TextAttribute template) {
        return TextAttributeBuilder.of(template);
    }

    default <T> T withTextAttribute(Function<TextAttribute, T> helper) {
        return helper.apply(this);
    }
}
