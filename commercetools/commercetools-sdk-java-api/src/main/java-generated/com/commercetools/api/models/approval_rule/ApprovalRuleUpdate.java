
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ApprovalRuleUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleUpdate approvalRuleUpdate = ApprovalRuleUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleUpdateImpl.class)
public interface ApprovalRuleUpdate {

    /**
     *  <p>Expected version of the ApprovalRule to which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the ApprovalRule.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ApprovalRuleUpdateAction> getActions();

    /**
     *  <p>Expected version of the ApprovalRule to which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the ApprovalRule.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ApprovalRuleUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the ApprovalRule.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ApprovalRuleUpdateAction> actions);

    /**
     * factory method
     * @return instance of ApprovalRuleUpdate
     */
    public static ApprovalRuleUpdate of() {
        return new ApprovalRuleUpdateImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleUpdate of(final ApprovalRuleUpdate template) {
        ApprovalRuleUpdateImpl instance = new ApprovalRuleUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public ApprovalRuleUpdate copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleUpdate deepCopy(@Nullable final ApprovalRuleUpdate template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleUpdateImpl instance = new ApprovalRuleUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.ApprovalRuleUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleUpdate
     * @return builder
     */
    public static ApprovalRuleUpdateBuilder builder() {
        return ApprovalRuleUpdateBuilder.of();
    }

    /**
     * create builder for ApprovalRuleUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleUpdateBuilder builder(final ApprovalRuleUpdate template) {
        return ApprovalRuleUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleUpdate(Function<ApprovalRuleUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleUpdate>";
            }
        };
    }
}
