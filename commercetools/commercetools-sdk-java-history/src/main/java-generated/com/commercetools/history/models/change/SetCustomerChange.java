
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerChange setCustomerChange = SetCustomerChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomerChangeImpl.class)
public interface SetCustomerChange extends Change {

    String SET_CUSTOMER_CHANGE = "SetCustomerChange";

    /**
     <>
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     <*  <p>Shape of the action for <code>setCustomer</code></p>>
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     <>
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     <>
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Reference previousValue);

    public void setNextValue(final Reference nextValue);

    public static SetCustomerChange of() {
        return new SetCustomerChangeImpl();
    }

    public static SetCustomerChange of(final SetCustomerChange template) {
        SetCustomerChangeImpl instance = new SetCustomerChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCustomerChangeBuilder builder() {
        return SetCustomerChangeBuilder.of();
    }

    public static SetCustomerChangeBuilder builder(final SetCustomerChange template) {
        return SetCustomerChangeBuilder.of(template);
    }

    default <T> T withSetCustomerChange(Function<SetCustomerChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerChange>";
            }
        };
    }
}
