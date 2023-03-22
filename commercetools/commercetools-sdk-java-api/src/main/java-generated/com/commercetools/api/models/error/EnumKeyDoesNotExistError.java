
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setMessage(final String message);

    public void setConflictingEnumKey(final String conflictingEnumKey);

    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static EnumKeyDoesNotExistError of() {
        return new EnumKeyDoesNotExistErrorImpl();
    }

    public static EnumKeyDoesNotExistError of(final EnumKeyDoesNotExistError template) {
        EnumKeyDoesNotExistErrorImpl instance = new EnumKeyDoesNotExistErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    public static EnumKeyDoesNotExistErrorBuilder builder() {
        return EnumKeyDoesNotExistErrorBuilder.of();
    }

    public static EnumKeyDoesNotExistErrorBuilder builder(final EnumKeyDoesNotExistError template) {
        return EnumKeyDoesNotExistErrorBuilder.of(template);
    }

    default <T> T withEnumKeyDoesNotExistError(Function<EnumKeyDoesNotExistError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EnumKeyDoesNotExistError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumKeyDoesNotExistError>() {
            @Override
            public String toString() {
                return "TypeReference<EnumKeyDoesNotExistError>";
            }
        };
    }
}
