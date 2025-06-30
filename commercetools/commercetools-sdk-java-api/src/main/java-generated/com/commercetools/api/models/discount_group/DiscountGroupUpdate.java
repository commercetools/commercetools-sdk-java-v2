
package com.commercetools.api.models.discount_group;

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
 * DiscountGroupUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupUpdate discountGroupUpdate = DiscountGroupUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupUpdateImpl.class)
public interface DiscountGroupUpdate {

    /**
     *  <p>Expected version of the DiscountGroup on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<DiscountGroupUpdateAction> getActions();

    /**
     *  <p>Expected version of the DiscountGroup on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final DiscountGroupUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     * @param actions values to be set
     */

    public void setActions(final List<DiscountGroupUpdateAction> actions);

    /**
     * factory method
     * @return instance of DiscountGroupUpdate
     */
    public static DiscountGroupUpdate of() {
        return new DiscountGroupUpdateImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupUpdate of(final DiscountGroupUpdate template) {
        DiscountGroupUpdateImpl instance = new DiscountGroupUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public DiscountGroupUpdate copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupUpdate deepCopy(@Nullable final DiscountGroupUpdate template) {
        if (template == null) {
            return null;
        }
        DiscountGroupUpdateImpl instance = new DiscountGroupUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.discount_group.DiscountGroupUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DiscountGroupUpdate
     * @return builder
     */
    public static DiscountGroupUpdateBuilder builder() {
        return DiscountGroupUpdateBuilder.of();
    }

    /**
     * create builder for DiscountGroupUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupUpdateBuilder builder(final DiscountGroupUpdate template) {
        return DiscountGroupUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupUpdate(Function<DiscountGroupUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupUpdate>";
            }
        };
    }
}
