
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Asset;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddAssetChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAssetChange addAssetChange = AddAssetChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddAssetChangeImpl.class)
public interface AddAssetChange extends Change {

    /**
     * discriminator value for AddAssetChange
     */
    String ADD_ASSET_CHANGE = "AddAssetChange";

    /**
     *  <p>Update action for <code>addAsset</code></p>
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
    public Asset getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Asset getPreviousValue();

    /**
     *  <p>Update action for <code>addAsset</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Asset nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Asset previousValue);

    /**
     * factory method
     * @return instance of AddAssetChange
     */
    public static AddAssetChange of() {
        return new AddAssetChangeImpl();
    }

    /**
     * factory method to copy an instance of AddAssetChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddAssetChange of(final AddAssetChange template) {
        AddAssetChangeImpl instance = new AddAssetChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for AddAssetChange
     * @return builder
     */
    public static AddAssetChangeBuilder builder() {
        return AddAssetChangeBuilder.of();
    }

    /**
     * create builder for AddAssetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAssetChangeBuilder builder(final AddAssetChange template) {
        return AddAssetChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddAssetChange(Function<AddAssetChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddAssetChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddAssetChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddAssetChange>";
            }
        };
    }
}
