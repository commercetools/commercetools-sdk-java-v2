
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Cart Discounts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CategorySetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Categories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Channels.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Customers.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroupSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Customer Groups.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Discount Codes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Inventories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEditSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Order Edits.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Staged Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Payments.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Product Selections.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Quotes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Staged Quotes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Quote Requests.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Reviews.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Shopping Lists.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCustomTypeAction" rel="nofollow">Set Custom Type</a> on Stores.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomTypeChange setCustomTypeChange = SetCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomTypeChangeImpl.class)
public interface SetCustomTypeChange extends Change {

    /**
     * discriminator value for SetCustomTypeChange
     */
    String SET_CUSTOM_TYPE_CHANGE = "SetCustomTypeChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * factory method
     * @return instance of SetCustomTypeChange
     */
    public static SetCustomTypeChange of() {
        return new SetCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomTypeChange of(final SetCustomTypeChange template) {
        SetCustomTypeChangeImpl instance = new SetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomTypeChange deepCopy(@Nullable final SetCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetCustomTypeChangeImpl instance = new SetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetCustomTypeChange
     * @return builder
     */
    public static SetCustomTypeChangeBuilder builder() {
        return SetCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomTypeChangeBuilder builder(final SetCustomTypeChange template) {
        return SetCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomTypeChange(Function<SetCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomTypeChange>";
            }
        };
    }
}
