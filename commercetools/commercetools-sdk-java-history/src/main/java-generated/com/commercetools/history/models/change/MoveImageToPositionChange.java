package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Image;
import com.commercetools.history.models.change.MoveImageToPositionChangeImpl;

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
 * MoveImageToPositionChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoveImageToPositionChange moveImageToPositionChange = MoveImageToPositionChange.builder()
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
@JsonDeserialize(as = MoveImageToPositionChangeImpl.class)
public interface MoveImageToPositionChange extends Change {

    /**
     * discriminator value for MoveImageToPositionChange
     */
    String MOVE_IMAGE_TO_POSITION_CHANGE = "MoveImageToPositionChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();
    /**
     *  <p>Update actions for moving images</p>
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
     *  <p>Update actions for moving images</p>
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
     * @return instance of MoveImageToPositionChange
     */
    public static MoveImageToPositionChange of(){
        return new MoveImageToPositionChangeImpl();
    }
    

    /**
     * factory method to create a shallow copy MoveImageToPositionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static MoveImageToPositionChange of(final MoveImageToPositionChange template) {
        MoveImageToPositionChangeImpl instance = new MoveImageToPositionChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of MoveImageToPositionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MoveImageToPositionChange deepCopy(@Nullable final MoveImageToPositionChange template) {
        if (template == null) {
            return null;
        }
        MoveImageToPositionChangeImpl instance = new MoveImageToPositionChangeImpl();
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
     * builder factory method for MoveImageToPositionChange
     * @return builder
     */
    public static MoveImageToPositionChangeBuilder builder() {
        return MoveImageToPositionChangeBuilder.of();
    }
    
    /**
     * create builder for MoveImageToPositionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoveImageToPositionChangeBuilder builder(final MoveImageToPositionChange template) {
        return MoveImageToPositionChangeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMoveImageToPositionChange(Function<MoveImageToPositionChange, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MoveImageToPositionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MoveImageToPositionChange>() {
            @Override
            public String toString() {
                return "TypeReference<MoveImageToPositionChange>";
            }
        };
    }
}
