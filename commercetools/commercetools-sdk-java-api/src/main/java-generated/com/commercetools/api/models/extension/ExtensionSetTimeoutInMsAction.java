
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionSetTimeoutInMsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetTimeoutInMsAction extensionSetTimeoutInMsAction = ExtensionSetTimeoutInMsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTimeoutInMs")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionSetTimeoutInMsActionImpl.class)
public interface ExtensionSetTimeoutInMsAction extends ExtensionUpdateAction {

    /**
     * discriminator value for ExtensionSetTimeoutInMsAction
     */
    String SET_TIMEOUT_IN_MS = "setTimeoutInMs";

    /**
     *  <p>Value to set. If not defined, the maximum value is used. If no timeout is provided, the <span>default value</span> is used for all types of Extensions, including <code>payment</code> Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     *  <p>This limit can be increased per Project after we review the performance impact. Please contact the <span>Composable Commerce support team</span> and provide the Region, Project key, and use case.</p>
     * @return timeoutInMs
     */

    @JsonProperty("timeoutInMs")
    public Integer getTimeoutInMs();

    /**
     *  <p>Value to set. If not defined, the maximum value is used. If no timeout is provided, the <span>default value</span> is used for all types of Extensions, including <code>payment</code> Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     *  <p>This limit can be increased per Project after we review the performance impact. Please contact the <span>Composable Commerce support team</span> and provide the Region, Project key, and use case.</p>
     * @param timeoutInMs value to be set
     */

    public void setTimeoutInMs(final Integer timeoutInMs);

    /**
     * factory method
     * @return instance of ExtensionSetTimeoutInMsAction
     */
    public static ExtensionSetTimeoutInMsAction of() {
        return new ExtensionSetTimeoutInMsActionImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionSetTimeoutInMsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionSetTimeoutInMsAction of(final ExtensionSetTimeoutInMsAction template) {
        ExtensionSetTimeoutInMsActionImpl instance = new ExtensionSetTimeoutInMsActionImpl();
        instance.setTimeoutInMs(template.getTimeoutInMs());
        return instance;
    }

    public ExtensionSetTimeoutInMsAction copyDeep();

    /**
     * factory method to create a deep copy of ExtensionSetTimeoutInMsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionSetTimeoutInMsAction deepCopy(@Nullable final ExtensionSetTimeoutInMsAction template) {
        if (template == null) {
            return null;
        }
        ExtensionSetTimeoutInMsActionImpl instance = new ExtensionSetTimeoutInMsActionImpl();
        instance.setTimeoutInMs(template.getTimeoutInMs());
        return instance;
    }

    /**
     * builder factory method for ExtensionSetTimeoutInMsAction
     * @return builder
     */
    public static ExtensionSetTimeoutInMsActionBuilder builder() {
        return ExtensionSetTimeoutInMsActionBuilder.of();
    }

    /**
     * create builder for ExtensionSetTimeoutInMsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetTimeoutInMsActionBuilder builder(final ExtensionSetTimeoutInMsAction template) {
        return ExtensionSetTimeoutInMsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionSetTimeoutInMsAction(Function<ExtensionSetTimeoutInMsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionSetTimeoutInMsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionSetTimeoutInMsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionSetTimeoutInMsAction>";
            }
        };
    }
}
