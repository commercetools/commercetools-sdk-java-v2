
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ProductPriceModeEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetPriceModeAction" rel="nofollow">Set PriceMode</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPriceModeChange setPriceModeChange = SetPriceModeChange.builder()
 *             .change("{change}")
 *             .previousValue(ProductPriceModeEnum.EMBEDDED)
 *             .nextValue(ProductPriceModeEnum.EMBEDDED)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetPriceModeChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetPriceModeChangeImpl.class)
public interface SetPriceModeChange extends Change {

    /**
     * discriminator value for SetPriceModeChange
     */
    String SET_PRICE_MODE_CHANGE = "SetPriceModeChange";

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
    @JsonProperty("previousValue")
    public ProductPriceModeEnum getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public ProductPriceModeEnum getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ProductPriceModeEnum previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ProductPriceModeEnum nextValue);

    /**
     * factory method
     * @return instance of SetPriceModeChange
     */
    public static SetPriceModeChange of() {
        return new SetPriceModeChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetPriceModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetPriceModeChange of(final SetPriceModeChange template) {
        SetPriceModeChangeImpl instance = new SetPriceModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetPriceModeChange copyDeep();

    /**
     * factory method to create a deep copy of SetPriceModeChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetPriceModeChange deepCopy(@Nullable final SetPriceModeChange template) {
        if (template == null) {
            return null;
        }
        SetPriceModeChangeImpl instance = new SetPriceModeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetPriceModeChange
     * @return builder
     */
    public static SetPriceModeChangeBuilder builder() {
        return SetPriceModeChangeBuilder.of();
    }

    /**
     * create builder for SetPriceModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPriceModeChangeBuilder builder(final SetPriceModeChange template) {
        return SetPriceModeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetPriceModeChange(Function<SetPriceModeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetPriceModeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPriceModeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetPriceModeChange>";
            }
        };
    }
}
