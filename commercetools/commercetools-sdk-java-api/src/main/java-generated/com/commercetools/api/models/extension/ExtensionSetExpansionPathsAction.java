
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 * ExtensionSetExpansionPathsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetExpansionPathsAction extensionSetExpansionPathsAction = ExtensionSetExpansionPathsAction.builder()
 *             .plusExpansionPaths(expansionPathsBuilder -> expansionPathsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setExpansionPaths")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionSetExpansionPathsActionImpl.class)
public interface ExtensionSetExpansionPathsAction extends ExtensionUpdateAction {

    /**
     * discriminator value for ExtensionSetExpansionPathsAction
     */
    String SET_EXPANSION_PATHS = "setExpansionPaths";

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @return expansionPaths
     */
    @NotNull
    @JsonProperty("expansionPaths")
    public List<String> getExpansionPaths();

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths values to be set
     */

    @JsonIgnore
    public void setExpansionPaths(final String... expansionPaths);

    /**
     *  <p><span>Expansion paths</span> used for reference expansion of the payload.</p>
     *  <p>Be aware of the <span>limits</span> of this feature and its <span>performance impact</span>.</p>
     * @param expansionPaths values to be set
     */

    public void setExpansionPaths(final List<String> expansionPaths);

    /**
     * factory method
     * @return instance of ExtensionSetExpansionPathsAction
     */
    public static ExtensionSetExpansionPathsAction of() {
        return new ExtensionSetExpansionPathsActionImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionSetExpansionPathsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionSetExpansionPathsAction of(final ExtensionSetExpansionPathsAction template) {
        ExtensionSetExpansionPathsActionImpl instance = new ExtensionSetExpansionPathsActionImpl();
        instance.setExpansionPaths(template.getExpansionPaths());
        return instance;
    }

    public ExtensionSetExpansionPathsAction copyDeep();

    /**
     * factory method to create a deep copy of ExtensionSetExpansionPathsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionSetExpansionPathsAction deepCopy(@Nullable final ExtensionSetExpansionPathsAction template) {
        if (template == null) {
            return null;
        }
        ExtensionSetExpansionPathsActionImpl instance = new ExtensionSetExpansionPathsActionImpl();
        instance.setExpansionPaths(Optional.ofNullable(template.getExpansionPaths()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ExtensionSetExpansionPathsAction
     * @return builder
     */
    public static ExtensionSetExpansionPathsActionBuilder builder() {
        return ExtensionSetExpansionPathsActionBuilder.of();
    }

    /**
     * create builder for ExtensionSetExpansionPathsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetExpansionPathsActionBuilder builder(final ExtensionSetExpansionPathsAction template) {
        return ExtensionSetExpansionPathsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionSetExpansionPathsAction(Function<ExtensionSetExpansionPathsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ExtensionSetExpansionPathsAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ExtensionSetExpansionPathsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionSetExpansionPathsAction>";
            }
        };
    }
}
