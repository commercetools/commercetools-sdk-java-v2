
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UpdatedFieldsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdatedFields updatedFields = UpdatedFields.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UpdatedFieldsBuilder implements Builder<UpdatedFields> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     * @return Builder
     */

    public UpdatedFieldsBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Some fields are invalid and have been updated.</p>
     * @param message value to be set
     * @return Builder
     */

    public UpdatedFieldsBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public UpdatedFieldsBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains two arrays:</p>
     *  <ul>
     *   <li><code>invalidFields</code> contains a list of invalid fields with the related <code>schema</code>, <code>path</code>, <code>value</code> and <code>message</code> properties.</li>
     *   <li><code>updatedFields</code> contains the updated fields with its related <code>type</code>, <code>path</code> and <code>value</code> properties, where <code>type</code> can be <code>update</code>|<code>insert</code>|<code>delete</code>.</li>
     *  </ul>
     * @param payload value to be set
     * @return Builder
     */

    public UpdatedFieldsBuilder payload(final java.lang.Object payload) {
        this.payload = payload;
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
     *  <p>Some fields are invalid and have been updated.</p>
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
     *  <p>Contains two arrays:</p>
     *  <ul>
     *   <li><code>invalidFields</code> contains a list of invalid fields with the related <code>schema</code>, <code>path</code>, <code>value</code> and <code>message</code> properties.</li>
     *   <li><code>updatedFields</code> contains the updated fields with its related <code>type</code>, <code>path</code> and <code>value</code> properties, where <code>type</code> can be <code>update</code>|<code>insert</code>|<code>delete</code>.</li>
     *  </ul>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds UpdatedFields with checking for non-null required values
     * @return UpdatedFields
     */
    public UpdatedFields build() {
        Objects.requireNonNull(severity, UpdatedFields.class + ": severity is missing");
        Objects.requireNonNull(message, UpdatedFields.class + ": message is missing");
        Objects.requireNonNull(correlationId, UpdatedFields.class + ": correlationId is missing");
        Objects.requireNonNull(payload, UpdatedFields.class + ": payload is missing");
        return new UpdatedFieldsImpl(severity, message, correlationId, payload);
    }

    /**
     * builds UpdatedFields without checking for non-null required values
     * @return UpdatedFields
     */
    public UpdatedFields buildUnchecked() {
        return new UpdatedFieldsImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of UpdatedFieldsBuilder
     * @return builder
     */
    public static UpdatedFieldsBuilder of() {
        return new UpdatedFieldsBuilder();
    }

    /**
     * create builder for UpdatedFields instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdatedFieldsBuilder of(final UpdatedFields template) {
        UpdatedFieldsBuilder builder = new UpdatedFieldsBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
