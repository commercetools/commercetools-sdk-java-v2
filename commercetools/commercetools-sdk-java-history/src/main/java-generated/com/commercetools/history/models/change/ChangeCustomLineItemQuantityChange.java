
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderChangeCustomLineItemQuantityAction" rel="nofollow">Change CustomLineItem Quantity</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCustomLineItemQuantityChange changeCustomLineItemQuantityChange = ChangeCustomLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeCustomLineItemQuantityChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeCustomLineItemQuantityChangeImpl.class)
public interface ChangeCustomLineItemQuantityChange extends Change {

    /**
     * discriminator value for ChangeCustomLineItemQuantityChange
     */
    String CHANGE_CUSTOM_LINE_ITEM_QUANTITY_CHANGE = "ChangeCustomLineItemQuantityChange";

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
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     *  <p>Name of the CustomLineItem.</p>
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     *  <p>Name of the CustomLineItem.</p>
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final LocalizedString customLineItem);

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     * factory method
     * @return instance of ChangeCustomLineItemQuantityChange
     */
    public static ChangeCustomLineItemQuantityChange of() {
        return new ChangeCustomLineItemQuantityChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeCustomLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeCustomLineItemQuantityChange of(final ChangeCustomLineItemQuantityChange template) {
        ChangeCustomLineItemQuantityChangeImpl instance = new ChangeCustomLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    public ChangeCustomLineItemQuantityChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeCustomLineItemQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeCustomLineItemQuantityChange deepCopy(
            @Nullable final ChangeCustomLineItemQuantityChange template) {
        if (template == null) {
            return null;
        }
        ChangeCustomLineItemQuantityChangeImpl instance = new ChangeCustomLineItemQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        return instance;
    }

    /**
     * builder factory method for ChangeCustomLineItemQuantityChange
     * @return builder
     */
    public static ChangeCustomLineItemQuantityChangeBuilder builder() {
        return ChangeCustomLineItemQuantityChangeBuilder.of();
    }

    /**
     * create builder for ChangeCustomLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeCustomLineItemQuantityChangeBuilder builder(final ChangeCustomLineItemQuantityChange template) {
        return ChangeCustomLineItemQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeCustomLineItemQuantityChange(Function<ChangeCustomLineItemQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeCustomLineItemQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeCustomLineItemQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeCustomLineItemQuantityChange>";
            }
        };
    }
}
