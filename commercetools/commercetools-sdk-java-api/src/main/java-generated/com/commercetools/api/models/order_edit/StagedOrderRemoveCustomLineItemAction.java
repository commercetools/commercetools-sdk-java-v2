
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveCustomLineItemAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveCustomLineItemAction stagedOrderRemoveCustomLineItemAction = StagedOrderRemoveCustomLineItemAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderRemoveCustomLineItemActionImpl.class)
public interface StagedOrderRemoveCustomLineItemAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderRemoveCustomLineItemAction
     */
    String REMOVE_CUSTOM_LINE_ITEM = "removeCustomLineItem";

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     * factory method
     * @return instance of StagedOrderRemoveCustomLineItemAction
     */
    public static StagedOrderRemoveCustomLineItemAction of() {
        return new StagedOrderRemoveCustomLineItemActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderRemoveCustomLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderRemoveCustomLineItemAction of(final StagedOrderRemoveCustomLineItemAction template) {
        StagedOrderRemoveCustomLineItemActionImpl instance = new StagedOrderRemoveCustomLineItemActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    /**
     * builder factory method for StagedOrderRemoveCustomLineItemAction
     * @return builder
     */
    public static StagedOrderRemoveCustomLineItemActionBuilder builder() {
        return StagedOrderRemoveCustomLineItemActionBuilder.of();
    }

    /**
     * create builder for StagedOrderRemoveCustomLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveCustomLineItemActionBuilder builder(
            final StagedOrderRemoveCustomLineItemAction template) {
        return StagedOrderRemoveCustomLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderRemoveCustomLineItemAction(Function<StagedOrderRemoveCustomLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveCustomLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveCustomLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveCustomLineItemAction>";
            }
        };
    }
}
