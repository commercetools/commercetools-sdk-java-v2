
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A field with a number value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NumberField numberField = NumberField.builder()
 *             .value(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NumberFieldImpl.class)
public interface NumberField extends CustomField {

    String NUMBER = "Number";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Double getValue();

    public void setValue(final Double value);

    public static NumberField of() {
        return new NumberFieldImpl();
    }

    public static NumberField of(final NumberField template) {
        NumberFieldImpl instance = new NumberFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static NumberFieldBuilder builder() {
        return NumberFieldBuilder.of();
    }

    public static NumberFieldBuilder builder(final NumberField template) {
        return NumberFieldBuilder.of(template);
    }

    default <T> T withNumberField(Function<NumberField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<NumberField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NumberField>() {
            @Override
            public String toString() {
                return "TypeReference<NumberField>";
            }
        };
    }
}
