package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Image;
import com.commercetools.history.models.change.AddExternalImageChangeImpl;

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
 * AddExternalImageChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddExternalImageChange addExternalImageChange = AddExternalImageChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
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
@JsonDeserialize(as = AddExternalImageChangeImpl.class)
public interface AddExternalImageChange extends Change {

    /**
     * discriminator value for AddExternalImageChange
     */
    String ADD_EXTERNAL_IMAGE_CHANGE = "AddExternalImageChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update actions for adding an external image</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();
    /**
     *
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();
    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Image> getPreviousValue();
    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Image> getNextValue();

    /**
     *  <p>Update actions for adding an external image</p>
     * @param change value to be set
     */
    
    public void setChange(final String change);
    
    
    /**
     * set catalogData
     * @param catalogData value to be set
     */
    
    public void setCatalogData(final String catalogData);
    
    
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    @JsonIgnore
    public void setPreviousValue(final Image ...previousValue);
    /**
     * set previousValue
     * @param previousValue values to be set
     */
    
    public void setPreviousValue(final List<Image> previousValue);
    
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    @JsonIgnore
    public void setNextValue(final Image ...nextValue);
    /**
     * set nextValue
     * @param nextValue values to be set
     */
    
    public void setNextValue(final List<Image> nextValue);

    /**
     * factory method
     * @return instance of AddExternalImageChange
     */
    public static AddExternalImageChange of(){
        return new AddExternalImageChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy AddExternalImageChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddExternalImageChange of(final AddExternalImageChange template) {
        AddExternalImageChangeImpl instance = new AddExternalImageChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddExternalImageChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddExternalImageChange deepCopy(@Nullable final AddExternalImageChange template) {
        if (template == null) {
            return null;
        }
        AddExternalImageChangeImpl instance = new AddExternalImageChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream().map(com.commercetools.history.models.common.Image::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream().map(com.commercetools.history.models.common.Image::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AddExternalImageChange
     * @return builder
     */
    public static AddExternalImageChangeBuilder builder() {
        return AddExternalImageChangeBuilder.of();
    }
    
    /**
     * create builder for AddExternalImageChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddExternalImageChangeBuilder builder(final AddExternalImageChange template) {
        return AddExternalImageChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddExternalImageChange(Function<AddExternalImageChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddExternalImageChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddExternalImageChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddExternalImageChange>";
            }
        };
    }
}
