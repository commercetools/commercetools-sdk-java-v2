
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
 *  <p>Draft type that stores the share of the Order total that a <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentAllocationDraft" rel="nofollow">PaymentAllocationDraft</a> covers.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AllocationDraft allocationDraft = AllocationDraft.absoluteBuilder()
 *             amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = AllocationDraftImpl.class, visible = true)
@JsonDeserialize(as = AllocationDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AllocationDraft {

    /**
     *  <p>Type of the Allocation.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public AllocationDraft copyDeep();

    /**
     * factory method to create a deep copy of AllocationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AllocationDraft deepCopy(@Nullable final AllocationDraft template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof AllocationDraftImpl)) {
            return template.copyDeep();
        }
        AllocationDraftImpl instance = new AllocationDraftImpl();
        return instance;
    }

    /**
     * builder for absolute subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.AbsoluteAllocationDraftBuilder absoluteBuilder() {
        return com.commercetools.api.models.cart.AbsoluteAllocationDraftBuilder.of();
    }

    /**
     * builder for relative subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart.RelativeAllocationDraftBuilder relativeBuilder() {
        return com.commercetools.api.models.cart.RelativeAllocationDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAllocationDraft(Function<AllocationDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AllocationDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<AllocationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AllocationDraft>";
            }
        };
    }
}
