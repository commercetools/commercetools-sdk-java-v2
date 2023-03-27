
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a search facet path could not be found.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFacetPathNotFoundError searchFacetPathNotFoundError = SearchFacetPathNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchFacetPathNotFoundErrorImpl.class)
public interface SearchFacetPathNotFoundError extends ErrorObject {

    /**
     * discriminator value for SearchFacetPathNotFoundError
     */
    String SEARCH_FACET_PATH_NOT_FOUND = "SearchFacetPathNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Facet path $path not found."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Facet path $path not found."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of SearchFacetPathNotFoundError
     */
    public static SearchFacetPathNotFoundError of() {
        return new SearchFacetPathNotFoundErrorImpl();
    }

    /**
     * factory method to copy an instance of SearchFacetPathNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchFacetPathNotFoundError of(final SearchFacetPathNotFoundError template) {
        SearchFacetPathNotFoundErrorImpl instance = new SearchFacetPathNotFoundErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    /**
     * builder factory method for SearchFacetPathNotFoundError
     * @return builder
     */
    public static SearchFacetPathNotFoundErrorBuilder builder() {
        return SearchFacetPathNotFoundErrorBuilder.of();
    }

    /**
     * create builder for SearchFacetPathNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFacetPathNotFoundErrorBuilder builder(final SearchFacetPathNotFoundError template) {
        return SearchFacetPathNotFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchFacetPathNotFoundError(Function<SearchFacetPathNotFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchFacetPathNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchFacetPathNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<SearchFacetPathNotFoundError>";
            }
        };
    }
}
