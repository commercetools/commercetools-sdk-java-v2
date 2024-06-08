
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
 *  <p>Returned when the indexing of Product information is deactivated in a Project.</p>
 *  <p>To activate indexing, call Change Product Search Indexing Enabled and set <code>enabled</code> to <code>true</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchDeactivatedError searchDeactivatedError = SearchDeactivatedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchDeactivatedErrorImpl.class)
public interface SearchDeactivatedError extends ErrorObject {

    /**
     * discriminator value for SearchDeactivatedError
     */
    String SEARCH_DEACTIVATED = "SearchDeactivated";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The endpoint is deactivated for this project. Please enable it via the Project endpoint, via the Merchant Center in the Project settings, or reach out to Support to enable it."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The endpoint is deactivated for this project. Please enable it via the Project endpoint, via the Merchant Center in the Project settings, or reach out to Support to enable it."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of SearchDeactivatedError
     */
    public static SearchDeactivatedError of() {
        return new SearchDeactivatedErrorImpl();
    }

    /**
     * factory method to create a shallow copy SearchDeactivatedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchDeactivatedError of(final SearchDeactivatedError template) {
        SearchDeactivatedErrorImpl instance = new SearchDeactivatedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchDeactivatedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchDeactivatedError deepCopy(@Nullable final SearchDeactivatedError template) {
        if (template == null) {
            return null;
        }
        SearchDeactivatedErrorImpl instance = new SearchDeactivatedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for SearchDeactivatedError
     * @return builder
     */
    public static SearchDeactivatedErrorBuilder builder() {
        return SearchDeactivatedErrorBuilder.of();
    }

    /**
     * create builder for SearchDeactivatedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchDeactivatedErrorBuilder builder(final SearchDeactivatedError template) {
        return SearchDeactivatedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchDeactivatedError(Function<SearchDeactivatedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchDeactivatedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchDeactivatedError>() {
            @Override
            public String toString() {
                return "TypeReference<SearchDeactivatedError>";
            }
        };
    }
}
