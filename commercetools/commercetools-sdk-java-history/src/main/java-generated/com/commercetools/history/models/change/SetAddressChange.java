
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAddressChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAddressChange setAddressChange = SetAddressChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAddressChangeImpl.class)
public interface SetAddressChange extends Change {

    /**
     * discriminator value for SetAddressChange
     */
    String SET_ADDRESS_CHANGE = "SetAddressChange";

    /**
     *  <p>Update action for <code>setAddress</code> action.</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Address getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    /**
     *  <p>Update action for <code>setAddress</code> action.</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Address nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Address previousValue);

    /**
     * factory method
     * @return instance of SetAddressChange
     */
    public static SetAddressChange of() {
        return new SetAddressChangeImpl();
    }

    /**
     * factory method to copy an instance of SetAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAddressChange of(final SetAddressChange template) {
        SetAddressChangeImpl instance = new SetAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetAddressChange
     * @return builder
     */
    public static SetAddressChangeBuilder builder() {
        return SetAddressChangeBuilder.of();
    }

    /**
     * create builder for SetAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAddressChangeBuilder builder(final SetAddressChange template) {
        return SetAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAddressChange(Function<SetAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAddressChange>";
            }
        };
    }
}
