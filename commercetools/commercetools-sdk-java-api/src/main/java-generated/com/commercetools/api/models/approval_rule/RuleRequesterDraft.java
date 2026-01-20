
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
 * RuleRequesterDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RuleRequesterDraft ruleRequesterDraft = RuleRequesterDraft.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RuleRequesterDraftImpl.class)
public interface RuleRequesterDraft extends io.vrap.rmf.base.client.Draft<RuleRequesterDraft> {

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> that an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> must hold for the Approval Rule to apply to the Orders they create.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRoleResourceIdentifier getAssociateRole();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> that an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> must hold for the Approval Rule to apply to the Orders they create.</p>
     * @param associateRole value to be set
     */

    public void setAssociateRole(final AssociateRoleResourceIdentifier associateRole);

    /**
     * factory method
     * @return instance of RuleRequesterDraft
     */
    public static RuleRequesterDraft of() {
        return new RuleRequesterDraftImpl();
    }

    /**
     * factory method to create a shallow copy RuleRequesterDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static RuleRequesterDraft of(final RuleRequesterDraft template) {
        RuleRequesterDraftImpl instance = new RuleRequesterDraftImpl();
        instance.setAssociateRole(template.getAssociateRole());
        return instance;
    }

    public RuleRequesterDraft copyDeep();

    /**
     * factory method to create a deep copy of RuleRequesterDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RuleRequesterDraft deepCopy(@Nullable final RuleRequesterDraft template) {
        if (template == null) {
            return null;
        }
        RuleRequesterDraftImpl instance = new RuleRequesterDraftImpl();
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier
                .deepCopy(template.getAssociateRole()));
        return instance;
    }

    /**
     * builder factory method for RuleRequesterDraft
     * @return builder
     */
    public static RuleRequesterDraftBuilder builder() {
        return RuleRequesterDraftBuilder.of();
    }

    /**
     * create builder for RuleRequesterDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RuleRequesterDraftBuilder builder(final RuleRequesterDraft template) {
        return RuleRequesterDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRuleRequesterDraft(Function<RuleRequesterDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RuleRequesterDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RuleRequesterDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RuleRequesterDraft>";
            }
        };
    }
}
