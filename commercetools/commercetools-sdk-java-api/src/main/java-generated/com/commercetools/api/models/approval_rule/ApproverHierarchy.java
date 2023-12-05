
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Describes the order in which Associates can approve the matched Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverHierarchy approverHierarchy = ApproverHierarchy.builder()
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApproverHierarchyImpl.class)
public interface ApproverHierarchy {

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @return tiers
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<ApproverConjunction> getTiers();

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final ApproverConjunction... tiers);

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<ApproverConjunction> tiers);

    /**
     * factory method
     * @return instance of ApproverHierarchy
     */
    public static ApproverHierarchy of() {
        return new ApproverHierarchyImpl();
    }

    /**
     * factory method to create a shallow copy ApproverHierarchy
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApproverHierarchy of(final ApproverHierarchy template) {
        ApproverHierarchyImpl instance = new ApproverHierarchyImpl();
        instance.setTiers(template.getTiers());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApproverHierarchy
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApproverHierarchy deepCopy(@Nullable final ApproverHierarchy template) {
        if (template == null) {
            return null;
        }
        ApproverHierarchyImpl instance = new ApproverHierarchyImpl();
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.approval_rule.ApproverConjunction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApproverHierarchy
     * @return builder
     */
    public static ApproverHierarchyBuilder builder() {
        return ApproverHierarchyBuilder.of();
    }

    /**
     * create builder for ApproverHierarchy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverHierarchyBuilder builder(final ApproverHierarchy template) {
        return ApproverHierarchyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApproverHierarchy(Function<ApproverHierarchy, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApproverHierarchy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApproverHierarchy>() {
            @Override
            public String toString() {
                return "TypeReference<ApproverHierarchy>";
            }
        };
    }
}
