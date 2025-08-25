
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Cart Discounts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CategorySetCustomFieldAction" rel="nofollow">Set CustomField</a> on Categories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Channels.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Customers.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroupSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Customer Groups.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Discount Codes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetCustomFieldAction" rel="nofollow">Set CustomField</a> on Inventories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEditSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Order Edits.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Payments.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Product Selections.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Quotes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Quote Requests.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Reviews.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingListSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Shopping Lists.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Staged Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Staged Quotes.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCustomFieldAction" rel="nofollow">Set CustomField</a> on Stores.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomFieldChange setCustomFieldChange = SetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomFieldChangeImpl.class)
public interface SetCustomFieldChange extends Change {

    /**
     * discriminator value for SetCustomFieldChange
     */
    String SET_CUSTOM_FIELD_CHANGE = "SetCustomFieldChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     * factory method
     * @return instance of SetCustomFieldChange
     */
    public static SetCustomFieldChange of() {
        return new SetCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomFieldChange of(final SetCustomFieldChange template) {
        SetCustomFieldChangeImpl instance = new SetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        return instance;
    }

    public SetCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomFieldChange deepCopy(@Nullable final SetCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetCustomFieldChangeImpl instance = new SetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        return instance;
    }

    /**
     * builder factory method for SetCustomFieldChange
     * @return builder
     */
    public static SetCustomFieldChangeBuilder builder() {
        return SetCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomFieldChangeBuilder builder(final SetCustomFieldChange template) {
        return SetCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomFieldChange(Function<SetCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomFieldChange>";
            }
        };
    }
}
