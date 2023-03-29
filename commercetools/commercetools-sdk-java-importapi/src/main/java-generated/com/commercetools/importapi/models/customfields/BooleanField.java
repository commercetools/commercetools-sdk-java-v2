
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A field with a boolean value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BooleanField booleanField = BooleanField.builder()
 *             .value(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BooleanFieldImpl.class)
public interface BooleanField extends CustomField {

    /**
     * discriminator value for BooleanField
     */
    String BOOLEAN = "Boolean";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Boolean getValue();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final Boolean value);

    /**
     * factory method
     * @return instance of BooleanField
     */
    public static BooleanField of() {
        return new BooleanFieldImpl();
    }

    /**
     * factory method to create a shallow copy BooleanField
     * @param template instance to be copied
     * @return copy instance
     */
    public static BooleanField of(final BooleanField template) {
        BooleanFieldImpl instance = new BooleanFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of BooleanField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BooleanField deepCopy(@Nullable final BooleanField template) {
        if (template == null) {
            return null;
        }
        BooleanFieldImpl instance = new BooleanFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for BooleanField
     * @return builder
     */
    public static BooleanFieldBuilder builder() {
        return BooleanFieldBuilder.of();
    }

    /**
     * create builder for BooleanField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BooleanFieldBuilder builder(final BooleanField template) {
        return BooleanFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBooleanField(Function<BooleanField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BooleanField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BooleanField>() {
            @Override
            public String toString() {
                return "TypeReference<BooleanField>";
            }
        };
    }
}
