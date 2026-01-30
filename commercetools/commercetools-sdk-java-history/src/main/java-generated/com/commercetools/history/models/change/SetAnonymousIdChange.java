
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
 * SetAnonymousIdChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAnonymousIdChange setAnonymousIdChange = SetAnonymousIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetAnonymousIdChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAnonymousIdChangeImpl.class)
public interface SetAnonymousIdChange extends Change {

    /**
     * discriminator value for SetAnonymousIdChange
     */
    String SET_ANONYMOUS_ID_CHANGE = "SetAnonymousIdChange";

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
     * @return instance of SetAnonymousIdChange
     */
    public static SetAnonymousIdChange of() {
        return new SetAnonymousIdChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAnonymousIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAnonymousIdChange of(final SetAnonymousIdChange template) {
        SetAnonymousIdChangeImpl instance = new SetAnonymousIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetAnonymousIdChange copyDeep();

    /**
     * factory method to create a deep copy of SetAnonymousIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAnonymousIdChange deepCopy(@Nullable final SetAnonymousIdChange template) {
        if (template == null) {
            return null;
        }
        SetAnonymousIdChangeImpl instance = new SetAnonymousIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetAnonymousIdChange
     * @return builder
     */
    public static SetAnonymousIdChangeBuilder builder() {
        return SetAnonymousIdChangeBuilder.of();
    }

    /**
     * create builder for SetAnonymousIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAnonymousIdChangeBuilder builder(final SetAnonymousIdChange template) {
        return SetAnonymousIdChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAnonymousIdChange(Function<SetAnonymousIdChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAnonymousIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAnonymousIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAnonymousIdChange>";
            }
        };
    }
}
