
package com.commercetools.checkout.models.error;

import java.util.*;

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
 *             .resourceId("{resourceId}")
 *             .expectedVersion(0.3)
 *             .currentVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConcurrentModificationErrorBuilder implements Builder<ConcurrentModificationError> {

    private String message;

    private String resourceId;

    private Long expectedVersion;

    private Long currentVersion;

    /**
     *  <p><code>"Object $resourceId has a different version than expected. Expected: $expectedVersion - Actual: $currentVersion."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The ID of the resource that has a version conflict.</p>
     * @param resourceId value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder resourceId(final String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     *  <p>Expected version of the resource.</p>
     * @param expectedVersion value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder expectedVersion(final Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }

    /**
     *  <p>Current version of the resource.</p>
     * @param currentVersion value to be set
     * @return Builder
     */

    public ConcurrentModificationErrorBuilder currentVersion(final Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     *  <p><code>"Object $resourceId has a different version than expected. Expected: $expectedVersion - Actual: $currentVersion."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The ID of the resource that has a version conflict.</p>
     * @return resourceId
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     *  <p>Expected version of the resource.</p>
     * @return expectedVersion
     */

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     *  <p>Current version of the resource.</p>
     * @return currentVersion
     */

    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * builds ConcurrentModificationError with checking for non-null required values
     * @return ConcurrentModificationError
     */
    public ConcurrentModificationError build() {
        Objects.requireNonNull(message, ConcurrentModificationError.class + ": message is missing");
        Objects.requireNonNull(resourceId, ConcurrentModificationError.class + ": resourceId is missing");
        Objects.requireNonNull(expectedVersion, ConcurrentModificationError.class + ": expectedVersion is missing");
        Objects.requireNonNull(currentVersion, ConcurrentModificationError.class + ": currentVersion is missing");
        return new ConcurrentModificationErrorImpl(message, resourceId, expectedVersion, currentVersion);
    }

    /**
     * builds ConcurrentModificationError without checking for non-null required values
     * @return ConcurrentModificationError
     */
    public ConcurrentModificationError buildUnchecked() {
        return new ConcurrentModificationErrorImpl(message, resourceId, expectedVersion, currentVersion);
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
        builder.resourceId = template.getResourceId();
        builder.expectedVersion = template.getExpectedVersion();
        builder.currentVersion = template.getCurrentVersion();
        return builder;
    }

}
