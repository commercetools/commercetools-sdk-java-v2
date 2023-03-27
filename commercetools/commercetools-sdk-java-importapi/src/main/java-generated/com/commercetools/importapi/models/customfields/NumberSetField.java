
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
 *     NumberSetField numberSetField = NumberSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NumberSetFieldImpl.class)
public interface NumberSetField extends CustomField {

    /**
     * discriminator value for NumberSetField
     */
    String NUMBER_SET = "NumberSet";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<Double> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final Double... value);

    /**
     * set value
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
     * factory method to copy an instance of NumberSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static NumberSetField of(final NumberSetField template) {
        NumberSetFieldImpl instance = new NumberSetFieldImpl();
        instance.setValue(template.getValue());
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
