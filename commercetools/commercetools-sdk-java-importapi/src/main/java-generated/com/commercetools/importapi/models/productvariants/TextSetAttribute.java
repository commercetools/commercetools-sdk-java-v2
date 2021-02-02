
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents an attribute which value is a set of strings.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TextSetAttributeImpl.class)
public interface TextSetAttribute extends Attribute {

    String TEXT_SET = "text-set";

    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    @JsonIgnore
    public void setValue(final String... value);

    public void setValue(final List<String> value);

    public static TextSetAttribute of() {
        return new TextSetAttributeImpl();
    }

    public static TextSetAttribute of(final TextSetAttribute template) {
        TextSetAttributeImpl instance = new TextSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static TextSetAttributeBuilder builder() {
        return TextSetAttributeBuilder.of();
    }

    public static TextSetAttributeBuilder builder(final TextSetAttribute template) {
        return TextSetAttributeBuilder.of(template);
    }

    default <T> T withTextSetAttribute(Function<TextSetAttribute, T> helper) {
        return helper.apply(this);
    }
}
