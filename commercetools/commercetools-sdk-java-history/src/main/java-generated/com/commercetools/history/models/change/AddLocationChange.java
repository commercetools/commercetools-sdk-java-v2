
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Location;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddLocationChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddLocationChange addLocationChange = AddLocationChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddLocationChangeImpl.class)
public interface AddLocationChange extends Change {

    /**
     * discriminator value for AddLocationChange
     */
    String ADD_LOCATION_CHANGE = "AddLocationChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addLocation</code> on zones</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Location getPreviousValue();

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Location getNextValue();

    /**
     *  <p>Update action for <code>addLocation</code> on zones</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Location previousValue);

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Location nextValue);

    /**
     * factory method
     * @return instance of AddLocationChange
     */
    public static AddLocationChange of() {
        return new AddLocationChangeImpl();
    }

    /**
     * factory method to copy an instance of AddLocationChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddLocationChange of(final AddLocationChange template) {
        AddLocationChangeImpl instance = new AddLocationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for AddLocationChange
     * @return builder
     */
    public static AddLocationChangeBuilder builder() {
        return AddLocationChangeBuilder.of();
    }

    /**
     * create builder for AddLocationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddLocationChangeBuilder builder(final AddLocationChange template) {
        return AddLocationChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddLocationChange(Function<AddLocationChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddLocationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddLocationChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddLocationChange>";
            }
        };
    }
}
