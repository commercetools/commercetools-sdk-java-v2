
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Asset;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryAddAssetAction" rel="nofollow">Add Asset</a> on Categories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductAddAssetAction" rel="nofollow">Add Asset</a> on Products.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAssetChange addAssetChange = AddAssetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddAssetChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddAssetChangeImpl.class)
public interface AddAssetChange extends Change {

    /**
     * discriminator value for AddAssetChange
     */
    String ADD_ASSET_CHANGE = "AddAssetChange";

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
    public Asset getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Asset getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Asset previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Asset nextValue);

    /**
     * factory method
     * @return instance of AddAssetChange
     */
    public static AddAssetChange of() {
        return new AddAssetChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddAssetChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddAssetChange of(final AddAssetChange template) {
        AddAssetChangeImpl instance = new AddAssetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public AddAssetChange copyDeep();

    /**
     * factory method to create a deep copy of AddAssetChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddAssetChange deepCopy(@Nullable final AddAssetChange template) {
        if (template == null) {
            return null;
        }
        AddAssetChangeImpl instance = new AddAssetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Asset.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Asset.deepCopy(template.getNextValue()));
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
