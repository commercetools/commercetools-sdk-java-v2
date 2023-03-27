
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when an AttributeEnumType or AttributeLocalizedEnumType contains a key that already exists.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumKeyAlreadyExistsError enumKeyAlreadyExistsError = EnumKeyAlreadyExistsError.builder()
 *             .message("{message}")
 *             .conflictingEnumKey("{conflictingEnumKey}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumKeyAlreadyExistsErrorImpl.class)
public interface EnumKeyAlreadyExistsError extends ErrorObject {

    /**
     * discriminator value for EnumKeyAlreadyExistsError
     */
    String ENUM_KEY_ALREADY_EXISTS = "EnumKeyAlreadyExists";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The $attributeName attribute definition already contains an enum value with the key $enumKey."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Conflicting enum key.</p>
     * @return conflictingEnumKey
     */
    @NotNull
    @JsonProperty("conflictingEnumKey")
    public String getConflictingEnumKey();

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */
    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    /**
     *  <p><code>"The $attributeName attribute definition already contains an enum value with the key $enumKey."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Conflicting enum key.</p>
     * @param conflictingEnumKey value to be set
     */

    public void setConflictingEnumKey(final String conflictingEnumKey);

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     */

    public void setConflictingAttributeName(final String conflictingAttributeName);

    /**
     * factory method
     * @return instance of EnumKeyAlreadyExistsError
     */
    public static EnumKeyAlreadyExistsError of() {
        return new EnumKeyAlreadyExistsErrorImpl();
    }

    /**
     * factory method to copy an instance of EnumKeyAlreadyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static EnumKeyAlreadyExistsError of(final EnumKeyAlreadyExistsError template) {
        EnumKeyAlreadyExistsErrorImpl instance = new EnumKeyAlreadyExistsErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * builder factory method for EnumKeyAlreadyExistsError
     * @return builder
     */
    public static EnumKeyAlreadyExistsErrorBuilder builder() {
        return EnumKeyAlreadyExistsErrorBuilder.of();
    }

    /**
     * create builder for EnumKeyAlreadyExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumKeyAlreadyExistsErrorBuilder builder(final EnumKeyAlreadyExistsError template) {
        return EnumKeyAlreadyExistsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEnumKeyAlreadyExistsError(Function<EnumKeyAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EnumKeyAlreadyExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumKeyAlreadyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<EnumKeyAlreadyExistsError>";
            }
        };
    }
}
