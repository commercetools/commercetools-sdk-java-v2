
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomFields;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemCustomTypeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemCustomTypeChange setCustomLineItemCustomTypeChange = SetCustomLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomLineItemCustomTypeChangeImpl.class)
public interface SetCustomLineItemCustomTypeChange extends Change {

    /**
     * discriminator value for SetCustomLineItemCustomTypeChange
     */
    String SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE_CHANGE = "SetCustomLineItemCustomTypeChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setCustomLineItemCustomType</code></p>
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
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Update action for <code>setCustomLineItemCustomType</code></p>
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

    public void setNextValue(final CustomFields nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     * factory method
     * @return instance of SetCustomLineItemCustomTypeChange
     */
    public static SetCustomLineItemCustomTypeChange of() {
        return new SetCustomLineItemCustomTypeChangeImpl();
    }

    /**
     * factory method to copy an instance of SetCustomLineItemCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomLineItemCustomTypeChange of(final SetCustomLineItemCustomTypeChange template) {
        SetCustomLineItemCustomTypeChangeImpl instance = new SetCustomLineItemCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setCustomLineItem(template.getCustomLineItem());
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetCustomLineItemCustomTypeChange
     * @return builder
     */
    public static SetCustomLineItemCustomTypeChangeBuilder builder() {
        return SetCustomLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetCustomLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemCustomTypeChangeBuilder builder(final SetCustomLineItemCustomTypeChange template) {
        return SetCustomLineItemCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomLineItemCustomTypeChange(Function<SetCustomLineItemCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomLineItemCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomLineItemCustomTypeChange>";
            }
        };
    }
}
