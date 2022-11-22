
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SearchExecutionFailureErrorImpl.class)
public interface SearchExecutionFailureError extends ErrorObject {

    String SEARCH_EXECUTION_FAILURE = "SearchExecutionFailure";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Something went wrong during the search query execution. In most case this happens due to usage of non-existing fields and custom product attributes. Please verify all filters and facets in your search query and make sure that all paths are correct."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setMessage(final String message);

    public static SearchExecutionFailureError of() {
        return new SearchExecutionFailureErrorImpl();
    }

    public static SearchExecutionFailureError of(final SearchExecutionFailureError template) {
        SearchExecutionFailureErrorImpl instance = new SearchExecutionFailureErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static SearchExecutionFailureErrorBuilder builder() {
        return SearchExecutionFailureErrorBuilder.of();
    }

    public static SearchExecutionFailureErrorBuilder builder(final SearchExecutionFailureError template) {
        return SearchExecutionFailureErrorBuilder.of(template);
    }

    default <T> T withSearchExecutionFailureError(Function<SearchExecutionFailureError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SearchExecutionFailureError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchExecutionFailureError>() {
            @Override
            public String toString() {
                return "TypeReference<SearchExecutionFailureError>";
            }
        };
    }
}
