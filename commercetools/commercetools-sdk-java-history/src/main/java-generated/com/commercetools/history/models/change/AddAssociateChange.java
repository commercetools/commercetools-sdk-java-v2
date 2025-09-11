
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddAssociateAction" rel="nofollow">Add Associate</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAssociateChange addAssociateChange = AddAssociateChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddAssociateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddAssociateChangeImpl.class)
public interface AddAssociateChange extends Change {

    /**
     * discriminator value for AddAssociateChange
     */
    String ADD_ASSOCIATE_CHANGE = "AddAssociateChange";

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
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Associate getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Associate nextValue);

    /**
     * factory method
     * @return instance of AddAssociateChange
     */
    public static AddAssociateChange of() {
        return new AddAssociateChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddAssociateChange of(final AddAssociateChange template) {
        AddAssociateChangeImpl instance = new AddAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public AddAssociateChange copyDeep();

    /**
     * factory method to create a deep copy of AddAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddAssociateChange deepCopy(@Nullable final AddAssociateChange template) {
        if (template == null) {
            return null;
        }
        AddAssociateChangeImpl instance = new AddAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.Associate.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for AddAssociateChange
     * @return builder
     */
    public static AddAssociateChangeBuilder builder() {
        return AddAssociateChangeBuilder.of();
    }

    /**
     * create builder for AddAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAssociateChangeBuilder builder(final AddAssociateChange template) {
        return AddAssociateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddAssociateChange(Function<AddAssociateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddAssociateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddAssociateChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddAssociateChange>";
            }
        };
    }
}
