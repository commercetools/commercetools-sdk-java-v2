
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
 * ApproverDisjunction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverDisjunction approverDisjunction = ApproverDisjunction.builder()
 *             .plusOr(orBuilder -> orBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApproverDisjunctionImpl.class)
public interface ApproverDisjunction {

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @return or
     */
    @NotNull
    @Valid
    @JsonProperty("or")
    public List<RuleApprover> getOr();

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or values to be set
     */

    @JsonIgnore
    public void setOr(final RuleApprover... or);

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or values to be set
     */

    public void setOr(final List<RuleApprover> or);

    /**
     * factory method
     * @return instance of ApproverDisjunction
     */
    public static ApproverDisjunction of() {
        return new ApproverDisjunctionImpl();
    }

    /**
     * factory method to create a shallow copy ApproverDisjunction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApproverDisjunction of(final ApproverDisjunction template) {
        ApproverDisjunctionImpl instance = new ApproverDisjunctionImpl();
        instance.setOr(template.getOr());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApproverDisjunction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApproverDisjunction deepCopy(@Nullable final ApproverDisjunction template) {
        if (template == null) {
            return null;
        }
        ApproverDisjunctionImpl instance = new ApproverDisjunctionImpl();
        instance.setOr(Optional.ofNullable(template.getOr())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.RuleApprover::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApproverDisjunction
     * @return builder
     */
    public static ApproverDisjunctionBuilder builder() {
        return ApproverDisjunctionBuilder.of();
    }

    /**
     * create builder for ApproverDisjunction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverDisjunctionBuilder builder(final ApproverDisjunction template) {
        return ApproverDisjunctionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApproverDisjunction(Function<ApproverDisjunction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApproverDisjunction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApproverDisjunction>() {
            @Override
            public String toString() {
                return "TypeReference<ApproverDisjunction>";
            }
        };
    }
}
