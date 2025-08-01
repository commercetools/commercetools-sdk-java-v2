
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
 *  <p>A field with a string value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StringField stringField = StringField.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("String")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StringFieldImpl.class)
public interface StringField extends CustomField {

    /**
     * discriminator value for StringField
     */
    String STRING = "String";

    /**
     *  <p>A text value.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     *  <p>A text value.</p>
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     * factory method
     * @return instance of StringField
     */
    public static StringField of() {
        return new StringFieldImpl();
    }

    /**
     * factory method to create a shallow copy StringField
     * @param template instance to be copied
     * @return copy instance
     */
    public static StringField of(final StringField template) {
        StringFieldImpl instance = new StringFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public StringField copyDeep();

    /**
     * factory method to create a deep copy of StringField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StringField deepCopy(@Nullable final StringField template) {
        if (template == null) {
            return null;
        }
        StringFieldImpl instance = new StringFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StringField
     * @return builder
     */
    public static StringFieldBuilder builder() {
        return StringFieldBuilder.of();
    }

    /**
     * create builder for StringField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StringFieldBuilder builder(final StringField template) {
        return StringFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStringField(Function<StringField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StringField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StringField>() {
            @Override
            public String toString() {
                return "TypeReference<StringField>";
            }
        };
    }
}
