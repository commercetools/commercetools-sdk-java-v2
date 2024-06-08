
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Valid Until on Cart Discounts.</li>
 *   <li>Set Valid Until on Discount Codes.</li>
 *   <li>Set Valid Until on Product Discounts.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidUntilChange setValidUntilChange = SetValidUntilChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetValidUntilChangeImpl.class)
public interface SetValidUntilChange extends Change {

    /**
     * discriminator value for SetValidUntilChange
     */
    String SET_VALID_UNTIL_CHANGE = "SetValidUntilChange";

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
     * @return instance of SetValidUntilChange
     */
    public static SetValidUntilChange of() {
        return new SetValidUntilChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetValidUntilChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetValidUntilChange of(final SetValidUntilChange template) {
        SetValidUntilChangeImpl instance = new SetValidUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetValidUntilChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetValidUntilChange deepCopy(@Nullable final SetValidUntilChange template) {
        if (template == null) {
            return null;
        }
        SetValidUntilChangeImpl instance = new SetValidUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetValidUntilChange
     * @return builder
     */
    public static SetValidUntilChangeBuilder builder() {
        return SetValidUntilChangeBuilder.of();
    }

    /**
     * create builder for SetValidUntilChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValidUntilChangeBuilder builder(final SetValidUntilChange template) {
        return SetValidUntilChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetValidUntilChange(Function<SetValidUntilChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetValidUntilChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValidUntilChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValidUntilChange>";
            }
        };
    }
}
