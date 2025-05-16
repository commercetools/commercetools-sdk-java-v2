
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets the requesters for an Approval Rule generates an ApprovalRuleRequestersSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetRequestersAction approvalRuleSetRequestersAction = ApprovalRuleSetRequestersAction.builder()
 *             .plusRequesters(requestersBuilder -> requestersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setRequesters")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleSetRequestersActionImpl.class)
public interface ApprovalRuleSetRequestersAction extends ApprovalRuleUpdateAction {

    /**
     * discriminator value for ApprovalRuleSetRequestersAction
     */
    String SET_REQUESTERS = "setRequesters";

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @return requesters
     */
    @NotNull
    @Valid
    @JsonProperty("requesters")
    public List<RuleRequesterDraft> getRequesters();

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @param requesters values to be set
     */

    @JsonIgnore
    public void setRequesters(final RuleRequesterDraft... requesters);

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     * @param requesters values to be set
     */

    public void setRequesters(final List<RuleRequesterDraft> requesters);

    /**
     * factory method
     * @return instance of ApprovalRuleSetRequestersAction
     */
    public static ApprovalRuleSetRequestersAction of() {
        return new ApprovalRuleSetRequestersActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleSetRequestersAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleSetRequestersAction of(final ApprovalRuleSetRequestersAction template) {
        ApprovalRuleSetRequestersActionImpl instance = new ApprovalRuleSetRequestersActionImpl();
        instance.setRequesters(template.getRequesters());
        return instance;
    }

    public ApprovalRuleSetRequestersAction copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleSetRequestersAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleSetRequestersAction deepCopy(@Nullable final ApprovalRuleSetRequestersAction template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleSetRequestersActionImpl instance = new ApprovalRuleSetRequestersActionImpl();
        instance.setRequesters(Optional.ofNullable(template.getRequesters())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleRequesterDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleSetRequestersAction
     * @return builder
     */
    public static ApprovalRuleSetRequestersActionBuilder builder() {
        return ApprovalRuleSetRequestersActionBuilder.of();
    }

    /**
     * create builder for ApprovalRuleSetRequestersAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetRequestersActionBuilder builder(final ApprovalRuleSetRequestersAction template) {
        return ApprovalRuleSetRequestersActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleSetRequestersAction(Function<ApprovalRuleSetRequestersAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetRequestersAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetRequestersAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleSetRequestersAction>";
            }
        };
    }
}
