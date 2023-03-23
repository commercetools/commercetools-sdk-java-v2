
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerNumberChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerNumberChange setCustomerNumberChange = SetCustomerNumberChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomerNumberChangeImpl.class)
public interface SetCustomerNumberChange extends Change {

    String SET_CUSTOMER_NUMBER_CHANGE = "SetCustomerNumberChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setCustomerNumber</code></p>
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

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetCustomerNumberChange of() {
        return new SetCustomerNumberChangeImpl();
    }

    public static SetCustomerNumberChange of(final SetCustomerNumberChange template) {
        SetCustomerNumberChangeImpl instance = new SetCustomerNumberChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCustomerNumberChangeBuilder builder() {
        return SetCustomerNumberChangeBuilder.of();
    }

    public static SetCustomerNumberChangeBuilder builder(final SetCustomerNumberChange template) {
        return SetCustomerNumberChangeBuilder.of(template);
    }

    default <T> T withSetCustomerNumberChange(Function<SetCustomerNumberChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerNumberChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerNumberChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerNumberChange>";
            }
        };
    }
}
