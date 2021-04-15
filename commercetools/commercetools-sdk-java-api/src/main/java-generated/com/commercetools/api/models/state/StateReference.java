
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateReferenceImpl.class)
public interface StateReference extends Reference {

    String STATE = "state";

    @Valid
    @JsonProperty("obj")
    public State getObj();

    public void setObj(final State obj);

    public static StateReference of() {
        return new StateReferenceImpl();
    }

    public static StateReference of(final StateReference template) {
        StateReferenceImpl instance = new StateReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static StateReferenceBuilder builder() {
        return StateReferenceBuilder.of();
    }

    public static StateReferenceBuilder builder(final StateReference template) {
        return StateReferenceBuilder.of(template);
    }

    default <T> T withStateReference(Function<StateReference, T> helper) {
        return helper.apply(this);
    }
}
