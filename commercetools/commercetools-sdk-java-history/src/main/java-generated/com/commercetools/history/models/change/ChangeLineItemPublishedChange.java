
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ShoppingListLineItemValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishAction" rel="nofollow">Publish</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductUnpublishAction" rel="nofollow">Unpublish</a> update action is performed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLineItemPublishedChange changeLineItemPublishedChange = ChangeLineItemPublishedChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeLineItemPublishedChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLineItemPublishedChangeImpl.class)
public interface ChangeLineItemPublishedChange extends Change {

    /**
     * discriminator value for ChangeLineItemPublishedChange
     */
    String CHANGE_LINE_ITEM_PUBLISHED_CHANGE = "ChangeLineItemPublishedChange";

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
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public ShoppingListLineItemValue getLineItem();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Boolean getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final ShoppingListLineItemValue lineItem);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Boolean previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Boolean nextValue);

    /**
     * factory method
     * @return instance of ChangeLineItemPublishedChange
     */
    public static ChangeLineItemPublishedChange of() {
        return new ChangeLineItemPublishedChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLineItemPublishedChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLineItemPublishedChange of(final ChangeLineItemPublishedChange template) {
        ChangeLineItemPublishedChangeImpl instance = new ChangeLineItemPublishedChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeLineItemPublishedChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeLineItemPublishedChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLineItemPublishedChange deepCopy(@Nullable final ChangeLineItemPublishedChange template) {
        if (template == null) {
            return null;
        }
        ChangeLineItemPublishedChangeImpl instance = new ChangeLineItemPublishedChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(
            com.commercetools.history.models.change_value.ShoppingListLineItemValue.deepCopy(template.getLineItem()));
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeLineItemPublishedChange
     * @return builder
     */
    public static ChangeLineItemPublishedChangeBuilder builder() {
        return ChangeLineItemPublishedChangeBuilder.of();
    }

    /**
     * create builder for ChangeLineItemPublishedChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLineItemPublishedChangeBuilder builder(final ChangeLineItemPublishedChange template) {
        return ChangeLineItemPublishedChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLineItemPublishedChange(Function<ChangeLineItemPublishedChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemPublishedChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLineItemPublishedChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLineItemPublishedChange>";
            }
        };
    }
}
