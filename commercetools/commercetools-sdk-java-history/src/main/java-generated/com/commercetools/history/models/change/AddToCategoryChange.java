
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddToCategoryChangeImpl.class)
public interface AddToCategoryChange extends Change {

    String ADD_TO_CATEGORY_CHANGE = "AddToCategoryChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addToCategory</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("category")
    public Reference getCategory();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reference> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    public void setChange(final String change);

    public void setCategory(final Reference category);

    @JsonIgnore
    public void setPreviousValue(final Reference... previousValue);

    public void setPreviousValue(final List<Reference> previousValue);

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    public void setNextValue(final List<Reference> nextValue);

    public static AddToCategoryChange of() {
        return new AddToCategoryChangeImpl();
    }

    public static AddToCategoryChange of(final AddToCategoryChange template) {
        AddToCategoryChangeImpl instance = new AddToCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setCategory(template.getCategory());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddToCategoryChangeBuilder builder() {
        return AddToCategoryChangeBuilder.of();
    }

    public static AddToCategoryChangeBuilder builder(final AddToCategoryChange template) {
        return AddToCategoryChangeBuilder.of(template);
    }

    default <T> T withAddToCategoryChange(Function<AddToCategoryChange, T> helper) {
        return helper.apply(this);
    }
}
