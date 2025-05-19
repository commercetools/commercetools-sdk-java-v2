
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.KeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>A field with a reference value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceField referenceField = ReferenceField.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Reference")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferenceFieldImpl.class)
public interface ReferenceField extends CustomField {

    /**
     * discriminator value for ReferenceField
     */
    String REFERENCE = "Reference";

    /**
     *  <p>References a resource by key</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public KeyReference getValue();

    /**
     *  <p>References a resource by key</p>
     * @param value value to be set
     */

    public void setValue(final KeyReference value);

    /**
     * factory method
     * @return instance of ReferenceField
     */
    public static ReferenceField of() {
        return new ReferenceFieldImpl();
    }

    /**
     * factory method to create a shallow copy ReferenceField
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReferenceField of(final ReferenceField template) {
        ReferenceFieldImpl instance = new ReferenceFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public ReferenceField copyDeep();

    /**
     * factory method to create a deep copy of ReferenceField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReferenceField deepCopy(@Nullable final ReferenceField template) {
        if (template == null) {
            return null;
        }
        ReferenceFieldImpl instance = new ReferenceFieldImpl();
        instance.setValue(com.commercetools.importapi.models.common.KeyReference.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for ReferenceField
     * @return builder
     */
    public static ReferenceFieldBuilder builder() {
        return ReferenceFieldBuilder.of();
    }

    /**
     * create builder for ReferenceField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceFieldBuilder builder(final ReferenceField template) {
        return ReferenceFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReferenceField(Function<ReferenceField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReferenceField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferenceField>() {
            @Override
            public String toString() {
                return "TypeReference<ReferenceField>";
            }
        };
    }
}
