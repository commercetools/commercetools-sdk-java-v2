
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Store on Orders.</li>
 *   <li>Set Store on Shopping Lists.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStoreChange setStoreChange = SetStoreChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetStoreChangeImpl.class)
public interface SetStoreChange extends Change {

    /**
     * discriminator value for SetStoreChange
     */
    String SET_STORE_CHANGE = "SetStoreChange";

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
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of SetStoreChange
     */
    public static SetStoreChange of() {
        return new SetStoreChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetStoreChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetStoreChange of(final SetStoreChange template) {
        SetStoreChangeImpl instance = new SetStoreChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetStoreChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetStoreChange deepCopy(@Nullable final SetStoreChange template) {
        if (template == null) {
            return null;
        }
        SetStoreChangeImpl instance = new SetStoreChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetStoreChange
     * @return builder
     */
    public static SetStoreChangeBuilder builder() {
        return SetStoreChangeBuilder.of();
    }

    /**
     * create builder for SetStoreChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStoreChangeBuilder builder(final SetStoreChange template) {
        return SetStoreChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetStoreChange(Function<SetStoreChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetStoreChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetStoreChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetStoreChange>";
            }
        };
    }
}
