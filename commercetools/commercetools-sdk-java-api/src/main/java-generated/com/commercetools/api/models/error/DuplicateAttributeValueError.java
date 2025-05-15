
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the <code>Unique</code> AttributeConstraint criteria are not met during an Update Product request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateAttributeValueError duplicateAttributeValueError = DuplicateAttributeValueError.builder()
 *             .message("{message}")
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicateAttributeValue")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateAttributeValueErrorImpl.class)
public interface DuplicateAttributeValueError extends ErrorObject {

    /**
     * discriminator value for DuplicateAttributeValueError
     */
    String DUPLICATE_ATTRIBUTE_VALUE = "DuplicateAttributeValue";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Attribute can't have the same value in a different variant."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Conflicting Attributes.</p>
     * @return attribute
     */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public Attribute getAttribute();

    /**
     *  <p><code>"Attribute can't have the same value in a different variant."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Conflicting Attributes.</p>
     * @param attribute value to be set
     */

    public void setAttribute(final Attribute attribute);

    /**
     * factory method
     * @return instance of DuplicateAttributeValueError
     */
    public static DuplicateAttributeValueError of() {
        return new DuplicateAttributeValueErrorImpl();
    }

    /**
     * factory method to create a shallow copy DuplicateAttributeValueError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DuplicateAttributeValueError of(final DuplicateAttributeValueError template) {
        DuplicateAttributeValueErrorImpl instance = new DuplicateAttributeValueErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    public DuplicateAttributeValueError copyDeep();

    /**
     * factory method to create a deep copy of DuplicateAttributeValueError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DuplicateAttributeValueError deepCopy(@Nullable final DuplicateAttributeValueError template) {
        if (template == null) {
            return null;
        }
        DuplicateAttributeValueErrorImpl instance = new DuplicateAttributeValueErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAttribute(com.commercetools.api.models.product.Attribute.deepCopy(template.getAttribute()));
        return instance;
    }

    /**
     * builder factory method for DuplicateAttributeValueError
     * @return builder
     */
    public static DuplicateAttributeValueErrorBuilder builder() {
        return DuplicateAttributeValueErrorBuilder.of();
    }

    /**
     * create builder for DuplicateAttributeValueError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateAttributeValueErrorBuilder builder(final DuplicateAttributeValueError template) {
        return DuplicateAttributeValueErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDuplicateAttributeValueError(Function<DuplicateAttributeValueError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateAttributeValueError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateAttributeValueError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateAttributeValueError>";
            }
        };
    }
}
