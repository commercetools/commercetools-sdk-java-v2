
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAssetNameChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssetNameChange changeAssetNameChange = ChangeAssetNameChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAssetNameChangeImpl.class)
public interface ChangeAssetNameChange extends Change {

    /**
     * discriminator value for ChangeAssetNameChange
     */
    String CHANGE_ASSET_NAME_CHANGE = "ChangeAssetNameChange";

    /**
     *  <p>Update action for <code>changeAssetName</code></p>
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
    public LocalizedString getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    /**
     *  <p>Update action for <code>changeAssetName</code></p>
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

    public void setNextValue(final LocalizedString nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     * factory method
     * @return instance of ChangeAssetNameChange
     */
    public static ChangeAssetNameChange of() {
        return new ChangeAssetNameChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeAssetNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAssetNameChange of(final ChangeAssetNameChange template) {
        ChangeAssetNameChangeImpl instance = new ChangeAssetNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeAssetNameChange
     * @return builder
     */
    public static ChangeAssetNameChangeBuilder builder() {
        return ChangeAssetNameChangeBuilder.of();
    }

    /**
     * create builder for ChangeAssetNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssetNameChangeBuilder builder(final ChangeAssetNameChange template) {
        return ChangeAssetNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAssetNameChange(Function<ChangeAssetNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAssetNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAssetNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAssetNameChange>";
            }
        };
    }
}
