
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a boolean value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = BooleanFieldImpl.class)
public interface BooleanField extends CustomField {

    String BOOLEAN = "Boolean";

    @NotNull
    @JsonProperty("value")
    public Boolean getValue();

    public void setValue(final Boolean value);

    public static BooleanField of() {
        return new BooleanFieldImpl();
    }

    public static BooleanField of(final BooleanField template) {
        BooleanFieldImpl instance = new BooleanFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static BooleanFieldBuilder builder() {
        return BooleanFieldBuilder.of();
    }

    public static BooleanFieldBuilder builder(final BooleanField template) {
        return BooleanFieldBuilder.of(template);
    }

    default <T> T withBooleanField(Function<BooleanField, T> helper) {
        return helper.apply(this);
    }
}
