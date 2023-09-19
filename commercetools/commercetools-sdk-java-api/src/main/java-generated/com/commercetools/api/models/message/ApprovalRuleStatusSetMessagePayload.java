
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.approval_rule.ApprovalRuleStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Status update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleStatusSetMessagePayload approvalRuleStatusSetMessagePayload = ApprovalRuleStatusSetMessagePayload.builder()
 *             .status(ApprovalRuleStatus.ACTIVE)
 *             .oldStatus(ApprovalRuleStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleStatusSetMessagePayloadImpl.class)
public interface ApprovalRuleStatusSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalRuleStatusSetMessagePayload
     */
    String APPROVAL_RULE_STATUS_SET = "ApprovalRuleStatusSet";

    /**
     *  <p>Status of the ApprovalRule after the Set Status update action.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ApprovalRuleStatus getStatus();

    /**
     *  <p>Status of the ApprovalRule before the Set Status update action.</p>
     * @return oldStatus
     */
    @NotNull
    @JsonProperty("oldStatus")
    public ApprovalRuleStatus getOldStatus();

    /**
     *  <p>Status of the ApprovalRule after the Set Status update action.</p>
     * @param status value to be set
     */

    public void setStatus(final ApprovalRuleStatus status);

    /**
     *  <p>Status of the ApprovalRule before the Set Status update action.</p>
     * @param oldStatus value to be set
     */

    public void setOldStatus(final ApprovalRuleStatus oldStatus);

    /**
     * factory method
     * @return instance of ApprovalRuleStatusSetMessagePayload
     */
    public static ApprovalRuleStatusSetMessagePayload of() {
        return new ApprovalRuleStatusSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleStatusSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleStatusSetMessagePayload of(final ApprovalRuleStatusSetMessagePayload template) {
        ApprovalRuleStatusSetMessagePayloadImpl instance = new ApprovalRuleStatusSetMessagePayloadImpl();
        instance.setStatus(template.getStatus());
        instance.setOldStatus(template.getOldStatus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleStatusSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleStatusSetMessagePayload deepCopy(
            @Nullable final ApprovalRuleStatusSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleStatusSetMessagePayloadImpl instance = new ApprovalRuleStatusSetMessagePayloadImpl();
        instance.setStatus(template.getStatus());
        instance.setOldStatus(template.getOldStatus());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleStatusSetMessagePayload
     * @return builder
     */
    public static ApprovalRuleStatusSetMessagePayloadBuilder builder() {
        return ApprovalRuleStatusSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalRuleStatusSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleStatusSetMessagePayloadBuilder builder(
            final ApprovalRuleStatusSetMessagePayload template) {
        return ApprovalRuleStatusSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleStatusSetMessagePayload(Function<ApprovalRuleStatusSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleStatusSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleStatusSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleStatusSetMessagePayload>";
            }
        };
    }
}
