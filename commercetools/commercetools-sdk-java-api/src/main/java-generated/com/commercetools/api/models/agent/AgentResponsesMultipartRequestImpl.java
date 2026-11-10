
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
 *  <p><code>multipart/form-data</code> body for a <span>/responses</span> request when files are attached. The JSON fields go in the <code>payload</code> part; files go in <code>files</code> parts.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesMultipartRequestImpl implements AgentResponsesMultipartRequest, ModelBase {

    private com.commercetools.api.models.agent.AgentResponsesPayload payload;

    private java.util.List<java.io.File> files;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AgentResponsesMultipartRequestImpl(
            @JsonProperty("payload") final com.commercetools.api.models.agent.AgentResponsesPayload payload,
            @JsonProperty("files") final java.util.List<java.io.File> files) {
        this.payload = payload;
        this.files = files;
    }

    /**
     * create empty instance
     */
    public AgentResponsesMultipartRequestImpl() {
    }

    /**
     *  <p>JSON document matching <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesPayload" rel="nofollow">AgentResponsesPayload</a>. Must include <code>outputType</code> and <code>locale</code>. At least one of <code>prompt</code> or <code>files</code> must be provided.</p>
     */

    public com.commercetools.api.models.agent.AgentResponsesPayload getPayload() {
        return this.payload;
    }

    /**
     *  <p>Supporting files. Repeat this part for each file. Maximum of 3 files, 20 MB each. Allowed content types: <code>application/pdf</code>, <code>text/plain</code>, <code>text/csv</code>, <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>, <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>, <code>message/rfc822</code>, <code>text/markdown</code>, <code>text/html</code>.</p>
     */

    public java.util.List<java.io.File> getFiles() {
        return this.files;
    }

    public void setPayload(final com.commercetools.api.models.agent.AgentResponsesPayload payload) {
        this.payload = payload;
    }

    public void setFiles(final java.io.File... files) {
        this.files = new ArrayList<>(Arrays.asList(files));
    }

    public void setFiles(final java.util.List<java.io.File> files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AgentResponsesMultipartRequestImpl that = (AgentResponsesMultipartRequestImpl) o;

        return new EqualsBuilder().append(payload, that.payload)
                .append(files, that.files)
                .append(payload, that.payload)
                .append(files, that.files)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(payload).append(files).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("payload", payload)
                .append("files", files)
                .build();
    }

    @Override
    public AgentResponsesMultipartRequest copyDeep() {
        return AgentResponsesMultipartRequest.deepCopy(this);
    }
}
