
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
@JsonDeserialize(as = SetStoresChangeImpl.class)
public interface SetStoresChange extends Change {

    String SET_STORES_CHANGE = "SetStoresChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setStores</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reference> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final Reference... previousValue);

    public void setPreviousValue(final List<Reference> previousValue);

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    public void setNextValue(final List<Reference> nextValue);

    public static SetStoresChange of() {
        return new SetStoresChangeImpl();
    }

    public static SetStoresChange of(final SetStoresChange template) {
        SetStoresChangeImpl instance = new SetStoresChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetStoresChangeBuilder builder() {
        return SetStoresChangeBuilder.of();
    }

    public static SetStoresChangeBuilder builder(final SetStoresChange template) {
        return SetStoresChangeBuilder.of(template);
    }

    default <T> T withSetStoresChange(Function<SetStoresChange, T> helper) {
        return helper.apply(this);
    }
}
