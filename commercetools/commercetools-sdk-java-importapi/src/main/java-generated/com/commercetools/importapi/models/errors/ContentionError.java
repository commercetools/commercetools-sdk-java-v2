
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ContentionError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ContentionError contentionError = ContentionError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Contention")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ContentionErrorImpl.class)
public interface ContentionError extends ErrorObject {

    /**
     * discriminator value for ContentionError
     */
    String CONTENTION = "Contention";

    /**
     * factory method
     * @return instance of ContentionError
     */
    public static ContentionError of() {
        return new ContentionErrorImpl();
    }

    /**
     * factory method to create a shallow copy ContentionError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ContentionError of(final ContentionError template) {
        ContentionErrorImpl instance = new ContentionErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public ContentionError copyDeep();

    /**
     * factory method to create a deep copy of ContentionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ContentionError deepCopy(@Nullable final ContentionError template) {
        if (template == null) {
            return null;
        }
        ContentionErrorImpl instance = new ContentionErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for ContentionError
     * @return builder
     */
    public static ContentionErrorBuilder builder() {
        return ContentionErrorBuilder.of();
    }

    /**
     * create builder for ContentionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ContentionErrorBuilder builder(final ContentionError template) {
        return ContentionErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withContentionError(Function<ContentionError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ContentionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ContentionError>() {
            @Override
            public String toString() {
                return "TypeReference<ContentionError>";
            }
        };
    }
}
