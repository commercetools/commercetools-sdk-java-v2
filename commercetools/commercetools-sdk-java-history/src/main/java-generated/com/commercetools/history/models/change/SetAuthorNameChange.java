
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewSetAuthorNameAction" rel="nofollow">Set Author Name</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAuthorNameChange setAuthorNameChange = SetAuthorNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetAuthorNameChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAuthorNameChangeImpl.class)
public interface SetAuthorNameChange extends Change {

    /**
     * discriminator value for SetAuthorNameChange
     */
    String SET_AUTHOR_NAME_CHANGE = "SetAuthorNameChange";

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
     * @return instance of SetAuthorNameChange
     */
    public static SetAuthorNameChange of() {
        return new SetAuthorNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAuthorNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAuthorNameChange of(final SetAuthorNameChange template) {
        SetAuthorNameChangeImpl instance = new SetAuthorNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetAuthorNameChange copyDeep();

    /**
     * factory method to create a deep copy of SetAuthorNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAuthorNameChange deepCopy(@Nullable final SetAuthorNameChange template) {
        if (template == null) {
            return null;
        }
        SetAuthorNameChangeImpl instance = new SetAuthorNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetAuthorNameChange
     * @return builder
     */
    public static SetAuthorNameChangeBuilder builder() {
        return SetAuthorNameChangeBuilder.of();
    }

    /**
     * create builder for SetAuthorNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAuthorNameChangeBuilder builder(final SetAuthorNameChange template) {
        return SetAuthorNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAuthorNameChange(Function<SetAuthorNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAuthorNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAuthorNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAuthorNameChange>";
            }
        };
    }
}
