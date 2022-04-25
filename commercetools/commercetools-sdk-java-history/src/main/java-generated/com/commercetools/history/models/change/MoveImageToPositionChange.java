
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MoveImageToPositionChangeImpl.class)
public interface MoveImageToPositionChange extends Change {

    String MOVE_IMAGE_TO_POSITION_CHANGE = "MoveImageToPositionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update actions for moving images</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Image> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Image> getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    @JsonIgnore
    public void setPreviousValue(final Image... previousValue);

    public void setPreviousValue(final List<Image> previousValue);

    @JsonIgnore
    public void setNextValue(final Image... nextValue);

    public void setNextValue(final List<Image> nextValue);

    public static MoveImageToPositionChange of() {
        return new MoveImageToPositionChangeImpl();
    }

    public static MoveImageToPositionChange of(final MoveImageToPositionChange template) {
        MoveImageToPositionChangeImpl instance = new MoveImageToPositionChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static MoveImageToPositionChangeBuilder builder() {
        return MoveImageToPositionChangeBuilder.of();
    }

    public static MoveImageToPositionChangeBuilder builder(final MoveImageToPositionChange template) {
        return MoveImageToPositionChangeBuilder.of(template);
    }

    default <T> T withMoveImageToPositionChange(Function<MoveImageToPositionChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MoveImageToPositionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MoveImageToPositionChange>() {
            @Override
            public String toString() {
                return "TypeReference<MoveImageToPositionChange>";
            }
        };
    }
}
