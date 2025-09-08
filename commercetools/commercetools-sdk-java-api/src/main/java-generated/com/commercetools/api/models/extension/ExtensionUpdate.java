
package com.commercetools.api.models.extension;

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
 * ExtensionUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionUpdate extensionUpdate = ExtensionUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionUpdateImpl.class)
public interface ExtensionUpdate extends
        com.commercetools.api.models.ResourceUpdate<ExtensionUpdate, ExtensionUpdateAction, ExtensionUpdateBuilder> {

    /**
     *  <p>Expected version of the Extension on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Extension.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ExtensionUpdateAction> getActions();

    /**
     *  <p>Expected version of the Extension on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Extension.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ExtensionUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Extension.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ExtensionUpdateAction> actions);

    /**
     * factory method
     * @return instance of ExtensionUpdate
     */
    public static ExtensionUpdate of() {
        return new ExtensionUpdateImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionUpdate of(final ExtensionUpdate template) {
        ExtensionUpdateImpl instance = new ExtensionUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public ExtensionUpdate copyDeep();

    /**
     * factory method to create a deep copy of ExtensionUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionUpdate deepCopy(@Nullable final ExtensionUpdate template) {
        if (template == null) {
            return null;
        }
        ExtensionUpdateImpl instance = new ExtensionUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.extension.ExtensionUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ExtensionUpdate
     * @return builder
     */
    public static ExtensionUpdateBuilder builder() {
        return ExtensionUpdateBuilder.of();
    }

    /**
     * create builder for ExtensionUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionUpdateBuilder builder(final ExtensionUpdate template) {
        return ExtensionUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionUpdate(Function<ExtensionUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionUpdate>";
            }
        };
    }
}
