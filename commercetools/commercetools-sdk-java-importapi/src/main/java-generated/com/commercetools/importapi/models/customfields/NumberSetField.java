
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
 *     NumberSetField numberSetField = NumberSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("NumberSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NumberSetFieldImpl.class)
public interface NumberSetField extends CustomField {

    /**
     * discriminator value for NumberSetField
     */
    String NUMBER_SET = "NumberSet";

    /**
     *  <p>JSON array of integer or floating-point number values. The order of items in the array is not fixed.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<Double> getValue();

    /**
     *  <p>JSON array of integer or floating-point number values. The order of items in the array is not fixed.</p>
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final Double... value);

    /**
     *  <p>JSON array of integer or floating-point number values. The order of items in the array is not fixed.</p>
     * @param value values to be set
     */

    public void setValue(final List<Double> value);

    /**
     * factory method
     * @return instance of NumberSetField
     */
    public static NumberSetField of() {
        return new NumberSetFieldImpl();
    }

    /**
     * factory method to create a shallow copy NumberSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static NumberSetField of(final NumberSetField template) {
        NumberSetFieldImpl instance = new NumberSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public NumberSetField copyDeep();

    /**
     * factory method to create a deep copy of NumberSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NumberSetField deepCopy(@Nullable final NumberSetField template) {
        if (template == null) {
            return null;
        }
        NumberSetFieldImpl instance = new NumberSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for NumberSetField
     * @return builder
     */
    public static NumberSetFieldBuilder builder() {
        return NumberSetFieldBuilder.of();
    }

    /**
     * create builder for NumberSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NumberSetFieldBuilder builder(final NumberSetField template) {
        return NumberSetFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNumberSetField(Function<NumberSetField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NumberSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NumberSetField>() {
            @Override
            public String toString() {
                return "TypeReference<NumberSetField>";
            }
        };
    }
}
