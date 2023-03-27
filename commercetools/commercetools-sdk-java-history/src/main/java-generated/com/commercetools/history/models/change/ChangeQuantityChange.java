
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.InventoryQuantityValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Update action for <code>changeQuantity</code> on inventories</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeQuantityChange changeQuantityChange = ChangeQuantityChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeQuantityChangeImpl.class)
public interface ChangeQuantityChange extends Change {

    /**
     * discriminator value for ChangeQuantityChange
     */
    String CHANGE_QUANTITY_CHANGE = "ChangeQuantityChange";

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
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public InventoryQuantityValue getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public InventoryQuantityValue getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final InventoryQuantityValue nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final InventoryQuantityValue previousValue);

    /**
     * factory method
     * @return instance of ChangeQuantityChange
     */
    public static ChangeQuantityChange of() {
        return new ChangeQuantityChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeQuantityChange of(final ChangeQuantityChange template) {
        ChangeQuantityChangeImpl instance = new ChangeQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeQuantityChange
     * @return builder
     */
    public static ChangeQuantityChangeBuilder builder() {
        return ChangeQuantityChangeBuilder.of();
    }

    /**
     * create builder for ChangeQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeQuantityChangeBuilder builder(final ChangeQuantityChange template) {
        return ChangeQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeQuantityChange(Function<ChangeQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeQuantityChange>";
            }
        };
    }
}
