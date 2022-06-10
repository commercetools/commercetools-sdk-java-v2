
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
     *  <p><code>cart</code>, <code>order</code>, <code>payment</code>, and <code>customer</code> are supported.</p>
     */
    @NotNull
    @JsonProperty("resourceTypeId")
    public ExtensionResourceTypeId getResourceTypeId();

    /**
     *  <p><code>Create</code> and <code>Update</code> requests are supported.</p>
     */
    @NotNull
    @JsonProperty("actions")
    public List<ExtensionAction> getActions();

    /**
     *  <p>Valid predicate that controls the conditions under which the API Extension is called. The Extension is not triggered when the specified condition is not fulfilled.</p>
     */

    @JsonProperty("condition")
    public String getCondition();

    public void setResourceTypeId(final ExtensionResourceTypeId resourceTypeId);

    @JsonIgnore
    public void setActions(final ExtensionAction... actions);

    public void setActions(final List<ExtensionAction> actions);

    public void setCondition(final String condition);

    public static ExtensionTrigger of() {
        return new ExtensionTriggerImpl();
    }

    public static ExtensionTrigger of(final ExtensionTrigger template) {
        ExtensionTriggerImpl instance = new ExtensionTriggerImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        instance.setActions(template.getActions());
        instance.setCondition(template.getCondition());
        return instance;
    }

    public static ExtensionTriggerBuilder builder() {
        return ExtensionTriggerBuilder.of();
    }

    public static ExtensionTriggerBuilder builder(final ExtensionTrigger template) {
        return ExtensionTriggerBuilder.of(template);
    }

    default <T> T withExtensionTrigger(Function<ExtensionTrigger, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionTrigger> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionTrigger>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionTrigger>";
            }
        };
    }
}
