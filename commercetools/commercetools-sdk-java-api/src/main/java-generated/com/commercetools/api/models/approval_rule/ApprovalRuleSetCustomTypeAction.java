
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * ApprovalRuleSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetCustomTypeAction approvalRuleSetCustomTypeAction = ApprovalRuleSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleSetCustomTypeActionImpl.class)
public interface ApprovalRuleSetCustomTypeAction extends ApprovalRuleUpdateAction {

    /**
     * discriminator value for ApprovalRuleSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the ApprovalRule with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ApprovalRule.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the ApprovalRule.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the ApprovalRule with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ApprovalRule.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the ApprovalRule.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of ApprovalRuleSetCustomTypeAction
     */
    public static ApprovalRuleSetCustomTypeAction of() {
        return new ApprovalRuleSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleSetCustomTypeAction of(final ApprovalRuleSetCustomTypeAction template) {
        ApprovalRuleSetCustomTypeActionImpl instance = new ApprovalRuleSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleSetCustomTypeAction deepCopy(@Nullable final ApprovalRuleSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleSetCustomTypeActionImpl instance = new ApprovalRuleSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleSetCustomTypeAction
     * @return builder
     */
    public static ApprovalRuleSetCustomTypeActionBuilder builder() {
        return ApprovalRuleSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for ApprovalRuleSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetCustomTypeActionBuilder builder(final ApprovalRuleSetCustomTypeAction template) {
        return ApprovalRuleSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleSetCustomTypeAction(Function<ApprovalRuleSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleSetCustomTypeAction>";
            }
        };
    }
}
