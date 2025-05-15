
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Predicate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRulePredicateSetMessagePayload approvalRulePredicateSetMessagePayload = ApprovalRulePredicateSetMessagePayload.builder()
 *             .predicate("{predicate}")
 *             .oldPredicate("{oldPredicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalRulePredicateSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRulePredicateSetMessagePayloadImpl.class)
public interface ApprovalRulePredicateSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalRulePredicateSetMessagePayload
     */
    String APPROVAL_RULE_PREDICATE_SET = "ApprovalRulePredicateSet";

    /**
     *  <p>Name of the ApprovalRule after the Set Predicate update action.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Name of the ApprovalRule before the Set Predicate update action.</p>
     * @return oldPredicate
     */
    @NotNull
    @JsonProperty("oldPredicate")
    public String getOldPredicate();

    /**
     *  <p>Name of the ApprovalRule after the Set Predicate update action.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     *  <p>Name of the ApprovalRule before the Set Predicate update action.</p>
     * @param oldPredicate value to be set
     */

    public void setOldPredicate(final String oldPredicate);

    /**
     * factory method
     * @return instance of ApprovalRulePredicateSetMessagePayload
     */
    public static ApprovalRulePredicateSetMessagePayload of() {
        return new ApprovalRulePredicateSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRulePredicateSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRulePredicateSetMessagePayload of(final ApprovalRulePredicateSetMessagePayload template) {
        ApprovalRulePredicateSetMessagePayloadImpl instance = new ApprovalRulePredicateSetMessagePayloadImpl();
        instance.setPredicate(template.getPredicate());
        instance.setOldPredicate(template.getOldPredicate());
        return instance;
    }

    public ApprovalRulePredicateSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRulePredicateSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRulePredicateSetMessagePayload deepCopy(
            @Nullable final ApprovalRulePredicateSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalRulePredicateSetMessagePayloadImpl instance = new ApprovalRulePredicateSetMessagePayloadImpl();
        instance.setPredicate(template.getPredicate());
        instance.setOldPredicate(template.getOldPredicate());
        return instance;
    }

    /**
     * builder factory method for ApprovalRulePredicateSetMessagePayload
     * @return builder
     */
    public static ApprovalRulePredicateSetMessagePayloadBuilder builder() {
        return ApprovalRulePredicateSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalRulePredicateSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRulePredicateSetMessagePayloadBuilder builder(
            final ApprovalRulePredicateSetMessagePayload template) {
        return ApprovalRulePredicateSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRulePredicateSetMessagePayload(
            Function<ApprovalRulePredicateSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRulePredicateSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRulePredicateSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRulePredicateSetMessagePayload>";
            }
        };
    }
}
