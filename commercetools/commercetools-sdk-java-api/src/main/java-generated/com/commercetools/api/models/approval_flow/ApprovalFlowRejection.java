
package com.commercetools.api.models.approval_flow;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ApprovalFlowRejection
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowRejection approvalFlowRejection = ApprovalFlowRejection.builder()
 *             .rejecter(rejecterBuilder -> rejecterBuilder)
 *             .rejectedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowRejectionImpl.class)
public interface ApprovalFlowRejection {

    /**
     *  <p>Associate who rejected the Approval Flow.</p>
     * @return rejecter
     */
    @NotNull
    @Valid
    @JsonProperty("rejecter")
    public Associate getRejecter();

    /**
     *  <p>Date and time (UTC) the Approval Flow was rejected.</p>
     * @return rejectedAt
     */
    @NotNull
    @JsonProperty("rejectedAt")
    public ZonedDateTime getRejectedAt();

    /**
     *  <p>The reason for the rejection of the Approval Flow.</p>
     * @return reason
     */

    @JsonProperty("reason")
    public String getReason();

    /**
     *  <p>Associate who rejected the Approval Flow.</p>
     * @param rejecter value to be set
     */

    public void setRejecter(final Associate rejecter);

    /**
     *  <p>Date and time (UTC) the Approval Flow was rejected.</p>
     * @param rejectedAt value to be set
     */

    public void setRejectedAt(final ZonedDateTime rejectedAt);

    /**
     *  <p>The reason for the rejection of the Approval Flow.</p>
     * @param reason value to be set
     */

    public void setReason(final String reason);

    /**
     * factory method
     * @return instance of ApprovalFlowRejection
     */
    public static ApprovalFlowRejection of() {
        return new ApprovalFlowRejectionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowRejection
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowRejection of(final ApprovalFlowRejection template) {
        ApprovalFlowRejectionImpl instance = new ApprovalFlowRejectionImpl();
        instance.setRejecter(template.getRejecter());
        instance.setRejectedAt(template.getRejectedAt());
        instance.setReason(template.getReason());
        return instance;
    }

    public ApprovalFlowRejection copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowRejection
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowRejection deepCopy(@Nullable final ApprovalFlowRejection template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowRejectionImpl instance = new ApprovalFlowRejectionImpl();
        instance.setRejecter(com.commercetools.api.models.business_unit.Associate.deepCopy(template.getRejecter()));
        instance.setRejectedAt(template.getRejectedAt());
        instance.setReason(template.getReason());
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowRejection
     * @return builder
     */
    public static ApprovalFlowRejectionBuilder builder() {
        return ApprovalFlowRejectionBuilder.of();
    }

    /**
     * create builder for ApprovalFlowRejection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowRejectionBuilder builder(final ApprovalFlowRejection template) {
        return ApprovalFlowRejectionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowRejection(Function<ApprovalFlowRejection, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowRejection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowRejection>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowRejection>";
            }
        };
    }
}
