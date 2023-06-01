package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.ChangeAssetOrderChangeImpl;

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
 * ChangeAssetOrderChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssetOrderChange changeAssetOrderChange = ChangeAssetOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ChangeAssetOrderChangeImpl.class)
public interface ChangeAssetOrderChange extends Change {

    /**
     * discriminator value for ChangeAssetOrderChange
     */
    String CHANGE_ASSET_ORDER_CHANGE = "ChangeAssetOrderChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *
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
    @Valid
    @JsonProperty("previousValue")
    public List<LocalizedString> getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<LocalizedString> getNextValue();

    /**
     * set change
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    @JsonIgnore
    public void setPreviousValue(final LocalizedString ...previousValue);
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    public void setPreviousValue(final List<LocalizedString> previousValue);
    
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    @JsonIgnore
    public void setNextValue(final LocalizedString ...nextValue);
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    public void setNextValue(final List<LocalizedString> nextValue);

    /**
     * factory method
     * @return instance of ChangeAssetOrderChange
     */
    public static ChangeAssetOrderChange of(){
        return new ChangeAssetOrderChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy ChangeAssetOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAssetOrderChange of(final ChangeAssetOrderChange template) {
        ChangeAssetOrderChangeImpl instance = new ChangeAssetOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeAssetOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeAssetOrderChange deepCopy(@Nullable final ChangeAssetOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangeAssetOrderChangeImpl instance = new ChangeAssetOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream().map(com.commercetools.history.models.common.LocalizedString::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream().map(com.commercetools.history.models.common.LocalizedString::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeAssetOrderChange
     * @return builder
     */
    public static ChangeAssetOrderChangeBuilder builder() {
        return ChangeAssetOrderChangeBuilder.of();
    }
    
    /**
     * create builder for ChangeAssetOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssetOrderChangeBuilder builder(final ChangeAssetOrderChange template) {
        return ChangeAssetOrderChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAssetOrderChange(Function<ChangeAssetOrderChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAssetOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAssetOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAssetOrderChange>";
            }
        };
    }
}
