
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.BusinessUnitApprovalRuleMode;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeApprovalRuleModeAction" rel="nofollow">Change Approval Rule Mode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeApprovalRuleModeChange changeApprovalRuleModeChange = ChangeApprovalRuleModeChange.builder()
 *             .change("{change}")
 *             .previousValue(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .nextValue(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeApprovalRuleModeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeApprovalRuleModeChangeImpl.class)
public interface ChangeApprovalRuleModeChange extends Change {

    /**
     * discriminator value for ChangeApprovalRuleModeChange
     */
    String CHANGE_APPROVAL_RULE_MODE_CHANGE = "ChangeApprovalRuleModeChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public BusinessUnitApprovalRuleMode getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public BusinessUnitApprovalRuleMode getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final BusinessUnitApprovalRuleMode previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final BusinessUnitApprovalRuleMode nextValue);

    /**
     * factory method
     * @return instance of ChangeApprovalRuleModeChange
     */
    public static ChangeApprovalRuleModeChange of() {
        return new ChangeApprovalRuleModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeApprovalRuleModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeApprovalRuleModeChange of(final ChangeApprovalRuleModeChange template) {
        ChangeApprovalRuleModeChangeImpl instance = new ChangeApprovalRuleModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeApprovalRuleModeChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeApprovalRuleModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeApprovalRuleModeChange deepCopy(@Nullable final ChangeApprovalRuleModeChange template) {
        if (template == null) {
            return null;
        }
        ChangeApprovalRuleModeChangeImpl instance = new ChangeApprovalRuleModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeApprovalRuleModeChange
     * @return builder
     */
    public static ChangeApprovalRuleModeChangeBuilder builder() {
        return ChangeApprovalRuleModeChangeBuilder.of();
    }

    /**
     * create builder for ChangeApprovalRuleModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeApprovalRuleModeChangeBuilder builder(final ChangeApprovalRuleModeChange template) {
        return ChangeApprovalRuleModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeApprovalRuleModeChange(Function<ChangeApprovalRuleModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeApprovalRuleModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeApprovalRuleModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeApprovalRuleModeChange>";
            }
        };
    }
}
