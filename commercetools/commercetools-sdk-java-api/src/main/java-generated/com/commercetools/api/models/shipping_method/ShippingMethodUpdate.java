
package com.commercetools.api.models.shipping_method;

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
 * ShippingMethodUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodUpdate shippingMethodUpdate = ShippingMethodUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodUpdateImpl.class)
public interface ShippingMethodUpdate extends
        com.commercetools.api.models.ResourceUpdate<ShippingMethodUpdate, ShippingMethodUpdateAction, ShippingMethodUpdateBuilder> {

    /**
     *  <p>Expected version of the ShippingMethod on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the <span>ShippingMethod</span>.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ShippingMethodUpdateAction> getActions();

    /**
     *  <p>Expected version of the ShippingMethod on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the <span>ShippingMethod</span>.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ShippingMethodUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the <span>ShippingMethod</span>.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ShippingMethodUpdateAction> actions);

    /**
     * factory method
     * @return instance of ShippingMethodUpdate
     */
    public static ShippingMethodUpdate of() {
        return new ShippingMethodUpdateImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodUpdate of(final ShippingMethodUpdate template) {
        ShippingMethodUpdateImpl instance = new ShippingMethodUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public ShippingMethodUpdate copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodUpdate deepCopy(@Nullable final ShippingMethodUpdate template) {
        if (template == null) {
            return null;
        }
        ShippingMethodUpdateImpl instance = new ShippingMethodUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodUpdate
     * @return builder
     */
    public static ShippingMethodUpdateBuilder builder() {
        return ShippingMethodUpdateBuilder.of();
    }

    /**
     * create builder for ShippingMethodUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodUpdateBuilder builder(final ShippingMethodUpdate template) {
        return ShippingMethodUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodUpdate(Function<ShippingMethodUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodUpdate>";
            }
        };
    }
}
