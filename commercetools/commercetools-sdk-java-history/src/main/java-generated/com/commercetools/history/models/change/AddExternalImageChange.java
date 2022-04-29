
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
@JsonDeserialize(as = AddExternalImageChangeImpl.class)
public interface AddExternalImageChange extends Change {

    String ADD_EXTERNAL_IMAGE_CHANGE = "AddExternalImageChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update actions for adding an external image</p>
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

    public static AddExternalImageChange of() {
        return new AddExternalImageChangeImpl();
    }

    public static AddExternalImageChange of(final AddExternalImageChange template) {
        AddExternalImageChangeImpl instance = new AddExternalImageChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddExternalImageChangeBuilder builder() {
        return AddExternalImageChangeBuilder.of();
    }

    public static AddExternalImageChangeBuilder builder(final AddExternalImageChange template) {
        return AddExternalImageChangeBuilder.of(template);
    }

    default <T> T withAddExternalImageChange(Function<AddExternalImageChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddExternalImageChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddExternalImageChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddExternalImageChange>";
            }
        };
    }
}
