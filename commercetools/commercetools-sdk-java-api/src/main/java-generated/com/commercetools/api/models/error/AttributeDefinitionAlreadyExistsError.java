
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDefinitionAlreadyExistsErrorImpl.class)
public interface AttributeDefinitionAlreadyExistsError extends ErrorObject {

    String ATTRIBUTE_DEFINITION_ALREADY_EXISTS = "AttributeDefinitionAlreadyExists";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"An attribute definition with name $attributeName already exists on product type $productTypeName."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     */
    @NotNull
    @JsonProperty("conflictingProductTypeId")
    public String getConflictingProductTypeId();

    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     */
    @NotNull
    @JsonProperty("conflictingProductTypeName")
    public String getConflictingProductTypeName();

    /**
     *  <p>Name of the conflicting Attribute.</p>
     */
    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    public void setMessage(final String message);

    public void setConflictingProductTypeId(final String conflictingProductTypeId);

    public void setConflictingProductTypeName(final String conflictingProductTypeName);

    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static AttributeDefinitionAlreadyExistsError of() {
        return new AttributeDefinitionAlreadyExistsErrorImpl();
    }

    public static AttributeDefinitionAlreadyExistsError of(final AttributeDefinitionAlreadyExistsError template) {
        AttributeDefinitionAlreadyExistsErrorImpl instance = new AttributeDefinitionAlreadyExistsErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    public static AttributeDefinitionAlreadyExistsErrorBuilder builder() {
        return AttributeDefinitionAlreadyExistsErrorBuilder.of();
    }

    public static AttributeDefinitionAlreadyExistsErrorBuilder builder(
            final AttributeDefinitionAlreadyExistsError template) {
        return AttributeDefinitionAlreadyExistsErrorBuilder.of(template);
    }

    default <T> T withAttributeDefinitionAlreadyExistsError(Function<AttributeDefinitionAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionAlreadyExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionAlreadyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDefinitionAlreadyExistsError>";
            }
        };
    }
}
