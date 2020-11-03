package com.commercetools.api.models.state;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.state.StateReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StateReferenceImpl.class)
public interface StateReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public State getObj();

    public void setObj(final State obj);

    public static StateReferenceImpl of(){
        return new StateReferenceImpl();
    }
    

    public static StateReferenceImpl of(final StateReference template) {
        StateReferenceImpl instance = new StateReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withStateReference(Function<StateReference, T> helper) {
        return helper.apply(this);
    }
}
