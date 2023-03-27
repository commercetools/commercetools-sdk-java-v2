
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddOrderLineItemChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddOrderLineItemChange addOrderLineItemChange = AddOrderLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddOrderLineItemChangeImpl.class)
public interface AddOrderLineItemChange extends Change {

    /**
     * discriminator value for AddOrderLineItemChange
     */
    String ADD_ORDER_LINE_ITEM_CHANGE = "AddOrderLineItemChange";

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
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LineItem getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LineItem getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LineItem previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final LineItem nextValue);

    /**
     * factory method
     * @return instance of AddOrderLineItemChange
     */
    public static AddOrderLineItemChange of() {
        return new AddOrderLineItemChangeImpl();
    }

    /**
     * factory method to copy an instance of AddOrderLineItemChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddOrderLineItemChange of(final AddOrderLineItemChange template) {
        AddOrderLineItemChangeImpl instance = new AddOrderLineItemChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for AddOrderLineItemChange
     * @return builder
     */
    public static AddOrderLineItemChangeBuilder builder() {
        return AddOrderLineItemChangeBuilder.of();
    }

    /**
     * create builder for AddOrderLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddOrderLineItemChangeBuilder builder(final AddOrderLineItemChange template) {
        return AddOrderLineItemChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddOrderLineItemChange(Function<AddOrderLineItemChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddOrderLineItemChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddOrderLineItemChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddOrderLineItemChange>";
            }
        };
    }
}
