
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.approval_rule.RuleRequester;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Requester update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleRequestersSetMessagePayload approvalRuleRequestersSetMessagePayload = ApprovalRuleRequestersSetMessagePayload.builder()
 *             .plusRequesters(requestersBuilder -> requestersBuilder)
 *             .plusOldRequesters(oldRequestersBuilder -> oldRequestersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleRequestersSetMessagePayloadImpl.class)
public interface ApprovalRuleRequestersSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalRuleRequestersSetMessagePayload
     */
    String APPROVAL_RULE_REQUESTERS_SET = "ApprovalRuleRequestersSet";

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @return requesters
     */
    @NotNull
    @Valid
    @JsonProperty("requesters")
    public List<RuleRequester> getRequesters();

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @return oldRequesters
     */
    @NotNull
    @Valid
    @JsonProperty("oldRequesters")
    public List<RuleRequester> getOldRequesters();

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters values to be set
     */

    @JsonIgnore
    public void setRequesters(final RuleRequester... requesters);

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters values to be set
     */

    public void setRequesters(final List<RuleRequester> requesters);

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters values to be set
     */

    @JsonIgnore
    public void setOldRequesters(final RuleRequester... oldRequesters);

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters values to be set
     */

    public void setOldRequesters(final List<RuleRequester> oldRequesters);

    /**
     * factory method
     * @return instance of ApprovalRuleRequestersSetMessagePayload
     */
    public static ApprovalRuleRequestersSetMessagePayload of() {
        return new ApprovalRuleRequestersSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleRequestersSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleRequestersSetMessagePayload of(final ApprovalRuleRequestersSetMessagePayload template) {
        ApprovalRuleRequestersSetMessagePayloadImpl instance = new ApprovalRuleRequestersSetMessagePayloadImpl();
        instance.setRequesters(template.getRequesters());
        instance.setOldRequesters(template.getOldRequesters());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleRequestersSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleRequestersSetMessagePayload deepCopy(
            @Nullable final ApprovalRuleRequestersSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleRequestersSetMessagePayloadImpl instance = new ApprovalRuleRequestersSetMessagePayloadImpl();
        instance.setRequesters(Optional.ofNullable(template.getRequesters())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleRequester::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setOldRequesters(Optional.ofNullable(template.getOldRequesters())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleRequester::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleRequestersSetMessagePayload
     * @return builder
     */
    public static ApprovalRuleRequestersSetMessagePayloadBuilder builder() {
        return ApprovalRuleRequestersSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalRuleRequestersSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleRequestersSetMessagePayloadBuilder builder(
            final ApprovalRuleRequestersSetMessagePayload template) {
        return ApprovalRuleRequestersSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleRequestersSetMessagePayload(
            Function<ApprovalRuleRequestersSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleRequestersSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleRequestersSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleRequestersSetMessagePayload>";
            }
        };
    }
}
