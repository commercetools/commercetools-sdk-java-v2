
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Shipping;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * AddShippingChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddShippingChange addShippingChange = AddShippingChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddShippingChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddShippingChangeImpl.class)
public interface AddShippingChange extends Change {

    /**
     * discriminator value for AddShippingChange
     */
    String ADD_SHIPPING_CHANGE = "AddShippingChange";

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
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Shipping getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Shipping nextValue);

    /**
     * factory method
     * @return instance of AddShippingChange
     */
    public static AddShippingChange of() {
        return new AddShippingChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddShippingChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddShippingChange of(final AddShippingChange template) {
        AddShippingChangeImpl instance = new AddShippingChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public AddShippingChange copyDeep();

    /**
     * factory method to create a deep copy of AddShippingChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddShippingChange deepCopy(@Nullable final AddShippingChange template) {
        if (template == null) {
            return null;
        }
        AddShippingChangeImpl instance = new AddShippingChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.Shipping.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddShippingChange
     * @return builder
     */
    public static AddShippingChangeBuilder builder() {
        return AddShippingChangeBuilder.of();
    }

    /**
     * create builder for AddShippingChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddShippingChangeBuilder builder(final AddShippingChange template) {
        return AddShippingChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddShippingChange(Function<AddShippingChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddShippingChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddShippingChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddShippingChange>";
            }
        };
    }
}
