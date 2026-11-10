
package com.commercetools.api.models.agent;

import java.io.File;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p><code>multipart/form-data</code> body for a <span>/responses</span> request when files are attached. The JSON fields go in the <code>payload</code> part; files go in <code>files</code> parts.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentResponsesMultipartRequest agentResponsesMultipartRequest = AgentResponsesMultipartRequest.builder()
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentResponsesMultipartRequestImpl.class)
public interface AgentResponsesMultipartRequest {

    /**
     *  <p>JSON document matching <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesPayload" rel="nofollow">AgentResponsesPayload</a>. Must include <code>outputType</code> and <code>locale</code>. At least one of <code>prompt</code> or <code>files</code> must be provided.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public AgentResponsesPayload getPayload();

    /**
     *  <p>Supporting files. Repeat this part for each file. Maximum of 3 files, 20 MB each. Allowed content types: <code>application/pdf</code>, <code>text/plain</code>, <code>text/csv</code>, <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>, <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>, <code>message/rfc822</code>, <code>text/markdown</code>, <code>text/html</code>.</p>
     * @return files
     */

    @JsonProperty("files")
    public List<File> getFiles();

    /**
     *  <p>JSON document matching <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesPayload" rel="nofollow">AgentResponsesPayload</a>. Must include <code>outputType</code> and <code>locale</code>. At least one of <code>prompt</code> or <code>files</code> must be provided.</p>
     * @param payload value to be set
     */

    public void setPayload(final AgentResponsesPayload payload);

    /**
     *  <p>Supporting files. Repeat this part for each file. Maximum of 3 files, 20 MB each. Allowed content types: <code>application/pdf</code>, <code>text/plain</code>, <code>text/csv</code>, <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>, <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>, <code>message/rfc822</code>, <code>text/markdown</code>, <code>text/html</code>.</p>
     * @param files values to be set
     */

    @JsonIgnore
    public void setFiles(final File... files);

    /**
     *  <p>Supporting files. Repeat this part for each file. Maximum of 3 files, 20 MB each. Allowed content types: <code>application/pdf</code>, <code>text/plain</code>, <code>text/csv</code>, <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>, <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>, <code>message/rfc822</code>, <code>text/markdown</code>, <code>text/html</code>.</p>
     * @param files values to be set
     */

    public void setFiles(final List<File> files);

    /**
     * factory method
     * @return instance of AgentResponsesMultipartRequest
     */
    public static AgentResponsesMultipartRequest of() {
        return new AgentResponsesMultipartRequestImpl();
    }

    /**
     * factory method to create a shallow copy AgentResponsesMultipartRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentResponsesMultipartRequest of(final AgentResponsesMultipartRequest template) {
        AgentResponsesMultipartRequestImpl instance = new AgentResponsesMultipartRequestImpl();
        instance.setPayload(template.getPayload());
        instance.setFiles(template.getFiles());
        return instance;
    }

    public AgentResponsesMultipartRequest copyDeep();

    /**
     * factory method to create a deep copy of AgentResponsesMultipartRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentResponsesMultipartRequest deepCopy(@Nullable final AgentResponsesMultipartRequest template) {
        if (template == null) {
            return null;
        }
        AgentResponsesMultipartRequestImpl instance = new AgentResponsesMultipartRequestImpl();
        instance.setPayload(com.commercetools.api.models.agent.AgentResponsesPayload.deepCopy(template.getPayload()));
        instance.setFiles(Optional.ofNullable(template.getFiles()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for AgentResponsesMultipartRequest
     * @return builder
     */
    public static AgentResponsesMultipartRequestBuilder builder() {
        return AgentResponsesMultipartRequestBuilder.of();
    }

    /**
     * create builder for AgentResponsesMultipartRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesMultipartRequestBuilder builder(final AgentResponsesMultipartRequest template) {
        return AgentResponsesMultipartRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentResponsesMultipartRequest(Function<AgentResponsesMultipartRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentResponsesMultipartRequest> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentResponsesMultipartRequest>() {
            @Override
            public String toString() {
                return "TypeReference<AgentResponsesMultipartRequest>";
            }
        };
    }
}
