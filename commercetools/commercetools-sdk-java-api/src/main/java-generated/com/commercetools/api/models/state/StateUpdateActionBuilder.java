
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateUpdateActionBuilder {

    public com.commercetools.api.models.state.StateAddRolesActionBuilder addRolesBuilder() {
        return com.commercetools.api.models.state.StateAddRolesActionBuilder.of();
    }

    public com.commercetools.api.models.state.StateChangeInitialActionBuilder changeInitialBuilder() {
        return com.commercetools.api.models.state.StateChangeInitialActionBuilder.of();
    }

    public com.commercetools.api.models.state.StateChangeKeyActionBuilder changeKeyBuilder() {
        return com.commercetools.api.models.state.StateChangeKeyActionBuilder.of();
    }

    public com.commercetools.api.models.state.StateChangeTypeActionBuilder changeTypeBuilder() {
        return com.commercetools.api.models.state.StateChangeTypeActionBuilder.of();
    }

    public com.commercetools.api.models.state.StateRemoveRolesActionBuilder removeRolesBuilder() {
        return com.commercetools.api.models.state.StateRemoveRolesActionBuilder.of();
    }

    public com.commercetools.api.models.state.StateSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.state.StateSetDescriptionActionBuilder.of();
    }

    public com.commercetools.api.models.state.StateSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.state.StateSetNameActionBuilder.of();
    }

    public com.commercetools.api.models.state.StateSetRolesActionBuilder setRolesBuilder() {
        return com.commercetools.api.models.state.StateSetRolesActionBuilder.of();
    }

    public com.commercetools.api.models.state.StateSetTransitionsActionBuilder setTransitionsBuilder() {
        return com.commercetools.api.models.state.StateSetTransitionsActionBuilder.of();
    }

    /**
     * factory method for an instance of StateUpdateActionBuilder
     * @return builder
     */
    public static StateUpdateActionBuilder of() {
        return new StateUpdateActionBuilder();
    }

}
