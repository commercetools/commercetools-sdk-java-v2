
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a boolean set value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = BooleanSetFieldImpl.class)
public interface BooleanSetField extends CustomField {

    String BOOLEAN_SET = "BooleanSet";

    @NotNull
    @JsonProperty("value")
    public List<Boolean> getValue();

    @JsonIgnore
    public void setValue(final Boolean... value);

    public void setValue(final List<Boolean> value);

    public static BooleanSetField of() {
        return new BooleanSetFieldImpl();
    }

    public static BooleanSetField of(final BooleanSetField template) {
        BooleanSetFieldImpl instance = new BooleanSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static BooleanSetFieldBuilder builder() {
        return BooleanSetFieldBuilder.of();
    }

    public static BooleanSetFieldBuilder builder(final BooleanSetField template) {
        return BooleanSetFieldBuilder.of(template);
    }

    default <T> T withBooleanSetField(Function<BooleanSetField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BooleanSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BooleanSetField>() {
            @Override
            public String toString() {
                return "TypeReference<BooleanSetField>";
            }
        };
    }
}
