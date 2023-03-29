
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when an AttributeEnumType or AttributeLocalizedEnumType already contains a value with the given key.</p>
 *  <p>The error is returned as a failed response to the Change the key of an EnumValue update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumKeyDoesNotExistError enumKeyDoesNotExistError = EnumKeyDoesNotExistError.builder()
 *             .message("{message}")
 *             .conflictingEnumKey("{conflictingEnumKey}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumKeyDoesNotExistErrorImpl.class)
public interface EnumKeyDoesNotExistError extends ErrorObject {

    /**
     * discriminator value for EnumKeyDoesNotExistError
     */
    String ENUM_KEY_DOES_NOT_EXIST = "EnumKeyDoesNotExist";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The $fieldName field definition does not contain an enum value with the key $enumKey."</code></p>
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
     *  <p><code>"The $fieldName field definition does not contain an enum value with the key $enumKey."</code></p>
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
     * @return instance of EnumKeyDoesNotExistError
     */
    public static EnumKeyDoesNotExistError of() {
        return new EnumKeyDoesNotExistErrorImpl();
    }

    /**
     * factory method to create a shallow copy EnumKeyDoesNotExistError
     * @param template instance to be copied
     * @return copy instance
     */
    public static EnumKeyDoesNotExistError of(final EnumKeyDoesNotExistError template) {
        EnumKeyDoesNotExistErrorImpl instance = new EnumKeyDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of EnumKeyDoesNotExistError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EnumKeyDoesNotExistError deepCopy(@Nullable final EnumKeyDoesNotExistError template) {
        if (template == null) {
            return null;
        }
        EnumKeyDoesNotExistErrorImpl instance = new EnumKeyDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * builder factory method for EnumKeyDoesNotExistError
     * @return builder
     */
    public static EnumKeyDoesNotExistErrorBuilder builder() {
        return EnumKeyDoesNotExistErrorBuilder.of();
    }

    /**
     * create builder for EnumKeyDoesNotExistError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumKeyDoesNotExistErrorBuilder builder(final EnumKeyDoesNotExistError template) {
        return EnumKeyDoesNotExistErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEnumKeyDoesNotExistError(Function<EnumKeyDoesNotExistError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EnumKeyDoesNotExistError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumKeyDoesNotExistError>() {
            @Override
            public String toString() {
                return "TypeReference<EnumKeyDoesNotExistError>";
            }
        };
    }
}
