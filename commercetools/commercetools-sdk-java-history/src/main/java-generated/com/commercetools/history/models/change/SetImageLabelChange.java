
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
@JsonDeserialize(as = SetImageLabelChangeImpl.class)
public interface SetImageLabelChange extends Change {

    String SET_IMAGE_LABEL_CHANGE = "SetImageLabelChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setImageLabel</code></p>
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
    public Image getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Image getNextValue();

    public void setChange(final String change);

    public void setCatalogData(final String catalogData);

    public void setPreviousValue(final Image previousValue);

    public void setNextValue(final Image nextValue);

    public static SetImageLabelChange of() {
        return new SetImageLabelChangeImpl();
    }

    public static SetImageLabelChange of(final SetImageLabelChange template) {
        SetImageLabelChangeImpl instance = new SetImageLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetImageLabelChangeBuilder builder() {
        return SetImageLabelChangeBuilder.of();
    }

    public static SetImageLabelChangeBuilder builder(final SetImageLabelChange template) {
        return SetImageLabelChangeBuilder.of(template);
    }

    default <T> T withSetImageLabelChange(Function<SetImageLabelChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetImageLabelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetImageLabelChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetImageLabelChange>";
            }
        };
    }
}
