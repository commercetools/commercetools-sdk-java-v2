
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
 * RemoveShippingChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveShippingChange removeShippingChange = RemoveShippingChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemoveShippingChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveShippingChangeImpl.class)
public interface RemoveShippingChange extends Change {

    /**
     * discriminator value for RemoveShippingChange
     */
    String REMOVE_SHIPPING_CHANGE = "RemoveShippingChange";

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
    @Valid
    @JsonProperty("previousValue")
    public Shipping getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Shipping previousValue);

    /**
     * factory method
     * @return instance of RemoveShippingChange
     */
    public static RemoveShippingChange of() {
        return new RemoveShippingChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveShippingChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveShippingChange of(final RemoveShippingChange template) {
        RemoveShippingChangeImpl instance = new RemoveShippingChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public RemoveShippingChange copyDeep();

    /**
     * factory method to create a deep copy of RemoveShippingChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveShippingChange deepCopy(@Nullable final RemoveShippingChange template) {
        if (template == null) {
            return null;
        }
        RemoveShippingChangeImpl instance = new RemoveShippingChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Shipping.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveShippingChange
     * @return builder
     */
    public static RemoveShippingChangeBuilder builder() {
        return RemoveShippingChangeBuilder.of();
    }

    /**
     * create builder for RemoveShippingChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveShippingChangeBuilder builder(final RemoveShippingChange template) {
        return RemoveShippingChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveShippingChange(Function<RemoveShippingChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveShippingChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveShippingChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveShippingChange>";
            }
        };
    }
}
