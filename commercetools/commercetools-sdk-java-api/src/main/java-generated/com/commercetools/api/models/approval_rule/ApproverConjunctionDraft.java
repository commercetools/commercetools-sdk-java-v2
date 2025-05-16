
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
 * ApproverConjunctionDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverConjunctionDraft approverConjunctionDraft = ApproverConjunctionDraft.builder()
 *             .plusAnd(andBuilder -> andBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApproverConjunctionDraftImpl.class)
public interface ApproverConjunctionDraft extends io.vrap.rmf.base.client.Draft<ApproverConjunctionDraft> {

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @return and
     */
    @NotNull
    @Valid
    @JsonProperty("and")
    public List<ApproverDisjunctionDraft> getAnd();

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param and values to be set
     */

    @JsonIgnore
    public void setAnd(final ApproverDisjunctionDraft... and);

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param and values to be set
     */

    public void setAnd(final List<ApproverDisjunctionDraft> and);

    /**
     * factory method
     * @return instance of ApproverConjunctionDraft
     */
    public static ApproverConjunctionDraft of() {
        return new ApproverConjunctionDraftImpl();
    }

    /**
     * factory method to create a shallow copy ApproverConjunctionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApproverConjunctionDraft of(final ApproverConjunctionDraft template) {
        ApproverConjunctionDraftImpl instance = new ApproverConjunctionDraftImpl();
        instance.setAnd(template.getAnd());
        return instance;
    }

    public ApproverConjunctionDraft copyDeep();

    /**
     * factory method to create a deep copy of ApproverConjunctionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApproverConjunctionDraft deepCopy(@Nullable final ApproverConjunctionDraft template) {
        if (template == null) {
            return null;
        }
        ApproverConjunctionDraftImpl instance = new ApproverConjunctionDraftImpl();
        instance.setAnd(Optional.ofNullable(template.getAnd())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.ApproverDisjunctionDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApproverConjunctionDraft
     * @return builder
     */
    public static ApproverConjunctionDraftBuilder builder() {
        return ApproverConjunctionDraftBuilder.of();
    }

    /**
     * create builder for ApproverConjunctionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverConjunctionDraftBuilder builder(final ApproverConjunctionDraft template) {
        return ApproverConjunctionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApproverConjunctionDraft(Function<ApproverConjunctionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApproverConjunctionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApproverConjunctionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ApproverConjunctionDraft>";
            }
        };
    }
}
