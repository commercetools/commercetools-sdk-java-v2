
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * RuleApproverDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RuleApproverDraft ruleApproverDraft = RuleApproverDraft.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RuleApproverDraftImpl.class)
public interface RuleApproverDraft extends io.vrap.rmf.base.client.Draft<RuleApproverDraft> {

    /**
     *  <p>Any Associate with this Role can approve.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRoleResourceIdentifier getAssociateRole();

    /**
     *  <p>Any Associate with this Role can approve.</p>
     * @param associateRole value to be set
     */

    public void setAssociateRole(final AssociateRoleResourceIdentifier associateRole);

    /**
     * factory method
     * @return instance of RuleApproverDraft
     */
    public static RuleApproverDraft of() {
        return new RuleApproverDraftImpl();
    }

    /**
     * factory method to create a shallow copy RuleApproverDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static RuleApproverDraft of(final RuleApproverDraft template) {
        RuleApproverDraftImpl instance = new RuleApproverDraftImpl();
        instance.setAssociateRole(template.getAssociateRole());
        return instance;
    }

    public RuleApproverDraft copyDeep();

    /**
     * factory method to create a deep copy of RuleApproverDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RuleApproverDraft deepCopy(@Nullable final RuleApproverDraft template) {
        if (template == null) {
            return null;
        }
        RuleApproverDraftImpl instance = new RuleApproverDraftImpl();
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier
                .deepCopy(template.getAssociateRole()));
        return instance;
    }

    /**
     * builder factory method for RuleApproverDraft
     * @return builder
     */
    public static RuleApproverDraftBuilder builder() {
        return RuleApproverDraftBuilder.of();
    }

    /**
     * create builder for RuleApproverDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RuleApproverDraftBuilder builder(final RuleApproverDraft template) {
        return RuleApproverDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRuleApproverDraft(Function<RuleApproverDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RuleApproverDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RuleApproverDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RuleApproverDraft>";
            }
        };
    }
}
