
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetShippingCustomTypeAction" rel="nofollow">Set Shipping Custom Type</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingCustomTypeChange setShippingCustomTypeChange = SetShippingCustomTypeChange.builder()
 *             .change("{change}")
 *             .shippingKey("{shippingKey}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetShippingCustomTypeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingCustomTypeChangeImpl.class)
public interface SetShippingCustomTypeChange extends Change {

    /**
     * discriminator value for SetShippingCustomTypeChange
     */
    String SET_SHIPPING_CUSTOM_TYPE_CHANGE = "SetShippingCustomTypeChange";

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
     *  <p><code>shippingKey</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a>.</p>
     * @return shippingKey
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p><code>shippingKey</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * factory method
     * @return instance of SetShippingCustomTypeChange
     */
    public static SetShippingCustomTypeChange of() {
        return new SetShippingCustomTypeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingCustomTypeChange of(final SetShippingCustomTypeChange template) {
        SetShippingCustomTypeChangeImpl instance = new SetShippingCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setShippingKey(template.getShippingKey());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetShippingCustomTypeChange copyDeep();

    /**
     * factory method to create a deep copy of SetShippingCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingCustomTypeChange deepCopy(@Nullable final SetShippingCustomTypeChange template) {
        if (template == null) {
            return null;
        }
        SetShippingCustomTypeChangeImpl instance = new SetShippingCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setShippingKey(template.getShippingKey());
        instance.setPreviousValue(
            com.commercetools.history.models.common.CustomFields.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.CustomFields.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetShippingCustomTypeChange
     * @return builder
     */
    public static SetShippingCustomTypeChangeBuilder builder() {
        return SetShippingCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetShippingCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingCustomTypeChangeBuilder builder(final SetShippingCustomTypeChange template) {
        return SetShippingCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingCustomTypeChange(Function<SetShippingCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingCustomTypeChange>";
            }
        };
    }
}
