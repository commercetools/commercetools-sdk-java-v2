
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.approval_rule.ApprovalRule;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> is created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleCreatedMessagePayload approvalRuleCreatedMessagePayload = ApprovalRuleCreatedMessagePayload.builder()
 *             .approvalRule(approvalRuleBuilder -> approvalRuleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalRuleCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleCreatedMessagePayloadImpl.class)
public interface ApprovalRuleCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalRuleCreatedMessagePayload
     */
    String APPROVAL_RULE_CREATED = "ApprovalRuleCreated";

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> that was created.</p>
     * @return approvalRule
     */
    @NotNull
    @Valid
    @JsonProperty("approvalRule")
    public ApprovalRule getApprovalRule();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> that was created.</p>
     * @param approvalRule value to be set
     */

    public void setApprovalRule(final ApprovalRule approvalRule);

    /**
     * factory method
     * @return instance of ApprovalRuleCreatedMessagePayload
     */
    public static ApprovalRuleCreatedMessagePayload of() {
        return new ApprovalRuleCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleCreatedMessagePayload of(final ApprovalRuleCreatedMessagePayload template) {
        ApprovalRuleCreatedMessagePayloadImpl instance = new ApprovalRuleCreatedMessagePayloadImpl();
        instance.setApprovalRule(template.getApprovalRule());
        return instance;
    }

    public ApprovalRuleCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleCreatedMessagePayload deepCopy(
            @Nullable final ApprovalRuleCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleCreatedMessagePayloadImpl instance = new ApprovalRuleCreatedMessagePayloadImpl();
        instance.setApprovalRule(
            com.commercetools.api.models.approval_rule.ApprovalRule.deepCopy(template.getApprovalRule()));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleCreatedMessagePayload
     * @return builder
     */
    public static ApprovalRuleCreatedMessagePayloadBuilder builder() {
        return ApprovalRuleCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalRuleCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleCreatedMessagePayloadBuilder builder(final ApprovalRuleCreatedMessagePayload template) {
        return ApprovalRuleCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleCreatedMessagePayload(Function<ApprovalRuleCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleCreatedMessagePayload>";
            }
        };
    }
}
