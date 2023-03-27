
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorByExtensionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorByExtension errorByExtension = ErrorByExtension.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ErrorByExtensionBuilder implements Builder<ErrorByExtension> {

    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @param id value to be set
     * @return Builder
     */

    public ErrorByExtensionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @param key value to be set
     * @return Builder
     */

    public ErrorByExtensionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ErrorByExtension with checking for non-null required values
     * @return ErrorByExtension
     */
    public ErrorByExtension build() {
        Objects.requireNonNull(id, ErrorByExtension.class + ": id is missing");
        return new ErrorByExtensionImpl(id, key);
    }

    /**
     * builds ErrorByExtension without checking for non-null required values
     * @return ErrorByExtension
     */
    public ErrorByExtension buildUnchecked() {
        return new ErrorByExtensionImpl(id, key);
    }

    /**
     * factory method for an instance of ErrorByExtensionBuilder
     * @return builder
     */
    public static ErrorByExtensionBuilder of() {
        return new ErrorByExtensionBuilder();
    }

    /**
     * create builder for ErrorByExtension instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ErrorByExtensionBuilder of(final ErrorByExtension template) {
        ErrorByExtensionBuilder builder = new ErrorByExtensionBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
