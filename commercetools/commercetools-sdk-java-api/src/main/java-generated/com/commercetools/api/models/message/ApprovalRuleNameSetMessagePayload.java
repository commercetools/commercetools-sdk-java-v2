
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleNameSetMessagePayload approvalRuleNameSetMessagePayload = ApprovalRuleNameSetMessagePayload.builder()
 *             .name("{name}")
 *             .oldName("{oldName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalRuleNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleNameSetMessagePayloadImpl.class)
public interface ApprovalRuleNameSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalRuleNameSetMessagePayload
     */
    String APPROVAL_RULE_NAME_SET = "ApprovalRuleNameSet";

    /**
     *  <p>Name of the ApprovalRule after the Set Name update action.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the ApprovalRule before the Set Name update action.</p>
     * @return oldName
     */
    @NotNull
    @JsonProperty("oldName")
    public String getOldName();

    /**
     *  <p>Name of the ApprovalRule after the Set Name update action.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Name of the ApprovalRule before the Set Name update action.</p>
     * @param oldName value to be set
     */

    public void setOldName(final String oldName);

    /**
     * factory method
     * @return instance of ApprovalRuleNameSetMessagePayload
     */
    public static ApprovalRuleNameSetMessagePayload of() {
        return new ApprovalRuleNameSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleNameSetMessagePayload of(final ApprovalRuleNameSetMessagePayload template) {
        ApprovalRuleNameSetMessagePayloadImpl instance = new ApprovalRuleNameSetMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setOldName(template.getOldName());
        return instance;
    }

    public ApprovalRuleNameSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleNameSetMessagePayload deepCopy(
            @Nullable final ApprovalRuleNameSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleNameSetMessagePayloadImpl instance = new ApprovalRuleNameSetMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setOldName(template.getOldName());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleNameSetMessagePayload
     * @return builder
     */
    public static ApprovalRuleNameSetMessagePayloadBuilder builder() {
        return ApprovalRuleNameSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalRuleNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleNameSetMessagePayloadBuilder builder(final ApprovalRuleNameSetMessagePayload template) {
        return ApprovalRuleNameSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleNameSetMessagePayload(Function<ApprovalRuleNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleNameSetMessagePayload>";
            }
        };
    }
}
