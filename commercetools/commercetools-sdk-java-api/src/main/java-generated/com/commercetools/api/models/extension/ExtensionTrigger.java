
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionTrigger
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionTrigger extensionTrigger = ExtensionTrigger.builder()
 *             .resourceTypeId(ExtensionResourceTypeId.CART)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionTriggerImpl.class)
public interface ExtensionTrigger {

    /**
     *  <p><code>cart</code>, <code>order</code>, <code>payment</code>, <code>customer</code>, <code>quote-request</code>, <code>staged-quote</code>, <code>quote</code>, and <code>business-unit</code> are supported.</p>
     * @return resourceTypeId
     */
    @NotNull
    @JsonProperty("resourceTypeId")
    public ExtensionResourceTypeId getResourceTypeId();

    /**
     *  <p><code>Create</code> and <code>Update</code> requests are supported.</p>
     * @return actions
     */
    @NotNull
    @JsonProperty("actions")
    public List<ExtensionAction> getActions();

    /**
     *  <p>Valid predicate that controls the conditions under which the API Extension is called. The Extension is not triggered when the specified condition is not fulfilled.</p>
     * @return condition
     */

    @JsonProperty("condition")
    public String getCondition();

    /**
     *  <p><code>cart</code>, <code>order</code>, <code>payment</code>, <code>customer</code>, <code>quote-request</code>, <code>staged-quote</code>, <code>quote</code>, and <code>business-unit</code> are supported.</p>
     * @param resourceTypeId value to be set
     */

    public void setResourceTypeId(final ExtensionResourceTypeId resourceTypeId);

    /**
     *  <p><code>Create</code> and <code>Update</code> requests are supported.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ExtensionAction... actions);

    /**
     *  <p><code>Create</code> and <code>Update</code> requests are supported.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ExtensionAction> actions);

    /**
     *  <p>Valid predicate that controls the conditions under which the API Extension is called. The Extension is not triggered when the specified condition is not fulfilled.</p>
     * @param condition value to be set
     */

    public void setCondition(final String condition);

    /**
     * factory method
     * @return instance of ExtensionTrigger
     */
    public static ExtensionTrigger of() {
        return new ExtensionTriggerImpl();
    }

    /**
     * factory method to copy an instance of ExtensionTrigger
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionTrigger of(final ExtensionTrigger template) {
        ExtensionTriggerImpl instance = new ExtensionTriggerImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        instance.setActions(template.getActions());
        instance.setCondition(template.getCondition());
        return instance;
    }

    /**
     * builder factory method for ExtensionTrigger
     * @return builder
     */
    public static ExtensionTriggerBuilder builder() {
        return ExtensionTriggerBuilder.of();
    }

    /**
     * create builder for ExtensionTrigger instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionTriggerBuilder builder(final ExtensionTrigger template) {
        return ExtensionTriggerBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionTrigger(Function<ExtensionTrigger, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionTrigger> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionTrigger>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionTrigger>";
            }
        };
    }
}
