
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
 *  <p>Returned when the <code>name</code> of the AttributeDefinition conflicts with an existing Attribute.</p>
 *  <p>The error is returned as a failed response to the Create ProductType request or Change AttributeDefinition Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinitionAlreadyExistsError attributeDefinitionAlreadyExistsError = AttributeDefinitionAlreadyExistsError.builder()
 *             .message("{message}")
 *             .conflictingProductTypeId("{conflictingProductTypeId}")
 *             .conflictingProductTypeName("{conflictingProductTypeName}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AttributeDefinitionAlreadyExists")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDefinitionAlreadyExistsErrorImpl.class)
public interface AttributeDefinitionAlreadyExistsError extends ErrorObject {

    /**
     * discriminator value for AttributeDefinitionAlreadyExistsError
     */
    String ATTRIBUTE_DEFINITION_ALREADY_EXISTS = "AttributeDefinitionAlreadyExists";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"An attribute definition with name $attributeName already exists on product type $productTypeName."</code></p>
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
     *  <p><code>"An attribute definition with name $attributeName already exists on product type $productTypeName."</code></p>
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
     * @return instance of AttributeDefinitionAlreadyExistsError
     */
    public static AttributeDefinitionAlreadyExistsError of() {
        return new AttributeDefinitionAlreadyExistsErrorImpl();
    }

    /**
     * factory method to create a shallow copy AttributeDefinitionAlreadyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeDefinitionAlreadyExistsError of(final AttributeDefinitionAlreadyExistsError template) {
        AttributeDefinitionAlreadyExistsErrorImpl instance = new AttributeDefinitionAlreadyExistsErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    public AttributeDefinitionAlreadyExistsError copyDeep();

    /**
     * factory method to create a deep copy of AttributeDefinitionAlreadyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeDefinitionAlreadyExistsError deepCopy(
            @Nullable final AttributeDefinitionAlreadyExistsError template) {
        if (template == null) {
            return null;
        }
        AttributeDefinitionAlreadyExistsErrorImpl instance = new AttributeDefinitionAlreadyExistsErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * builder factory method for AttributeDefinitionAlreadyExistsError
     * @return builder
     */
    public static AttributeDefinitionAlreadyExistsErrorBuilder builder() {
        return AttributeDefinitionAlreadyExistsErrorBuilder.of();
    }

    /**
     * create builder for AttributeDefinitionAlreadyExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDefinitionAlreadyExistsErrorBuilder builder(
            final AttributeDefinitionAlreadyExistsError template) {
        return AttributeDefinitionAlreadyExistsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeDefinitionAlreadyExistsError(Function<AttributeDefinitionAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionAlreadyExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionAlreadyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDefinitionAlreadyExistsError>";
            }
        };
    }
}
