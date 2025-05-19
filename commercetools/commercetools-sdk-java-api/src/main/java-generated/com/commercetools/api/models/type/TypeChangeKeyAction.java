
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * TypeChangeKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeKeyAction typeChangeKeyAction = TypeChangeKeyAction.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeKeyActionImpl.class)
public interface TypeChangeKeyAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeChangeKeyAction
     */
    String CHANGE_KEY = "changeKey";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of TypeChangeKeyAction
     */
    public static TypeChangeKeyAction of() {
        return new TypeChangeKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeChangeKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeChangeKeyAction of(final TypeChangeKeyAction template) {
        TypeChangeKeyActionImpl instance = new TypeChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public TypeChangeKeyAction copyDeep();

    /**
     * factory method to create a deep copy of TypeChangeKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeChangeKeyAction deepCopy(@Nullable final TypeChangeKeyAction template) {
        if (template == null) {
            return null;
        }
        TypeChangeKeyActionImpl instance = new TypeChangeKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for TypeChangeKeyAction
     * @return builder
     */
    public static TypeChangeKeyActionBuilder builder() {
        return TypeChangeKeyActionBuilder.of();
    }

    /**
     * create builder for TypeChangeKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeKeyActionBuilder builder(final TypeChangeKeyAction template) {
        return TypeChangeKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeChangeKeyAction(Function<TypeChangeKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeKeyAction>";
            }
        };
    }
}
