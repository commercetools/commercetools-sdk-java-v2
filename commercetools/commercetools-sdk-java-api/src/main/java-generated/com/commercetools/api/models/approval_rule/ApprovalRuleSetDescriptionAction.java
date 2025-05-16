
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the description for an Approval Rule generates an ApprovalRuleDescriptionSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetDescriptionAction approvalRuleSetDescriptionAction = ApprovalRuleSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleSetDescriptionActionImpl.class)
public interface ApprovalRuleSetDescriptionAction extends ApprovalRuleUpdateAction {

    /**
     * discriminator value for ApprovalRuleSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>New description to set for the Approval Rule.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>New description to set for the Approval Rule.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     * factory method
     * @return instance of ApprovalRuleSetDescriptionAction
     */
    public static ApprovalRuleSetDescriptionAction of() {
        return new ApprovalRuleSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleSetDescriptionAction of(final ApprovalRuleSetDescriptionAction template) {
        ApprovalRuleSetDescriptionActionImpl instance = new ApprovalRuleSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public ApprovalRuleSetDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleSetDescriptionAction deepCopy(@Nullable final ApprovalRuleSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleSetDescriptionActionImpl instance = new ApprovalRuleSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleSetDescriptionAction
     * @return builder
     */
    public static ApprovalRuleSetDescriptionActionBuilder builder() {
        return ApprovalRuleSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for ApprovalRuleSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetDescriptionActionBuilder builder(final ApprovalRuleSetDescriptionAction template) {
        return ApprovalRuleSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleSetDescriptionAction(Function<ApprovalRuleSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleSetDescriptionAction>";
            }
        };
    }
}
