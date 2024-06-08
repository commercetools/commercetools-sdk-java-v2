
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The import of States does not follow any predefined rules and should be only used if no transitions are defined. The <code>quantity</code> of the ItemStates must match the sum of all Custom Line Item states' quantities.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderImportCustomLineItemStateAction stagedOrderImportCustomLineItemStateAction = StagedOrderImportCustomLineItemStateAction.builder()
 *             .plusState(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderImportCustomLineItemStateActionImpl.class)
public interface StagedOrderImportCustomLineItemStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderImportCustomLineItemStateAction
     */
    String IMPORT_CUSTOM_LINE_ITEM_STATE = "importCustomLineItemState";

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>New status of the Custom Line Items.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>New status of the Custom Line Items.</p>
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     *  <p>New status of the Custom Line Items.</p>
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     * factory method
     * @return instance of StagedOrderImportCustomLineItemStateAction
     */
    public static StagedOrderImportCustomLineItemStateAction of() {
        return new StagedOrderImportCustomLineItemStateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderImportCustomLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderImportCustomLineItemStateAction of(
            final StagedOrderImportCustomLineItemStateAction template) {
        StagedOrderImportCustomLineItemStateActionImpl instance = new StagedOrderImportCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderImportCustomLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderImportCustomLineItemStateAction deepCopy(
            @Nullable final StagedOrderImportCustomLineItemStateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderImportCustomLineItemStateActionImpl instance = new StagedOrderImportCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderImportCustomLineItemStateAction
     * @return builder
     */
    public static StagedOrderImportCustomLineItemStateActionBuilder builder() {
        return StagedOrderImportCustomLineItemStateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderImportCustomLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderImportCustomLineItemStateActionBuilder builder(
            final StagedOrderImportCustomLineItemStateAction template) {
        return StagedOrderImportCustomLineItemStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderImportCustomLineItemStateAction(
            Function<StagedOrderImportCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderImportCustomLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderImportCustomLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderImportCustomLineItemStateAction>";
            }
        };
    }
}
