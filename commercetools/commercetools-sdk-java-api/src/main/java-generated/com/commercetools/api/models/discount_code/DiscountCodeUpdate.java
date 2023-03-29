
package com.commercetools.api.models.discount_code;

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
 * DiscountCodeUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeUpdate discountCodeUpdate = DiscountCodeUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeUpdateImpl.class)
public interface DiscountCodeUpdate extends
        com.commercetools.api.models.ResourceUpdate<DiscountCodeUpdate, DiscountCodeUpdateAction, DiscountCodeUpdateBuilder> {

    /**
     *  <p>Expected version of the DiscountCode on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the DiscountCode.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<DiscountCodeUpdateAction> getActions();

    /**
     *  <p>Expected version of the DiscountCode on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the DiscountCode.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final DiscountCodeUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the DiscountCode.</p>
     * @param actions values to be set
     */

    public void setActions(final List<DiscountCodeUpdateAction> actions);

    /**
     * factory method
     * @return instance of DiscountCodeUpdate
     */
    public static DiscountCodeUpdate of() {
        return new DiscountCodeUpdateImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeUpdate of(final DiscountCodeUpdate template) {
        DiscountCodeUpdateImpl instance = new DiscountCodeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeUpdate deepCopy(@Nullable final DiscountCodeUpdate template) {
        if (template == null) {
            return null;
        }
        DiscountCodeUpdateImpl instance = new DiscountCodeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.discount_code.DiscountCodeUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeUpdate
     * @return builder
     */
    public static DiscountCodeUpdateBuilder builder() {
        return DiscountCodeUpdateBuilder.of();
    }

    /**
     * create builder for DiscountCodeUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeUpdateBuilder builder(final DiscountCodeUpdate template) {
        return DiscountCodeUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeUpdate(Function<DiscountCodeUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeUpdate>";
            }
        };
    }
}
