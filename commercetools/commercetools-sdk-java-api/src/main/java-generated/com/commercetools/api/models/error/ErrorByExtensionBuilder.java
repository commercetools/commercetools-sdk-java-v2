
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
     * @param id
     * @return Builder
     */

    public ErrorByExtensionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @param key
     * @return Builder
     */

    public ErrorByExtensionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ErrorByExtension build() {
        Objects.requireNonNull(id, ErrorByExtension.class + ": id is missing");
        return new ErrorByExtensionImpl(id, key);
    }

    /**
     * builds ErrorByExtension without checking for non null required values
     */
    public ErrorByExtension buildUnchecked() {
        return new ErrorByExtensionImpl(id, key);
    }

    public static ErrorByExtensionBuilder of() {
        return new ErrorByExtensionBuilder();
    }

    public static ErrorByExtensionBuilder of(final ErrorByExtension template) {
        ErrorByExtensionBuilder builder = new ErrorByExtensionBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
