
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:State">State</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateReferenceImpl.class)
public interface StateReference extends Reference, com.commercetools.api.models.Identifiable<State> {

    String STATE = "state";

    /**
    *  <p>Contains the representation of the expanded State. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for States.</p>
    */
    @Valid
    @JsonProperty("obj")
    public State getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:State">State</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final State obj);

    public void setId(final String id);

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

    public static com.fasterxml.jackson.core.type.TypeReference<StateReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateReference>() {
            @Override
            public String toString() {
                return "TypeReference<StateReference>";
            }
        };
    }
}
