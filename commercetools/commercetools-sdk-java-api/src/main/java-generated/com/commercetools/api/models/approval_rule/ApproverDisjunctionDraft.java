
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
 * ApproverDisjunctionDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverDisjunctionDraft approverDisjunctionDraft = ApproverDisjunctionDraft.builder()
 *             .plusOr(orBuilder -> orBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApproverDisjunctionDraftImpl.class)
public interface ApproverDisjunctionDraft extends io.vrap.rmf.base.client.Draft<ApproverDisjunctionDraft> {

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @return or
     */
    @NotNull
    @Valid
    @JsonProperty("or")
    public List<RuleApproverDraft> getOr();

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or values to be set
     */

    @JsonIgnore
    public void setOr(final RuleApproverDraft... or);

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or values to be set
     */

    public void setOr(final List<RuleApproverDraft> or);

    /**
     * factory method
     * @return instance of ApproverDisjunctionDraft
     */
    public static ApproverDisjunctionDraft of() {
        return new ApproverDisjunctionDraftImpl();
    }

    /**
     * factory method to create a shallow copy ApproverDisjunctionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApproverDisjunctionDraft of(final ApproverDisjunctionDraft template) {
        ApproverDisjunctionDraftImpl instance = new ApproverDisjunctionDraftImpl();
        instance.setOr(template.getOr());
        return instance;
    }

    public ApproverDisjunctionDraft copyDeep();

    /**
     * factory method to create a deep copy of ApproverDisjunctionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApproverDisjunctionDraft deepCopy(@Nullable final ApproverDisjunctionDraft template) {
        if (template == null) {
            return null;
        }
        ApproverDisjunctionDraftImpl instance = new ApproverDisjunctionDraftImpl();
        instance.setOr(Optional.ofNullable(template.getOr())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleApproverDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApproverDisjunctionDraft
     * @return builder
     */
    public static ApproverDisjunctionDraftBuilder builder() {
        return ApproverDisjunctionDraftBuilder.of();
    }

    /**
     * create builder for ApproverDisjunctionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverDisjunctionDraftBuilder builder(final ApproverDisjunctionDraft template) {
        return ApproverDisjunctionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApproverDisjunctionDraft(Function<ApproverDisjunctionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApproverDisjunctionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApproverDisjunctionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ApproverDisjunctionDraft>";
            }
        };
    }
}
