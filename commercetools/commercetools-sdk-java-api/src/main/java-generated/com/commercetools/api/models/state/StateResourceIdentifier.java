
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:State">State</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateResourceIdentifierImpl.class)
public interface StateResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<State> {

    String STATE = "state";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:State">State</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:State">State</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static StateResourceIdentifier of() {
        return new StateResourceIdentifierImpl();
    }

    public static StateResourceIdentifier of(final StateResourceIdentifier template) {
        StateResourceIdentifierImpl instance = new StateResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static StateResourceIdentifierBuilder builder() {
        return StateResourceIdentifierBuilder.of();
    }

    public static StateResourceIdentifierBuilder builder(final StateResourceIdentifier template) {
        return StateResourceIdentifierBuilder.of(template);
    }

    default <T> T withStateResourceIdentifier(Function<StateResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StateResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<StateResourceIdentifier>";
            }
        };
    }
}
