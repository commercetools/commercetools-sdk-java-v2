
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
 * ExtensionSetDependenciesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetDependenciesAction extensionSetDependenciesAction = ExtensionSetDependenciesAction.builder()
 *             .plusDependencies(dependenciesBuilder -> dependenciesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDependencies")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionSetDependenciesActionImpl.class)
public interface ExtensionSetDependenciesAction extends ExtensionUpdateAction {

    /**
     * discriminator value for ExtensionSetDependenciesAction
     */
    String SET_DEPENDENCIES = "setDependencies";

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @return dependencies
     */
    @NotNull
    @Valid
    @JsonProperty("dependencies")
    public List<ExtensionResourceIdentifier> getDependencies();

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @param dependencies values to be set
     */

    @JsonIgnore
    public void setDependencies(final ExtensionResourceIdentifier... dependencies);

    /**
     *  <p>Extensions this Extension depends on, identified by <code>id</code> or <code>key</code>. Set to an empty array to remove all dependencies. Maximum 5 entries.</p>
     * @param dependencies values to be set
     */

    public void setDependencies(final List<ExtensionResourceIdentifier> dependencies);

    /**
     * factory method
     * @return instance of ExtensionSetDependenciesAction
     */
    public static ExtensionSetDependenciesAction of() {
        return new ExtensionSetDependenciesActionImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionSetDependenciesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionSetDependenciesAction of(final ExtensionSetDependenciesAction template) {
        ExtensionSetDependenciesActionImpl instance = new ExtensionSetDependenciesActionImpl();
        instance.setDependencies(template.getDependencies());
        return instance;
    }

    public ExtensionSetDependenciesAction copyDeep();

    /**
     * factory method to create a deep copy of ExtensionSetDependenciesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionSetDependenciesAction deepCopy(@Nullable final ExtensionSetDependenciesAction template) {
        if (template == null) {
            return null;
        }
        ExtensionSetDependenciesActionImpl instance = new ExtensionSetDependenciesActionImpl();
        instance.setDependencies(Optional.ofNullable(template.getDependencies())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.extension.ExtensionResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ExtensionSetDependenciesAction
     * @return builder
     */
    public static ExtensionSetDependenciesActionBuilder builder() {
        return ExtensionSetDependenciesActionBuilder.of();
    }

    /**
     * create builder for ExtensionSetDependenciesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetDependenciesActionBuilder builder(final ExtensionSetDependenciesAction template) {
        return ExtensionSetDependenciesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionSetDependenciesAction(Function<ExtensionSetDependenciesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionSetDependenciesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionSetDependenciesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionSetDependenciesAction>";
            }
        };
    }
}
