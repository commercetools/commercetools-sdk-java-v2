
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
 *  <p>Returned if the requested search service is not ready. The search might be deactivated or indexing is in progress.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchNotReadyError searchNotReadyError = SearchNotReadyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchNotReadyErrorImpl.class)
public interface SearchNotReadyError extends ErrorObject {

    /**
     * discriminator value for SearchNotReadyError
     */
    String SEARCH_NOT_READY = "SearchNotReady";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>$Search is not ready. Check the indexing-status endpoint and that the feature has been activated in the project settings.</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>$Search is not ready. Check the indexing-status endpoint and that the feature has been activated in the project settings.</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of SearchNotReadyError
     */
    public static SearchNotReadyError of() {
        return new SearchNotReadyErrorImpl();
    }

    /**
     * factory method to create a shallow copy SearchNotReadyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchNotReadyError of(final SearchNotReadyError template) {
        SearchNotReadyErrorImpl instance = new SearchNotReadyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchNotReadyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchNotReadyError deepCopy(@Nullable final SearchNotReadyError template) {
        if (template == null) {
            return null;
        }
        SearchNotReadyErrorImpl instance = new SearchNotReadyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for SearchNotReadyError
     * @return builder
     */
    public static SearchNotReadyErrorBuilder builder() {
        return SearchNotReadyErrorBuilder.of();
    }

    /**
     * create builder for SearchNotReadyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchNotReadyErrorBuilder builder(final SearchNotReadyError template) {
        return SearchNotReadyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchNotReadyError(Function<SearchNotReadyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchNotReadyError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchNotReadyError>() {
            @Override
            public String toString() {
                return "TypeReference<SearchNotReadyError>";
            }
        };
    }
}
