
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.associate_role.AssociateRoleKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * RuleApprover
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RuleApprover ruleApprover = RuleApprover.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RuleApproverImpl.class)
public interface RuleApprover {

    /**
     *  <p>The Associate Role that is allowed to approve at a given stage in the approval process.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRoleKeyReference getAssociateRole();

    /**
     *  <p>The Associate Role that is allowed to approve at a given stage in the approval process.</p>
     * @param associateRole value to be set
     */

    public void setAssociateRole(final AssociateRoleKeyReference associateRole);

    /**
     * factory method
     * @return instance of RuleApprover
     */
    public static RuleApprover of() {
        return new RuleApproverImpl();
    }

    /**
     * factory method to create a shallow copy RuleApprover
     * @param template instance to be copied
     * @return copy instance
     */
    public static RuleApprover of(final RuleApprover template) {
        RuleApproverImpl instance = new RuleApproverImpl();
        instance.setAssociateRole(template.getAssociateRole());
        return instance;
    }

    /**
     * factory method to create a deep copy of RuleApprover
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RuleApprover deepCopy(@Nullable final RuleApprover template) {
        if (template == null) {
            return null;
        }
        RuleApproverImpl instance = new RuleApproverImpl();
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRoleKeyReference
                .deepCopy(template.getAssociateRole()));
        return instance;
    }

    /**
     * builder factory method for RuleApprover
     * @return builder
     */
    public static RuleApproverBuilder builder() {
        return RuleApproverBuilder.of();
    }

    /**
     * create builder for RuleApprover instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RuleApproverBuilder builder(final RuleApprover template) {
        return RuleApproverBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRuleApprover(Function<RuleApprover, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RuleApprover> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RuleApprover>() {
            @Override
            public String toString() {
                return "TypeReference<RuleApprover>";
            }
        };
    }
}
