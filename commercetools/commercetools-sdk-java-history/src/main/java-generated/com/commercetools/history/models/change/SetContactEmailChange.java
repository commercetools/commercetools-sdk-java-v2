
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
 *  <p>Change triggered by the Set Contact Email update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetContactEmailChange setContactEmailChange = SetContactEmailChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetContactEmailChangeImpl.class)
public interface SetContactEmailChange extends Change {

    /**
     * discriminator value for SetContactEmailChange
     */
    String SET_CONTACT_EMAIL_CHANGE = "SetContactEmailChange";

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
     * @return instance of SetContactEmailChange
     */
    public static SetContactEmailChange of() {
        return new SetContactEmailChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetContactEmailChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetContactEmailChange of(final SetContactEmailChange template) {
        SetContactEmailChangeImpl instance = new SetContactEmailChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetContactEmailChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetContactEmailChange deepCopy(@Nullable final SetContactEmailChange template) {
        if (template == null) {
            return null;
        }
        SetContactEmailChangeImpl instance = new SetContactEmailChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetContactEmailChange
     * @return builder
     */
    public static SetContactEmailChangeBuilder builder() {
        return SetContactEmailChangeBuilder.of();
    }

    /**
     * create builder for SetContactEmailChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetContactEmailChangeBuilder builder(final SetContactEmailChange template) {
        return SetContactEmailChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetContactEmailChange(Function<SetContactEmailChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetContactEmailChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetContactEmailChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetContactEmailChange>";
            }
        };
    }
}
