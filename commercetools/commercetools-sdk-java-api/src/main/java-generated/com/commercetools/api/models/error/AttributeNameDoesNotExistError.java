
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when an AttributeDefinition does not exist for an Attribute <code>name</code>.</p>
 *  <p>The error is returned as a failed response to the Change AttributeDefinition Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeNameDoesNotExistError attributeNameDoesNotExistError = AttributeNameDoesNotExistError.builder()
 *             .message("{message}")
 *             .invalidAttributeName("{invalidAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeNameDoesNotExistErrorImpl.class)
public interface AttributeNameDoesNotExistError extends ErrorObject {

    String ATTRIBUTE_NAME_DOES_NOT_EXIST = "AttributeNameDoesNotExist";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Attribute definition for $attributeName does not exist on type $typeName."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Non-existent Attribute name.</p>
     */
    @NotNull
    @JsonProperty("invalidAttributeName")
    public String getInvalidAttributeName();

    public void setMessage(final String message);

    public void setInvalidAttributeName(final String invalidAttributeName);

    public static AttributeNameDoesNotExistError of() {
        return new AttributeNameDoesNotExistErrorImpl();
    }

    public static AttributeNameDoesNotExistError of(final AttributeNameDoesNotExistError template) {
        AttributeNameDoesNotExistErrorImpl instance = new AttributeNameDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setInvalidAttributeName(template.getInvalidAttributeName());
        return instance;
    }

    public static AttributeNameDoesNotExistErrorBuilder builder() {
        return AttributeNameDoesNotExistErrorBuilder.of();
    }

    public static AttributeNameDoesNotExistErrorBuilder builder(final AttributeNameDoesNotExistError template) {
        return AttributeNameDoesNotExistErrorBuilder.of(template);
    }

    default <T> T withAttributeNameDoesNotExistError(Function<AttributeNameDoesNotExistError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeNameDoesNotExistError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeNameDoesNotExistError>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeNameDoesNotExistError>";
            }
        };
    }
}
