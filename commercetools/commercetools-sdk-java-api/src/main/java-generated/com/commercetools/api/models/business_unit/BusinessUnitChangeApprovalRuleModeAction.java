
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updates <span>Approval Rules</span> inheritance behavior between Business Units.</p>
 *  <p>Only Business Units of type <code>Division</code> can be changed to <code>ExplicitAndFromParent</code>.</p>
 *  <p>This update action generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitApprovalRuleModeChangedMessage" rel="nofollow">BusinessUnitApprovalRuleModeChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeApprovalRuleModeAction businessUnitChangeApprovalRuleModeAction = BusinessUnitChangeApprovalRuleModeAction.builder()
 *             .approvalRuleMode(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeApprovalRuleMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitChangeApprovalRuleModeActionImpl.class)
public interface BusinessUnitChangeApprovalRuleModeAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitChangeApprovalRuleModeAction
     */
    String CHANGE_APPROVAL_RULE_MODE = "changeApprovalRuleMode";

    /**
     *  <p>The new value for <code>approvalRuleMode</code>.</p>
     * @return approvalRuleMode
     */
    @NotNull
    @JsonProperty("approvalRuleMode")
    public BusinessUnitApprovalRuleMode getApprovalRuleMode();

    /**
     *  <p>The new value for <code>approvalRuleMode</code>.</p>
     * @param approvalRuleMode value to be set
     */

    public void setApprovalRuleMode(final BusinessUnitApprovalRuleMode approvalRuleMode);

    /**
     * factory method
     * @return instance of BusinessUnitChangeApprovalRuleModeAction
     */
    public static BusinessUnitChangeApprovalRuleModeAction of() {
        return new BusinessUnitChangeApprovalRuleModeActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitChangeApprovalRuleModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitChangeApprovalRuleModeAction of(final BusinessUnitChangeApprovalRuleModeAction template) {
        BusinessUnitChangeApprovalRuleModeActionImpl instance = new BusinessUnitChangeApprovalRuleModeActionImpl();
        instance.setApprovalRuleMode(template.getApprovalRuleMode());
        return instance;
    }

    public BusinessUnitChangeApprovalRuleModeAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitChangeApprovalRuleModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitChangeApprovalRuleModeAction deepCopy(
            @Nullable final BusinessUnitChangeApprovalRuleModeAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitChangeApprovalRuleModeActionImpl instance = new BusinessUnitChangeApprovalRuleModeActionImpl();
        instance.setApprovalRuleMode(template.getApprovalRuleMode());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitChangeApprovalRuleModeAction
     * @return builder
     */
    public static BusinessUnitChangeApprovalRuleModeActionBuilder builder() {
        return BusinessUnitChangeApprovalRuleModeActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitChangeApprovalRuleModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeApprovalRuleModeActionBuilder builder(
            final BusinessUnitChangeApprovalRuleModeAction template) {
        return BusinessUnitChangeApprovalRuleModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitChangeApprovalRuleModeAction(
            Function<BusinessUnitChangeApprovalRuleModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeApprovalRuleModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeApprovalRuleModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeApprovalRuleModeAction>";
            }
        };
    }
}
