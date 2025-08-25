
package com.commercetools.api.models.approval_flow;

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
 * ApprovalFlowSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowSetCustomTypeAction approvalFlowSetCustomTypeAction = ApprovalFlowSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowSetCustomTypeActionImpl.class)
public interface ApprovalFlowSetCustomTypeAction extends ApprovalFlowUpdateAction {

    /**
     * discriminator value for ApprovalFlowSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalFlow with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalFlow.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalFlow.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the ApprovalFlow with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the ApprovalFlow.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the ApprovalFlow.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of ApprovalFlowSetCustomTypeAction
     */
    public static ApprovalFlowSetCustomTypeAction of() {
        return new ApprovalFlowSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowSetCustomTypeAction of(final ApprovalFlowSetCustomTypeAction template) {
        ApprovalFlowSetCustomTypeActionImpl instance = new ApprovalFlowSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public ApprovalFlowSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowSetCustomTypeAction deepCopy(@Nullable final ApprovalFlowSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowSetCustomTypeActionImpl instance = new ApprovalFlowSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowSetCustomTypeAction
     * @return builder
     */
    public static ApprovalFlowSetCustomTypeActionBuilder builder() {
        return ApprovalFlowSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for ApprovalFlowSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowSetCustomTypeActionBuilder builder(final ApprovalFlowSetCustomTypeAction template) {
        return ApprovalFlowSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowSetCustomTypeAction(Function<ApprovalFlowSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowSetCustomTypeAction>";
            }
        };
    }
}
