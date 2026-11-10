
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
 *     RelativeAllocation relativeAllocation = RelativeAllocation.builder()
 *             .percentage(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Relative")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RelativeAllocationImpl.class)
public interface RelativeAllocation extends Allocation {

    /**
     * discriminator value for RelativeAllocation
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
     * @return instance of RelativeAllocation
     */
    public static RelativeAllocation of() {
        return new RelativeAllocationImpl();
    }

    /**
     * factory method to create a shallow copy RelativeAllocation
     * @param template instance to be copied
     * @return copy instance
     */
    public static RelativeAllocation of(final RelativeAllocation template) {
        RelativeAllocationImpl instance = new RelativeAllocationImpl();
        instance.setPercentage(template.getPercentage());
        return instance;
    }

    public RelativeAllocation copyDeep();

    /**
     * factory method to create a deep copy of RelativeAllocation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RelativeAllocation deepCopy(@Nullable final RelativeAllocation template) {
        if (template == null) {
            return null;
        }
        RelativeAllocationImpl instance = new RelativeAllocationImpl();
        instance.setPercentage(template.getPercentage());
        return instance;
    }

    /**
     * builder factory method for RelativeAllocation
     * @return builder
     */
    public static RelativeAllocationBuilder builder() {
        return RelativeAllocationBuilder.of();
    }

    /**
     * create builder for RelativeAllocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RelativeAllocationBuilder builder(final RelativeAllocation template) {
        return RelativeAllocationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRelativeAllocation(Function<RelativeAllocation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RelativeAllocation> typeReference() {
        return new tools.jackson.core.type.TypeReference<RelativeAllocation>() {
            @Override
            public String toString() {
                return "TypeReference<RelativeAllocation>";
            }
        };
    }
}
