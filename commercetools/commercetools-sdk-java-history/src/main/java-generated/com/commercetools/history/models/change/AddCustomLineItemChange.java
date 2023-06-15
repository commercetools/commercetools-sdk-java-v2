
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.CustomLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Add CustomLineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddCustomLineItemChange addCustomLineItemChange = AddCustomLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddCustomLineItemChangeImpl.class)
public interface AddCustomLineItemChange extends Change {

    /**
     * discriminator value for AddCustomLineItemChange
     */
    String ADD_CUSTOM_LINE_ITEM_CHANGE = "AddCustomLineItemChange";

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
    public CustomLineItem getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomLineItem getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomLineItem previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomLineItem nextValue);

    /**
     * factory method
     * @return instance of AddCustomLineItemChange
     */
    public static AddCustomLineItemChange of() {
        return new AddCustomLineItemChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddCustomLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddCustomLineItemChange of(final AddCustomLineItemChange template) {
        AddCustomLineItemChangeImpl instance = new AddCustomLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddCustomLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddCustomLineItemChange deepCopy(@Nullable final AddCustomLineItemChange template) {
        if (template == null) {
            return null;
        }
        AddCustomLineItemChangeImpl instance = new AddCustomLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomLineItem.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomLineItem.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddCustomLineItemChange
     * @return builder
     */
    public static AddCustomLineItemChangeBuilder builder() {
        return AddCustomLineItemChangeBuilder.of();
    }

    /**
     * create builder for AddCustomLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddCustomLineItemChangeBuilder builder(final AddCustomLineItemChange template) {
        return AddCustomLineItemChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddCustomLineItemChange(Function<AddCustomLineItemChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddCustomLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddCustomLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddCustomLineItemChange>";
            }
        };
    }
}
