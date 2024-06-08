
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Setting the Order Predicate for an Approval Rule generates an ApprovalRulePredicateSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetPredicateAction approvalRuleSetPredicateAction = ApprovalRuleSetPredicateAction.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleSetPredicateActionImpl.class)
public interface ApprovalRuleSetPredicateAction extends ApprovalRuleUpdateAction {

    /**
     * discriminator value for ApprovalRuleSetPredicateAction
     */
    String SET_PREDICATE = "setPredicate";

    /**
     *  <p>A valid Order Predicate to set for the Approval Rule.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>A valid Order Predicate to set for the Approval Rule.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of ApprovalRuleSetPredicateAction
     */
    public static ApprovalRuleSetPredicateAction of() {
        return new ApprovalRuleSetPredicateActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleSetPredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleSetPredicateAction of(final ApprovalRuleSetPredicateAction template) {
        ApprovalRuleSetPredicateActionImpl instance = new ApprovalRuleSetPredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleSetPredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleSetPredicateAction deepCopy(@Nullable final ApprovalRuleSetPredicateAction template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleSetPredicateActionImpl instance = new ApprovalRuleSetPredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleSetPredicateAction
     * @return builder
     */
    public static ApprovalRuleSetPredicateActionBuilder builder() {
        return ApprovalRuleSetPredicateActionBuilder.of();
    }

    /**
     * create builder for ApprovalRuleSetPredicateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetPredicateActionBuilder builder(final ApprovalRuleSetPredicateAction template) {
        return ApprovalRuleSetPredicateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleSetPredicateAction(Function<ApprovalRuleSetPredicateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetPredicateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetPredicateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleSetPredicateAction>";
            }
        };
    }
}
