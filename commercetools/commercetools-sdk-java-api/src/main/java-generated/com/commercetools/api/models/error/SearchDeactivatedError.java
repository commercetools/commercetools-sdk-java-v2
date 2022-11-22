
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String SEARCH_DEACTIVATED = "SearchDeactivated";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The endpoint is deactivated for this project. Please enable it via the Project endpoint, via the Merchant Center in the Project settings, or reach out to Support to enable it."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setMessage(final String message);

    public static SearchDeactivatedError of() {
        return new SearchDeactivatedErrorImpl();
    }

    public static SearchDeactivatedError of(final SearchDeactivatedError template) {
        SearchDeactivatedErrorImpl instance = new SearchDeactivatedErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static SearchDeactivatedErrorBuilder builder() {
        return SearchDeactivatedErrorBuilder.of();
    }

    public static SearchDeactivatedErrorBuilder builder(final SearchDeactivatedError template) {
        return SearchDeactivatedErrorBuilder.of(template);
    }

    default <T> T withSearchDeactivatedError(Function<SearchDeactivatedError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SearchDeactivatedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchDeactivatedError>() {
            @Override
            public String toString() {
                return "TypeReference<SearchDeactivatedError>";
            }
        };
    }
}
