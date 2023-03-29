
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveAddressChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAddressChange removeAddressChange = RemoveAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveAddressChangeImpl.class)
public interface RemoveAddressChange extends Change {

    /**
     * discriminator value for RemoveAddressChange
     */
    String REMOVE_ADDRESS_CHANGE = "RemoveAddressChange";

    /**
     *  <p>Update action for <code>removeAddress</code> action.</p>
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
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    /**
     *  <p>Update action for <code>removeAddress</code> action.</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Address previousValue);

    /**
     * factory method
     * @return instance of RemoveAddressChange
     */
    public static RemoveAddressChange of() {
        return new RemoveAddressChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveAddressChange of(final RemoveAddressChange template) {
        RemoveAddressChangeImpl instance = new RemoveAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveAddressChange deepCopy(@Nullable final RemoveAddressChange template) {
        if (template == null) {
            return null;
        }
        RemoveAddressChangeImpl instance = new RemoveAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.Address::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RemoveAddressChange
     * @return builder
     */
    public static RemoveAddressChangeBuilder builder() {
        return RemoveAddressChangeBuilder.of();
    }

    /**
     * create builder for RemoveAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAddressChangeBuilder builder(final RemoveAddressChange template) {
        return RemoveAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveAddressChange(Function<RemoveAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveAddressChange>";
            }
        };
    }
}
