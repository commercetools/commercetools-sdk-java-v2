
package com.commercetools.api.models.approval_flow;

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
 * ApprovalFlowUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowUpdate approvalFlowUpdate = ApprovalFlowUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowUpdateImpl.class)
public interface ApprovalFlowUpdate {

    /**
     *  <p>Expected version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> to which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a>.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ApprovalFlowUpdateAction> getActions();

    /**
     *  <p>Expected version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> to which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a>.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ApprovalFlowUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a>.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ApprovalFlowUpdateAction> actions);

    /**
     * factory method
     * @return instance of ApprovalFlowUpdate
     */
    public static ApprovalFlowUpdate of() {
        return new ApprovalFlowUpdateImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowUpdate of(final ApprovalFlowUpdate template) {
        ApprovalFlowUpdateImpl instance = new ApprovalFlowUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public ApprovalFlowUpdate copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowUpdate deepCopy(@Nullable final ApprovalFlowUpdate template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowUpdateImpl instance = new ApprovalFlowUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_flow.ApprovalFlowUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowUpdate
     * @return builder
     */
    public static ApprovalFlowUpdateBuilder builder() {
        return ApprovalFlowUpdateBuilder.of();
    }

    /**
     * create builder for ApprovalFlowUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowUpdateBuilder builder(final ApprovalFlowUpdate template) {
        return ApprovalFlowUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowUpdate(Function<ApprovalFlowUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowUpdate>";
            }
        };
    }
}
