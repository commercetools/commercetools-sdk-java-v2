
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Valid From on Cart Discounts.</li>
 *   <li>Set Valid From on Discount Codes.</li>
 *   <li>Set Valid From on Product Discounts.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidFromChange setValidFromChange = SetValidFromChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetValidFromChangeImpl.class)
public interface SetValidFromChange extends Change {

    /**
     * discriminator value for SetValidFromChange
     */
    String SET_VALID_FROM_CHANGE = "SetValidFromChange";

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
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of SetValidFromChange
     */
    public static SetValidFromChange of() {
        return new SetValidFromChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetValidFromChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetValidFromChange of(final SetValidFromChange template) {
        SetValidFromChangeImpl instance = new SetValidFromChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetValidFromChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetValidFromChange deepCopy(@Nullable final SetValidFromChange template) {
        if (template == null) {
            return null;
        }
        SetValidFromChangeImpl instance = new SetValidFromChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetValidFromChange
     * @return builder
     */
    public static SetValidFromChangeBuilder builder() {
        return SetValidFromChangeBuilder.of();
    }

    /**
     * create builder for SetValidFromChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValidFromChangeBuilder builder(final SetValidFromChange template) {
        return SetValidFromChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetValidFromChange(Function<SetValidFromChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetValidFromChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValidFromChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValidFromChange>";
            }
        };
    }
}
