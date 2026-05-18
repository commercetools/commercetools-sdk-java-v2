
package com.commercetools.checkout.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceNotFoundError resourceNotFoundError = ResourceNotFoundError.builder()
 *             .message("{message}")
 *             .resourceIdentifier("{resourceIdentifier}")
 *             .resourceId("{resourceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceNotFoundErrorBuilder implements Builder<ResourceNotFoundError> {

    private String message;

    private String resourceIdentifier;

    private String resourceId;

    /**
     *  <p><code>"The Resource with $resourceIdentifier $resourceId was not found."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ResourceNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The identifier type used (e.g., <code>id</code>, <code>key</code>).</p>
     * @param resourceIdentifier value to be set
     * @return Builder
     */

    public ResourceNotFoundErrorBuilder resourceIdentifier(final String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     *  <p>The actual identifier value.</p>
     * @param resourceId value to be set
     * @return Builder
     */

    public ResourceNotFoundErrorBuilder resourceId(final String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     *  <p><code>"The Resource with $resourceIdentifier $resourceId was not found."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The identifier type used (e.g., <code>id</code>, <code>key</code>).</p>
     * @return resourceIdentifier
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     *  <p>The actual identifier value.</p>
     * @return resourceId
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * builds ResourceNotFoundError with checking for non-null required values
     * @return ResourceNotFoundError
     */
    public ResourceNotFoundError build() {
        Objects.requireNonNull(message, ResourceNotFoundError.class + ": message is missing");
        Objects.requireNonNull(resourceIdentifier, ResourceNotFoundError.class + ": resourceIdentifier is missing");
        Objects.requireNonNull(resourceId, ResourceNotFoundError.class + ": resourceId is missing");
        return new ResourceNotFoundErrorImpl(message, resourceIdentifier, resourceId);
    }

    /**
     * builds ResourceNotFoundError without checking for non-null required values
     * @return ResourceNotFoundError
     */
    public ResourceNotFoundError buildUnchecked() {
        return new ResourceNotFoundErrorImpl(message, resourceIdentifier, resourceId);
    }

    /**
     * factory method for an instance of ResourceNotFoundErrorBuilder
     * @return builder
     */
    public static ResourceNotFoundErrorBuilder of() {
        return new ResourceNotFoundErrorBuilder();
    }

    /**
     * create builder for ResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceNotFoundErrorBuilder of(final ResourceNotFoundError template) {
        ResourceNotFoundErrorBuilder builder = new ResourceNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.resourceIdentifier = template.getResourceIdentifier();
        builder.resourceId = template.getResourceId();
        return builder;
    }

}
