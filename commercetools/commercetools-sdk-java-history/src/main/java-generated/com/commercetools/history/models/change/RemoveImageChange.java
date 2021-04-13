
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
@JsonDeserialize(as = RemoveImageChangeImpl.class)
public interface RemoveImageChange extends Change {

    String REMOVE_IMAGE_CHANGE = "RemoveImageChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update actions for removing images</p>
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

    public static RemoveImageChange of() {
        return new RemoveImageChangeImpl();
    }

    public static RemoveImageChange of(final RemoveImageChange template) {
        RemoveImageChangeImpl instance = new RemoveImageChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveImageChangeBuilder builder() {
        return RemoveImageChangeBuilder.of();
    }

    public static RemoveImageChangeBuilder builder(final RemoveImageChange template) {
        return RemoveImageChangeBuilder.of(template);
    }

    default <T> T withRemoveImageChange(Function<RemoveImageChange, T> helper) {
        return helper.apply(this);
    }
}
