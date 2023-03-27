
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeIsActiveChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeIsActiveChange changeIsActiveChange = ChangeIsActiveChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeIsActiveChangeImpl.class)
public interface ChangeIsActiveChange extends Change {

    /**
     * discriminator value for ChangeIsActiveChange
     */
    String CHANGE_IS_ACTIVE_CHANGE = "ChangeIsActiveChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>changeIsActive</code></p>
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
    public Boolean getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    /**
     *  <p>Shape of the action for <code>changeIsActive</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Boolean previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Boolean nextValue);

    /**
     * factory method
     * @return instance of ChangeIsActiveChange
     */
    public static ChangeIsActiveChange of() {
        return new ChangeIsActiveChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeIsActiveChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeIsActiveChange of(final ChangeIsActiveChange template) {
        ChangeIsActiveChangeImpl instance = new ChangeIsActiveChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeIsActiveChange
     * @return builder
     */
    public static ChangeIsActiveChangeBuilder builder() {
        return ChangeIsActiveChangeBuilder.of();
    }

    /**
     * create builder for ChangeIsActiveChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeIsActiveChangeBuilder builder(final ChangeIsActiveChange template) {
        return ChangeIsActiveChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeIsActiveChange(Function<ChangeIsActiveChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeIsActiveChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeIsActiveChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeIsActiveChange>";
            }
        };
    }
}
