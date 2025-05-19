
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TypeUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeUpdate typeUpdate = TypeUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeUpdateImpl.class)
public interface TypeUpdate
        extends com.commercetools.api.models.ResourceUpdate<TypeUpdate, TypeUpdateAction, TypeUpdateBuilder> {

    /**
     *  <p>Expected version of the type on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Type.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<TypeUpdateAction> getActions();

    /**
     *  <p>Expected version of the type on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Type.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final TypeUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Type.</p>
     * @param actions values to be set
     */

    public void setActions(final List<TypeUpdateAction> actions);

    /**
     * factory method
     * @return instance of TypeUpdate
     */
    public static TypeUpdate of() {
        return new TypeUpdateImpl();
    }

    /**
     * factory method to create a shallow copy TypeUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeUpdate of(final TypeUpdate template) {
        TypeUpdateImpl instance = new TypeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public TypeUpdate copyDeep();

    /**
     * factory method to create a deep copy of TypeUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeUpdate deepCopy(@Nullable final TypeUpdate template) {
        if (template == null) {
            return null;
        }
        TypeUpdateImpl instance = new TypeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.type.TypeUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TypeUpdate
     * @return builder
     */
    public static TypeUpdateBuilder builder() {
        return TypeUpdateBuilder.of();
    }

    /**
     * create builder for TypeUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeUpdateBuilder builder(final TypeUpdate template) {
        return TypeUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeUpdate(Function<TypeUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<TypeUpdate>";
            }
        };
    }
}
