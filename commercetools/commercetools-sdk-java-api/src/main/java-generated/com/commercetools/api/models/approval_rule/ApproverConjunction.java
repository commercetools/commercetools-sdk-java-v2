
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
 * ApproverConjunction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverConjunction approverConjunction = ApproverConjunction.builder()
 *             .plusAnd(andBuilder -> andBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApproverConjunctionImpl.class)
public interface ApproverConjunction {

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @return and
     */
    @NotNull
    @Valid
    @JsonProperty("and")
    public List<ApproverDisjunction> getAnd();

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param and values to be set
     */

    @JsonIgnore
    public void setAnd(final ApproverDisjunction... and);

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved.</p>
     * @param and values to be set
     */

    public void setAnd(final List<ApproverDisjunction> and);

    /**
     * factory method
     * @return instance of ApproverConjunction
     */
    public static ApproverConjunction of() {
        return new ApproverConjunctionImpl();
    }

    /**
     * factory method to create a shallow copy ApproverConjunction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApproverConjunction of(final ApproverConjunction template) {
        ApproverConjunctionImpl instance = new ApproverConjunctionImpl();
        instance.setAnd(template.getAnd());
        return instance;
    }

    public ApproverConjunction copyDeep();

    /**
     * factory method to create a deep copy of ApproverConjunction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApproverConjunction deepCopy(@Nullable final ApproverConjunction template) {
        if (template == null) {
            return null;
        }
        ApproverConjunctionImpl instance = new ApproverConjunctionImpl();
        instance.setAnd(Optional.ofNullable(template.getAnd())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.ApproverDisjunction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApproverConjunction
     * @return builder
     */
    public static ApproverConjunctionBuilder builder() {
        return ApproverConjunctionBuilder.of();
    }

    /**
     * create builder for ApproverConjunction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverConjunctionBuilder builder(final ApproverConjunction template) {
        return ApproverConjunctionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApproverConjunction(Function<ApproverConjunction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApproverConjunction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApproverConjunction>() {
            @Override
            public String toString() {
                return "TypeReference<ApproverConjunction>";
            }
        };
    }
}
