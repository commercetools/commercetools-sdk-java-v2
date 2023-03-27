
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionChangeDestinationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionChangeDestinationAction extensionChangeDestinationAction = ExtensionChangeDestinationAction.builder()
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionChangeDestinationActionImpl.class)
public interface ExtensionChangeDestinationAction extends ExtensionUpdateAction {

    /**
     * discriminator value for ExtensionChangeDestinationAction
     */
    String CHANGE_DESTINATION = "changeDestination";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return destination
     */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public ExtensionDestination getDestination();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param destination value to be set
     */

    public void setDestination(final ExtensionDestination destination);

    /**
     * factory method
     * @return instance of ExtensionChangeDestinationAction
     */
    public static ExtensionChangeDestinationAction of() {
        return new ExtensionChangeDestinationActionImpl();
    }

    /**
     * factory method to copy an instance of ExtensionChangeDestinationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionChangeDestinationAction of(final ExtensionChangeDestinationAction template) {
        ExtensionChangeDestinationActionImpl instance = new ExtensionChangeDestinationActionImpl();
        instance.setDestination(template.getDestination());
        return instance;
    }

    /**
     * builder factory method for ExtensionChangeDestinationAction
     * @return builder
     */
    public static ExtensionChangeDestinationActionBuilder builder() {
        return ExtensionChangeDestinationActionBuilder.of();
    }

    /**
     * create builder for ExtensionChangeDestinationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionChangeDestinationActionBuilder builder(final ExtensionChangeDestinationAction template) {
        return ExtensionChangeDestinationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionChangeDestinationAction(Function<ExtensionChangeDestinationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionChangeDestinationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionChangeDestinationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionChangeDestinationAction>";
            }
        };
    }
}
