
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    public void setMessage(final String message);

    public void setConflictingProductTypeId(final String conflictingProductTypeId);

    public void setConflictingProductTypeName(final String conflictingProductTypeName);

    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static AttributeDefinitionTypeConflictError of() {
        return new AttributeDefinitionTypeConflictErrorImpl();
    }

    public static AttributeDefinitionTypeConflictError of(final AttributeDefinitionTypeConflictError template) {
        AttributeDefinitionTypeConflictErrorImpl instance = new AttributeDefinitionTypeConflictErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    public static AttributeDefinitionTypeConflictErrorBuilder builder() {
        return AttributeDefinitionTypeConflictErrorBuilder.of();
    }

    public static AttributeDefinitionTypeConflictErrorBuilder builder(
            final AttributeDefinitionTypeConflictError template) {
        return AttributeDefinitionTypeConflictErrorBuilder.of(template);
    }

    default <T> T withAttributeDefinitionTypeConflictError(Function<AttributeDefinitionTypeConflictError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionTypeConflictError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionTypeConflictError>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDefinitionTypeConflictError>";
            }
        };
    }
}
