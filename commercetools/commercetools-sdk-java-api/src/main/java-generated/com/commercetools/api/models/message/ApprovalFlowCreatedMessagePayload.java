
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.approval_flow.ApprovalFlow;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> is created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowCreatedMessagePayload approvalFlowCreatedMessagePayload = ApprovalFlowCreatedMessagePayload.builder()
 *             .approvalFlow(approvalFlowBuilder -> approvalFlowBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalFlowCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowCreatedMessagePayloadImpl.class)
public interface ApprovalFlowCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalFlowCreatedMessagePayload
     */
    String APPROVAL_FLOW_CREATED = "ApprovalFlowCreated";

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> that was created.</p>
     * @return approvalFlow
     */
    @NotNull
    @Valid
    @JsonProperty("approvalFlow")
    public ApprovalFlow getApprovalFlow();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> that was created.</p>
     * @param approvalFlow value to be set
     */

    public void setApprovalFlow(final ApprovalFlow approvalFlow);

    /**
     * factory method
     * @return instance of ApprovalFlowCreatedMessagePayload
     */
    public static ApprovalFlowCreatedMessagePayload of() {
        return new ApprovalFlowCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowCreatedMessagePayload of(final ApprovalFlowCreatedMessagePayload template) {
        ApprovalFlowCreatedMessagePayloadImpl instance = new ApprovalFlowCreatedMessagePayloadImpl();
        instance.setApprovalFlow(template.getApprovalFlow());
        return instance;
    }

    public ApprovalFlowCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowCreatedMessagePayload deepCopy(
            @Nullable final ApprovalFlowCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowCreatedMessagePayloadImpl instance = new ApprovalFlowCreatedMessagePayloadImpl();
        instance.setApprovalFlow(
            com.commercetools.api.models.approval_flow.ApprovalFlow.deepCopy(template.getApprovalFlow()));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowCreatedMessagePayload
     * @return builder
     */
    public static ApprovalFlowCreatedMessagePayloadBuilder builder() {
        return ApprovalFlowCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalFlowCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowCreatedMessagePayloadBuilder builder(final ApprovalFlowCreatedMessagePayload template) {
        return ApprovalFlowCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowCreatedMessagePayload(Function<ApprovalFlowCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowCreatedMessagePayload>";
            }
        };
    }
}
