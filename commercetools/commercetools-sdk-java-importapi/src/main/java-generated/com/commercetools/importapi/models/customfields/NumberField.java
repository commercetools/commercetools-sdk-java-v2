
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
@io.vrap.rmf.base.client.utils.json.SubType("Number")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NumberFieldImpl.class)
public interface NumberField extends CustomField {

    /**
     * discriminator value for NumberField
     */
    String NUMBER = "Number";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Double getValue();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final Double value);

    /**
     * factory method
     * @return instance of NumberField
     */
    public static NumberField of() {
        return new NumberFieldImpl();
    }

    /**
     * factory method to create a shallow copy NumberField
     * @param template instance to be copied
     * @return copy instance
     */
    public static NumberField of(final NumberField template) {
        NumberFieldImpl instance = new NumberFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public NumberField copyDeep();

    /**
     * factory method to create a deep copy of NumberField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NumberField deepCopy(@Nullable final NumberField template) {
        if (template == null) {
            return null;
        }
        NumberFieldImpl instance = new NumberFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for NumberField
     * @return builder
     */
    public static NumberFieldBuilder builder() {
        return NumberFieldBuilder.of();
    }

    /**
     * create builder for NumberField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NumberFieldBuilder builder(final NumberField template) {
        return NumberFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNumberField(Function<NumberField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NumberField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NumberField>() {
            @Override
            public String toString() {
                return "TypeReference<NumberField>";
            }
        };
    }
}
