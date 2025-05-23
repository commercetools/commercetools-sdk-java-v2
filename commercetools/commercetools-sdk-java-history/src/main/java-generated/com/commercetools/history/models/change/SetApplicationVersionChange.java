
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
 *  <p>Change triggered automatically due to a user-initiated change.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationVersionChange setApplicationVersionChange = SetApplicationVersionChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetApplicationVersionChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetApplicationVersionChangeImpl.class)
public interface SetApplicationVersionChange extends Change {

    /**
     * discriminator value for SetApplicationVersionChange
     */
    String SET_APPLICATION_VERSION_CHANGE = "SetApplicationVersionChange";

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
     * @return instance of SetApplicationVersionChange
     */
    public static SetApplicationVersionChange of() {
        return new SetApplicationVersionChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetApplicationVersionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetApplicationVersionChange of(final SetApplicationVersionChange template) {
        SetApplicationVersionChangeImpl instance = new SetApplicationVersionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetApplicationVersionChange copyDeep();

    /**
     * factory method to create a deep copy of SetApplicationVersionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetApplicationVersionChange deepCopy(@Nullable final SetApplicationVersionChange template) {
        if (template == null) {
            return null;
        }
        SetApplicationVersionChangeImpl instance = new SetApplicationVersionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetApplicationVersionChange
     * @return builder
     */
    public static SetApplicationVersionChangeBuilder builder() {
        return SetApplicationVersionChangeBuilder.of();
    }

    /**
     * create builder for SetApplicationVersionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationVersionChangeBuilder builder(final SetApplicationVersionChange template) {
        return SetApplicationVersionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetApplicationVersionChange(Function<SetApplicationVersionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationVersionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationVersionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationVersionChange>";
            }
        };
    }
}
