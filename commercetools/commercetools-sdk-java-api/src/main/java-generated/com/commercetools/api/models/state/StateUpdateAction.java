
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * StateUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateUpdateAction stateUpdateAction = StateUpdateAction.addRolesBuilder()
 *             plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateAddRolesActionImpl.class, name = StateAddRolesAction.ADD_ROLES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateChangeInitialActionImpl.class, name = StateChangeInitialAction.CHANGE_INITIAL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateChangeKeyActionImpl.class, name = StateChangeKeyAction.CHANGE_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateChangeTypeActionImpl.class, name = StateChangeTypeAction.CHANGE_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateRemoveRolesActionImpl.class, name = StateRemoveRolesAction.REMOVE_ROLES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateSetDescriptionActionImpl.class, name = StateSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateSetNameActionImpl.class, name = StateSetNameAction.SET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateSetRolesActionImpl.class, name = StateSetRolesAction.SET_ROLES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.state.StateSetTransitionsActionImpl.class, name = StateSetTransitionsAction.SET_TRANSITIONS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = StateUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = StateUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StateUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<StateUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of StateUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateUpdateAction deepCopy(@Nullable final StateUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.state.StateAddRolesAction) {
            return com.commercetools.api.models.state.StateAddRolesAction
                    .deepCopy((com.commercetools.api.models.state.StateAddRolesAction) template);
        }
        if (template instanceof com.commercetools.api.models.state.StateChangeInitialAction) {
            return com.commercetools.api.models.state.StateChangeInitialAction
                    .deepCopy((com.commercetools.api.models.state.StateChangeInitialAction) template);
        }
        if (template instanceof com.commercetools.api.models.state.StateChangeKeyAction) {
            return com.commercetools.api.models.state.StateChangeKeyAction
                    .deepCopy((com.commercetools.api.models.state.StateChangeKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.state.StateChangeTypeAction) {
            return com.commercetools.api.models.state.StateChangeTypeAction
                    .deepCopy((com.commercetools.api.models.state.StateChangeTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.state.StateRemoveRolesAction) {
            return com.commercetools.api.models.state.StateRemoveRolesAction
                    .deepCopy((com.commercetools.api.models.state.StateRemoveRolesAction) template);
        }
        if (template instanceof com.commercetools.api.models.state.StateSetDescriptionAction) {
            return com.commercetools.api.models.state.StateSetDescriptionAction
                    .deepCopy((com.commercetools.api.models.state.StateSetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.state.StateSetNameAction) {
            return com.commercetools.api.models.state.StateSetNameAction
                    .deepCopy((com.commercetools.api.models.state.StateSetNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.state.StateSetRolesAction) {
            return com.commercetools.api.models.state.StateSetRolesAction
                    .deepCopy((com.commercetools.api.models.state.StateSetRolesAction) template);
        }
        if (template instanceof com.commercetools.api.models.state.StateSetTransitionsAction) {
            return com.commercetools.api.models.state.StateSetTransitionsAction
                    .deepCopy((com.commercetools.api.models.state.StateSetTransitionsAction) template);
        }
        StateUpdateActionImpl instance = new StateUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addRoles subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateAddRolesActionBuilder addRolesBuilder() {
        return com.commercetools.api.models.state.StateAddRolesActionBuilder.of();
    }

    /**
     * builder for changeInitial subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateChangeInitialActionBuilder changeInitialBuilder() {
        return com.commercetools.api.models.state.StateChangeInitialActionBuilder.of();
    }

    /**
     * builder for changeKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateChangeKeyActionBuilder changeKeyBuilder() {
        return com.commercetools.api.models.state.StateChangeKeyActionBuilder.of();
    }

    /**
     * builder for changeType subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateChangeTypeActionBuilder changeTypeBuilder() {
        return com.commercetools.api.models.state.StateChangeTypeActionBuilder.of();
    }

    /**
     * builder for removeRoles subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateRemoveRolesActionBuilder removeRolesBuilder() {
        return com.commercetools.api.models.state.StateRemoveRolesActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.state.StateSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.state.StateSetNameActionBuilder.of();
    }

    /**
     * builder for setRoles subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateSetRolesActionBuilder setRolesBuilder() {
        return com.commercetools.api.models.state.StateSetRolesActionBuilder.of();
    }

    /**
     * builder for setTransitions subtype
     * @return builder
     */
    public static com.commercetools.api.models.state.StateSetTransitionsActionBuilder setTransitionsBuilder() {
        return com.commercetools.api.models.state.StateSetTransitionsActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateUpdateAction(Function<StateUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateUpdateAction>";
            }
        };
    }
}
