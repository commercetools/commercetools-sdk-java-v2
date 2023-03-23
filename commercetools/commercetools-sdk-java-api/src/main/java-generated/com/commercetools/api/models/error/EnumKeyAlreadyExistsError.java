
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

    public void setMessage(final String message);

    public void setConflictingEnumKey(final String conflictingEnumKey);

    public void setConflictingAttributeName(final String conflictingAttributeName);

    public static EnumKeyAlreadyExistsError of() {
        return new EnumKeyAlreadyExistsErrorImpl();
    }

    public static EnumKeyAlreadyExistsError of(final EnumKeyAlreadyExistsError template) {
        EnumKeyAlreadyExistsErrorImpl instance = new EnumKeyAlreadyExistsErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    public static EnumKeyAlreadyExistsErrorBuilder builder() {
        return EnumKeyAlreadyExistsErrorBuilder.of();
    }

    public static EnumKeyAlreadyExistsErrorBuilder builder(final EnumKeyAlreadyExistsError template) {
        return EnumKeyAlreadyExistsErrorBuilder.of(template);
    }

    default <T> T withEnumKeyAlreadyExistsError(Function<EnumKeyAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EnumKeyAlreadyExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumKeyAlreadyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<EnumKeyAlreadyExistsError>";
            }
        };
    }
}
