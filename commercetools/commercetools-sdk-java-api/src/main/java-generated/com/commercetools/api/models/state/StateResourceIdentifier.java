
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateResourceIdentifierImpl.class)
public interface StateResourceIdentifier extends ResourceIdentifier {

    String STATE = "state";

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
}
