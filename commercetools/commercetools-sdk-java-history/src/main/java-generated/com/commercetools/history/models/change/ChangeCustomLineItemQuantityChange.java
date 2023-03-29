
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeCustomLineItemQuantityChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCustomLineItemQuantityChange changeCustomLineItemQuantityChange = ChangeCustomLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(1)
 *             .previousValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>changeCustomLineItemQuantity</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public LocalizedString getCustomLineItem();

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    /**
     *  <p>Update action for <code>changeCustomLineItemQuantity</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set customLineItem
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final LocalizedString customLineItem);

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

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
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

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
        instance.setCustomLineItem(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getCustomLineItem()));
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
