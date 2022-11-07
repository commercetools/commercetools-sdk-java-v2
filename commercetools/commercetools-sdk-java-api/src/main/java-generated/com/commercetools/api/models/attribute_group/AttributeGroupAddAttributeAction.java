
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupAddAttributeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupAddAttributeAction attributeGroupAddAttributeAction = AttributeGroupAddAttributeAction.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupAddAttributeActionImpl.class)
public interface AttributeGroupAddAttributeAction extends AttributeGroupUpdateAction {

    String ADD_ATTRIBUTE = "addAttribute";

    /**
     *  <p>Value to add.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public AttributeReference getAttribute();

    public void setAttribute(final AttributeReference attribute);

    public static AttributeGroupAddAttributeAction of() {
        return new AttributeGroupAddAttributeActionImpl();
    }

    public static AttributeGroupAddAttributeAction of(final AttributeGroupAddAttributeAction template) {
        AttributeGroupAddAttributeActionImpl instance = new AttributeGroupAddAttributeActionImpl();
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    public static AttributeGroupAddAttributeActionBuilder builder() {
        return AttributeGroupAddAttributeActionBuilder.of();
    }

    public static AttributeGroupAddAttributeActionBuilder builder(final AttributeGroupAddAttributeAction template) {
        return AttributeGroupAddAttributeActionBuilder.of(template);
    }

    default <T> T withAttributeGroupAddAttributeAction(Function<AttributeGroupAddAttributeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupAddAttributeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupAddAttributeAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupAddAttributeAction>";
            }
        };
    }
}
