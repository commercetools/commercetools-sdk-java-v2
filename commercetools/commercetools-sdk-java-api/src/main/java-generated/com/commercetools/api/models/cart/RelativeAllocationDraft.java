
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Allocates a percentage of the Order total to a Payment Method.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RelativeAllocationDraft relativeAllocationDraft = RelativeAllocationDraft.builder()
 *             .percentage(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Relative")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RelativeAllocationDraftImpl.class)
public interface RelativeAllocationDraft
        extends AllocationDraft, io.vrap.rmf.base.client.Draft<RelativeAllocationDraft> {

    /**
     * discriminator value for RelativeAllocationDraft
     */
    String RELATIVE = "Relative";

    /**
     *  <p>Percentage of the Order total allocated to the Payment Method. For example, <code>100</code> allocates the entire Order total.</p>
     * @return percentage
     */
    @NotNull
    @JsonProperty("percentage")
    public Integer getPercentage();

    /**
     *  <p>Percentage of the Order total allocated to the Payment Method. For example, <code>100</code> allocates the entire Order total.</p>
     * @param percentage value to be set
     */

    public void setPercentage(final Integer percentage);

    /**
     * factory method
     * @return instance of RelativeAllocationDraft
     */
    public static RelativeAllocationDraft of() {
        return new RelativeAllocationDraftImpl();
    }

    /**
     * factory method to create a shallow copy RelativeAllocationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static RelativeAllocationDraft of(final RelativeAllocationDraft template) {
        RelativeAllocationDraftImpl instance = new RelativeAllocationDraftImpl();
        instance.setPercentage(template.getPercentage());
        return instance;
    }

    public RelativeAllocationDraft copyDeep();

    /**
     * factory method to create a deep copy of RelativeAllocationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RelativeAllocationDraft deepCopy(@Nullable final RelativeAllocationDraft template) {
        if (template == null) {
            return null;
        }
        RelativeAllocationDraftImpl instance = new RelativeAllocationDraftImpl();
        instance.setPercentage(template.getPercentage());
        return instance;
    }

    /**
     * builder factory method for RelativeAllocationDraft
     * @return builder
     */
    public static RelativeAllocationDraftBuilder builder() {
        return RelativeAllocationDraftBuilder.of();
    }

    /**
     * create builder for RelativeAllocationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RelativeAllocationDraftBuilder builder(final RelativeAllocationDraft template) {
        return RelativeAllocationDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRelativeAllocationDraft(Function<RelativeAllocationDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RelativeAllocationDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<RelativeAllocationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RelativeAllocationDraft>";
            }
        };
    }
}
