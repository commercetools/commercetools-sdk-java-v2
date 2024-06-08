
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.ReturnInfoDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Produces the Return Info Set Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnInfoAction stagedOrderSetReturnInfoAction = StagedOrderSetReturnInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetReturnInfoActionImpl.class)
public interface StagedOrderSetReturnInfoAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetReturnInfoAction
     */
    String SET_RETURN_INFO = "setReturnInfo";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<ReturnInfoDraft> getItems();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final ReturnInfoDraft... items);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param items values to be set
     */

    public void setItems(final List<ReturnInfoDraft> items);

    /**
     * factory method
     * @return instance of StagedOrderSetReturnInfoAction
     */
    public static StagedOrderSetReturnInfoAction of() {
        return new StagedOrderSetReturnInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetReturnInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetReturnInfoAction of(final StagedOrderSetReturnInfoAction template) {
        StagedOrderSetReturnInfoActionImpl instance = new StagedOrderSetReturnInfoActionImpl();
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetReturnInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetReturnInfoAction deepCopy(@Nullable final StagedOrderSetReturnInfoAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetReturnInfoActionImpl instance = new StagedOrderSetReturnInfoActionImpl();
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ReturnInfoDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetReturnInfoAction
     * @return builder
     */
    public static StagedOrderSetReturnInfoActionBuilder builder() {
        return StagedOrderSetReturnInfoActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetReturnInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnInfoActionBuilder builder(final StagedOrderSetReturnInfoAction template) {
        return StagedOrderSetReturnInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetReturnInfoAction(Function<StagedOrderSetReturnInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetReturnInfoAction>";
            }
        };
    }
}
