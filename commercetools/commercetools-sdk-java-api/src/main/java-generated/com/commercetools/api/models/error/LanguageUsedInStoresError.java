
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
 *  <p>Returned when a language cannot be removed from a Project as it is being used by a Store.</p>
 *  <p>The error is returned as a failed response to the Change Languages update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LanguageUsedInStoresError languageUsedInStoresError = LanguageUsedInStoresError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("LanguageUsedInStores")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LanguageUsedInStoresErrorImpl.class)
public interface LanguageUsedInStoresError extends ErrorObject {

    /**
     * discriminator value for LanguageUsedInStoresError
     */
    String LANGUAGE_USED_IN_STORES = "LanguageUsedInStores";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Language(s) in use by a store cannot be deleted. Remove them in all the stores of this project first."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Language(s) in use by a store cannot be deleted. Remove them in all the stores of this project first."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of LanguageUsedInStoresError
     */
    public static LanguageUsedInStoresError of() {
        return new LanguageUsedInStoresErrorImpl();
    }

    /**
     * factory method to create a shallow copy LanguageUsedInStoresError
     * @param template instance to be copied
     * @return copy instance
     */
    public static LanguageUsedInStoresError of(final LanguageUsedInStoresError template) {
        LanguageUsedInStoresErrorImpl instance = new LanguageUsedInStoresErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public LanguageUsedInStoresError copyDeep();

    /**
     * factory method to create a deep copy of LanguageUsedInStoresError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LanguageUsedInStoresError deepCopy(@Nullable final LanguageUsedInStoresError template) {
        if (template == null) {
            return null;
        }
        LanguageUsedInStoresErrorImpl instance = new LanguageUsedInStoresErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for LanguageUsedInStoresError
     * @return builder
     */
    public static LanguageUsedInStoresErrorBuilder builder() {
        return LanguageUsedInStoresErrorBuilder.of();
    }

    /**
     * create builder for LanguageUsedInStoresError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LanguageUsedInStoresErrorBuilder builder(final LanguageUsedInStoresError template) {
        return LanguageUsedInStoresErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLanguageUsedInStoresError(Function<LanguageUsedInStoresError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LanguageUsedInStoresError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LanguageUsedInStoresError>() {
            @Override
            public String toString() {
                return "TypeReference<LanguageUsedInStoresError>";
            }
        };
    }
}
