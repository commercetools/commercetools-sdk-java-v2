
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchFacetPathNotFoundErrorBuilder
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
public class SearchFacetPathNotFoundErrorBuilder implements Builder<SearchFacetPathNotFoundError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Facet path $path not found."</code></p>
     */

    public SearchFacetPathNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public SearchFacetPathNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public SearchFacetPathNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public SearchFacetPathNotFoundError build() {
        Objects.requireNonNull(message, SearchFacetPathNotFoundError.class + ": message is missing");
        return new SearchFacetPathNotFoundErrorImpl(message, values);
    }

    /**
     * builds SearchFacetPathNotFoundError without checking for non null required values
     */
    public SearchFacetPathNotFoundError buildUnchecked() {
        return new SearchFacetPathNotFoundErrorImpl(message, values);
    }

    public static SearchFacetPathNotFoundErrorBuilder of() {
        return new SearchFacetPathNotFoundErrorBuilder();
    }

    public static SearchFacetPathNotFoundErrorBuilder of(final SearchFacetPathNotFoundError template) {
        SearchFacetPathNotFoundErrorBuilder builder = new SearchFacetPathNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
