
package com.commercetools.api.models.agent;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentResponsesMultipartRequestBuilder
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
public class AgentResponsesMultipartRequestBuilder implements Builder<AgentResponsesMultipartRequest> {

    private com.commercetools.api.models.agent.AgentResponsesPayload payload;

    @Nullable
    private java.util.List<java.io.File> files;

    /**
     *  <p>JSON document matching <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesPayload" rel="nofollow">AgentResponsesPayload</a>. Must include <code>outputType</code> and <code>locale</code>. At least one of <code>prompt</code> or <code>files</code> must be provided.</p>
     * @param builder function to build the payload value
     * @return Builder
     */

    public AgentResponsesMultipartRequestBuilder payload(
            Function<com.commercetools.api.models.agent.AgentResponsesPayloadBuilder, com.commercetools.api.models.agent.AgentResponsesPayloadBuilder> builder) {
        this.payload = builder.apply(com.commercetools.api.models.agent.AgentResponsesPayloadBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON document matching <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesPayload" rel="nofollow">AgentResponsesPayload</a>. Must include <code>outputType</code> and <code>locale</code>. At least one of <code>prompt</code> or <code>files</code> must be provided.</p>
     * @param builder function to build the payload value
     * @return Builder
     */

    public AgentResponsesMultipartRequestBuilder withPayload(
            Function<com.commercetools.api.models.agent.AgentResponsesPayloadBuilder, com.commercetools.api.models.agent.AgentResponsesPayload> builder) {
        this.payload = builder.apply(com.commercetools.api.models.agent.AgentResponsesPayloadBuilder.of());
        return this;
    }

    /**
     *  <p>JSON document matching <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesPayload" rel="nofollow">AgentResponsesPayload</a>. Must include <code>outputType</code> and <code>locale</code>. At least one of <code>prompt</code> or <code>files</code> must be provided.</p>
     * @param payload value to be set
     * @return Builder
     */

    public AgentResponsesMultipartRequestBuilder payload(
            final com.commercetools.api.models.agent.AgentResponsesPayload payload) {
        this.payload = payload;
        return this;
    }

    /**
     *  <p>Supporting files. Repeat this part for each file. Maximum of 3 files, 20 MB each. Allowed content types: <code>application/pdf</code>, <code>text/plain</code>, <code>text/csv</code>, <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>, <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>, <code>message/rfc822</code>, <code>text/markdown</code>, <code>text/html</code>.</p>
     * @param files value to be set
     * @return Builder
     */

    public AgentResponsesMultipartRequestBuilder files(@Nullable final java.io.File... files) {
        this.files = new ArrayList<>(Arrays.asList(files));
        return this;
    }

    /**
     *  <p>Supporting files. Repeat this part for each file. Maximum of 3 files, 20 MB each. Allowed content types: <code>application/pdf</code>, <code>text/plain</code>, <code>text/csv</code>, <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>, <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>, <code>message/rfc822</code>, <code>text/markdown</code>, <code>text/html</code>.</p>
     * @param files value to be set
     * @return Builder
     */

    public AgentResponsesMultipartRequestBuilder files(@Nullable final java.util.List<java.io.File> files) {
        this.files = files;
        return this;
    }

    /**
     *  <p>Supporting files. Repeat this part for each file. Maximum of 3 files, 20 MB each. Allowed content types: <code>application/pdf</code>, <code>text/plain</code>, <code>text/csv</code>, <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>, <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>, <code>message/rfc822</code>, <code>text/markdown</code>, <code>text/html</code>.</p>
     * @param files value to be set
     * @return Builder
     */

    public AgentResponsesMultipartRequestBuilder plusFiles(@Nullable final java.io.File... files) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.addAll(Arrays.asList(files));
        return this;
    }

    /**
     *  <p>JSON document matching <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesPayload" rel="nofollow">AgentResponsesPayload</a>. Must include <code>outputType</code> and <code>locale</code>. At least one of <code>prompt</code> or <code>files</code> must be provided.</p>
     * @return payload
     */

    public com.commercetools.api.models.agent.AgentResponsesPayload getPayload() {
        return this.payload;
    }

    /**
     *  <p>Supporting files. Repeat this part for each file. Maximum of 3 files, 20 MB each. Allowed content types: <code>application/pdf</code>, <code>text/plain</code>, <code>text/csv</code>, <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code>, <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code>, <code>message/rfc822</code>, <code>text/markdown</code>, <code>text/html</code>.</p>
     * @return files
     */

    @Nullable
    public java.util.List<java.io.File> getFiles() {
        return this.files;
    }

    /**
     * builds AgentResponsesMultipartRequest with checking for non-null required values
     * @return AgentResponsesMultipartRequest
     */
    public AgentResponsesMultipartRequest build() {
        Objects.requireNonNull(payload, AgentResponsesMultipartRequest.class + ": payload is missing");
        return new AgentResponsesMultipartRequestImpl(payload, files);
    }

    /**
     * builds AgentResponsesMultipartRequest without checking for non-null required values
     * @return AgentResponsesMultipartRequest
     */
    public AgentResponsesMultipartRequest buildUnchecked() {
        return new AgentResponsesMultipartRequestImpl(payload, files);
    }

    /**
     * factory method for an instance of AgentResponsesMultipartRequestBuilder
     * @return builder
     */
    public static AgentResponsesMultipartRequestBuilder of() {
        return new AgentResponsesMultipartRequestBuilder();
    }

    /**
     * create builder for AgentResponsesMultipartRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentResponsesMultipartRequestBuilder of(final AgentResponsesMultipartRequest template) {
        AgentResponsesMultipartRequestBuilder builder = new AgentResponsesMultipartRequestBuilder();
        builder.payload = template.getPayload();
        builder.files = template.getFiles();
        return builder;
    }

}
