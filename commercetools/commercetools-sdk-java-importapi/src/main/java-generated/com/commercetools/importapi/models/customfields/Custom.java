
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.TypeKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The representation to be sent to the server when creating a resource with Custom Fields.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Custom custom = Custom.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomImpl.class)
public interface Custom {

    /**
     *  <p>The Type that provides the field definitions for this object. If the referenced Type does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Type is created.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public TypeKeyReference getType();

    /**
     *  <p>The Custom Fields of this object.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>The Type that provides the field definitions for this object. If the referenced Type does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Type is created.</p>
     * @param type value to be set
     */

    public void setType(final TypeKeyReference type);

    /**
     *  <p>The Custom Fields of this object.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of Custom
     */
    public static Custom of() {
        return new CustomImpl();
    }

    /**
     * factory method to create a shallow copy Custom
     * @param template instance to be copied
     * @return copy instance
     */
    public static Custom of(final Custom template) {
        CustomImpl instance = new CustomImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public Custom copyDeep();

    /**
     * factory method to create a deep copy of Custom
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Custom deepCopy(@Nullable final Custom template) {
        if (template == null) {
            return null;
        }
        CustomImpl instance = new CustomImpl();
        instance.setType(com.commercetools.importapi.models.common.TypeKeyReference.deepCopy(template.getType()));
        instance.setFields(
            com.commercetools.importapi.models.customfields.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for Custom
     * @return builder
     */
    public static CustomBuilder builder() {
        return CustomBuilder.of();
    }

    /**
     * create builder for Custom instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomBuilder builder(final Custom template) {
        return CustomBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustom(Function<Custom, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Custom> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Custom>() {
            @Override
            public String toString() {
                return "TypeReference<Custom>";
            }
        };
    }
}
