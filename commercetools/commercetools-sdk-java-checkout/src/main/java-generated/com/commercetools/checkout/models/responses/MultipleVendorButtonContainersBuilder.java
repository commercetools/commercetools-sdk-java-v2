
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MultipleVendorButtonContainersBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MultipleVendorButtonContainers multipleVendorButtonContainers = MultipleVendorButtonContainers.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MultipleVendorButtonContainersBuilder implements Builder<MultipleVendorButtonContainers> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     * @return Builder
     */

    public MultipleVendorButtonContainersBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Multiple vendor button containers detected, this may cause issues.</p>
     * @param message value to be set
     * @return Builder
     */

    public MultipleVendorButtonContainersBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public MultipleVendorButtonContainersBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>`warn`</p>
     * @return severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     *  <p>Multiple vendor button containers detected, this may cause issues.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */

    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * builds MultipleVendorButtonContainers with checking for non-null required values
     * @return MultipleVendorButtonContainers
     */
    public MultipleVendorButtonContainers build() {
        Objects.requireNonNull(severity, MultipleVendorButtonContainers.class + ": severity is missing");
        Objects.requireNonNull(message, MultipleVendorButtonContainers.class + ": message is missing");
        Objects.requireNonNull(correlationId, MultipleVendorButtonContainers.class + ": correlationId is missing");
        return new MultipleVendorButtonContainersImpl(severity, message, correlationId);
    }

    /**
     * builds MultipleVendorButtonContainers without checking for non-null required values
     * @return MultipleVendorButtonContainers
     */
    public MultipleVendorButtonContainers buildUnchecked() {
        return new MultipleVendorButtonContainersImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of MultipleVendorButtonContainersBuilder
     * @return builder
     */
    public static MultipleVendorButtonContainersBuilder of() {
        return new MultipleVendorButtonContainersBuilder();
    }

    /**
     * create builder for MultipleVendorButtonContainers instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MultipleVendorButtonContainersBuilder of(final MultipleVendorButtonContainers template) {
        MultipleVendorButtonContainersBuilder builder = new MultipleVendorButtonContainersBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
