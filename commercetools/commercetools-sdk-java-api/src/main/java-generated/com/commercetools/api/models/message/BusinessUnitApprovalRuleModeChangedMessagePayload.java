
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Approval Rule Mode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitApprovalRuleModeChangedMessagePayload businessUnitApprovalRuleModeChangedMessagePayload = BusinessUnitApprovalRuleModeChangedMessagePayload.builder()
 *             .approvalRuleMode(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitApprovalRuleModeChangedMessagePayloadImpl.class)
public interface BusinessUnitApprovalRuleModeChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitApprovalRuleModeChangedMessagePayload
     */
    String BUSINESS_UNIT_APPROVAL_RULE_MODE_CHANGED = "BusinessUnitApprovalRuleModeChanged";

    /**
     *  <p>BusinessUnitApprovalRuleMode of the Business Unit after the Change Approval Rule Mode update action.</p>
     * @return approvalRuleMode
     */
    @NotNull
    @JsonProperty("approvalRuleMode")
    public BusinessUnitApprovalRuleMode getApprovalRuleMode();

    /**
     *  <p>BusinessUnitApprovalRuleMode of the Business Unit before the Change Approval Rule Mode update action.</p>
     * @return oldApprovalRuleMode
     */

    @JsonProperty("oldApprovalRuleMode")
    public BusinessUnitApprovalRuleMode getOldApprovalRuleMode();

    /**
     *  <p>BusinessUnitApprovalRuleMode of the Business Unit after the Change Approval Rule Mode update action.</p>
     * @param approvalRuleMode value to be set
     */

    public void setApprovalRuleMode(final BusinessUnitApprovalRuleMode approvalRuleMode);

    /**
     *  <p>BusinessUnitApprovalRuleMode of the Business Unit before the Change Approval Rule Mode update action.</p>
     * @param oldApprovalRuleMode value to be set
     */

    public void setOldApprovalRuleMode(final BusinessUnitApprovalRuleMode oldApprovalRuleMode);

    /**
     * factory method
     * @return instance of BusinessUnitApprovalRuleModeChangedMessagePayload
     */
    public static BusinessUnitApprovalRuleModeChangedMessagePayload of() {
        return new BusinessUnitApprovalRuleModeChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitApprovalRuleModeChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitApprovalRuleModeChangedMessagePayload of(
            final BusinessUnitApprovalRuleModeChangedMessagePayload template) {
        BusinessUnitApprovalRuleModeChangedMessagePayloadImpl instance = new BusinessUnitApprovalRuleModeChangedMessagePayloadImpl();
        instance.setApprovalRuleMode(template.getApprovalRuleMode());
        instance.setOldApprovalRuleMode(template.getOldApprovalRuleMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitApprovalRuleModeChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitApprovalRuleModeChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitApprovalRuleModeChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitApprovalRuleModeChangedMessagePayloadImpl instance = new BusinessUnitApprovalRuleModeChangedMessagePayloadImpl();
        instance.setApprovalRuleMode(template.getApprovalRuleMode());
        instance.setOldApprovalRuleMode(template.getOldApprovalRuleMode());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitApprovalRuleModeChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder builder() {
        return BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitApprovalRuleModeChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder builder(
            final BusinessUnitApprovalRuleModeChangedMessagePayload template) {
        return BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitApprovalRuleModeChangedMessagePayload(
            Function<BusinessUnitApprovalRuleModeChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitApprovalRuleModeChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitApprovalRuleModeChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitApprovalRuleModeChangedMessagePayload>";
            }
        };
    }
}
