
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleRequestersSetMessagePayloadBuilder
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
public class ApprovalRuleRequestersSetMessagePayloadBuilder
        implements Builder<ApprovalRuleRequestersSetMessagePayload> {

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> oldRequesters;

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder requesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... requesters) {
        this.requesters = new ArrayList<>(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder requesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters) {
        this.requesters = requesters;
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param requesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder plusRequesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... requesters) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters.addAll(Arrays.asList(requesters));
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder plusRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        if (this.requesters == null) {
            this.requesters = new ArrayList<>();
        }
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder withRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        this.requesters = new ArrayList<>();
        this.requesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder addRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return plusRequesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the requesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder setRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return requesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder oldRequesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... oldRequesters) {
        this.oldRequesters = new ArrayList<>(Arrays.asList(oldRequesters));
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder oldRequesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> oldRequesters) {
        this.oldRequesters = oldRequesters;
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param oldRequesters value to be set
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder plusOldRequesters(
            final com.commercetools.api.models.approval_rule.RuleRequester... oldRequesters) {
        if (this.oldRequesters == null) {
            this.oldRequesters = new ArrayList<>();
        }
        this.oldRequesters.addAll(Arrays.asList(oldRequesters));
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the oldRequesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder plusOldRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        if (this.oldRequesters == null) {
            this.oldRequesters = new ArrayList<>();
        }
        this.oldRequesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the oldRequesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder withOldRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequesterBuilder> builder) {
        this.oldRequesters = new ArrayList<>();
        this.oldRequesters
                .add(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()).build());
        return this;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the oldRequesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder addOldRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return plusOldRequesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @param builder function to build the oldRequesters value
     * @return Builder
     */

    public ApprovalRuleRequestersSetMessagePayloadBuilder setOldRequesters(
            Function<com.commercetools.api.models.approval_rule.RuleRequesterBuilder, com.commercetools.api.models.approval_rule.RuleRequester> builder) {
        return oldRequesters(builder.apply(com.commercetools.api.models.approval_rule.RuleRequesterBuilder.of()));
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @return requesters
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> getRequesters() {
        return this.requesters;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     * @return oldRequesters
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> getOldRequesters() {
        return this.oldRequesters;
    }

    /**
     * builds ApprovalRuleRequestersSetMessagePayload with checking for non-null required values
     * @return ApprovalRuleRequestersSetMessagePayload
     */
    public ApprovalRuleRequestersSetMessagePayload build() {
        Objects.requireNonNull(requesters, ApprovalRuleRequestersSetMessagePayload.class + ": requesters is missing");
        Objects.requireNonNull(oldRequesters,
            ApprovalRuleRequestersSetMessagePayload.class + ": oldRequesters is missing");
        return new ApprovalRuleRequestersSetMessagePayloadImpl(requesters, oldRequesters);
    }

    /**
     * builds ApprovalRuleRequestersSetMessagePayload without checking for non-null required values
     * @return ApprovalRuleRequestersSetMessagePayload
     */
    public ApprovalRuleRequestersSetMessagePayload buildUnchecked() {
        return new ApprovalRuleRequestersSetMessagePayloadImpl(requesters, oldRequesters);
    }

    /**
     * factory method for an instance of ApprovalRuleRequestersSetMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalRuleRequestersSetMessagePayloadBuilder of() {
        return new ApprovalRuleRequestersSetMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalRuleRequestersSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleRequestersSetMessagePayloadBuilder of(
            final ApprovalRuleRequestersSetMessagePayload template) {
        ApprovalRuleRequestersSetMessagePayloadBuilder builder = new ApprovalRuleRequestersSetMessagePayloadBuilder();
        builder.requesters = template.getRequesters();
        builder.oldRequesters = template.getOldRequesters();
        return builder;
    }

}
