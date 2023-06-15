
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
 *  <p>Change triggered automatically by the Add Product or Remove Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductCountChange setProductCountChange = SetProductCountChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetProductCountChangeImpl.class)
public interface SetProductCountChange extends Change {

    /**
     * discriminator value for SetProductCountChange
     */
    String SET_PRODUCT_COUNT_CHANGE = "SetProductCountChange";

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
    public Integer getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     * factory method
     * @return instance of SetProductCountChange
     */
    public static SetProductCountChange of() {
        return new SetProductCountChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetProductCountChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetProductCountChange of(final SetProductCountChange template) {
        SetProductCountChangeImpl instance = new SetProductCountChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetProductCountChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetProductCountChange deepCopy(@Nullable final SetProductCountChange template) {
        if (template == null) {
            return null;
        }
        SetProductCountChangeImpl instance = new SetProductCountChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetProductCountChange
     * @return builder
     */
    public static SetProductCountChangeBuilder builder() {
        return SetProductCountChangeBuilder.of();
    }

    /**
     * create builder for SetProductCountChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductCountChangeBuilder builder(final SetProductCountChange template) {
        return SetProductCountChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetProductCountChange(Function<SetProductCountChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetProductCountChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetProductCountChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetProductCountChange>";
            }
        };
    }
}
