
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
 *  <p>Describes the sequence in which Associates can approve an Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverHierarchyDraft approverHierarchyDraft = ApproverHierarchyDraft.builder()
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApproverHierarchyDraftImpl.class)
public interface ApproverHierarchyDraft extends io.vrap.rmf.base.client.Draft<ApproverHierarchyDraft> {

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @return tiers
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<ApproverConjunctionDraft> getTiers();

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final ApproverConjunctionDraft... tiers);

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<ApproverConjunctionDraft> tiers);

    /**
     * factory method
     * @return instance of ApproverHierarchyDraft
     */
    public static ApproverHierarchyDraft of() {
        return new ApproverHierarchyDraftImpl();
    }

    /**
     * factory method to create a shallow copy ApproverHierarchyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApproverHierarchyDraft of(final ApproverHierarchyDraft template) {
        ApproverHierarchyDraftImpl instance = new ApproverHierarchyDraftImpl();
        instance.setTiers(template.getTiers());
        return instance;
    }

    public ApproverHierarchyDraft copyDeep();

    /**
     * factory method to create a deep copy of ApproverHierarchyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApproverHierarchyDraft deepCopy(@Nullable final ApproverHierarchyDraft template) {
        if (template == null) {
            return null;
        }
        ApproverHierarchyDraftImpl instance = new ApproverHierarchyDraftImpl();
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.ApproverConjunctionDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApproverHierarchyDraft
     * @return builder
     */
    public static ApproverHierarchyDraftBuilder builder() {
        return ApproverHierarchyDraftBuilder.of();
    }

    /**
     * create builder for ApproverHierarchyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverHierarchyDraftBuilder builder(final ApproverHierarchyDraft template) {
        return ApproverHierarchyDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApproverHierarchyDraft(Function<ApproverHierarchyDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApproverHierarchyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApproverHierarchyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ApproverHierarchyDraft>";
            }
        };
    }
}
