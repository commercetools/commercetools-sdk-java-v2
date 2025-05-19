
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>If the <code>editVersion</code> and/or <code>resourceVersion</code> do not match the actual version, a ConcurrentModification error will be returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditApply orderEditApply = OrderEditApply.builder()
 *             .editVersion(0.3)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditApplyImpl.class)
public interface OrderEditApply {

    /**
     *  <p>Current <code>version</code> of the OrderEdit to be applied.</p>
     * @return editVersion
     */
    @NotNull
    @JsonProperty("editVersion")
    public Long getEditVersion();

    /**
     *  <p>Current <code>version</code> of the Order to which the OrderEdit is applied.</p>
     * @return resourceVersion
     */
    @NotNull
    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    /**
     *  <p>Current <code>version</code> of the OrderEdit to be applied.</p>
     * @param editVersion value to be set
     */

    public void setEditVersion(final Long editVersion);

    /**
     *  <p>Current <code>version</code> of the Order to which the OrderEdit is applied.</p>
     * @param resourceVersion value to be set
     */

    public void setResourceVersion(final Long resourceVersion);

    /**
     * factory method
     * @return instance of OrderEditApply
     */
    public static OrderEditApply of() {
        return new OrderEditApplyImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditApply
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditApply of(final OrderEditApply template) {
        OrderEditApplyImpl instance = new OrderEditApplyImpl();
        instance.setEditVersion(template.getEditVersion());
        instance.setResourceVersion(template.getResourceVersion());
        return instance;
    }

    public OrderEditApply copyDeep();

    /**
     * factory method to create a deep copy of OrderEditApply
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditApply deepCopy(@Nullable final OrderEditApply template) {
        if (template == null) {
            return null;
        }
        OrderEditApplyImpl instance = new OrderEditApplyImpl();
        instance.setEditVersion(template.getEditVersion());
        instance.setResourceVersion(template.getResourceVersion());
        return instance;
    }

    /**
     * builder factory method for OrderEditApply
     * @return builder
     */
    public static OrderEditApplyBuilder builder() {
        return OrderEditApplyBuilder.of();
    }

    /**
     * create builder for OrderEditApply instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditApplyBuilder builder(final OrderEditApply template) {
        return OrderEditApplyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditApply(Function<OrderEditApply, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditApply> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditApply>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditApply>";
            }
        };
    }
}
