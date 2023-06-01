package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.AssetChangeValue;
import java.lang.Object;
import com.commercetools.history.models.change.SetAssetCustomFieldChangeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * SetAssetCustomFieldChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetCustomFieldChange setAssetCustomFieldChange = SetAssetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SetAssetCustomFieldChangeImpl.class)
public interface SetAssetCustomFieldChange extends Change {

    /**
     * discriminator value for SetAssetCustomFieldChange
     */
    String SET_ASSET_CUSTOM_FIELD_CHANGE = "SetAssetCustomFieldChange";

    /**
     *  <p>Update action for <code>setAssetCustomField</code></p>
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
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();
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
    @JsonProperty("nextValue")
    public Object getNextValue();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Update action for <code>setAssetCustomField</code></p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set name
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     * set customTypeId
     * @param customTypeId value to be set
     */
    
    public void setCustomTypeId(final String customTypeId);
    
    
    /**
     * set asset
     * @param asset value to be set
     */
    
    public void setAsset(final AssetChangeValue asset);
    
    
    /**
     * set nextValue
     * @param nextValue value to be set
     */
    
    public void setNextValue(final Object nextValue);
    
    
    /**
     * set previousValue
     * @param previousValue value to be set
     */
    
    public void setPreviousValue(final Object previousValue);
    

    /**
     * factory method
     * @return instance of SetAssetCustomFieldChange
     */
    public static SetAssetCustomFieldChange of(){
        return new SetAssetCustomFieldChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy SetAssetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAssetCustomFieldChange of(final SetAssetCustomFieldChange template) {
        SetAssetCustomFieldChangeImpl instance = new SetAssetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetAssetCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAssetCustomFieldChange deepCopy(@Nullable final SetAssetCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetAssetCustomFieldChangeImpl instance = new SetAssetCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setAsset(com.commercetools.history.models.change_value.AssetChangeValue.deepCopy(template.getAsset()));
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetAssetCustomFieldChange
     * @return builder
     */
    public static SetAssetCustomFieldChangeBuilder builder() {
        return SetAssetCustomFieldChangeBuilder.of();
    }
    
    /**
     * create builder for SetAssetCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetCustomFieldChangeBuilder builder(final SetAssetCustomFieldChange template) {
        return SetAssetCustomFieldChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAssetCustomFieldChange(Function<SetAssetCustomFieldChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAssetCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAssetCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAssetCustomFieldChange>";
            }
        };
    }
}
