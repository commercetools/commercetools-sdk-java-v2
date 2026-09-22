
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when an uploaded file in an Intake Agent <span>API request</span> could not be parsed.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentFileNotProcessedWarningImpl implements AgentFileNotProcessedWarning, ModelBase {

    private String code;

    private String message;

    private String fileName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AgentFileNotProcessedWarningImpl(@JsonProperty("message") final String message,
            @JsonProperty("fileName") final String fileName) {
        this.message = message;
        this.fileName = fileName;
        this.code = FILE_NOT_PROCESSED;
    }

    /**
     * create empty instance
     */
    public AgentFileNotProcessedWarningImpl() {
        this.code = FILE_NOT_PROCESSED;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Plain text description of why the file could not be parsed.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Name of the file that failed to parse.</p>
     */

    public String getFileName() {
        return this.fileName;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AgentFileNotProcessedWarningImpl that = (AgentFileNotProcessedWarningImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(fileName, that.fileName)
                .append(code, that.code)
                .append(message, that.message)
                .append(fileName, that.fileName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(fileName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("fileName", fileName)
                .build();
    }

    @Override
    public AgentFileNotProcessedWarning copyDeep() {
        return AgentFileNotProcessedWarning.deepCopy(this);
    }
}
