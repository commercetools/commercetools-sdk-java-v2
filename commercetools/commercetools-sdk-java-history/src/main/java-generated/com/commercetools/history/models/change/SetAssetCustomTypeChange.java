
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetCustomTypeChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetCustomTypeChange setAssetCustomTypeChange = SetAssetCustomTypeChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAssetCustomTypeChangeImpl.class)
public interface SetAssetCustomTypeChange extends Change {

    /**
     * discriminator value for SetAssetCustomTypeChange
     */
    String SET_ASSET_CUSTOM_TYPE_CHANGE = "SetAssetCustomTypeChange";

    /**
     *  <p>Update action for <code>setAssetCustomType</code></p>
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
     * @return asset
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetChangeValue getAsset();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomFields getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomFields getPreviousValue();

    /**
     *  <p>Update action for <code>setAssetCustomType</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set asset
     * @param asset value to be set
     */

    public void setAsset(final AssetChangeValue asset);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final CustomFields nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final CustomFields previousValue);

    /**
     * factory method
     * @return instance of SetAssetCustomTypeChange
     */
    public static SetAssetCustomTypeChange of() {
        return new SetAssetCustomTypeChangeImpl();
    }

    /**
     * factory method to copy an instance of SetAssetCustomTypeChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAssetCustomTypeChange of(final SetAssetCustomTypeChange template) {
        SetAssetCustomTypeChangeImpl instance = new SetAssetCustomTypeChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetAssetCustomTypeChange
     * @return builder
     */
    public static SetAssetCustomTypeChangeBuilder builder() {
        return SetAssetCustomTypeChangeBuilder.of();
    }

    /**
     * create builder for SetAssetCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetCustomTypeChangeBuilder builder(final SetAssetCustomTypeChange template) {
        return SetAssetCustomTypeChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAssetCustomTypeChange(Function<SetAssetCustomTypeChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAssetCustomTypeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAssetCustomTypeChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAssetCustomTypeChange>";
            }
        };
    }
}
