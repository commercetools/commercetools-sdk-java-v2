
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
 *  <p>The import of States does not follow any predefined rules and should be only used if no transitions are defined. The <code>quantity</code> in the ItemStates must match the sum of all Line Item states' quantities.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderImportLineItemStateAction stagedOrderImportLineItemStateAction = StagedOrderImportLineItemStateAction.builder()
 *             .plusState(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("importLineItemState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderImportLineItemStateActionImpl.class)
public interface StagedOrderImportLineItemStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderImportLineItemStateAction
     */
    String IMPORT_LINE_ITEM_STATE = "importLineItemState";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>New status of the Line Items.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>New status of the Line Items.</p>
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     *  <p>New status of the Line Items.</p>
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     * factory method
     * @return instance of StagedOrderImportLineItemStateAction
     */
    public static StagedOrderImportLineItemStateAction of() {
        return new StagedOrderImportLineItemStateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderImportLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderImportLineItemStateAction of(final StagedOrderImportLineItemStateAction template) {
        StagedOrderImportLineItemStateActionImpl instance = new StagedOrderImportLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setState(template.getState());
        return instance;
    }

    public StagedOrderImportLineItemStateAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderImportLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderImportLineItemStateAction deepCopy(
            @Nullable final StagedOrderImportLineItemStateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderImportLineItemStateActionImpl instance = new StagedOrderImportLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderImportLineItemStateAction
     * @return builder
     */
    public static StagedOrderImportLineItemStateActionBuilder builder() {
        return StagedOrderImportLineItemStateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderImportLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderImportLineItemStateActionBuilder builder(
            final StagedOrderImportLineItemStateAction template) {
        return StagedOrderImportLineItemStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderImportLineItemStateAction(Function<StagedOrderImportLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderImportLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderImportLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderImportLineItemStateAction>";
            }
        };
    }
}
