
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ConcurrentModificationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConcurrentModificationError concurrentModificationError = ConcurrentModificationError.builder()
 *             .message("{message}")
 *             .currentVersion(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConcurrentModificationErrorBuilder implements Builder<ConcurrentModificationError> {

    private String message;

    @Nullable
    private Long specifiedVersion;

    private Long currentVersion;

    @Nullable
    private java.lang.Object conflictedResource;

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @param message value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The version specified in the failed request.</p>
     * @param specifiedVersion value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder specifiedVersion(@Nullable final Long specifiedVersion) {
        this.specifiedVersion = specifiedVersion;
        return this;
    }

    /**
     *  <p>The current version of the resource.</p>
     * @param currentVersion value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder currentVersion(final Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     *  <p>The resource in conflict.</p>
     * @param conflictedResource value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder conflictedResource(@Nullable final java.lang.Object conflictedResource) {
        this.conflictedResource = conflictedResource;
        return this;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The version specified in the failed request.</p>
     * @return specifiedVersion
     */

    @Nullable
    public Long getSpecifiedVersion() {
        return this.specifiedVersion;
    }

    /**
     *  <p>The current version of the resource.</p>
     * @return currentVersion
     */

    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     *  <p>The resource in conflict.</p>
     * @return conflictedResource
     */

    @Nullable
    public java.lang.Object getConflictedResource() {
        return this.conflictedResource;
    }

    /**
     * builds ConcurrentModificationError with checking for non-null required values
     * @return ConcurrentModificationError
     */
    public ConcurrentModificationError build() {
        Objects.requireNonNull(message, ConcurrentModificationError.class + ": message is missing");
        Objects.requireNonNull(currentVersion, ConcurrentModificationError.class + ": currentVersion is missing");
        return new ConcurrentModificationErrorImpl(message, specifiedVersion, currentVersion, conflictedResource);
    }

    /**
     * builds ConcurrentModificationError without checking for non-null required values
     * @return ConcurrentModificationError
     */
    public ConcurrentModificationError buildUnchecked() {
        return new ConcurrentModificationErrorImpl(message, specifiedVersion, currentVersion, conflictedResource);
    }

    /**
     * factory method for an instance of ConcurrentModificationErrorBuilder
     * @return builder
     */
    public static ConcurrentModificationErrorBuilder of() {
        return new ConcurrentModificationErrorBuilder();
    }

    /**
     * create builder for ConcurrentModificationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConcurrentModificationErrorBuilder of(final ConcurrentModificationError template) {
        ConcurrentModificationErrorBuilder builder = new ConcurrentModificationErrorBuilder();
        builder.message = template.getMessage();
        builder.specifiedVersion = template.getSpecifiedVersion();
        builder.currentVersion = template.getCurrentVersion();
        builder.conflictedResource = template.getConflictedResource();
        return builder;
    }

}
