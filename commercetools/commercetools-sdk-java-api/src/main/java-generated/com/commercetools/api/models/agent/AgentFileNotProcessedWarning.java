
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.warning.WarningObject;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when an uploaded file in an Intake Agent <span>API request</span> could not be parsed.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("FileNotProcessed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentFileNotProcessedWarningImpl.class)
public interface AgentFileNotProcessedWarning extends WarningObject {

    /**
     * discriminator value for AgentFileNotProcessedWarning
     */
    String FILE_NOT_PROCESSED = "FileNotProcessed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of why the file could not be parsed.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Name of the file that failed to parse.</p>
     * @return fileName
     */
    @NotNull
    @JsonProperty("fileName")
    public String getFileName();

    /**
     *  <p>Plain text description of why the file could not be parsed.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Name of the file that failed to parse.</p>
     * @param fileName value to be set
     */

    public void setFileName(final String fileName);

    /**
     * factory method
     * @return instance of AgentFileNotProcessedWarning
     */
    public static AgentFileNotProcessedWarning of() {
        return new AgentFileNotProcessedWarningImpl();
    }

    /**
     * factory method to create a shallow copy AgentFileNotProcessedWarning
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentFileNotProcessedWarning of(final AgentFileNotProcessedWarning template) {
        AgentFileNotProcessedWarningImpl instance = new AgentFileNotProcessedWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setFileName(template.getFileName());
        return instance;
    }

    public AgentFileNotProcessedWarning copyDeep();

    /**
     * factory method to create a deep copy of AgentFileNotProcessedWarning
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentFileNotProcessedWarning deepCopy(@Nullable final AgentFileNotProcessedWarning template) {
        if (template == null) {
            return null;
        }
        AgentFileNotProcessedWarningImpl instance = new AgentFileNotProcessedWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setFileName(template.getFileName());
        return instance;
    }

    /**
     * builder factory method for AgentFileNotProcessedWarning
     * @return builder
     */
    public static AgentFileNotProcessedWarningBuilder builder() {
        return AgentFileNotProcessedWarningBuilder.of();
    }

    /**
     * create builder for AgentFileNotProcessedWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentFileNotProcessedWarningBuilder builder(final AgentFileNotProcessedWarning template) {
        return AgentFileNotProcessedWarningBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentFileNotProcessedWarning(Function<AgentFileNotProcessedWarning, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentFileNotProcessedWarning> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentFileNotProcessedWarning>() {
            @Override
            public String toString() {
                return "TypeReference<AgentFileNotProcessedWarning>";
            }
        };
    }
}
