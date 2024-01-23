
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
 *   <li>Set Description on Tax Categories.</li>
 *   <li>Set Description on Zones.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDescriptionChange setDescriptionChange = SetDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDescriptionChangeImpl.class)
public interface SetDescriptionChange extends Change {

    /**
     * discriminator value for SetDescriptionChange
     */
    String SET_DESCRIPTION_CHANGE = "SetDescriptionChange";

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
     * @return instance of SetDescriptionChange
     */
    public static SetDescriptionChange of() {
        return new SetDescriptionChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDescriptionChange of(final SetDescriptionChange template) {
        SetDescriptionChangeImpl instance = new SetDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDescriptionChange deepCopy(@Nullable final SetDescriptionChange template) {
        if (template == null) {
            return null;
        }
        SetDescriptionChangeImpl instance = new SetDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetDescriptionChange
     * @return builder
     */
    public static SetDescriptionChangeBuilder builder() {
        return SetDescriptionChangeBuilder.of();
    }

    /**
     * create builder for SetDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDescriptionChangeBuilder builder(final SetDescriptionChange template) {
        return SetDescriptionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDescriptionChange(Function<SetDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDescriptionChange>";
            }
        };
    }
}
