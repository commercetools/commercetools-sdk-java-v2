package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.SearchExecutionFailureErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Returned when a search query could not be completed due to an unexpected failure.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchExecutionFailureError searchExecutionFailureError = SearchExecutionFailureError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SearchExecutionFailureErrorImpl.class)
public interface SearchExecutionFailureError extends ErrorObject {

    /**
     * discriminator value for SearchExecutionFailureError
     */
    String SEARCH_EXECUTION_FAILURE = "SearchExecutionFailure";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p><code>"Something went wrong during the search query execution. In most case this happens due to usage of non-existing fields and custom product attributes. Please verify all filters and facets in your search query and make sure that all paths are correct."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Something went wrong during the search query execution. In most case this happens due to usage of non-existing fields and custom product attributes. Please verify all filters and facets in your search query and make sure that all paths are correct."</code></p>
     * @param message value to be set
     */
    
    public void setMessage(final String message);
    

    /**
     * factory method
     * @return instance of SearchExecutionFailureError
     */
    public static SearchExecutionFailureError of(){
        return new SearchExecutionFailureErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy SearchExecutionFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchExecutionFailureError of(final SearchExecutionFailureError template) {
        SearchExecutionFailureErrorImpl instance = new SearchExecutionFailureErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchExecutionFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchExecutionFailureError deepCopy(@Nullable final SearchExecutionFailureError template) {
        if (template == null) {
            return null;
        }
        SearchExecutionFailureErrorImpl instance = new SearchExecutionFailureErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for SearchExecutionFailureError
     * @return builder
     */
    public static SearchExecutionFailureErrorBuilder builder() {
        return SearchExecutionFailureErrorBuilder.of();
    }
    
    /**
     * create builder for SearchExecutionFailureError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchExecutionFailureErrorBuilder builder(final SearchExecutionFailureError template) {
        return SearchExecutionFailureErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchExecutionFailureError(Function<SearchExecutionFailureError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchExecutionFailureError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchExecutionFailureError>() {
            @Override
            public String toString() {
                return "TypeReference<SearchExecutionFailureError>";
            }
        };
    }
}
