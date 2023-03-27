
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeNameChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeNameChange changeNameChange = ChangeNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeNameChangeImpl.class)
public interface ChangeNameChange extends Change {

    /**
     * discriminator value for ChangeNameChange
     */
    String CHANGE_NAME_CHANGE = "ChangeNameChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>changeName</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Shape of the action for <code>changeName</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of ChangeNameChange
     */
    public static ChangeNameChange of() {
        return new ChangeNameChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeNameChange of(final ChangeNameChange template) {
        ChangeNameChangeImpl instance = new ChangeNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeNameChange
     * @return builder
     */
    public static ChangeNameChangeBuilder builder() {
        return ChangeNameChangeBuilder.of();
    }

    /**
     * create builder for ChangeNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeNameChangeBuilder builder(final ChangeNameChange template) {
        return ChangeNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeNameChange(Function<ChangeNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeNameChange>";
            }
        };
    }
}
