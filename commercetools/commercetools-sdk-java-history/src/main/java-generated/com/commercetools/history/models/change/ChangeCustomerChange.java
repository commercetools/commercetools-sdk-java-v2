
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteChangeCustomerAction" rel="nofollow">Change Customer</a> on Quotes</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequestChangeCustomerAction" rel="nofollow">Change Customer</a> on Quote Requests</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeCustomerChange changeCustomerChange = ChangeCustomerChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeCustomerChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeCustomerChangeImpl.class)
public interface ChangeCustomerChange extends Change {

    /**
     * discriminator value for ChangeCustomerChange
     */
    String CHANGE_CUSTOMER_CHANGE = "ChangeCustomerChange";

    /**
     *
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
     * @return instance of ChangeCustomerChange
     */
    public static ChangeCustomerChange of() {
        return new ChangeCustomerChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeCustomerChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeCustomerChange of(final ChangeCustomerChange template) {
        ChangeCustomerChangeImpl instance = new ChangeCustomerChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeCustomerChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeCustomerChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeCustomerChange deepCopy(@Nullable final ChangeCustomerChange template) {
        if (template == null) {
            return null;
        }
        ChangeCustomerChangeImpl instance = new ChangeCustomerChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeCustomerChange
     * @return builder
     */
    public static ChangeCustomerChangeBuilder builder() {
        return ChangeCustomerChangeBuilder.of();
    }

    /**
     * create builder for ChangeCustomerChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeCustomerChangeBuilder builder(final ChangeCustomerChange template) {
        return ChangeCustomerChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeCustomerChange(Function<ChangeCustomerChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeCustomerChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeCustomerChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeCustomerChange>";
            }
        };
    }
}
