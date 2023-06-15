
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
 *   <li>Change Key on Channels.</li>
 *   <li>Change State key on States.</li>
 *   <li>Change Key on Types.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeKeyChange changeKeyChange = ChangeKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeKeyChangeImpl.class)
public interface ChangeKeyChange extends Change {

    /**
     * discriminator value for ChangeKeyChange
     */
    String CHANGE_KEY_CHANGE = "ChangeKeyChange";

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
     * @return instance of ChangeKeyChange
     */
    public static ChangeKeyChange of() {
        return new ChangeKeyChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeKeyChange of(final ChangeKeyChange template) {
        ChangeKeyChangeImpl instance = new ChangeKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeKeyChange deepCopy(@Nullable final ChangeKeyChange template) {
        if (template == null) {
            return null;
        }
        ChangeKeyChangeImpl instance = new ChangeKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeKeyChange
     * @return builder
     */
    public static ChangeKeyChangeBuilder builder() {
        return ChangeKeyChangeBuilder.of();
    }

    /**
     * create builder for ChangeKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeKeyChangeBuilder builder(final ChangeKeyChange template) {
        return ChangeKeyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeKeyChange(Function<ChangeKeyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeKeyChange>";
            }
        };
    }
}
