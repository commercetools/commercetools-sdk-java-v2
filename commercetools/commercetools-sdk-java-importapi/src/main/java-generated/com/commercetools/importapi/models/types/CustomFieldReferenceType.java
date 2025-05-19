
package com.commercetools.importapi.models.types;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Field type for Reference values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldReferenceType customFieldReferenceType = CustomFieldReferenceType.builder()
 *             .referenceTypeId(CustomFieldReferenceValue.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Reference")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldReferenceTypeImpl.class)
public interface CustomFieldReferenceType extends FieldType {

    /**
     * discriminator value for CustomFieldReferenceType
     */
    String REFERENCE = "Reference";

    /**
     *  <p>Resource type the Custom Field can reference.</p>
     * @return referenceTypeId
     */
    @NotNull
    @JsonProperty("referenceTypeId")
    public CustomFieldReferenceValue getReferenceTypeId();

    /**
     *  <p>Resource type the Custom Field can reference.</p>
     * @param referenceTypeId value to be set
     */

    public void setReferenceTypeId(final CustomFieldReferenceValue referenceTypeId);

    /**
     * factory method
     * @return instance of CustomFieldReferenceType
     */
    public static CustomFieldReferenceType of() {
        return new CustomFieldReferenceTypeImpl();
    }

    /**
     * factory method to create a shallow copy CustomFieldReferenceType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldReferenceType of(final CustomFieldReferenceType template) {
        CustomFieldReferenceTypeImpl instance = new CustomFieldReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

    public CustomFieldReferenceType copyDeep();

    /**
     * factory method to create a deep copy of CustomFieldReferenceType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldReferenceType deepCopy(@Nullable final CustomFieldReferenceType template) {
        if (template == null) {
            return null;
        }
        CustomFieldReferenceTypeImpl instance = new CustomFieldReferenceTypeImpl();
        instance.setReferenceTypeId(template.getReferenceTypeId());
        return instance;
    }

    /**
     * builder factory method for CustomFieldReferenceType
     * @return builder
     */
    public static CustomFieldReferenceTypeBuilder builder() {
        return CustomFieldReferenceTypeBuilder.of();
    }

    /**
     * create builder for CustomFieldReferenceType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldReferenceTypeBuilder builder(final CustomFieldReferenceType template) {
        return CustomFieldReferenceTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldReferenceType(Function<CustomFieldReferenceType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldReferenceType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldReferenceType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldReferenceType>";
            }
        };
    }
}
