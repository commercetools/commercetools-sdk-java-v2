
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
 * AttributeGroupRemoveAttributeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupRemoveAttributeAction attributeGroupRemoveAttributeAction = AttributeGroupRemoveAttributeAction.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupRemoveAttributeActionImpl.class)
public interface AttributeGroupRemoveAttributeAction extends AttributeGroupUpdateAction {

    String REMOVE_ATTRIBUTE = "removeAttribute";

    /**
     *  <p>Value to remove.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public AttributeReference getAttribute();

    public void setAttribute(final AttributeReference attribute);

    public static AttributeGroupRemoveAttributeAction of() {
        return new AttributeGroupRemoveAttributeActionImpl();
    }

    public static AttributeGroupRemoveAttributeAction of(final AttributeGroupRemoveAttributeAction template) {
        AttributeGroupRemoveAttributeActionImpl instance = new AttributeGroupRemoveAttributeActionImpl();
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    public static AttributeGroupRemoveAttributeActionBuilder builder() {
        return AttributeGroupRemoveAttributeActionBuilder.of();
    }

    public static AttributeGroupRemoveAttributeActionBuilder builder(
            final AttributeGroupRemoveAttributeAction template) {
        return AttributeGroupRemoveAttributeActionBuilder.of(template);
    }

    default <T> T withAttributeGroupRemoveAttributeAction(Function<AttributeGroupRemoveAttributeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupRemoveAttributeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupRemoveAttributeAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupRemoveAttributeAction>";
            }
        };
    }
}
