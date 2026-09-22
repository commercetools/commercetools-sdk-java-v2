
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentFileNotProcessedWarningBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentFileNotProcessedWarning agentFileNotProcessedWarning = AgentFileNotProcessedWarning.builder()
 *             .message("{message}")
 *             .fileName("{fileName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentFileNotProcessedWarningBuilder implements Builder<AgentFileNotProcessedWarning> {

    private String message;

    private String fileName;

    /**
     *  <p>Plain text description of why the file could not be parsed.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentFileNotProcessedWarningBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Name of the file that failed to parse.</p>
     * @param fileName value to be set
     * @return Builder
     */

    public AgentFileNotProcessedWarningBuilder fileName(final String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     *  <p>Plain text description of why the file could not be parsed.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Name of the file that failed to parse.</p>
     * @return fileName
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * builds AgentFileNotProcessedWarning with checking for non-null required values
     * @return AgentFileNotProcessedWarning
     */
    public AgentFileNotProcessedWarning build() {
        Objects.requireNonNull(message, AgentFileNotProcessedWarning.class + ": message is missing");
        Objects.requireNonNull(fileName, AgentFileNotProcessedWarning.class + ": fileName is missing");
        return new AgentFileNotProcessedWarningImpl(message, fileName);
    }

    /**
     * builds AgentFileNotProcessedWarning without checking for non-null required values
     * @return AgentFileNotProcessedWarning
     */
    public AgentFileNotProcessedWarning buildUnchecked() {
        return new AgentFileNotProcessedWarningImpl(message, fileName);
    }

    /**
     * factory method for an instance of AgentFileNotProcessedWarningBuilder
     * @return builder
     */
    public static AgentFileNotProcessedWarningBuilder of() {
        return new AgentFileNotProcessedWarningBuilder();
    }

    /**
     * create builder for AgentFileNotProcessedWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentFileNotProcessedWarningBuilder of(final AgentFileNotProcessedWarning template) {
        AgentFileNotProcessedWarningBuilder builder = new AgentFileNotProcessedWarningBuilder();
        builder.message = template.getMessage();
        builder.fileName = template.getFileName();
        return builder;
    }

}
