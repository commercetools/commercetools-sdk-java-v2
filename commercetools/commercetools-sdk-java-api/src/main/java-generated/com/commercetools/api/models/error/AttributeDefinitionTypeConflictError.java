
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the <code>type</code> is different for an AttributeDefinition using the same <code>name</code> in multiple Product Types.</p>
 *  <p>The error is returned as a failed response to the Create ProductType request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinitionTypeConflictError attributeDefinitionTypeConflictError = AttributeDefinitionTypeConflictError.builder()
 *             .message("{message}")
 *             .conflictingProductTypeId("{conflictingProductTypeId}")
 *             .conflictingProductTypeName("{conflictingProductTypeName}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDefinitionTypeConflictErrorImpl.class)
public interface AttributeDefinitionTypeConflictError extends ErrorObject {

    /**
     * discriminator value for AttributeDefinitionTypeConflictError
     */
    String ATTRIBUTE_DEFINITION_TYPE_CONFLICT = "AttributeDefinitionTypeConflict";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The attribute with name $attributeName has a different type on product type $productTypeName."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     * @return conflictingProductTypeId
     */
    @NotNull
    @JsonProperty("conflictingProductTypeId")
    public String getConflictingProductTypeId();

    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     * @return conflictingProductTypeName
     */
    @NotNull
    @JsonProperty("conflictingProductTypeName")
    public String getConflictingProductTypeName();

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */
    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    /**
     *  <p><code>"The attribute with name $attributeName has a different type on product type $productTypeName."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     * @param conflictingProductTypeId value to be set
     */

    public void setConflictingProductTypeId(final String conflictingProductTypeId);

    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     * @param conflictingProductTypeName value to be set
     */

    public void setConflictingProductTypeName(final String conflictingProductTypeName);

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     */

    public void setConflictingAttributeName(final String conflictingAttributeName);

    /**
     * factory method
     * @return instance of AttributeDefinitionTypeConflictError
     */
    public static AttributeDefinitionTypeConflictError of() {
        return new AttributeDefinitionTypeConflictErrorImpl();
    }

    /**
     * factory method to create a shallow copy AttributeDefinitionTypeConflictError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeDefinitionTypeConflictError of(final AttributeDefinitionTypeConflictError template) {
        AttributeDefinitionTypeConflictErrorImpl instance = new AttributeDefinitionTypeConflictErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeDefinitionTypeConflictError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeDefinitionTypeConflictError deepCopy(
            @Nullable final AttributeDefinitionTypeConflictError template) {
        if (template == null) {
            return null;
        }
        AttributeDefinitionTypeConflictErrorImpl instance = new AttributeDefinitionTypeConflictErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * builder factory method for AttributeDefinitionTypeConflictError
     * @return builder
     */
    public static AttributeDefinitionTypeConflictErrorBuilder builder() {
        return AttributeDefinitionTypeConflictErrorBuilder.of();
    }

    /**
     * create builder for AttributeDefinitionTypeConflictError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDefinitionTypeConflictErrorBuilder builder(
            final AttributeDefinitionTypeConflictError template) {
        return AttributeDefinitionTypeConflictErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeDefinitionTypeConflictError(Function<AttributeDefinitionTypeConflictError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionTypeConflictError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionTypeConflictError>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDefinitionTypeConflictError>";
            }
        };
    }
}
