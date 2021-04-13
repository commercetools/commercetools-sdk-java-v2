
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ReturnInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddReturnInfoChangeImpl.class)
public interface AddReturnInfoChange extends Change {

    String ADD_RETURN_INFO_CHANGE = "AddReturnInfoChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addReturnInfo</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ReturnInfo getNextValue();

    public void setChange(final String change);

    public void setNextValue(final ReturnInfo nextValue);

    public static AddReturnInfoChange of() {
        return new AddReturnInfoChangeImpl();
    }

    public static AddReturnInfoChange of(final AddReturnInfoChange template) {
        AddReturnInfoChangeImpl instance = new AddReturnInfoChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddReturnInfoChangeBuilder builder() {
        return AddReturnInfoChangeBuilder.of();
    }

    public static AddReturnInfoChangeBuilder builder(final AddReturnInfoChange template) {
        return AddReturnInfoChangeBuilder.of(template);
    }

    default <T> T withAddReturnInfoChange(Function<AddReturnInfoChange, T> helper) {
        return helper.apply(this);
    }
}
