
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
 * RuleRequester
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RuleRequester ruleRequester = RuleRequester.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RuleRequesterImpl.class)
public interface RuleRequester {

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> that an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> must hold for the Approval Rule to apply to the Orders they create.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRoleKeyReference getAssociateRole();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> that an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> must hold for the Approval Rule to apply to the Orders they create.</p>
     * @param associateRole value to be set
     */

    public void setAssociateRole(final AssociateRoleKeyReference associateRole);

    /**
     * factory method
     * @return instance of RuleRequester
     */
    public static RuleRequester of() {
        return new RuleRequesterImpl();
    }

    /**
     * factory method to create a shallow copy RuleRequester
     * @param template instance to be copied
     * @return copy instance
     */
    public static RuleRequester of(final RuleRequester template) {
        RuleRequesterImpl instance = new RuleRequesterImpl();
        instance.setAssociateRole(template.getAssociateRole());
        return instance;
    }

    public RuleRequester copyDeep();

    /**
     * factory method to create a deep copy of RuleRequester
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RuleRequester deepCopy(@Nullable final RuleRequester template) {
        if (template == null) {
            return null;
        }
        RuleRequesterImpl instance = new RuleRequesterImpl();
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRoleKeyReference
                .deepCopy(template.getAssociateRole()));
        return instance;
    }

    /**
     * builder factory method for RuleRequester
     * @return builder
     */
    public static RuleRequesterBuilder builder() {
        return RuleRequesterBuilder.of();
    }

    /**
     * create builder for RuleRequester instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RuleRequesterBuilder builder(final RuleRequester template) {
        return RuleRequesterBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRuleRequester(Function<RuleRequester, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RuleRequester> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RuleRequester>() {
            @Override
            public String toString() {
                return "TypeReference<RuleRequester>";
            }
        };
    }
}
